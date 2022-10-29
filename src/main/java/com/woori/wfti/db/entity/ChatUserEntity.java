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
    @Column(name="ROW_ID")
    private String rowId;

    @Column(nullable = false)
    private Long chatSrno;

    @Column
    private Boolean useYn;

}
