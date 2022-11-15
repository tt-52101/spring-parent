package com.emily.infrastructure.test.po.json;

import com.emily.infrastructure.common.enums.DateFormatType;
import com.emily.infrastructure.common.sensitive.JsonSensitive;
import com.emily.infrastructure.common.sensitive.JsonSerialize;
import com.emily.infrastructure.common.sensitive.SensitiveType;

import java.util.Map;
import java.util.Set;

/**
 * @Description :
 * @Author :  Emily
 * @CreateDate :  Created in 2022/10/27 10:53 上午
 */
@JsonSerialize(include = true)
public class JsonResponse {
    private int a;
    private byte[] b;
    @JsonSensitive(SensitiveType.USERNAME)
    private String username;
    @JsonSensitive
    private String password;
    @JsonSensitive(SensitiveType.EMAIL)
    private String email;
    @JsonSensitive(SensitiveType.ID_CARD)
    private String idCard;
    @JsonSensitive(SensitiveType.BANK_CARD)
    private String bankCard;
    @JsonSensitive(SensitiveType.PHONE)
    private String phone;
    @JsonSensitive(SensitiveType.PHONE)
    private String mobile;
    private Job job;
    private Job[] jobs;
    private String[] arr;
    private Set<Job> list;
    private DateFormatType dateFormat;
    private Map<String, Object> work;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public byte[] getB() {
        return b;
    }

    public void setB(byte[] b) {
        this.b = b;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public DateFormatType getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormatType dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Job[] getJobs() {
        return jobs;
    }

    public void setJobs(Job[] jobs) {
        this.jobs = jobs;
    }

    public Set<Job> getList() {
        return list;
    }

    public void setList(Set<Job> list) {
        this.list = list;
    }

    public Map<String, Object> getWork() {
        return work;
    }

    public void setWork(Map<String, Object> work) {
        this.work = work;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class Job {
        @JsonSensitive(SensitiveType.DEFAULT)
        private String work;
        @JsonSensitive(SensitiveType.EMAIL)
        private String email;

        public String getWork() {
            return work;
        }

        public void setWork(String work) {
            this.work = work;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
