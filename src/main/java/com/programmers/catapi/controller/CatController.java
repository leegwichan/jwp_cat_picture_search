package com.programmers.catapi.controller;

import com.programmers.catapi.request.catopenapi.CatOpenAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CatController {

    private final CatOpenAPI catClient;

    @GetMapping("/test")
    private ResponseEntity get() {
        return new ResponseEntity(catClient.getCatInformation(5), HttpStatus.OK);
    }

}
