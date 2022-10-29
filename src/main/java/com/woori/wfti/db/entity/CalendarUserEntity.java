package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="calendar_user_th")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalendarUserEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calUserId;

    @Column(nullable = false)
    private Long calSrno;
    @Column(nullable = false)
    private Long userSrno;

    @Column
    private LocalDateTime rgsDh;
    @Column
    private LocalDateTime quitDh;
    @Column
    private String userStsCd;

}
