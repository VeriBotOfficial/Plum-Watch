package com.wakeup.howear.view.user.login.bean;

import java.util.List;

/* loaded from: classes4.dex */
public class WeChatUserInfoModel {
    private String city;
    private String country;
    private String headimgurl;
    private String nickname;
    private String openid;
    private List<String> privilege;
    private String province;
    private int sex;
    private String unionid;

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String str) {
        this.openid = str;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public String getHeadimgurl() {
        return this.headimgurl;
    }

    public void setHeadimgurl(String str) {
        this.headimgurl = str;
    }

    public String getUnionid() {
        return this.unionid;
    }

    public void setUnionid(String str) {
        this.unionid = str;
    }

    public List<String> getPrivilege() {
        return this.privilege;
    }

    public void setPrivilege(List<String> list) {
        this.privilege = list;
    }
}
