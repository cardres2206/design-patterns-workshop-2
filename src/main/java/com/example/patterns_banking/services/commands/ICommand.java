package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.models.Account;


public interface ICommand<T> {
  Account execute();
}
