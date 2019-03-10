package com.gbst.dca.repositories.dca;

import com.gbst.dca.domain.dca.Acc;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface AccRepository extends CrudRepository<Acc, Integer> {
    Optional<Acc> findAccByAcc(String acc);
}
