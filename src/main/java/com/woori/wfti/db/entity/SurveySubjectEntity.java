package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name="survey_subject_ti")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SurveySubjectEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjSrno;

    @Column(nullable = false)
    private String subNm;

}
