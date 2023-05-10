package com.programmers.catapi.request.catopenapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class CatInformationDto {
    private final String id;
    private final String url;
    private final int width;
    private final int height;
    private final List<Breed> breeds;
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class Breed {
    private String name;
    private String temperament;
    private String origin;
}



