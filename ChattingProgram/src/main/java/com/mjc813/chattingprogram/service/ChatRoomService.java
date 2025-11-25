package com.mjc813.chattingprogram.service;

import com.mjc813.chattingprogram.dto.ChatRoomDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ChatRoomService {
    private final Map<Long, ChatRoomDto> chatRoomCollection = new HashMap<>();

    public ChatRoomDto insert(String roomName) {
        ChatRoomDto newRoom = ChatRoomDto.builder()
                .roomName(roomName)
                .id(this.getNewId()).build();
        this.chatRoomCollection.put(newRoom.getId(), newRoom);
        return newRoom;
    }

    private Long getNewId() {
        Long newId = this.chatRoomCollection.values().stream()
                .mapToLong(x->x.getId()).max().orElse(0L);
        return newId + 1;
    }

    public ChatRoomDto findByRoomId(Long id) {
        ChatRoomDto findRoom = this.chatRoomCollection.values().stream()
                .filter(x -> id == x.getId()).findAny().orElse(null);
        return findRoom;
    }

    public List<ChatRoomDto> findAll() {
        return this.chatRoomCollection.values().stream().toList();
    }

    public void deleteByRoomId(Long roomId) {
        this.chatRoomCollection.remove(roomId);
    }
}
