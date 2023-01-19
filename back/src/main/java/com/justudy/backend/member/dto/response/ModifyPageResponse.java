package com.justudy.backend.member.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
public class ModifyPageResponse {

    private String username;

    private String region;

    private String level;

    private String ssafyId;

    private String userId;

    private String phone;

    private String email;

    private String[] category;

    private String dream;

    private String introduction;

    @Builder
    public ModifyPageResponse(String username, String region, String userId,
                              String level, String ssafyId,
                              String phone, String email,
                              String[] category, String dream, String introduction) {
        this.username = username;
        this.region = region;
        this.level = level;
        this.ssafyId = ssafyId;
        this.userId = userId;
        this.phone = phone;
        this.email = email;
        this.category = category;
        this.dream = dream;
        this.introduction = introduction;
    }
}
