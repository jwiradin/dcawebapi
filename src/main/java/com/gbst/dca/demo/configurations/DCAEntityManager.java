package com.gbst.dca.demo.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;


@Configuration
@EnableJpaRepositories(
		entityManagerFactoryRef = "dcaEntityManager",
		transactionManagerRef = "dcaTransactionManager",
		basePackages = {"com.gbst.dca.demo.domain.dca", "com.gbst.dca.demo.repositories.dca"}
)
public class DCAEntityManager {
	@Autowired
	private Environment env;

	@Bean(name="dcaEntityManager")
	@Primary
	public LocalContainerEntityManagerFactoryBean dcaEntityManager(){
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dcaDataSource());
		em.setPackagesToScan(new String[] { "com.gbst.dca.demo.domain.dca" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.show_sql", env.getProperty("spring.jpa.properties.hibernate.show_sql"));
		properties.put("hibernate.use_sql_comments", env.getProperty("spring.jpa.properties.hibernate.use_sql_comments"));
		properties.put("hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
		properties.put("hibernate.type", env.getProperty("spring.jpa.properties.hibernate.type"));
		properties.put("hibernate.enable_lazy_load_no_trans", env.getProperty("spring.jpa.properties.hibernate.enable_lazy_load_no_trans"));

		em.setJpaPropertyMap(properties);

		return em;
	}

	@Bean(name = "dcaDataSource")
	@Primary
	@ConfigurationProperties("spring.datasource.dca")
	public DataSource dcaDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		return dataSource;
	}

	@Bean(name="dcaTransactionManager")
	@Primary
	public PlatformTransactionManager dcaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(dcaEntityManager().getObject());
		return transactionManager;
	}
}
