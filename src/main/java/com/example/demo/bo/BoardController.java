package com.example.demo.bo;

import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;
    @GetMapping("/boards")
    public String boardList() {
        return "board/board-list";
    }

    @GetMapping("/boards/write")
    public String boardWrite() {
        return "board/board-write";
    }
    @PostMapping("/boards")
    public String saveBoard(BoardVO boardVO, HttpServletRequest request){
        System.out.println(boardVO);

        HttpSession session = request.getSession();
        String loginId = session.getAttribute("loginId").toString();

        boardVO.setCreateAccountId(loginId);
        boardVO.setModifyAccountId(loginId);

        boardService.saveBoard(boardVO);

        return "redirect:/boards";
    }
}
