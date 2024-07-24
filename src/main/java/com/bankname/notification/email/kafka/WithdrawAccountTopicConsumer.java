package com.bankname.notification.email.kafka;


import com.bankname.banking.model.AccountDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class WithdrawAccountTopicConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaListener
            (
                    id = "withdraw-account-listener",
                    topics = "withdraw-account-topic",
                    groupId = "withdraw-account-listener"
            )
    public void consume(AccountDTO accountDTO) {
        LOGGER.info("Received event from Withdraw Account Topic: {}", accountDTO.toString());
    }
}
