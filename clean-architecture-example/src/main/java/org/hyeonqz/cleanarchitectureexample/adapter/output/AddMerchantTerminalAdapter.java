package org.hyeonqz.cleanarchitectureexample.adapter.output;

import org.hyeonqz.cleanarchitectureexample.infrastructure.mappers.MerchantTerminalMapper;
import org.springframework.stereotype.Repository;

import kr.co.qrbank.admin.application.port.output.AddMerchantTerminalPort;
import kr.co.qrbank.admin.domain.MerchantTerminalDomain;
import kr.co.qrbank.database.repositories.MerchantTerminalRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class AddMerchantTerminalAdapter implements AddMerchantTerminalPort {

    private final MerchantTerminalRepository merchantTerminalRepository;

    @Override
    public MerchantTerminalDomain save(MerchantTerminalDomain merchantTerminalDomain) {

        // domain -> to entity
        MerchantTerminal merchantTerminal = MerchantTerminal.builder().build();

        // save
        merchantTerminalRepository.save(merchantTerminal);

        // entity -> domain
        MerchantTerminalDomain merchantTerminalDomain = MerchantTerminalMapper.toDomain();

        return merchantTerminalDomain;
    }

}
