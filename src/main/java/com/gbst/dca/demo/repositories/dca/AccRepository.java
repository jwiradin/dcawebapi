package com.gbst.dca.demo.repositories.dca;

import com.gbst.dca.demo.domain.dca.Acc;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccRepository extends CrudRepository<Acc, Integer> {
    public Optional<Acc> findAccByAcc(String acc);

}
