package com.brullo.maximiliano.Evaluacion.Tecnica.p1.web;

import com.brullo.maximiliano.Evaluacion.Tecnica.p1.domain.Candidate;
import com.brullo.maximiliano.Evaluacion.Tecnica.p1.service.CandidateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/")
    public String inicio(Model model){

        var candidate = candidateService.listCandidate();

        log.info("Controlador MVC...");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Candidate candidate) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Candidate candidate){
        candidateService.save(candidate);
        return "redirect:/";
    }
}