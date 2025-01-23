package org.hyeonqz.cleanarchitectureexample.infrastructure.mappers;

import kr.co.qrbank.admin.domain.MerchantTerminalDomain;
import kr.co.qrbank.database.entities.MerchantTerminal;

public class MerchantTerminalMapper {

    public static MerchantTerminalDomain toDomain(MerchantTerminal merchantTerminal) {
        return MerchantTerminalDomain.builder()
                .merchant(merchantTerminal.getMerchant())
                .uuid(merchantTerminal.getUuid())
                .shortUuid(merchantTerminal.getShortUuid())
                .name(merchantTerminal.getName())
                .createTime(merchantTerminal.getCreateTime())
                .createAt(merchantTerminal.getCreateAt())
                .createBy(merchantTerminal.getCreateBy())
                .updateTime(merchantTerminal.getUpdateTime())
                .updateAt(merchantTerminal.getUpdateAt())
                .updateBy(merchantTerminal.getUpdateBy())
                .deleteTime(merchantTerminal.getDeleteTime())
                .deleteAt(merchantTerminal.getDeleteAt())
                .deleteBy(merchantTerminal.getDeleteBy())
                .build();
    }
}
