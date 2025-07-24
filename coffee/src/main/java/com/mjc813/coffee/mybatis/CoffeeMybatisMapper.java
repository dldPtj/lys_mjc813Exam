package com.mjc813.coffee.mybatis;

import com.mjc813.coffee.dto.CoffeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// CRUD의 메소드를 만들어주는 곳
// mapper인터페이스가 있어야 resources/mapper/**/*.xml 파일중에서
// <mapper namespace="com.mjc813.mpacrud.animal.mybatis.AnimalMybatisMapper">
// SQL 쿼리 문장의 태그들을 메소드로 만들어 준다.
@Mapper
public interface CoffeeMybatisMapper {
    public void insertCoffee(CoffeeDto dto);
    public List<CoffeeDto> findAll();
    public CoffeeDto findById(Long id);
    public void updateCoffee(CoffeeDto dto);
}
