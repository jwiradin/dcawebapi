package com.gbst.dca.demo.services.dca;

import com.gbst.dca.demo.domain.dca.*;
import com.gbst.dca.demo.repositories.dca.AccAddressPrintRepository;
import com.gbst.dca.demo.repositories.dca.AccAddressRepository;
import com.gbst.dca.demo.repositories.dca.AccRepository;
import com.gbst.dca.demo.repositories.dca.SysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class SysService {

	@Autowired
	SysRepository sysRepository;

	@Cacheable("dca.sys")
	public List<Sys> find() {

		Iterable<Sys> sys = sysRepository.findAll();
		List<Sys> result = new ArrayList<>();
		sys.forEach(result::add);

		return result;
	}
}