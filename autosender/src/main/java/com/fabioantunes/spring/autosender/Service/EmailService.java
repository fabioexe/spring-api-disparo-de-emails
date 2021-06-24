package com.fabioantunes.spring.autosender.Service;

import com.fabioantunes.spring.autosender.Domain.EmailStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendmail(EmailStructure email){
        SimpleMailMessage sm = new SimpleMailMessage();
        sm.setTo(email.getEmail());
        sm.setSubject(email.getName());
        sm.setText(email.getContent());

        mailSender.send(sm);
    }
}
