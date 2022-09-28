package com.hrd.test.model2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public record UserCon(UserServ userServ) {

    @PostMapping("user")
    public void add(@RequestBody UserReq userReq){
        log.info("new user regis {}" , userReq);
        userServ.add(userReq);
    }
}
