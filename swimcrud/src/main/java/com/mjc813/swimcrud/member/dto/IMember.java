package com.mjc813.swimcrud.member.dto;

import lombok.Generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    default void copyMembers(IMember isrc) {
        if (isrc == null) {
            return;
        }
        this.setId(isrc.getId());
        this.setName(isrc.getName());
        this.setUsername(isrc.getUsername());
        this.setPassword(isrc.getPassword());
        this.setEmail(isrc.getEmail());
        this.setPhoneNumber(isrc.getPhoneNumber());
        this.setRole(isrc.getRole());
        this.setMaxLock(isrc.getMaxLock());
    }

    default void copyMembersNotNull(IMember isrc) {
        if (isrc == null) {
            return;
        }
        if (isrc.getId() != null) {
            this.setId(isrc.getId());
        }
        if (isrc.getName() != null) {
            this.setName(isrc.getName());
        }
        if (isrc.getUsername() != null) {
            this.setUsername(isrc.getUsername());
        }
        if (isrc.getPassword() != null) {
            this.setPassword(isrc.getPassword());
        }
        if (isrc.getEmail() != null) {
            this.setEmail(isrc.getEmail());
        }
        if (isrc.getPhoneNumber() != null) {
            this.setPhoneNumber(isrc.getPhoneNumber());
        }
        if (isrc.getRole() != null) {
            this.setRole(isrc.getRole());
        }
        if (isrc.getMaxLock() != null) {
            this.setMaxLock(isrc.getMaxLock());
        }
    }
}
