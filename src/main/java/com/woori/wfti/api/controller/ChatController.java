package com.woori.wfti.api.controller;

import com.woori.wfti.api.service.ChatService;
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
@RequestMapping("/v1/chat")      // version 1 API
public class ChatController {
    @Autowired
    private ChatService chatService;

    /**
     * 새로운 일정에 따른 채팅방 등록
     * @return
     * @throws
     */
    @PostMapping("createChat")
    public ResponseEntity<ChatEntity> createChat(@RequestBody ChatEntity requestChat) {
        ChatEntity responseChat = ChatEntity.builder()
                .chatSrno(1L) // 채팅방일련번호
                .clubSrno(1L) // 소모임일련번호
                .calSrno(1L) // 일정일련번호
                .build();
        return new ResponseEntity<ChatEntity>(chatService.createChat(responseChat), HttpStatus.OK);
    }
}
