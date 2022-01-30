package com.example.cookieservice.controller.openfeign;

import com.example.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ACTIVITY-SERVICE")
public interface ActivityClient {
    @GetMapping("/activity")
    Message getMsg();
}
