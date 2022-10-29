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
     * @return 새로운 일정에 대한 채팅방 정보
     * @throws
     */
    @PostMapping("createChat")
    public ResponseEntity<ChatEntity> createChat(@RequestBody ChatEntity requestChat) {
        ChatEntity responseChat = ChatEntity.builder()
                .clubSrno(requestChat.getClubSrno()) // 소모임일련번호
                .calSrno(requestChat.getCalSrno()) // 일정일련번호
                .chatUrl(requestChat.getChatUrl()) // 채팅 url
                .useYn(requestChat.getUseYn()) // 사용여부(DELETE 없이 사용하지 않을 경우 N)
                .build();
        return new ResponseEntity<>(chatService.createChat(responseChat), HttpStatus.OK);
    }
}
