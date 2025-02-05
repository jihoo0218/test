package com.example.demo.bo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/boards")
    public String boardList() {
        return "board/board-list";
    }

    @GetMapping("/boards/write")
    public String boardWrite() {
        return "board/board-write";
    }
}
