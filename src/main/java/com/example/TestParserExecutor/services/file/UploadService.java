package com.example.TestParserExecutor.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @author Kadir Aydemir
 */
@Service
public interface UploadService {
    boolean saveFile(MultipartFile file);
}
