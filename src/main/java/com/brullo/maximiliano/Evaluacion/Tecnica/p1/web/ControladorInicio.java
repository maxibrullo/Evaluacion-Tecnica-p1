package com.brullo.maximiliano.Evaluacion.Tecnica.p1.web;

import com.brullo.maximiliano.Evaluacion.Tecnica.p1.dao.CandidateDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @Autowired
    private CandidateDao candidateDao;

    @GetMapping("/")
    public String inicio(Model model){

        var candidate = candidateDao.findAll();

        log.info("Controlador MVC...");
        return "index";
    }
}