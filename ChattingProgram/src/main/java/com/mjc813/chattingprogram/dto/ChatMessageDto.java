package com.mjc813.chattingprogram.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessageDto {
    private ChatMessageType msgType;
    private Long roomId;
    private String writer;
    private String message;
}
