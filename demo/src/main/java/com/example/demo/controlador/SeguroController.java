package com.example.demo.controlador;

import com.example.demo.entidad.Seguro;
import com.example.demo.repositorio.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SeguroController {

    @Autowired
    private SeguroRepository seguroRepository;

    @GetMapping("/seguros")
    public String listarSeguros(Model model) {
        List<Seguro> lista = seguroRepository.findAll();
        model.addAttribute("listaSeguros", lista);
        return "seguro/lista";
    }
}
