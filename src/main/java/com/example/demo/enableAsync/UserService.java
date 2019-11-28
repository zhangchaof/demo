package com.example.demo.enableAsync;

import java.util.concurrent.Future;

public interface UserService {
    String findUserNameById(Long id);

    Future <String> findLastNameById(Long id);
}
