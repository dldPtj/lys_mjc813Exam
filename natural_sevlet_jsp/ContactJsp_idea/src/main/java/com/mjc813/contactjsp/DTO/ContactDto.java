package com.mjc813.contactjsp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto implements IContact {
    Integer id;
    String name;
    String phoneNumber;
    String zipNumber;
    String email;

    @Override
    public String getContactFullInfo() {
        return "";
    }
}
