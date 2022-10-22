package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="club_user_th")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClubUserEntity extends BaseEntity{

    @Id
    @Column(name="ROW_ID")
    private String rowId;

    @Column(nullable = false)
    private Long clubSrno;
    @Column(nullable = false)
    private Long userSrno;

    @Column
    private int userRole;   // Enum 으로 대체
    @Column
    private int userStsCd;
    @Column
    private LocalDateTime invtDh;
    @Column
    private LocalDateTime joinDh;
    @Column
    private LocalDateTime QuitDh;

}
