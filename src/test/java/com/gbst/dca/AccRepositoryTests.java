package com.gbst.dca;

import com.gbst.dca.domain.dca.Acc;
import com.gbst.dca.repositories.dca.AccRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccRepositoryTests {

    @Autowired
	AccRepository accRepository;

    @Test
    public void testfindById() {
        Acc acc = accRepository.findById(7).get();
        Assert.assertTrue(acc.getAccName().equalsIgnoreCase("Account Name 7"));
        Assert.assertTrue(acc.getCorporate().getCorpName().equalsIgnoreCase("Corporate Name 3"));
    }
}
