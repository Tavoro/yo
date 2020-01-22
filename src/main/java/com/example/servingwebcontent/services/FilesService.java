package com.example.servingwebcontent.Services;


import com.example.servingwebcontent.Repositorys.UsersRepository;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Service
public class FilesService {

    public void getFile(HttpSession session, HttpServletResponse response,String dir,String name) throws Exception {
        try {
            File fileToDownload = new File(dir+name);

            InputStream inputStream = new FileInputStream(fileToDownload);
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment; filename="+name);
            IOUtils.copy(inputStream, response.getOutputStream());
            response.flushBuffer();
            inputStream.close();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
