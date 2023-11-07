package com.aixu.domain.book.feign;

import com.aixu.domain.book.dto.BookDTO;
import com.aixu.domain.book.vo.BookVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:50
 */
@FeignClient(name = "bookApi", url = "http://localhost:8000/book")
public interface BookClient {

    @RequestMapping("/create")
    BookVO createBook();
}
