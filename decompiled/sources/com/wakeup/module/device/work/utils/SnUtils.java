package com.wakeup.module.device.work.utils;

import android.text.TextUtils;
import com.wakeup.common.storage.CacheManager;
import com.yandex.div2.PhoneMasks;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* compiled from: SnUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/module/device/work/utils/SnUtils;", "", "<init>", "()V", "Companion", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnUtils {
    public static final String CACHE_KEY = "GEN_DEVICE_SN_";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final String genSn() {
        return INSTANCE.genSn();
    }

    @JvmStatic
    public static final String getSn(String str) {
        return INSTANCE.getSn(str);
    }

    /* compiled from: SnUtils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/wakeup/module/device/work/utils/SnUtils$Companion;", "", "<init>", "()V", "CACHE_KEY", "", "getSn", "mac", "genSn", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String getSn(String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            String string = CacheManager.INSTANCE.getString(SnUtils.CACHE_KEY + mac);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String genSn = genSn();
            CacheManager.INSTANCE.saveString(SnUtils.CACHE_KEY + mac, genSn);
            return genSn;
        }

        @JvmStatic
        public final String genSn() {
            String valueOf;
            StringBuilder sb;
            int nextInt = Random.INSTANCE.nextInt(1, 1000);
            if (nextInt < 10) {
                sb = new StringBuilder(PhoneMasks.EXTRA_NUMBERS);
            } else {
                if (nextInt >= 100) {
                    valueOf = String.valueOf(nextInt);
                    return "testapp0000000" + valueOf;
                }
                sb = new StringBuilder("0");
            }
            valueOf = sb.append(nextInt).toString();
            return "testapp0000000" + valueOf;
        }
    }
}
