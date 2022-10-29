package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name="chat_tb")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatSrno;

    @Column(nullable = false)
    private Long clubSrno;
    @Column(nullable = false)
    private Long calSrno;
    @Column(nullable = false)
    private Long rgsUserSrno;

    @Column
    private String chatUrl;
    @Column
    private Boolean useYn;
    @Column
    private String clubCst;
    @Column
    private String calDescTxt;

}
