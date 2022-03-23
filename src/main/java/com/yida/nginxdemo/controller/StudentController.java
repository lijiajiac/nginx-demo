package com.yida.nginxdemo.controller;

import com.yida.nginxdemo.entity.Student;
import com.yida.nginxdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2022-03-14 17:27:25
 */
@Controller
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    @Value("${server.port}")
    private Integer port;

   @GetMapping("/index")
    public String index(Model model) {
       model.addAttribute("port",port);
       return "index";
   }

   @ResponseBody
   @PostMapping("/selectBirth")
    public Object selectBirth(@RequestParam("beginTime")String beginTime,@RequestParam("endTime")String endTime){
       List<Student> students = studentService.queryBirth(beginTime, endTime);
       return students;
   }
}

