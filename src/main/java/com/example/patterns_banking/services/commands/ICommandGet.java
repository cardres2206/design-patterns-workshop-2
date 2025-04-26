package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.models.Account;

import java.util.List;

public interface ICommandGet<T> {
    List<Account> execute();
}
