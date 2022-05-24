package com.example.TestParserExecutor.models.mappers;

import com.example.TestParserExecutor.config.MappersConfig;
import com.example.TestParserExecutor.models.User;
import com.example.TestParserExecutor.models.requests.UserPostRequest;
import org.mapstruct.Mapper;


@Mapper(
        config = MappersConfig.class
)
public interface UserMapper {
    User from(UserPostRequest request);
}
