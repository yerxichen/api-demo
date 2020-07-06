package com.sjq.demo.controller;

import com.sjq.demo.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(value = "/upload")
public class FileUploadController {
    static Logger logger= LoggerFactory.getLogger(FileUploadController.class);

    @Value("${fileDir}")
    private String fileDir;

    @PostMapping("/fileUpload")
    @ResponseBody
    public ResponseResult fileUpload(@RequestParam MultipartFile file) {
        logger.info(fileDir);
        File filePath=new File(fileDir);
        if(!filePath.exists()){
            filePath.mkdirs();
        }
        File tempFile=new File(fileDir+file.getOriginalFilename());
        try {
            file.transferTo(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseResult.success();
    }
}
