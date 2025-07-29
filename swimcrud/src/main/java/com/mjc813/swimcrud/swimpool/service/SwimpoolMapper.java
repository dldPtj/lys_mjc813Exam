package com.mjc813.swimcrud.swimpool.service;

import com.mjc813.swimcrud.swimpool.dto.SwimpoolDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SwimpoolMapper {
    public List<SwimpoolDto> findAll();
    public SwimpoolDto findById(Integer id);
    public void insert(SwimpoolDto swimpoolDto);
    public void update(SwimpoolDto swimpoolDto);
    public void delete(Integer id);
}