package com.brullo.maximiliano.Evaluacion.Tecnica.p1.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model){
        log.info("Controlador MVC...");
        return "index";
    }
}