package com.example.demo.controlador;

import com.example.demo.entidad.Auto;
import com.example.demo.repositorio.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/autos/nuevo")
    public String nuevoAuto(Model model) {
        model.addAttribute("auto", new Auto());
        return "auto/form";
    }

    @PostMapping("/autos/guardar")
    public String guardarAuto(@ModelAttribute("auto") Auto auto) {
        autoRepository.save(auto);
        return "redirect:/autos";
    }

}
