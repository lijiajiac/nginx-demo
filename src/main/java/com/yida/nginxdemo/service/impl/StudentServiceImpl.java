package com.yida.nginxdemo.service.impl;

import com.yida.nginxdemo.dao.StudentDao;
import com.yida.nginxdemo.entity.Student;
import com.yida.nginxdemo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2022-03-14 17:27:26
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> queryBirth(String begintime, String endtime) {
        return studentDao.queryBirth(begintime,endtime);
    }

}
