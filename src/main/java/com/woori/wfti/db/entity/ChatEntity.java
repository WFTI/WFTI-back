package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="chat_tb")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ChatEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatSrno;

    @Column(nullable = false)
    private Long clubSrno;
    @Column(nullable = false)
    private Long calSrno;

    @Column
    private String chatUrl;
    @Column
    private Boolean useYn;
    @Column
    private Long rgsUsrSrno;
    @Column
    private String clubCst;
    @Column
    private String calDescTxt;

}
