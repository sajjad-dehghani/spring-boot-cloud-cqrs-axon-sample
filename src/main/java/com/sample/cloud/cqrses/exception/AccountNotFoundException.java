package com.sample.cloud.cqrses.exception;

import java.util.UUID;

public class AccountNotFoundException extends Throwable {
    public AccountNotFoundException(UUID id) {
        super("Cannot found account number [" + id + "]");
    }
}
