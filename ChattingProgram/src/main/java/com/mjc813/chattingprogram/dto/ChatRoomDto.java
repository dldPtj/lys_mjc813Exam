package com.mjc813.chattingprogram.dto;

import com.mjc813.chattingprogram.conf.ChatWebSocketSession;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoomDto {
    private String roomName;
    private Long id;
    private List<ChatWebSocketSession> chatUserList;
    public Integer getCount() {
        return chatUserList == null ? 0 : chatUserList.size();
    }
}
