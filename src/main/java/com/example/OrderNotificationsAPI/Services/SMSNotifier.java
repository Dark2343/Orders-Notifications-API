package com.example.OrderNotificationsAPI.Services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SMSNotifier{

    public void sendSMS(String to, String messageBody) {
        String twilioAuthToken = "sensitive";
        String twilioAccountSid = "sensitive";
        Twilio.init(twilioAccountSid, twilioAuthToken);

        String twilioPhoneNumber = "sensitive";
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(to),
                        new com.twilio.type.PhoneNumber(twilioPhoneNumber),
                        messageBody)
                .create();

    }
}
