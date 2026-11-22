package com.beken.iot.smartsdk.core.log;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLogger.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/beken/iot/smartsdk/core/log/DefaultLogger;", "Lcom/beken/iot/smartsdk/core/log/Logger;", "()V", "log", "", "logLevel", "Lcom/beken/iot/smartsdk/core/log/LogLevel;", "tag", "", "msg", "printD", "printE", "printI", "printV", "printW", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DefaultLogger implements Logger {

    /* compiled from: DefaultLogger.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.beken.iot.smartsdk.core.log.Logger
    public void log(LogLevel logLevel, String tag, String msg) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i == 1) {
            printV(tag, msg);
            return;
        }
        if (i == 2) {
            printD(tag, msg);
            return;
        }
        if (i == 3) {
            printI(tag, msg);
        } else if (i == 4) {
            printW(tag, msg);
        } else {
            if (i != 5) {
                return;
            }
            printE(tag, msg);
        }
    }

    private final void printD(String tag, String msg) {
        Log.d(tag, msg);
    }

    private final void printV(String tag, String msg) {
        Log.v(tag, msg);
    }

    private final void printI(String tag, String msg) {
        Log.i(tag, msg);
    }

    private final void printW(String tag, String msg) {
        Log.w(tag, msg);
    }

    private final void printE(String tag, String msg) {
        Log.e(tag, msg);
    }
}
