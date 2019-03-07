package com.gbst.dca.demo.repositories.dca;

import com.gbst.dca.demo.domain.dca.Acc;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.Optional;

public class AccCustomRepositoryImpl implements AccCustomRepository {
    @Override
    @Procedure(name="getSproc")
    public Optional<Acc> retrieveSproc(Integer accId) {
        return null;
    }
}
