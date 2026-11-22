package com.wakeup.common.network.entity.redemptioncode;

/* loaded from: classes2.dex */
public class RecordBean {
    private String code;
    private String expireDate;
    private String icon;

    /* renamed from: id, reason: collision with root package name */
    private int f14241id;
    private String name;
    private int type;
    private int worthType;

    public int getId() {
        return this.f14241id;
    }

    public void setId(int id2) {
        this.f14241id = id2;
    }

    public int getWorthType() {
        return this.worthType;
    }

    public void setWorthType(int worthType) {
        this.worthType = worthType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getExpireDate() {
        return this.expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
