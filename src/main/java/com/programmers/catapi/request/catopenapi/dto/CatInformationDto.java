package com.programmers.catapi.request.catopenapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CatInformationDto {
    private final String id;
    private final String url;
    private final int width;
    private final int height;
}
