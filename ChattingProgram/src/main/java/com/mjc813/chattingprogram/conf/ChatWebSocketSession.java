package com.mjc813.chattingprogram.conf;

import lombok.*;
import org.springframework.web.socket.WebSocketSession;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatWebSocketSession {
    private WebSocketSession webSocketSession;
    private String writer;
}
