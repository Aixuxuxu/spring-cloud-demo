package com.aixu.domain.book.vo;

import com.aixu.domain.book.base.BaseBook;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:33
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BookVO extends BaseBook {

}
