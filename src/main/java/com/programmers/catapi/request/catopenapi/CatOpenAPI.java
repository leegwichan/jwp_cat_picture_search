package com.programmers.catapi.request.catopenapi;

import com.programmers.catapi.request.catopenapi.dto.CatInformationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@FeignClient(name = "cat-open-api", url = "https://api.thecatapi.com")
public interface CatOpenAPI {

    @RequestMapping(method = RequestMethod.GET,
            value = "/v1/images/search?limit={size}",
            headers = "x-api-key=${openapi.cat.api-key}")
    List<CatInformationDto> getCatInformation(@PathVariable(value = "size") int size);
}
