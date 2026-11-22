package com.wakeup.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.vasdolly.helper.ChannelReaderUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChannelUtil.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/common/utils/ChannelUtil;", "", "<init>", "()V", "getChannel", "", "context", "Landroid/content/Context;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChannelUtil {
    public static final ChannelUtil INSTANCE = new ChannelUtil();

    private ChannelUtil() {
    }

    public final String getChannel(Context context) {
        if (context == null) {
            return "generic";
        }
        String channel = ChannelReaderUtil.getChannel(context);
        if (TextUtils.isEmpty(channel)) {
            return "generic";
        }
        Intrinsics.checkNotNull(channel);
        return channel;
    }
}
