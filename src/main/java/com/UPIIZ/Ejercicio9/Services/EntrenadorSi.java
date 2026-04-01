package com.UPIIZ.Ejercicio9.Services;

import com.UPIIZ.Ejercicio9.Entities.EntrenadorE;
import java.util.List;

public interface EntrenadorSi {
    List<EntrenadorE> listarTodos();
    EntrenadorE buscarPorId(Long id);
    void guardar(EntrenadorE entrenador);
    void eliminar(Long id);
}