package com.seunghwa.admin.book.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // final field -> constructor parameter
public class HelloResponseDto {

        private final String name;
        private final int amount;

}
