package com.ohgiraffers.common;


import lombok.*;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Member {

    private int sequence;
    private String name;
    private String phone;
    private String email;
    private Account personalAccount;

}
