package com.aixu.domain.book.dao;

import com.aixu.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:29
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>, QuerydslPredicateExecutor<Book> {
}
