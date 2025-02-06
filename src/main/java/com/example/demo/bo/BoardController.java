package com.example.demo.bo;

import org.springframework.ui.Model;
import com.example.demo.dto.BoardDetailDto;
import com.example.demo.dto.BoardListDto;
import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    @GetMapping("/boards/list")
    @ResponseBody
    public ResponseEntity<List<BoardListDto>> getBoardList(){
        List<BoardListDto> boardList = boardService.getBoardList();

        return ResponseEntity.status(HttpStatus.OK).body(boardList);
    }
    @GetMapping("/boards/{boardIdx}/detail")
    public String boardDetailPage(@PathVariable int boardIdx, Model model){
        boardService.increaseViews(boardIdx);

        BoardDetailDto boardDetail = boardService.getBoardDetail(boardIdx);


        model.addAttribute("boardDetail",boardDetail);
        return "board/board-detail";
    }
}
