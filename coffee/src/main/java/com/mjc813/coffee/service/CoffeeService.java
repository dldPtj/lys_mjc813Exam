package com.mjc813.coffee.service;

import com.mjc813.coffee.dto.CoffeeDto;
import com.mjc813.coffee.mybatis.CoffeeMybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    @Autowired // 스프링프레임워크가 인스턴스를 생성해준다.
    private CoffeeMybatisMapper coffeeMybatisMapper;

    public void insert(CoffeeDto dto) {
        this.coffeeMybatisMapper.insertCoffee(dto);
    }

    public CoffeeDto findById(Long id) {
        return this.coffeeMybatisMapper.findById(id);
    }

    public List<CoffeeDto> findAll() {
        List<CoffeeDto> all = this.coffeeMybatisMapper.findAll();
        return all;
    }

    public void update(CoffeeDto dto) {
        this.coffeeMybatisMapper.updateCoffee(dto);
    }

    public void delete(Long id) {
        this.coffeeMybatisMapper.deleteCoffee(id);
    }
}
