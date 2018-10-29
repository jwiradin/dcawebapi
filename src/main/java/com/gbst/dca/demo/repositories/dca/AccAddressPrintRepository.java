package com.gbst.dca.demo.repositories.dca;

import com.gbst.dca.demo.domain.dca.AccAddressPK;
import com.gbst.dca.demo.domain.dca.AccAddressPrint;
import com.gbst.dca.demo.domain.dca.AccAddressPrintPK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  AccAddressPrintRepository extends CrudRepository<AccAddressPrint, AccAddressPrintPK> {
    public List<AccAddressPrint> findAccAddressPrintByAccAddress_Id(AccAddressPK pk);
}
