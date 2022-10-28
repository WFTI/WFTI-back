package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="calendar_ti")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalendarEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calSrno;

    @Column(nullable = false)
    private Long clubSrno;

    @Column
    private LocalDateTime stDh;
    @Column
    private LocalDateTime edDh;
    @Column
    private String clubPlc;
    @Column
    private String clubCst;
    @Column
    private String calDescTxt;
    @Column
    private Boolean pubYn;

}
