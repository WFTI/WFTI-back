package com.woori.wfti.db.repository;

import com.woori.wfti.db.entity.CalendarEntity;
import com.woori.wfti.db.entity.SearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<SearchEntity, Long> {
}
