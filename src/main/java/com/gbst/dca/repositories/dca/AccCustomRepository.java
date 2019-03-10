package com.gbst.dca.repositories.dca;

import com.gbst.dca.domain.dca.Acc;

import java.util.Optional;

public interface AccCustomRepository {
    public Optional<Acc> retrieveSproc(Integer accId);
}
