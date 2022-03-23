package com.yida.nginxdemo.service;

import com.yida.nginxdemo.entity.Student;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2022-03-14 17:27:26
 */
public interface StudentService {

    List<Student> queryBirth(String beginTime, String endTime);
}
