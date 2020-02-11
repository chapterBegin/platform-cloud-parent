package com.antivirus.user.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    private String id;

    private String phone;

    private String firstName;

    private String secondName;

    private String fullName;

    private String idCard;
}
