package com.mjc813.mpacrud.animal.mybatis;

import com.mjc813.mpacrud.animal.controller.AnimalController;
import com.mjc813.mpacrud.animal.dto.AnimalDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // resources/mapper/**/*.xml 파일 중에서 <mapper namespace="com.mjc813.mpacrud.animal.mybatis.AnimalMybatisMapper">
// mapper
// SQL 쿼리 문장의 태그들을 메소드로 만들어준다.
public interface AnimalMybatisMapper {
    public void insertAnimal(AnimalDto animalDto);
    public List<AnimalDto> findAll();
    public AnimalDto findById(Long id);
    public void update(AnimalDto dto);
}
