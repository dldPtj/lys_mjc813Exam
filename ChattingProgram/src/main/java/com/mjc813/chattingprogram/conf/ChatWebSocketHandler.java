package com.mjc813.chattingprogram.conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mjc813.chattingprogram.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class ChatWebSocketHandler extends TextWebSocketHandler {
    @Autowired
    private ChatRoomService chatRoomService;
    @Autowired
    private ObjectMapper objectMapper;


}
