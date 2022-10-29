package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="chat_user_th")    //테이블명
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatUserEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long chatUserId;

    @Column(nullable = false)
    private Long chatSrno;

    @Column(nullable = false)
    private Long clubSrno;

    @Column
    private Boolean useYn;
    @Column
    private LocalDateTime rgsDh;

}
