package com.woori.wfti.db.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="chat_user_th")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ChatUserEntity extends BaseEntity{

    @Id
    @Column(name="ROW_ID")
    private String rowId;

    @Column(nullable = false)
    private Long chatSrno;

    @Column
    private Boolean useYn;

}
