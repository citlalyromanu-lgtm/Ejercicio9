package com.UPIIZ.Ejercicio9.Services;

import com.UPIIZ.Ejercicio9.Entities.EntrenadorE;
import com.UPIIZ.Ejercicio9.Repositories.EntrenadorR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntrenadorS implements EntrenadorSi {
    @Autowired
    private EntrenadorR repositorio;

    @Override
    public List<EntrenadorE> listarTodos() { return repositorio.findAll(); }
    @Override
    public EntrenadorE buscarPorId(Long id) { return repositorio.findById(id).orElse(null); }
    @Override
    public void guardar(EntrenadorE entrenador) { repositorio.save(entrenador); }
    @Override
    public void eliminar(Long id) { repositorio.deleteById(id); }
}