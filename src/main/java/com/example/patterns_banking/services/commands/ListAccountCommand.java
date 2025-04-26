package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.dtos.AccountDTO;
import com.example.patterns_banking.factory.AccountFactory;
import com.example.patterns_banking.factory.AccountFactoryProvider;
import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.models.Customer;
import com.example.patterns_banking.repositories.IAccountRepository;
import com.example.patterns_banking.repositories.ICustomerRepository;

import java.util.List;
import java.util.Optional;

public class ListAccountCommand implements ICommandGet<Account> {
    private final IAccountRepository accountRepository;

    public ListAccountCommand(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> execute() {
        return accountRepository.findAll();

    }

}
