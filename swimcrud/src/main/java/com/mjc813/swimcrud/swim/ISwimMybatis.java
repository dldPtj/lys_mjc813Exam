package com.mjc813.swimcrud.swim;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ISwimMybatis {
    public List<SwimDto> findAll();
}
