package com.example.demo.repositorio;

import com.example.demo.entidad.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Auto, Integer> {
}
