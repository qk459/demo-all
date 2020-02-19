package com.example.demoall.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 */
@Controller
@RequestMapping("/com/example/demoall/demo/FileUpload")
public class FileUpload {

        @RequestMapping("getFiledFrom")
        public void getFiledFrom(@RequestParam("head_img") MultipartFile file,String userName) throws IOException {
                System.out.println(userName);
                String fileName= file.getOriginalFilename();
                System.out.println("fileName:"+fileName);
                File outfile=new File("C:\\Users\\Public\\Desktop\\"+fileName);
                file.transferTo(outfile);
        }




}
