package com.fabioantunes.spring.autosender.Controller;

import com.fabioantunes.spring.autosender.Domain.EmailStructure;
import com.fabioantunes.spring.autosender.Service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping(value="/mail")
    public String sendEmail(@RequestBody EmailStructure email){
        emailService.sendmail(email);
        return "Email sent succesfully";
    }

}
