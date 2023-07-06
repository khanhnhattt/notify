package app.khanhnhatt.notify.service.impl;

import app.khanhnhatt.notify.domain.SendEmailDTO;
import app.khanhnhatt.notify.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@RequiredArgsConstructor
public abstract class NotificationServiceImpl implements NotificationService {

    private final JavaMailSenderImpl mailSender;

    @Override
    public String sendEmail(SendEmailDTO sendEmailDTO) {

        // SendEmail information
        String toAddress = sendEmailDTO.getToAddress();
        String subject = sendEmailDTO.getSubject();
        String body = sendEmailDTO.getBody();

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(toAddress);
        msg.setSubject(subject);
        msg.setText(body);

        mailSender.send(msg);
        return "Email sent successfully to " + toAddress;
    }

}
