package com.mjc813.swimcrud.swim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwimService {
    @Autowired
    private ISwimMybatis mybatisMapper;

    public void addSwim(SwimDto swimdto) {

    }

    public List<SwimDto> findAll() {
        List<SwimDto> arraylist = this.mybatisMapper.findAll();
        return arraylist;
    }
}
