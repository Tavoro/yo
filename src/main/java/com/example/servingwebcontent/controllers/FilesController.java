package com.example.servingwebcontent.controllers;


import com.example.servingwebcontent.services.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value="/download")
public class FilesController {

    @Autowired
    FilesService fileService;

    @GetMapping
    public void getFile(HttpSession session, HttpServletResponse response, @RequestParam(name = "dir") String dir,
                        @RequestParam(name = "name") String name) throws Exception {
        fileService.getFile(session,response,dir,name);
    }
}
