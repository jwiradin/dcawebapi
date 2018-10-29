package com.gbst.dca.demo.services.dca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class LookUpServices {

    @Autowired
    DataSource dataSource;


    public List<Map<String,String>> AccByAccCode(String acc){
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "select Acc,AccID from (Select Acc, AccID, Rank() over (partition by left(Acc," + String.format("%d", acc.length()+1) + ") order by Acc) as rank from Acc where Acc.Acc like '" +acc  + "%') a where a.rank <= 2";

        List<Map<String,Object>> rows = template.queryForList(sql);
        List<Map<String, String>> result = new ArrayList<>();

        for(Map row:rows){
            Map<String,String> r = new HashMap<>();

            r.put("Acc",(String)row.get("Acc"));
            r.put("AccId", row.get("AccID").toString());

            result.add(r);
        }

        return result;
    }
}
