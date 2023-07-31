package com.Twiliosms.Twiliosms.Controller;

import com.Twiliosms.Twiliosms.Payload.SmsRequest;
import com.Twiliosms.Twiliosms.Service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SmsController {
    private final SmsService smsService;
    @Autowired
    public SmsController(SmsService smsService) {

        this.smsService = smsService;
    }

    //@PostMapping("/send-sms")
    //public void sendSms(@RequestBody SmsRequest smsRequest){
      //  smsService.sendSms(smsRequest.getToPhoneNumber(),smsRequest.getMessage());
    //}
    @RequestMapping(value = "/send-sms", method = RequestMethod.POST)
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest.getToPhoneNumber(), smsRequest.getMessage());
    }

}

