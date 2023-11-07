package com.aixu.controller;

import com.aixu.domain.book.feign.BookClient;
import com.aixu.domain.book.vo.BookVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:52
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private BookClient bookClient;

    @GetMapping("/create")
    public BookVO createBook(){
        return bookClient.createBook();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
