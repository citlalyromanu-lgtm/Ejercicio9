package com.UPIIZ.Ejercicio9.Services;

import com.UPIIZ.Ejercicio9.Entities.JugadorE;
import com.UPIIZ.Ejercicio9.Repositories.JugadorR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JugadorS implements JugadorSi {
    @Autowired
    private JugadorR repositorio;

    @Override
    public List<JugadorE> listarTodos() { return repositorio.findAll(); }
    @Override
    public JugadorE buscarPorId(Long id) { return repositorio.findById(id).orElse(null); }
    @Override
    public void guardar(JugadorE jugador) { repositorio.save(jugador); }
    @Override
    public void eliminar(Long id) { repositorio.deleteById(id); }
}