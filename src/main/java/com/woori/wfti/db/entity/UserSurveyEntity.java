package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="user_survey_th")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSurveyEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;

    @Column(nullable = false)
    private Long userSrno;
    @Column(nullable = false)
    private Long subjSrno;

    @Column
    private int likeScr;
    @Column
    private LocalDateTime survDh;

}
