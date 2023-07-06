package app.khanhnhatt.notify.service;

import app.khanhnhatt.notify.domain.SendEmailDTO;
import app.khanhnhatt.notify.domain.SendTelegramDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    String sendEmail(SendEmailDTO sendEmailDTO);

    String sendTelegramMsg(SendTelegramDTO sendTelegramDTO);
}
