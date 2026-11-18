package com.apm.insight.l;

import com.phancy.mini.core.resource.MiniPack;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DateFormat f6066a;

    public static DateFormat a() {
        if (f6066a == null) {
            f6066a = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT, Locale.getDefault());
        }
        return f6066a;
    }
}
