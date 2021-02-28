package com.yewer.springbootmybatismulidatasource.mapper.ds1;

import com.yewer.springbootmybatismulidatasource.entity.User;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yewer
 * @since 2021-02-27
 */
public interface User1Mapper {
    User selectByPrimaryKey(Long id);
}
