package com.brullo.maximiliano.Evaluacion.Tecnica.p1.service;

import com.brullo.maximiliano.Evaluacion.Tecnica.p1.dao.CandidateDao;
import com.brullo.maximiliano.Evaluacion.Tecnica.p1.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CandidateServiceImpl implements CandidateService{

    @Autowired
    private CandidateDao candidateDao;

    @Override
    @Transactional(readOnly = true)
    public List<Candidate> listCandidate(){
        return (List<Candidate>) candidateDao.findAll();
    }

    @Override
    @Transactional
    public void save(Candidate candidate){
        candidateDao.delete(candidate);
    }

    @Override
    @Transactional
    public void delete(Candidate candidate){
        candidateDao.delete(candidate);
    }

    @Override
    @Transactional(readOnly = true)
    public Candidate findCandidate(Candidate candidate){
        return candidateDao.findById(candidate.getCandidateId()).orElse(null);
    }
}
