package com.wakeup.common.storage.model;

import com.wakeup.common.utils.DateUtil;

/* loaded from: classes2.dex */
public class HttpCacheModel {
    private String jsonStr;
    private long time;
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJsonStr() {
        return this.jsonStr;
    }

    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return this.time;
    }

    public boolean isTimeout() {
        return isTimeout(1);
    }

    public boolean isTimeout(int day) {
        return DateUtil.getDayStartTime() >= DateUtil.addDay(this.time * 1000, day);
    }
}
