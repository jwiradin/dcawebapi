package com.gbst.dca;

import com.gbst.dca.domain.dca.Corporate;
import com.gbst.dca.repositories.dca.CorporateRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorporateRepositoryTests {

	@Autowired
	CorporateRepository corporateRepository;

	@Autowired
	EntityManager em;

	@Test
	@Transactional
	public void testRepository() {
		Corporate corporate = corporateRepository.findById(1).get();

		//Assert.assertTrue(corporate.getCorpName().equalsIgnoreCase("Corporate Name 1"));
		Assert.assertTrue(corporate.getCorporateLogo().getPage1LogoName().equalsIgnoreCase(""));
	}

}
