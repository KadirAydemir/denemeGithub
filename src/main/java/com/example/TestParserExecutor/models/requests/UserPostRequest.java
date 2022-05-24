package com.example.TestParserExecutor.models.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class UserPostRequest {
    private String name;
    private String surname;
}
