package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity(name="search_th")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SearchEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long srchSrno;

    @Column(nullable = false)
    private Long userSrno;

    @Column
    private LocalDateTime srchDh;
    @Column
    private Set<String> srchWrd;

}
