package com.wakeup.common.baidu.model;

/* loaded from: classes2.dex */
public class BceData {
    private int action;
    private String hitType;
    private String isSafe;
    private String langType;
    private String subHitType;

    public String getHitType() {
        return this.hitType;
    }

    public void setHitType(String hitType) {
        this.hitType = hitType;
    }

    public String getSubHitType() {
        return this.subHitType;
    }

    public void setSubHitType(String subHitType) {
        this.subHitType = subHitType;
    }

    public int getAction() {
        return this.action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public String getLangType() {
        return this.langType;
    }

    public void setLangType(String langType) {
        this.langType = langType;
    }

    public String getIsSafe() {
        return this.isSafe;
    }

    public void setIsSafe(String isSafe) {
        this.isSafe = isSafe;
    }

    public String toString() {
        return "BceData{hitType='" + this.hitType + "', subHitType='" + this.subHitType + "', action=" + this.action + ", langType='" + this.langType + "', isSafe='" + this.isSafe + "'}";
    }
}
