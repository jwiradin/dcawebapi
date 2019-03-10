package com.gbst.dca.repositories.dca;

import com.gbst.dca.domain.dca.Acc;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.Optional;

public class AccCustomRepositoryImpl implements AccCustomRepository {
    @Override
    @Procedure(name="getSproc")
    public Optional<Acc> retrieveSproc(Integer accId) {
        return null;
    }
}
