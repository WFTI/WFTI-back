package com.woori.wfti.api.controller;

import com.woori.wfti.db.entity.ClubEntity;
import com.woori.wfti.db.entity.UserEntity;
import com.woori.wfti.db.repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController             // Json 형태 결과값을 반환 @ResponseBody 버전 업
@RequiredArgsConstructor    // final 객체를 Constructor 주입 해줌 (Autowired 역할)
@RequestMapping("/v1")      // version 1 API
public class ClubController {

    private final ClubRepository clubRepository;

    /**
     * 모임 조회
     */
    @GetMapping("club")
    public List<ClubEntity> findAllUser() {
        return clubRepository.findAll();
    }

    /**
     * 모임 등록 (테스트용)
     *
     */
    @PostMapping("club")
    public ClubEntity createClub() {
        final ClubEntity user = ClubEntity.builder()
                .rgsUserSrno(2L)
                .clubNm("클럽1")
                .build();
        return clubRepository.save(user);
    }

}
