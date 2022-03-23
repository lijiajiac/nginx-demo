package com.yida.nginxdemo.dao;

import com.yida.nginxdemo.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-14 17:27:25
 */
public interface StudentDao {
    List<Student> queryBirth(@Param("beginTime")String beginTime, @Param("endTime")String endTime);

}

