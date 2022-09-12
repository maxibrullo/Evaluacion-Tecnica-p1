package com.brullo.maximiliano.Evaluacion.Tecnica.p1.service;

import com.brullo.maximiliano.Evaluacion.Tecnica.p1.dao.CandidateDao;
import com.brullo.maximiliano.Evaluacion.Tecnica.p1.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CandidateServiceImpl implements CandidateService{

    @Autowired
    private CandidateDao candidateDao;

    @Override
    public List<Candidate> listCandidate(){
        return (List<Candidate>) candidateDao.findAll();
    }

    @Override
    public void save(Candidate candidate){
        candidateDao.delete(candidate);
    }

    @Override
    public void delete(Candidate candidate){
        candidateDao.delete(candidate);
    }

    @Override
    public Candidate findCandidate(Candidate candidate){
        return candidateDao.findById(candidate.getCandidateId()).orElse(null);
    }
}
