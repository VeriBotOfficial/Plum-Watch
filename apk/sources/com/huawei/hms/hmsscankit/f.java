package com.huawei.hms.hmsscankit;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: RemoteDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
class f extends SimpleDateFormat {
    f(String str) {
        super(str);
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
