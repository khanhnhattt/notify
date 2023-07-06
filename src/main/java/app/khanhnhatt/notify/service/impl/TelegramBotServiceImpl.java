package app.khanhnhatt.notify.service;

import app.khanhnhatt.notify.domain.SendTelegramDTO;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramBotServiceImpl extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "the_amazing_bot";
    }

    @Override
    public String getBotToken() {
        return "6338033395:AAFlKkNlf7ndqM8_arpFkRLuPn-wBMlcg2Y";
    }

    public void sendMessage(SendTelegramDTO sendTelegramDTO) throws TelegramApiException {
        SendMessage message = new SendMessage(sendTelegramDTO.getChatId(), sendTelegramDTO.getMessage());
        execute(message);
    }
}
