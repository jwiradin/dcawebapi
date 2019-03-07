package com.gbst.dca.demo.services.dca;

import com.gbst.dca.demo.domain.dca.*;
import com.gbst.dca.demo.repositories.dca.AccAddressPrintRepository;
import com.gbst.dca.demo.repositories.dca.AccAddressRepository;
import com.gbst.dca.demo.repositories.dca.AccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccService {

    @Autowired
    AccRepository accRepository;

    @Autowired
    AccAddressRepository accAddressRepository;

    @Autowired
    AccAddressPrintRepository accAddressPrintRepository;

    public Acc find(int accId){
        Optional<Acc> result = accRepository.findById(accId);
        //Optional<Acc> result = accRepository.retrieveSproc(accId);
        return result.isPresent()? result.get():null;
    }

    public List<AccAddress> listAccAddress(int accId){

        List<AccAddress> result = accAddressRepository.findAccAddressByAcc_AccID(accId);

        return result;
    }

    public AccAddress findAccAddress(int accId, short addNum){

        AccAddressPK pk = new AccAddressPK();
        pk.setAccID(accId);
        pk.setAddNum((addNum));

        Optional<AccAddress> result = accAddressRepository.findById(pk);

        if(result.isPresent())
            return result.get();
        else
            return null;
    }


    public List<AccAddressPrint> listAccAddressPrint(int accId, short addNum){

        AccAddressPK pk = new AccAddressPK(accId, addNum);

        List<AccAddressPrint> result = accAddressPrintRepository.findAccAddressPrintByAccAddress_Id(pk);

        return result;
    }

    public AccAddressPrint findAccAddressPrint(int accId, short addNum, String repId){

        AccAddressPrintPK pk = new AccAddressPrintPK(accId, addNum, repId);

        Optional<AccAddressPrint> result = accAddressPrintRepository.findById(pk);

        if(result.isPresent())
            return result.get();
        else
            return null;
    }
}
