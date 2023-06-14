package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.Member;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {


        return new PersonalAccount("1002-051-053-541", 1000);

    }

    @Bean
    public Member memberGenerator() {
//        생성자 주입
//        return new Member(1, "조평훈", "01055182290", "pasda@gmail.com", accountGenerator());

        /* setter 주입 */
        Member member = new Member();
        member.setSequence(1);
        member.setName("조평훈");
        member.setPhone("01055182290");
        member.setEmail("askldhjaskldj@asljkdhaklsd");
        member.setPersonalAccount(accountGenerator());

        return member;
    }
}
