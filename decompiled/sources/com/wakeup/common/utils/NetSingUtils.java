package com.wakeup.common.utils;

import com.wakeup.common.log.LogUtils;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;

/* compiled from: NetSingUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/wakeup/common/utils/NetSingUtils;", "", "<init>", "()V", "TAG", "", "getSing", "params", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetSingUtils {
    public static final NetSingUtils INSTANCE = new NetSingUtils();
    private static final String TAG = "NetSingUtils";

    private NetSingUtils() {
    }

    public final String getSing(Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : MapsKt.toSortedMap(params).entrySet()) {
            sb.append((String) entry.getKey()).append("=").append((String) entry.getValue()).append("&");
        }
        String sb2 = sb.deleteCharAt(sb.length() - 1).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String str = sb2 + "yLg3bht7h7ds94Op";
        StringBuilder sb3 = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
            for (byte b : digest) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                sb3.append(format);
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "getSing error: " + e.getMessage());
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        LogUtils.d(TAG, "getSing: " + sb4);
        return sb4;
    }
}
