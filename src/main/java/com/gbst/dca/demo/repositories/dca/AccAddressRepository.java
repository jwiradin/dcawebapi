package com.gbst.dca.demo.repositories.dca;

import com.gbst.dca.demo.domain.dca.AccAddress;
import com.gbst.dca.demo.domain.dca.AccAddressPK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccAddressRepository extends CrudRepository<AccAddress, AccAddressPK>{

    public List<AccAddress> findAccAddressByAcc_AccID(int accId);

}
