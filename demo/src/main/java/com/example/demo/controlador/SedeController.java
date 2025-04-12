package com.example.demo.controlador;

import com.example.demo.entidad.Sede;
import com.example.demo.repositorio.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SedeController {

    @Autowired
    private SedeRepository sedeRepository;

    @GetMapping("/sedes")
    public String listarSedes(Model model) {
        List<Sede> lista = sedeRepository.findAll();
        model.addAttribute("listaSedes", lista);
        return "sede/lista";
    }
}
