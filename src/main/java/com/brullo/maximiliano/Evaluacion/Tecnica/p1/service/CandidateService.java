package com.brullo.maximiliano.Evaluacion.Tecnica.p1.service;

import com.brullo.maximiliano.Evaluacion.Tecnica.p1.domain.Candidate;

import java.util.List;

public interface CandidateService {

    public List<Candidate> listCandidate();

    public void save(Candidate candidate);

    public void delete(Candidate candidate);

    public Candidate findCandidat(Candidate candidate);
}
