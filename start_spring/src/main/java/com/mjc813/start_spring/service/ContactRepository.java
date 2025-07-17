package com.mjc813.start_spring.service;

import com.mjc813.start_spring.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactRepository {
    @Autowired
    private IContactMybatisMapper mapper;

    public Contact insert(Contact item) {
        this.mapper.insert(item);
        return item;
    }

    public List<Contact> selectAll() {
        return this.mapper.selectAll();
    }
}
