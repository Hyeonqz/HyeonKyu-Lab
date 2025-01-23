package org.hyeonqz.cleanarchitectureexample.application.port.input;

import kr.co.qrbank.admin.application.command.AddMerchantTerminalCommand;
import kr.co.qrbank.admin.domain.MerchantTerminalDomain;

@FunctionalInterface
public interface AddMerchantTerminalUseCase {
    MerchantTerminalDomain addMerchantTerminal(AddMerchantTerminalCommand command);
}
