package com.duckranger.goodproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duckranger.goodproject.domain.Tramp;
import com.duckranger.goodproject.repository.TrampRepository;

@Service
public class TrampsService {

    private static final Logger logger = LoggerFactory.getLogger(TrampsService.class);

    @Autowired
    private TrampRepository trampRepository;

    public Iterable<Tramp> findAll() {
	return trampRepository.findAll();
    }

    public Tramp save(Tramp t) {
	return trampRepository.save(t);
    }

    public void delete(Long id) {
	trampRepository.delete(id);
    }

    public Tramp findOne(Long id) {
	return trampRepository.findOne(id);
    }

    // more methods from TrampRepository
}