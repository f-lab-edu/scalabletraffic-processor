package org.processor.domain.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum UserSocialType {

    NAVER("네이버"),
    KAKAO("카카오톡");

    private final String value;

    public String getKey() {
        return name();
    }
}
