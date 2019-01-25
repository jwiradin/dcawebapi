package com.gbst.dca.demo.controllers;

import com.gbst.dca.demo.domain.dca.Acc;
import com.gbst.dca.demo.domain.dca.AccAddress;
import com.gbst.dca.demo.domain.dca.AccAddressPrint;
import com.gbst.dca.demo.repositories.dca.AccRepository;
import com.gbst.dca.demo.services.dca.AccService;
import com.gbst.dca.demo.services.dca.LookUpServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/acc")
public class AccControler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AccRepository repository;

    @Autowired
    LookUpServices lookUpServices;


    @Autowired
    AccService accService;

    @RequestMapping("/")
    public Iterable<Acc> index(){
        return repository.findAll();
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Acc> find(@PathVariable Integer id){
        Acc result = accService.find(id);

        if(result != null)
            return new ResponseEntity<Acc> (result, HttpStatus.OK);
        else
            return new ResponseEntity<Acc>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/{id}/address")
    public ResponseEntity<List<AccAddress>> listAddress(@PathVariable Integer id){
        List<AccAddress> result = accService.listAccAddress(id);

        if(result != null)
            return new ResponseEntity<List<AccAddress>> (result, HttpStatus.OK);

        else
            return new ResponseEntity<List<AccAddress>>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/{id}/address/{addNum}")
    public ResponseEntity<AccAddress> findAddress(@PathVariable Integer id,
                                                          @PathVariable short addNum){
        AccAddress result = accService.findAccAddress(id, addNum);

        if (result != null)
            return new ResponseEntity<AccAddress> (result, HttpStatus.OK);
        else
            return new ResponseEntity<AccAddress>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/{id}/address/{addNum}/print")
    public ResponseEntity<List<AccAddressPrint>> listAddressPrint(@PathVariable Integer id,
                                                  @PathVariable short addNum){

        List<AccAddressPrint> result = accService.listAccAddressPrint(id, addNum);

        if(result != null)
            return new ResponseEntity<List<AccAddressPrint>>(result, HttpStatus.OK);
        else
            return new ResponseEntity<List<AccAddressPrint>>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping("/{id}/address/{addNum}/print/{repId}")
    public ResponseEntity<AccAddressPrint> findAddressPrint(@PathVariable Integer id,
                                                                  @PathVariable short addNum,
                                                                  @PathVariable String repId){

        AccAddressPrint result = accService.findAccAddressPrint(id, addNum, repId);

        if(result != null)
            return new ResponseEntity<AccAddressPrint>(result, HttpStatus.OK);
        else
            return new ResponseEntity<AccAddressPrint>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping("/code/{acc}")
    public ResponseEntity<Acc> findByName(@PathVariable String acc){
        Optional<Acc> result =repository.findAccByAcc(acc);
        if(result.isPresent()){
            logger.debug("isPresent {}",result.isPresent());
            return new ResponseEntity<Acc> (result.get(), HttpStatus.OK);
        }

        return new ResponseEntity<Acc>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/lookup/code/{acc}")
    public ResponseEntity<List<Map<String, String>>> lookUpbyAcc(@PathVariable String acc){
        List<Map<String, String>> result =lookUpServices.AccByAccCode(acc);
        if(result.size() > 0){
            return new ResponseEntity<List<Map<String, String>>>(result, HttpStatus.OK);
        }
        return new ResponseEntity<List<Map<String, String>>>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/lookup/name/{name}")
    public ResponseEntity<List<Map<String, String>>> lookUpbyName(@PathVariable String name){
        List<Map<String, String>> result =lookUpServices.AccByAccName(name);
        if(result.size() > 0){
            return new ResponseEntity<List<Map<String, String>>>(result, HttpStatus.OK);
        }
        return new ResponseEntity<List<Map<String, String>>>(HttpStatus.NOT_FOUND);
    }

}
