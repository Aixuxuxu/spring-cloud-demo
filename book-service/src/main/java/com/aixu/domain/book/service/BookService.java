package com.aixu.domain.book.service;

import com.aixu.domain.book.dto.BookDTO;
import com.aixu.domain.book.vo.BookVO;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:30
 */
public interface BookService {

   BookVO createBook(BookDTO bookDTO);


}
