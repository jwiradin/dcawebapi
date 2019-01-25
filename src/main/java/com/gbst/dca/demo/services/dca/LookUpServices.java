package com.gbst.dca.demo.services.dca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("dataSource")
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

    public List<Map<String,String>> AccByAccName(String name){
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "select AccName,AccID from (Select AccName, AccID, Rank() over (partition by left(AccName," + String.format("%d", name.length()+1) + ") order by AccName) as rank from Acc where AccName like '" + name + "%') a where a.rank <= 2";
        //String sql = "select AccName,AccID from Acc where Acc.AccName like '" +name  + "%' and Acc.AccId >= 0";

        List<Map<String,Object>> rows = template.queryForList(sql);
        List<Map<String, String>> result = new ArrayList<>();

        for(Map row:rows){
            Map<String,String> r = new HashMap<>();

            r.put("AccID",row.get("AccID").toString());
            r.put("AccName", row.get("AccName").toString());

            result.add(r);
        }

        return result;
    }
}
