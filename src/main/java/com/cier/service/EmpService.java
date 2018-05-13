package com.cier.service;

import com.cier.dao.EmpMapper;
import com.cier.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empService")
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    public List<Emp> selectAllEmp(){
        return empMapper.selectAllEmp();
    }
}
