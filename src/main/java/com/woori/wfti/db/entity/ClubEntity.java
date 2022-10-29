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
    private Long clubSrno; // 소모임 일련번호

    @Column(nullable = false)
    private Long rgsUserSrno; // 소모임 최초 등록 회원 일련번호
    @Column
    private LocalDateTime rgsDh; // 소모임 최초 등록일자
    @Column(nullable = false)
    private Long chgUserSrno; // 소모임 정보 마지막 수정 회원 일련번호
    @Column
    private LocalDateTime chgDh; // 소모임 정보 마지막 수정 일자
    @Column
    private String clubNm;
    @Column
    private String clubDescTxt;

}
