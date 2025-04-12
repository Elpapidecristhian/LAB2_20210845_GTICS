package com.example.demo.controlador;

import com.example.demo.entidad.Auto;
import com.example.demo.repositorio.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    @GetMapping("/autos")
    public String listarAutos(Model model) {
        List<Auto> lista = autoRepository.findAll();
        model.addAttribute("listaAutos", lista);
        return "auto/lista";
    }
}
