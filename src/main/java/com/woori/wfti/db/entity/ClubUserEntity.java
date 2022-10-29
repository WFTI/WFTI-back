package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="club_user_th")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClubUserEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubUserId;

    @Column(nullable = false)
    private Long clubSrno;
    @Column(nullable = false)
    private Long userSrno;

    @Column
    private String userRole;
    @Column
    private String userStsCd;
    @Column
    private LocalDateTime rgsDh;
    @Column
    private LocalDateTime QuitDh;

}
