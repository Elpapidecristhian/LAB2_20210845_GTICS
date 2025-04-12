package com.example.demo.repositorio;

import com.example.demo.entidad.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroRepository extends JpaRepository<Seguro, Integer> {
}
