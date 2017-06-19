package com.example.multipleDataSource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Laurance on 2017/6/19.
 */
@RestController
public class DockerController {

    @GetMapping("/")
    public String docker() {
        return "<h1>This is my 1st Docker Demo</h1>";
    }
}
