package com.programmers.catapi.request.catopenapi;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.programmers.catapi.request.catopenapi.dto.CatInformationDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest(properties = {"env=default"})
@Disabled("CAT OPEN API 동작에 영향을 받으므로 테스트에 추가하지 않는다.")
public class CatOpenAPITest {

    @Autowired
    private CatOpenAPI catClient;

    @DisplayName("CAT OPEN API를 통해 고양이 정보를 가져올 수 있다.")
    @Test
    void catOpenApiTest() {

        List<CatInformationDto> cats = catClient.getCatInformation(5);
        System.out.println(cats.toString());

        assertThat(cats.size()).isEqualTo(5);
    }
}
