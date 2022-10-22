package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="calendar_user_th")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalendarUserEntity extends BaseEntity{

    @Id
    @Column(name="ROW_ID")
    private String rowId;

    @Column(nullable = false)
    private Long calSrno;

    @Column(nullable = false)
    private Long userSrno;

    @Column
    private Boolean rgsYn;
    @Column
    private Boolean invtAccpYn;
    @Column
    private LocalDateTime invtDh;
    @Column
    private LocalDateTime invtAccpDh;

}
