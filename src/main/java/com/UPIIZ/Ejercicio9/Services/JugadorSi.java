package com.UPIIZ.Ejercicio9.Services;

import com.UPIIZ.Ejercicio9.Entities.JugadorE;
import java.util.List;

public interface JugadorSi {
    List<JugadorE> listarTodos();
    JugadorE buscarPorId(Long id);
    void guardar(JugadorE jugador);
    void eliminar(Long id);
}