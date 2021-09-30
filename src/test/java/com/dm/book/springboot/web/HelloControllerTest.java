package com.dm.book.springboot.web;

import com.dm.book.springboot.web.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class) // SpringBoot와 JUnit 사이의 연결자
@WebMvcTest(controllers = HelloController.class) // @Controller, @Controller Advice 사용가능하게함, @Service, @Component, @Repository는 사용 불가능
public class HelloControllerTest {
    @Autowired // Spring이 관리하는 Bean을 주입받음
    private MockMvc mvc; // 웹 API(GET, POST등)을 테스트함

    @Test
    public void sayHello() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk()) // HTTP Status Code 200만 검사
                .andExpect(content().string(hello)); // 출력되는 내용물이 hello가 맞는지 검사
    }
}
