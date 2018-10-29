package com.gbst.dca.demo;

import com.gbst.dca.demo.domain.dca.Acc;
import com.gbst.dca.demo.domain.dca.Corporate;
import com.gbst.dca.demo.repositories.dca.AccRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

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
