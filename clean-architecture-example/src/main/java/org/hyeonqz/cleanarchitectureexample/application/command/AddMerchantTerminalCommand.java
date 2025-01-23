package org.hyeonqz.cleanarchitectureexample.application.command;

import kr.co.qrbank.admin.global.utils.CommandUtil;
import lombok.Getter;


@Getter
public record AddMerchantTerminalCommand(
        String merchantName,
        String posName) {

    public AddMerchantTerminalCommand {
        CommandUtil.throwIfNull(merchantName, "merchantName is null or blank.");
        CommandUtil.throwIfNull(posName, "posName is null or blank.");
    }

}
