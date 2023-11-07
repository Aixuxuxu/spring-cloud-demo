package com.aixu.domain.book.service;

import cn.hutool.core.bean.BeanUtil;
import com.aixu.domain.book.Book;
import com.aixu.domain.book.dao.BookRepository;
import com.aixu.domain.book.dto.BookDTO;
import com.aixu.domain.book.vo.BookVO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:34
 */
@Service
public class BookServiceImpl implements BookService{

    @Resource
    private BookRepository bookRepository;

    @Autowired
    private JPAQueryFactory queryFactory;

    @Override
    public BookVO createBook(BookDTO bookDTO) {

        return BeanUtil.copyProperties(
                bookRepository.save(
                        bookRepository.save(BeanUtil.copyProperties(bookDTO, Book.class))
                ),
                BookVO.class
        );
    }
}
