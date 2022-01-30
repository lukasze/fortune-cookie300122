package com.example.cookieservice.controller.openfeign;

import com.example.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="DECISION-SERVICE")
public interface DecisionClient {
    @GetMapping("/decision")
    Message getMsg();
}
