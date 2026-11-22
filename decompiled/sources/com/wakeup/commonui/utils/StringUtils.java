package com.wakeup.commonui.utils;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.wakeup.common.utils.NumberUtils;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: StringUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/commonui/utils/StringUtils;", "", "<init>", "()V", "time2String", "", "duration", "", "context", "Landroid/content/Context;", "meter2String", "distance", "strToByteArrayMax", "", "str", AppLovinMediationProvider.MAX, "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringUtils {
    public static final StringUtils INSTANCE = new StringUtils();

    private StringUtils() {
    }

    public final String time2String(int duration, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (duration < 60) {
            return duration + context.getString(R.string.second);
        }
        if (duration < 3600) {
            return ((duration / 60) + (duration % 60 <= 0 ? 0 : 1)) + context.getString(R.string.min);
        }
        int i = duration / 3600;
        int i2 = duration - (i * 3600);
        int i3 = (i2 / 60) + (i2 % 60 <= 0 ? 0 : 1);
        return i + context.getString(R.string.hour) + (i3 > 0 ? i3 + context.getString(R.string.min) : "");
    }

    public final String meter2String(int distance, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (distance < 1000) {
            return distance + context.getString(R.string.sport_mi);
        }
        return NumberUtils.formatNumberToStr(UnitConvertUtils.Km2Mile(distance / 1000.0f), 1) + context.getString(R.string.unit_gongli);
    }

    public final byte[] strToByteArrayMax(String str, int max) {
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length <= max || max == 0) {
            return bytes;
        }
        byte[] bytes2 = "...".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        int length = max - bytes2.length;
        if (length <= 0) {
            return bytes2;
        }
        StringBuilder sb = new StringBuilder();
        int length2 = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            byte[] bytes3 = String.valueOf(charAt).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            if (bytes3.length + i > length) {
                break;
            }
            sb.append(charAt);
            i += bytes3.length;
        }
        byte[] bytes4 = (((Object) sb) + "...").getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes4, "getBytes(...)");
        return bytes4;
    }
}
