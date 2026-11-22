package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sd extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final sd f16852a = new sd();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        int i = rd.c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "getLoggerName(...)");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i2 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        rd.a(loggerName, i2, message, record.getThrown());
    }

    private sd() {
    }
}
