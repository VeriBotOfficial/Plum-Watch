package com.wakeup.common.common.config;

import android.content.Context;
import com.wakeup.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ChannelConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, d2 = {"substituteChannelAppName", "", "Landroid/content/Context;", "resId", "", "oldChar", "newChar", "common_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChannelConfigKt {
    public static /* synthetic */ String substituteChannelAppName$default(Context context, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return substituteChannelAppName(context, i, str, str2);
    }

    public static final String substituteChannelAppName(Context context, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (!ChannelConfig.INSTANCE.isLenovo()) {
            return string;
        }
        if (str == null) {
            str = context.getString(R.string.app_name);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if (str2 == null) {
            str2 = ChannelConfig.LENOVO_APP_NAME;
        }
        return StringsKt.replace(string, str, str2, true);
    }
}
