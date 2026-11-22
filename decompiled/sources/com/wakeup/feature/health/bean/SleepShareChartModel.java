package com.wakeup.feature.health.bean;

import com.wakeup.commonui.chart.data.SleepData;
import com.wakeup.commonui.chart.data.SleepTypeData;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class SleepShareChartModel implements Serializable {
    private String avatar;
    private int awakePercent;
    private String awakeSleepDesc;
    private int deepPercent;
    private String deepSleepDesc;
    private String longWrite;
    private List<SleepTypeData> mNapList;
    private SleepData mSleepData;
    private String nickName;
    private String percentDesc;
    private int remPercent;
    private String remSleepDesc;
    private int score;
    private int shallowPercent;
    private String shallowSleepDesc;
    private String shortWrite;
    private long timeStamp;
    private int totalSleepDuration;

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int i) {
        this.score = i;
    }

    public String getShortWrite() {
        return this.shortWrite;
    }

    public void setShortWrite(String str) {
        this.shortWrite = str;
    }

    public String getLongWrite() {
        return this.longWrite;
    }

    public void setLongWrite(String str) {
        this.longWrite = str;
    }

    public String getPercentDesc() {
        return this.percentDesc;
    }

    public void setPercentDesc(String str) {
        this.percentDesc = str;
    }

    public String getDeepSleepDesc() {
        return this.deepSleepDesc;
    }

    public void setDeepSleepDesc(String str) {
        this.deepSleepDesc = str;
    }

    public String getShallowSleepDesc() {
        return this.shallowSleepDesc;
    }

    public void setShallowSleepDesc(String str) {
        this.shallowSleepDesc = str;
    }

    public String getAwakeSleepDesc() {
        return this.awakeSleepDesc;
    }

    public void setAwakeSleepDesc(String str) {
        this.awakeSleepDesc = str;
    }

    public int getTotalSleepDuration() {
        return this.totalSleepDuration;
    }

    public void setTotalSleepDuration(int i) {
        this.totalSleepDuration = i;
    }

    public int getDeepPercent() {
        return this.deepPercent;
    }

    public void setDeepPercent(int i) {
        this.deepPercent = i;
    }

    public int getShallowPercent() {
        return this.shallowPercent;
    }

    public void setShallowPercent(int i) {
        this.shallowPercent = i;
    }

    public int getAwakePercent() {
        return this.awakePercent;
    }

    public void setAwakePercent(int i) {
        this.awakePercent = i;
    }

    public SleepData getSleepData() {
        return this.mSleepData;
    }

    public void setSleepData(SleepData sleepData) {
        this.mSleepData = sleepData;
    }

    public String getRemSleepDesc() {
        return this.remSleepDesc;
    }

    public void setRemSleepDesc(String str) {
        this.remSleepDesc = str;
    }

    public int getRemPercent() {
        return this.remPercent;
    }

    public void setRemPercent(int i) {
        this.remPercent = i;
    }

    public List<SleepTypeData> getmNapList() {
        return this.mNapList;
    }

    public void setmNapList(List<SleepTypeData> list) {
        this.mNapList = list;
    }
}
