package org.hyeonqz.cleanarchitectureexample.application.service;

import org.hyeonqz.cleanarchitectureexample.infrastructure.mappers.MerchantTerminalMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.qrbank.admin.application.command.AddMerchantTerminalCommand;
import kr.co.qrbank.admin.application.port.input.AddMerchantTerminalUseCase;
import kr.co.qrbank.admin.application.port.output.AddMerchantTerminalPort;
import kr.co.qrbank.admin.domain.MerchantTerminalDomain;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AddMerchantTerminalService implements AddMerchantTerminalUseCase {

    private final AddMerchantTerminalPort addMerchantTerminalPort;

    @Override
    public MerchantTerminalDomain addMerchantTerminal(AddMerchantTerminalCommand command) {

        // 비즈니스 로직 구현

        return null;
    }

}
