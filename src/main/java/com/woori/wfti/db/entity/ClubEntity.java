package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="club_tb")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClubEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubSrno;

    @Column(nullable = false)
    private Long rgsUserSrno;
    @Column(nullable = false)
    private Long chgUserSrno;

    @Column(nullable = false)
    private String clubNm;
    @Column(nullable = false)
    private String clubDescTxt;

}
