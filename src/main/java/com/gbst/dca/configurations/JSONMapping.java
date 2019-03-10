package com.gbst.dca.configurations;


import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JSONMapping {

    @Bean
    public Module datatypeHibernateModule() {
        return new Hibernate5Module();
    }

}
