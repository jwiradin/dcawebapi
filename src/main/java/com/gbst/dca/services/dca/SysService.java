package com.gbst.dca.services.dca;

import com.gbst.dca.domain.dca.Sys;
import com.gbst.dca.repositories.dca.SysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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