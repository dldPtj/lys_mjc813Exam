package com.mjc813.swimcrud.swimpool.service;


import com.mjc813.swimcrud.swimpool.dto.SwimpoolDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwimpoolService {
    @Autowired // new 대신에 쓰이는 에노테이션 또는 @RequiredArgsConstructor 사용 : 매개변수가 있는 생성자가 꼭 필요하다(복잡함)
    private SwimpoolMapper swimpoolMapper;

    public List<SwimpoolDto> findAll() {
        return this.swimpoolMapper.findAll();
    }

    public SwimpoolDto findById(Integer id) {
        return this.swimpoolMapper.findById(id);
    }

    public SwimpoolDto insert(SwimpoolDto dto) {
        this.swimpoolMapper.insert(dto);
        return dto;
    }

    public SwimpoolDto update(SwimpoolDto dto) {
        this.swimpoolMapper.update(dto);
        return dto;
    }

    public void delete(Integer id) {
        this.swimpoolMapper.delete(id);
    }
}
