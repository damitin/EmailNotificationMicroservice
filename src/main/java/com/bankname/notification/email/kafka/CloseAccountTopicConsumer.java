package com.bankname.notification.email.kafka;


import com.bankname.banking.model.AccountDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CloseAccountTopicConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(id = "close-account-listener", topics = "close-account-topic")
    public void consume(AccountDTO accountDTO) {
        LOGGER.info("Received event from Close Account Topic: {}", accountDTO.toString());
    }
}
