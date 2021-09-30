package com.dm.book.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void rombokTest(){
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name); // assertThat = 테스트 검증 라이브러리의 검증 메소드. 검증하고싶은 메소드를 인자로 받는다.
        assertThat(dto.getAmount()).isEqualTo(amount); // isEqualTo = assertThat에 있는 값과 isEqualTo의 값이 같을 경우 성공
    }
}
