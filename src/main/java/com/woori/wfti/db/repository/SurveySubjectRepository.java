package com.woori.wfti.db.repository;

import com.woori.wfti.db.entity.SurveySubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveySubjectRepository extends JpaRepository<SurveySubjectEntity, Long> {
}
