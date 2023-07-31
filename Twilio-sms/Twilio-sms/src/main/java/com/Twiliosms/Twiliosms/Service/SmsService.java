package com.Twiliosms.Twiliosms.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    public void sendSms(String toPhoneNumber, String message) {
        Twilio.init(accountSid, authToken);

        Message.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber("+13344873305"), message)
                .create();
    }
}
