package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="search_th")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long srchSrno;

    @Column(nullable = false)
    private Long userSrno;

    @Column
    private LocalDateTime srchDh;
    @Column
    private String srchWrd;

}
