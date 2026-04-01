package com.UPIIZ.Ejercicio9.Controllers;

import com.UPIIZ.Ejercicio9.Entities.JugadorE;
import com.UPIIZ.Ejercicio9.Services.JugadorSi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JugadorC {

    @Autowired
    private JugadorSi servicio;

    // Menú Principal (Fifa)
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // LISTAR
    @GetMapping("/jugadores")
    public String listarJugadores(Model model) {
        model.addAttribute("jugadores", servicio.listarTodos());
        return "ListadoJ";
    }

    // AGREGAR
    @GetMapping("/jugadores/nuevo")
    public String mostrarFormularioAgregar(Model model) {
        model.addAttribute("jugador", new JugadorE());
        return "AgregarJ";
    }

    @PostMapping("/jugadores/guardar")
    public String guardarJugador(@ModelAttribute JugadorE jugador) {
        servicio.guardar(jugador);
        return "redirect:/jugadores";
    }

    // ACTUALIZAR
    @GetMapping("/jugadores/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("jugador", servicio.buscarPorId(id));
        return "ActualizarJ";
    }

    // ELIMINAR (Muestra confirmación)
    @GetMapping("/jugadores/eliminar/{id}")
    public String confirmarEliminar(@PathVariable Long id, Model model) {
        model.addAttribute("jugador", servicio.buscarPorId(id));
        return "EliminarJ";
    }

    @PostMapping("/jugadores/borrar/{id}")
    public String eliminarJugador(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/jugadores";
    }
}