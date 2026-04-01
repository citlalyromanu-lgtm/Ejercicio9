package com.UPIIZ.Ejercicio9.Controllers;

import com.UPIIZ.Ejercicio9.Entities.EntrenadorE;
import com.UPIIZ.Ejercicio9.Services.EntrenadorSi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EntrenadorC {

    @Autowired
    private EntrenadorSi servicio;

    // LISTAR
    @GetMapping("/entrenadores")
    public String listarEntrenadores(Model model) {
        model.addAttribute("entrenadores", servicio.listarTodos());
        // Debe coincidir exactamente con el nombre de tu archivo HTML
        return "ListadoE";
    }

    // AGREGAR
    @GetMapping("/entrenadores/nuevo")
    public String mostrarFormularioAgregar(Model model) {
        model.addAttribute("entrenador", new EntrenadorE());
        return "AgregarE";
    }

    @PostMapping("/entrenadores/guardar")
    public String guardarEntrenador(@ModelAttribute EntrenadorE entrenador) {
        servicio.guardar(entrenador);
        return "redirect:/entrenadores";
    }

    // ACTUALIZAR
    @GetMapping("/entrenadores/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("entrenador", servicio.buscarPorId(id));
        return "ActualizarE";
    }

    // ELIMINAR (Muestra pantalla de confirmación)
    @GetMapping("/entrenadores/eliminar/{id}")
    public String confirmarEliminar(@PathVariable Long id, Model model) {
        model.addAttribute("entrenador", servicio.buscarPorId(id));
        return "EliminarE";
    }

    @PostMapping("/entrenadores/borrar/{id}")
    public String eliminarEntrenador(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/entrenadores";
    }
}