package com.woori.wfti.api.service;

import com.woori.wfti.db.entity.ChatEntity;
import com.woori.wfti.db.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    public ChatEntity createChat(final ChatEntity createClub) {
        if(createClub == null) throw new IllegalArgumentException("ChatEntity cannot be null");
        return chatRepository.save(createClub);
    }

    public List<ChatEntity> getChats() {
        List<ChatEntity> chats = chatRepository.findAll();

        if(!chats.isEmpty()) return chatRepository.findAll();
        else throw new IllegalArgumentException("no such data");
    }
}
