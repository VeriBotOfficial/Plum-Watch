package com.beken.iot.smartsdk.core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateUtil.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/beken/iot/smartsdk/core/utils/DateUtil;", "", "()V", "getDay", "", "getFullyCurrentTime", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateUtil {
    public static final DateUtil INSTANCE = new DateUtil();

    private DateUtil() {
    }

    public final String getFullyCurrentTime() {
        String format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format.format(date)");
        return format;
    }

    public final String getDay() {
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format.format(date)");
        return format;
    }
}
