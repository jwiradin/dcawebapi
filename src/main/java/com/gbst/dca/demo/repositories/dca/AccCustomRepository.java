package com.gbst.dca.demo.repositories.dca;

import com.gbst.dca.demo.domain.dca.Acc;

import java.util.Optional;

public interface AccCustomRepository {
    public Optional<Acc> retrieveSproc(Integer accId);
}
