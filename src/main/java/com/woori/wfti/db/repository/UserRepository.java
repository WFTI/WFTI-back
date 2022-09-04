package com.woori.wfti.db.repository;


import com.woori.wfti.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 유저 모델 관련 디비 쿼리 생성을 위한 JPA Query Method 인터페이스 정의
 */
//JpaRepository 상속받으면서 제네릭에 사용할 entity와 ID타입이 될 수 있는 클래스
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
