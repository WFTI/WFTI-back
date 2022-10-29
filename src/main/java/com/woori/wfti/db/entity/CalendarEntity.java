package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="calendar_th")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalendarEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calSrno; // 일정 일련번호

    @Column(nullable = false)
    private Long clubSrno; // 소모임 일련번호

    @Column
    private LocalDateTime stDh; // 일정 시작일시
    @Column
    private LocalDateTime edDh; // 일정 마감일시
    @Column
    private String clubPlc; // 일정 장소
    @Column
    private String clubCst; // 일정 비용
    @Column
    private String calDescTxt; // 일정 설명
    @Column
    private Boolean pubYn; // 공개여부
    @Column
    private LocalDateTime rgsDh; // 일정 최초등록일시
    @Column
    private LocalDateTime chgDh; // 일정 마지막수정일시
}
