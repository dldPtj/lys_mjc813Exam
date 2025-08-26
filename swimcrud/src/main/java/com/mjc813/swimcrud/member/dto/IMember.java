package com.mjc813.swimcrud.member.dto;

import lombok.Generated;

public interface IMember {
    Long getId();
    String getName();
    String getUsername();
    String getPassword();
    String getEmail();
    String getPhoneNumber();
    Erole getRole();
    Integer getMaxLock();
    void setId(final Long id);
    void setName(final String name);
    void setUsername(final String username);
    void setPassword(final String password);
    void setEmail(final String email);
    void setPhoneNumber(final String phoneNumber);
    void setRole(final Erole role);
    void setMaxLock(final Integer maxLock);
}
