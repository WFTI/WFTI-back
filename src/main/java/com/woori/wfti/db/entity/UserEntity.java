package com.woori.wfti.db.entity;

import javax.persistence.*;

import lombok.*;

import java.time.LocalDateTime;

@Entity(name="user_tb")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userSrno;

    @Column(nullable = false)
    private String userEmpNo;
    @Column(nullable = false)
    private String userNm;
    @Column(nullable = false)
    private String userPw;
    @Column
    private LocalDateTime lstSginDh;
    @Column
    private Boolean LginYn;
    @Column
    private LocalDateTime rgsDh;
    @Column
    private LocalDateTime chgDh;

}
