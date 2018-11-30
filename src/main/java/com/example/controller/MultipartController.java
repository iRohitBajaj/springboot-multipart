package com.example.controller;

import com.example.model.Metadata;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipartController {

    @PostMapping(value = "/upload", consumes = {"multipart/form-data"})
    public String fileUpload(@RequestPart(value = "metadata", required = true) Metadata metadata,
                             @RequestPart(value = "file", required = true) byte[] file) {
        return "ok";
    }
}

