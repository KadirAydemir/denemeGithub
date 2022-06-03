package com.example.TestParserExecutor.services;

import org.springframework.stereotype.Service;

/**
 * @author Kadir Aydemir
 */
@Service
public interface GithubService {
    boolean createRepo(String filePath);
}
