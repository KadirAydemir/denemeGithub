package com.example.TestParserExecutor.services;

import org.springframework.stereotype.Service;

/**
 * @author Kadir Aydemir
 */
@Service
public interface ZipService {
    boolean unzipFile(String zipFileDestination, String destination);
}
