package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* loaded from: classes5.dex */
public final class lo {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16153a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName("UTF-8");
    public static final Charset d;
    public static final Charset e;

    static {
        Charset.forName(CharEncoding.UTF_16BE);
        d = Charset.forName(CharEncoding.UTF_16LE);
        e = Charset.forName("UTF-16");
    }
}
