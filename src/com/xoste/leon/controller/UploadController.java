package com.xoste.leon.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Leon
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    public String upload(MultipartFile file, String name) throws IOException {
        System.out.println("name = " + name);
        String filename = file.getOriginalFilename();
        System.out.println("filename..." + filename);
        String suffix = filename.substring(filename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid..." + uuid);
        FileUtils.copyInputStreamToFile(file.getInputStream(), new File("I:\\重要文件\\Desktop\\" + uuid + suffix));
        return "/index.jsp";
    }
}
