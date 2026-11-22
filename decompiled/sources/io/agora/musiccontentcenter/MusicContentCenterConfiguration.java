package io.agora.musiccontentcenter;

/* loaded from: classes6.dex */
public class MusicContentCenterConfiguration {
    public String appId;
    public IMusicContentCenterEventHandler eventHandler;
    public int maxCacheSize;
    public String mccDomain;
    public long mccUid;
    public String token;

    public MusicContentCenterConfiguration() {
        this.appId = null;
        this.token = null;
        this.mccUid = 0L;
        this.maxCacheSize = 10;
        this.eventHandler = null;
        this.mccDomain = null;
    }

    public MusicContentCenterConfiguration(String appid, String token, long mccUid, int maxCacheSize, IMusicContentCenterEventHandler eventHandler) {
        this.appId = appid;
        this.token = token;
        this.mccUid = mccUid;
        this.maxCacheSize = maxCacheSize;
        this.eventHandler = eventHandler;
        this.mccDomain = null;
    }

    public MusicContentCenterConfiguration(String appid, String token, long mccUid, int maxCacheSize, IMusicContentCenterEventHandler eventHandler, String domain) {
        this.appId = appid;
        this.token = token;
        this.mccUid = mccUid;
        this.maxCacheSize = maxCacheSize;
        this.eventHandler = eventHandler;
        this.mccDomain = domain;
    }

    public String getAppId() {
        return this.appId;
    }

    public IMusicContentCenterEventHandler getEventHandler() {
        return this.eventHandler;
    }

    public int getMaxCacheSize() {
        return this.maxCacheSize;
    }

    public String getMccDomain() {
        return this.mccDomain;
    }

    public long getMccUid() {
        return this.mccUid;
    }

    public String getToken() {
        return this.token;
    }
}
