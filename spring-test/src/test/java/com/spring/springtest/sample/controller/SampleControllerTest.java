package com.spring.springtest.sample.controller;

import com.spring.springtest.sample.service.SampleService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SampleControllerTest {

    @MockBean
    private SampleService mockSampleService;

    /*
    * WebAPI test
    */
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void hello() throws Exception{
//
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello bbung"))
//                .andDo(print());
//    }

    /*
    * 통합 테스트
    * ServletContainer 동작
    * @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
     */
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Test
//    public void hello() throws Exception{
//
////        when(mockSampleService.getName()).thenReturn("rai");
//
//        String result = testRestTemplate.getForObject("/hello", String.class);
//
//        assertThat(result).isEqualTo("hello bbung");
//    }

    /*
    * a sychronize로 동작한다.
    * 응답이 온 후 콜백이 동작
     */
//    @Autowired
//    private WebTestClient webTestClient;
//
//    @Test
//    public void hello() throws Exception{
//        when(mockSampleService.getName()).thenReturn("rai");
//
//        webTestClient.get().uri("/hello").exchange()
//                .expectStatus().isOk()
//                .expectBody(String.class)
//                .isEqualTo("hello rai");
//    }

}