package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class ek2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15393a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) throws NumberFormatException {
        int i = f92.f15466a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }
}
