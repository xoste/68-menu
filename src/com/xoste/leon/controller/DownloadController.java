package com.xoste.leon.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @author Leon
 */
@Controller
public class DownloadController {
    /**
     * index.jsp页面传过来的链接参数
     * */
    @RequestMapping("/download")
    public void download(String fileName, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
        ServletOutputStream outputStream = resp.getOutputStream();
        String realPath = req.getServletContext().getRealPath("files");
        System.out.println(realPath);
        File file = new File(realPath, fileName);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }
}
