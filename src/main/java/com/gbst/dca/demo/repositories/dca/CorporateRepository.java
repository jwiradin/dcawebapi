package com.gbst.dca.demo.repositories.dca;


import com.gbst.dca.demo.domain.dca.Corporate;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface CorporateRepository extends CrudRepository<Corporate, Integer>{

}
