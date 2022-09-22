package com.java;

import org.springframework.stereotype.Service;

@Service
public record UserServ(UserRepo userRepo) {
    public void add(UserReq userReq) {
        User user = User.builder()
                .name(userReq.name())
                .build();
        userRepo.save(user);
    }
}
