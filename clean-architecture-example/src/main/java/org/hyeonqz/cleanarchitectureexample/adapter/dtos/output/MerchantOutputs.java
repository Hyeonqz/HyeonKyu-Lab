package org.hyeonqz.cleanarchitectureexample.adapter.dtos.output;

import java.util.UUID;

import kr.co.qrbank.common.utils.TimeUtil;
import kr.co.qrbank.database.entities.MerchantTerminal;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@ToString
@Slf4j
public final class MerchantOutputs {

    @Getter
    @Builder(access = AccessLevel.PRIVATE)
    @ToString
    public static class Terminal {
        private Long id;
        private UUID uuid;
        private String shortUuid;
        private String name;
        private String createTime;

        public static Terminal fromEntity(MerchantTerminal merchantTerminal) {
            return Terminal.builder()
                    .id(merchantTerminal.getId())
                    .uuid(merchantTerminal.getUuid())
                    .shortUuid(merchantTerminal.getShortUuid())
                    .name(merchantTerminal.getName())
                    .createTime(TimeUtil.zonedTimeOfInstant("Asia/Seoul", merchantTerminal.getCreateTime()))
                    .build();
        }

    }

}
