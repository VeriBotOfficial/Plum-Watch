package com.huawei.hms.hmsscankit;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: RemoteDecoder.java */
/* loaded from: classes14.dex */
class f extends SimpleDateFormat {
    f(String str) {
        super(str);
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
