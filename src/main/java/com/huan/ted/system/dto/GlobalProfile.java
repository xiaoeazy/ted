/*
 * #{copyright}#
 */

package com.huan.ted.system.dto;

/**
 * 用来表示一个全局的配置文件值.
 * 
 * @author huanghuan
 */
public class GlobalProfile {

    private String profileName;

    private String profileValue;

    public GlobalProfile() {
    }

    public GlobalProfile(String profileName, String profileValue) {
        this.profileName = profileName;
        this.profileValue = profileValue;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileValue() {
        return profileValue;
    }

    public void setProfileValue(String profileValue) {
        this.profileValue = profileValue;
    }
}
