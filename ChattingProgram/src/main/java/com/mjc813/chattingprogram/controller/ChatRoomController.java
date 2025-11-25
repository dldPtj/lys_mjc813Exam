package com.mjc813.chattingprogram.controller;

import com.mjc813.chattingprogram.dto.ChatRoomDto;
import com.mjc813.chattingprogram.service.ChatRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/websocket")
public class ChatRoomController {
    @Autowired
    private ChatRoomService chatRoomService;

    @GetMapping("/list")
    public String getRoomlist(Model model) {
        List<ChatRoomDto> all = this.chatRoomService.findAll();
        model.addAttribute("list", all);
        return "/chat/roomlist";
    }

    @PostMapping("/insert")
    public String insertRoom(Model model, String roomName, String writer) {
        this.chatRoomService.insert(roomName);
        return "redirect:/websocket/list";
    }

    @GetMapping("/enter")
    public String enterRoom(Model model, Long roomId, String writer) {
        ChatRoomDto find = this.chatRoomService.findByRoomId(roomId);
        if ( find == null ) {
            return "redirect:/websocket/list";
        } else {
            model.addAttribute("chatRoom", find);
            model.addAttribute("writer", writer);
            return "/chat/room";
        }
    }
}
