package com.woori.wfti.api.service;

import com.woori.wfti.db.entity.ClubEntity;
import com.woori.wfti.db.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public ClubEntity createClub(final ClubEntity createClub) {
        if(createClub == null) throw new IllegalArgumentException("ClubEntity cannot be null");
        return clubRepository.save(createClub);
    }

    public List<ClubEntity> getClubs() {
        List<ClubEntity> clubs = clubRepository.findAll();

        if(!clubs.isEmpty()) return clubRepository.findAll();
        else throw new IllegalArgumentException("no such data");
    }
}
