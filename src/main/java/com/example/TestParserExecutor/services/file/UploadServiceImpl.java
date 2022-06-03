package com.example.TestParserExecutor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Kadir Aydemir
 */
@Service
public class UploadServiceImpl implements UploadService {
    @Autowired
    ZipService zipService;
    @Autowired
    GithubService githubService;

    @Override
    public boolean saveFile(MultipartFile file) {
        try (InputStream in = file.getInputStream()) {
            String fileName = file.getOriginalFilename();
            String folderPath = System.getProperty("user.dir") + File.separator + "uploads";
            String filePath = folderPath + File.separator + fileName;

            // Copies Spring's multipartfile inputStream to /sismed/temp/exames (absolute path)
            Files.copy(in, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);

            boolean result = zipService.unzipFile(filePath, folderPath);


            githubService.createRepo("asd");
            return result;
        } catch (IOException e) {
            return false;
        }
    }
}
