package com.example.servingwebcontent.controllers;


import com.example.servingwebcontent.services.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @author Filatov
 * Контроллер для скачивания файла, с помощью сервиса FilesService.
 * Пример запроса в браузере (http://localhost:8080/download?name=primer.txt&dir=C:/)
 */
@RestController
@RequestMapping(value="/download")
public class FilesController {

    @Autowired
    FilesService fileService;

    /**
     *Метод сервиса FilesService для скачки файла.
     * @param session  Сессия
     * @param response Сервлет
     * @param dir      Путь к файлу
     * @param name     Имя файла
     * @throws Exception Если файла нет, то ошибка.
     */
    @GetMapping
    public void getFile(HttpSession session, HttpServletResponse response,
                        @RequestParam(name = "dir") String dir,
                        @RequestParam(name = "name") String name) throws Exception {
        fileService.getFile(session,response,dir,name);
    }
}
