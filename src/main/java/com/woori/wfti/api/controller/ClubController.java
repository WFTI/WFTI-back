package com.woori.wfti.api.controller;

import com.woori.wfti.api.service.ClubService;
import com.woori.wfti.db.entity.ClubEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController             // Json 형태 결과값을 반환 @ResponseBody 버전 업
@RequiredArgsConstructor    // final 객체를 Constructor 주입 해줌 (Autowired 역할)
@RequestMapping("/v1/club")      // version 1 API
public class ClubController {
    @Autowired
    private ClubService clubService;

    /**
     * 모든 소모임 조회
     * @return
     * @throws
     */
    @GetMapping("club")
    public List<ClubEntity> findAllUser() {

        return clubService.getClubs();
    }

    /**
     * 새로운 모임 등록
     * @return
     * @throws
     */
    @PostMapping("createClub")
    public ClubEntity createClub() {
        final ClubEntity club = ClubEntity.builder()
                .rgsUserSrno(2L)
                .clubNm("클럽1")
                .build();
        return clubService.createClub(club);
    }

}
