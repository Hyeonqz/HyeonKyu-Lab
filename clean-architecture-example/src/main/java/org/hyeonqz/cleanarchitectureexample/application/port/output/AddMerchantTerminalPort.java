package org.hyeonqz.cleanarchitectureexample.application.port.output;

import kr.co.qrbank.admin.domain.MerchantTerminalDomain;

@FunctionalInterface
public interface AddMerchantTerminalPort {
    MerchantTerminalDomain save(MerchantTerminalDomain merchantTerminalDomain);
}
