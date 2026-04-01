package com.UPIIZ.Ejercicio9.Repositories;

import com.UPIIZ.Ejercicio9.Entities.JugadorE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorR extends JpaRepository<JugadorE, Long> {}