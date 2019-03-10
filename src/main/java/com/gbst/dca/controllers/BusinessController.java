package com.gbst.dca.controllers;

import com.gbst.dca.dto.CollHeld;
import com.gbst.dca.dto.Financials;
import com.gbst.dca.dto.LedgerActivity;
import com.gbst.dca.dto.OpenPos;
import com.gbst.dca.services.dca.DtoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/business")
public class BusinessController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DtoService dtoService;

	@RequestMapping("/{id}/openpos")
	public ResponseEntity<List<OpenPos>> retrieveOpenPos(@PathVariable Integer id){
		logger.debug("Find openpos for {}", id);
		//Acc result = accService.find(id);
		List<OpenPos> result = dtoService.OpenPosition(id);
		if(result != null) {
			logger.debug("Found openpos {}", id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		else {
			logger.debug("Not Found openpos {}", id);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping("/{id}/collheld")
	public ResponseEntity<List<CollHeld>> retrieveCollHeld(@PathVariable Integer id){
		logger.debug("Find CollHeld for {}", id);
		//Acc result = accService.find(id);
		List<CollHeld> result = dtoService.retrieveCollateralHeld(id);
		if(result != null) {
			logger.debug("Found CollHeld {}", id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		else {
			logger.debug("Not Found openpos {}", id);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping("/{id}/financials")
	public ResponseEntity<Financials> retrieveFinancials(@PathVariable Integer id){
		logger.debug("Find Financials for {}", id);

		Financials result = dtoService.retrieveFinancials(id);
		if(result != null) {
			logger.debug("Found Financials {}", id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		else {
			logger.debug("Not Found Financials {}", id);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping("/{id}/ledgeractivity")
	public ResponseEntity<List<LedgerActivity>> retrieveLedgerActivity(@PathVariable Integer id,
														 @RequestParam String rptPeriod,
														 @RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate from,
														 @RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate to){

		logger.debug("Find ledgeractivity for {}", id);

		List<LedgerActivity> result = dtoService.retrieveLedgerActivity(id, rptPeriod, from, to);

		if(result != null) {
			logger.debug("Found ledgeractivity {}", id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		else {
			logger.debug("Not Found ledgeractivity {}", id);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
