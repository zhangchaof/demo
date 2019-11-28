package com.example.demo.enableAsync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Async
    public String findUserNameById(Long id) {
        log.info("UserServiceImpl userName----------->" + Thread.currentThread().getName());
        return "关注公众号：java思维导图";
    }

    @Async
    public Future<String> findLastNameById(Long id) {
        log.info("UserServiceImpl LastName----------->" + Thread .currentThread().getName());
        return new AsyncResult<String >("关注公众号：java思维导图");

    }
}


