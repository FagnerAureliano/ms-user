package com.ms.user.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ms.user.dtos.EmailDTO;
import com.ms.user.models.UserModel;

@Component
public class UserProducer {

    final RabbitTemplate rabbitTemplate;

    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${broker.queue.email.name}")
    private String routingKey;


    public void publishMessageEmail(UserModel userModel) {
        var emailDTO = new EmailDTO();
        emailDTO.setUserId(userModel.getUserId());
        emailDTO.setEmailTo(userModel.getEmail());
        emailDTO.setSubject("Welcome to our platform");
        emailDTO.setText(userModel.getName() + ", You have been successfully registered to our platform");

        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }

}
