package com.UPIIZ.Ejercicio9.Repositories;

import com.UPIIZ.Ejercicio9.Entities.EntrenadorE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorR extends JpaRepository<EntrenadorE, Long> {}