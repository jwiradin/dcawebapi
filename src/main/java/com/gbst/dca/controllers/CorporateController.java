package com.gbst.dca.controllers;

import com.gbst.dca.domain.dca.Corporate;
import com.gbst.dca.domain.dca.CorporateLogo;
import com.gbst.dca.repositories.dca.CorporateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/corp")
public class CorporateController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CorporateRepository repository;

    @RequestMapping("/")
    public Iterable<Corporate> index(){
        return repository.findAll();
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Corporate> find(@PathVariable Integer id){
        Optional<Corporate> result = repository.findById(id);

        if(result.isPresent()){
            logger.debug("isPresent {}",result.isPresent());
            return new ResponseEntity<Corporate> (result.get(), HttpStatus.FOUND);
        }

        return new ResponseEntity<Corporate>(HttpStatus.NOT_FOUND);
    }


    @RequestMapping("/{id}/logo")
    public ResponseEntity<CorporateLogo> findLog(@PathVariable Integer id){

        Optional<Corporate> result = repository.findById(id);

        if(result.isPresent()){
            logger.debug("isPresent {}",result.isPresent());

            return new ResponseEntity<CorporateLogo> (result.get().getCorporateLogo(), HttpStatus.FOUND);
        }

        return new ResponseEntity<CorporateLogo>(HttpStatus.NOT_FOUND);
    }
}
