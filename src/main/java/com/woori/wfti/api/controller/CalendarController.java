package com.woori.wfti.api.controller;

import com.woori.wfti.api.service.CalendarService;
import com.woori.wfti.db.entity.CalendarEntity;
import com.woori.wfti.db.entity.ChatEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController             // Json 형태 결과값을 반환 @ResponseBody 버전 업
@RequiredArgsConstructor    // final 객체를 Constructor 주입 해줌 (Autowired 역할)
@RequestMapping("/v1/calendar")      // version 1 API
public class CalendarController {
    @Autowired
    private CalendarService calendarService;

    /**
     * 새로운 일정 등록
     * @return 생성된 일정 정보, http status
     * @throws
     */
    @PostMapping("createCalendar")
    public ResponseEntity<CalendarEntity> createCalendar(@RequestBody CalendarEntity requestCalendar) {
        CalendarEntity responseCalendar = CalendarEntity.builder()
                .clubSrno(requestCalendar.getClubSrno()) // 소모임 일련번호
                .calDescTxt(requestCalendar.getCalDescTxt()) // 소모임 설명
                .clubCst(requestCalendar.getClubCst()) // 일정 비용
                .clubPlc(requestCalendar.getClubPlc()) // 일정 장소
                .stDh(requestCalendar.getStDh()) // 일정 시작일시
                .edDh(requestCalendar.getEdDh()) // 일정 마감일시
                .pubYn(requestCalendar.getPubYn()) // 공개일정여부
                .build();
        return new ResponseEntity<>(calendarService.createCalendar(responseCalendar), HttpStatus.OK);
    }
    
}
