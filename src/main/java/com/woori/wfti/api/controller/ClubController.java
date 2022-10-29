package com.woori.wfti.api.controller;

import com.woori.wfti.api.service.ClubService;
import com.woori.wfti.db.entity.ClubEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("selectClubs")
    public List<ClubEntity> selectClubs() {
        return clubService.getClubs();
    }

    /**
     * 새로운 모임 등록
     * @return
     * @throws
     */
    @PostMapping("createClub")
    public ResponseEntity<ClubEntity> createClub(@RequestBody ClubEntity requestClub) {
        final ClubEntity responseClub = ClubEntity.builder()
                .clubNm(requestClub.getClubDescTxt()) // 클럽 이름
                .clubSrno(requestClub.getClubSrno()) // 클럽 일련번호
                .clubDescTxt(requestClub.getClubDescTxt()) // 클럽 설명
                .rgsUserSrno(requestClub.getRgsUserSrno()) // 소모임 최초 등록 회원
                .rgsDh(requestClub.getRgsDh()) // 소모임 최초 등록 회원번호
                .build();
        return new ResponseEntity<>(clubService.createClub(responseClub), HttpStatus.CREATED);
    }

    /**
     * 소모임 정보 수정
     * @return 수정된 소모임 정보(이름 or 설명)
     * @throws
     */
    @PutMapping("updateClub")
    public ResponseEntity<ClubEntity> updateClub(@RequestBody ClubEntity requestClub) {
        final ClubEntity responseClub = ClubEntity.builder()
                .clubNm(requestClub.getClubDescTxt()) // 클럽 이름
                .clubSrno(requestClub.getClubSrno()) // 클럽 일련번호
                .clubDescTxt(requestClub.getClubDescTxt()) // 클럽 설명
                .chgDh(requestClub.getChgDh()) // 소모임 정보 마지막 수정 일자
                .chgUserSrno(requestClub.getChgUserSrno()) // 소모임 정보 마지막 수정 회원
                .build();
        return new ResponseEntity<>(clubService.createClub(responseClub), HttpStatus.ACCEPTED);
    }

}
