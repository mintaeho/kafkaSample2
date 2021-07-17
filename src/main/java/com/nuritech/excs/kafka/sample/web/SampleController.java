package com.nuritech.excs.kafka.sample.web;


import com.nuritech.excs.kafka.sample.dto.Greeting;
import com.nuritech.excs.kafka.sample.service.MessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Kafka와 연동하여 메세지를 주고 받는 샘플코드 입니다.
 * Kafka 설정을 Bean 으로 구현해서 여러 개 설정을 관리한다.
 *
 * 테스트 방법 : Postman을 통해 Http POST 방식으로 다음 URL Call
 * localhost:8080/kafka/test
 */
@RequiredArgsConstructor
@Slf4j
@RestController
public class SampleController {

    private final MessageProducer producer;

    @GetMapping(value = "/kafka/test")
    public void test() {

        producer.sendMessage("Hello, World!");
        for(int i=0 ; i<5 ; i++) {
            producer.sendMessageToPartion("Hello to Partioned Topic!", i);
        }
        producer.sendMessageToFiltered("Hello Baeldung!");
        producer.sendMessageToFiltered("Hello World!");
        producer.sendGreetingMessage(new Greeting("Greetings", "World!"));

    }


}
