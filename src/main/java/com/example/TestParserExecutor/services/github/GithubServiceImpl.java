package com.example.TestParserExecutor.services;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author Kadir Aydemir
 */
@Service
public class GithubServiceImpl implements GithubService {
    @Override
    public boolean createRepo(String filePath) {

        String branchName="name";
        String branchId="bid";
        String sourceBranch="sb";
        String alias="ppp";

        String[] command = {"curl","-H","Authorization: token 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", "--data" ,"{\"name\":\"KADIR\"}", "https://api.github.com/user/repos"};
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;

        try
        {
            p = process.start();
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ( (line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            String result = builder.toString();
            System.out.print(result);

        }
        catch (IOException e)
        {   System.out.print("error");
            e.printStackTrace();
        }


        return false;
    }
}
