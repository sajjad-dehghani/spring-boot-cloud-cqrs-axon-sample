package com.sample.cloud.cqrses.event;

import lombok.Value;

import java.math.BigDecimal;
import java.util.UUID;

@Value
public class MoneyDebitedEvent {

    private final UUID id;
    private final BigDecimal debitAmount;
}
