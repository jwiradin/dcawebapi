package com.gbst.dca.repositories.dca;

import com.gbst.dca.domain.dca.AccAddress;
import com.gbst.dca.domain.dca.AccAddressPK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccAddressRepository extends CrudRepository<AccAddress, AccAddressPK>{

    public List<AccAddress> findAccAddressByAcc_AccID(int accId);

}
