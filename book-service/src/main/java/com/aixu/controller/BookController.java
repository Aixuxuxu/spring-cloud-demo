package com.aixu.controller;

import com.aixu.domain.book.dto.BookDTO;
import com.aixu.domain.book.service.BookService;
import com.aixu.domain.book.vo.BookVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:27
 */

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/create")
    public BookVO createBook() {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setName("Java");
        return bookService.createBook(bookDTO);
    }

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

}
