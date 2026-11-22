package com.beken.iot.smartsdk.core.log;

import com.wakeup.common.burypoint.BuryPointPageId;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BKSmartLog.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001f\u0010\u001b\u001a\u00020\u00102\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001c\"\u00020\b¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/beken/iot/smartsdk/core/log/BKSmartLog;", "", "()V", "enable", "", "enableDetail", "levelList", "", "Lcom/beken/iot/smartsdk/core/log/LogLevel;", "getLevelList", "()Ljava/util/List;", "levelList$delegate", "Lkotlin/Lazy;", "logger", "Lcom/beken/iot/smartsdk/core/log/Logger;", "d", "", "tag", "", "msg", BuryPointPageId.PAGE_ID_PLAN_DETAIL, "e", "getEnableDetail", "i", "minLogLevel", "logLevel", "setLogger", "specifiedLogLevel", "", "([Lcom/beken/iot/smartsdk/core/log/LogLevel;)V", "v", "w", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BKSmartLog {
    private static boolean enable;
    private static boolean enableDetail;
    public static final BKSmartLog INSTANCE = new BKSmartLog();
    private static Logger logger = new DefaultLogger();

    /* renamed from: levelList$delegate, reason: from kotlin metadata */
    private static final Lazy levelList = LazyKt.lazy(new Function0<List<LogLevel>>() { // from class: com.beken.iot.smartsdk.core.log.BKSmartLog$levelList$2
        @Override // kotlin.jvm.functions.Function0
        public final List<LogLevel> invoke() {
            return CollectionsKt.mutableListOf(LogLevel.VERBOSE, LogLevel.DEBUG, LogLevel.INFO, LogLevel.WARN, LogLevel.ERROR);
        }
    });

    /* compiled from: BKSmartLog.kt */
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

    private BKSmartLog() {
    }

    private final List<LogLevel> getLevelList() {
        return (List) levelList.getValue();
    }

    public final void enable(boolean enable2) {
        enable = enable2;
    }

    public final void enableDetail(boolean enable2) {
        enableDetail = enable2;
    }

    public final boolean getEnableDetail() {
        return enableDetail;
    }

    public final void setLogger(Logger logger2) {
        logger = logger2;
    }

    public final void minLogLevel(LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        int i = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i == 1) {
            specifiedLogLevel(LogLevel.VERBOSE, LogLevel.DEBUG, LogLevel.INFO, LogLevel.WARN, LogLevel.ERROR);
            return;
        }
        if (i == 2) {
            specifiedLogLevel(LogLevel.DEBUG, LogLevel.INFO, LogLevel.WARN, LogLevel.ERROR);
            return;
        }
        if (i == 3) {
            specifiedLogLevel(LogLevel.INFO, LogLevel.WARN, LogLevel.ERROR);
        } else if (i == 4) {
            specifiedLogLevel(LogLevel.WARN, LogLevel.ERROR);
        } else {
            if (i != 5) {
                return;
            }
            specifiedLogLevel(LogLevel.ERROR);
        }
    }

    public final void specifiedLogLevel(LogLevel... logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        getLevelList().clear();
        for (LogLevel logLevel2 : logLevel) {
            getLevelList().add(logLevel2);
        }
    }

    public final void detail(String tag, String msg) {
        Logger logger2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (enableDetail && enable && (logger2 = logger) != null) {
            logger2.log(LogLevel.DEBUG, tag, msg);
        }
    }

    public final void v(String tag, String msg) {
        Logger logger2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!enable || (logger2 = logger) == null) {
            return;
        }
        logger2.log(LogLevel.VERBOSE, tag, msg);
    }

    public final void d(String tag, String msg) {
        Logger logger2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!enable || (logger2 = logger) == null) {
            return;
        }
        logger2.log(LogLevel.DEBUG, tag, msg);
    }

    public final void i(String tag, String msg) {
        Logger logger2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!enable || (logger2 = logger) == null) {
            return;
        }
        logger2.log(LogLevel.INFO, tag, msg);
    }

    public final void w(String tag, String msg) {
        Logger logger2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!enable || (logger2 = logger) == null) {
            return;
        }
        logger2.log(LogLevel.WARN, tag, msg);
    }

    public final void e(String tag, String msg) {
        Logger logger2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (msg == null || !enable || (logger2 = logger) == null) {
            return;
        }
        logger2.log(LogLevel.ERROR, tag, msg);
    }
}
