package com.woori.wfti.db.repository;

import com.woori.wfti.db.entity.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<ClubEntity, Long> {
}
