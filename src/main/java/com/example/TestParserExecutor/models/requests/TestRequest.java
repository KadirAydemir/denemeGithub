package com.example.TestParserExecutor.models.requests;

import com.example.TestParserExecutor.models.enums.TestType;
import junit.framework.Test;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class TestRequest {
    private TestType testType;
    private String testCase;
    private String expected;
}
