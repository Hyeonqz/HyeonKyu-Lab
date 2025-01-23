package org.hyeonqz.cleanarchitectureexample.domain;

import java.time.Instant;
import java.util.UUID;

import kr.co.qrbank.database.entities.Merchant;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MerchantTerminalDomain {

    private Long id;

    private Merchant merchant;

    private UUID uuid;

    private String shortUuid;

    private String name;

    private Instant createTime;

    private String createAt;

    private String createBy;

    private Instant updateTime;

    private String updateAt;

    private String updateBy;

    private Instant deleteTime;

    private String deleteAt;

    private String deleteBy;

    // 도메인 로직 작성
}
