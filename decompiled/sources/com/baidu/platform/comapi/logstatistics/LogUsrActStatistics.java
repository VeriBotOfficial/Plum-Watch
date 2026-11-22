package com.baidu.platform.comapi.logstatistics;

import java.util.Map;

/* loaded from: classes13.dex */
public class LogUsrActStatistics extends com.baidu.platform.comapi.logstatistics.a {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final LogUsrActStatistics f8571a = new LogUsrActStatistics();
    }

    public static LogUsrActStatistics getInstance() {
        return b.f8571a;
    }

    public void addLogWithLowLevel(String str, String str2, String str3, Map<String, Object> map) {
        LogStatistics.getInstance().a(1200, 1, appendLogTag(str, str2, str3), map);
    }

    private LogUsrActStatistics() {
    }
}
