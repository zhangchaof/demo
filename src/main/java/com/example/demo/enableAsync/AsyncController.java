package com.example.demo.enableAsync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Slf4j
@RestController
public class AsyncController {

    @Autowired
    UserService userService;

    @GetMapping("/tt")
    public Object tt() throws InterruptedException {
        String username = userService.findUserNameById(1L);
        log.info("AsyncController----------->" + Thread.currentThread().getName());
        log.info("username---------------->" + username);
        return username;
    }

    @GetMapping("/tt1")
    public Object tt1() throws InterruptedException, ExecutionException {
        String username = userService.findUserNameById(1L);
        log.info("AsyncController----------->" + Thread.currentThread().getName());
        log.info("username---------------->" + username);
        Future<String> future = userService.findLastNameById(1L);

        String lastname = future.get();
        log.info("lastname---------------->" + lastname + Thread.currentThread().getName());
        return username;
    }
}
