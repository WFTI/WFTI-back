package com.woori.wfti.db.entity;

import javax.persistence.*;

import lombok.*;

/**
 * 유저 모델 엔티티 정의
 */
// Entity가 붙은 클래스는 JPA가 관리하는 클래스, 테이블과 매핑할 클래스에 해당 어노테이션 사용
@Entity(name="user_tb")    //테이블명
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userSrno;
    @Column(nullable = false, unique = true)
    private String userEmpNo;
    @Column(nullable = false)
    private String userNm;

    public UserEntity(String userEmpNo, String userNm) {
        this.userEmpNo = userEmpNo;
        this.userNm = userNm;
    }
//    // userPw 값은 WirteOnly로 설정 필요 (@JsonIgnore, @JsonProperty)
//    private String userPw;
//    private Date lstSginDh;
//    private String LginYn;
//    private Date chgDh;
}
