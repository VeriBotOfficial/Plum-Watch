package com.huawei.hms.push.utils.ha;

/* loaded from: classes14.dex */
public class PushAnalyticsCenter {

    /* renamed from: a, reason: collision with root package name */
    private PushBaseAnalytics f10493a;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static PushAnalyticsCenter f10494a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f10494a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f10493a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f10493a = pushBaseAnalytics;
    }
}
