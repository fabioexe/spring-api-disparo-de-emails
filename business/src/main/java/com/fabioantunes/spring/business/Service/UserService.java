package com.fabioantunes.spring.business.Service;

import com.fabioantunes.spring.business.Domain.User;
import com.fabioantunes.spring.business.Repository.UserRepository;
import com.fabioantunes.spring.business.Request.UserRequestBody;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRep;

    @Autowired
    private KafkaTemplate<String, User> template;

    public User saveUser(UserRequestBody userRequestBody){
        User userToReturn = new User().builder()
                .name(userRequestBody.getName())
                .email(userRequestBody.getEmail())
                .build();
        userRep.save(userToReturn);
        template.send("create-user", userToReturn);
        return userToReturn;

    }

}
