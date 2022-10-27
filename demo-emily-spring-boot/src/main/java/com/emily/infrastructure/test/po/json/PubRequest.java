package com.emily.infrastructure.test.po.json;

import com.emily.infrastructure.common.sensitive.SensitiveType;
import com.emily.infrastructure.common.sensitive.annotation.JsonIgnore;

import java.util.Map;

/**
 * @Description :
 * @Author :  姚明洋
 * @CreateDate :  Created in 2022/10/27 10:53 上午
 */
public class PubRequest {
    @JsonIgnore(type = SensitiveType.USERNAME)
    public String username;
    @JsonIgnore
    public String password;
    @JsonIgnore(type = SensitiveType.EMAIL)
    public String email;
    @JsonIgnore(type = SensitiveType.ID_CARD)
    public String idCard;
    @JsonIgnore(type = SensitiveType.BANK_CARD)
    public String bankCard;
    @JsonIgnore(type = SensitiveType.MOBILE_PHONE)
    public String phone;
    @JsonIgnore(type = SensitiveType.FIXED_PHONE)
    public String mobile;
    public Job job;
    public Map<String, Object> work;


    public static class Job {
        @JsonIgnore(type = SensitiveType.DEFAULT)
        public String work;
        @JsonIgnore(type = SensitiveType.EMAIL)
        public String email;

    }
}
