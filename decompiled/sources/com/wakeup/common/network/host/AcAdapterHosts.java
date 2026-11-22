package com.wakeup.common.network.host;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AcAdapterHosts.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/common/network/host/AcAdapterHosts;", "", "<init>", "()V", "HOST_CN", "", "HOST_OVERSEAS", "host", "httpBase", "path", "testUseHttps", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcAdapterHosts {
    private static final String HOST_CN = "ai-cloud-bk.4paradigm.com";
    private static final String HOST_OVERSEAS = "ai-cloud-hk.4paradigm.com";
    public static final AcAdapterHosts INSTANCE = new AcAdapterHosts();

    @JvmStatic
    public static final String httpBase(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return httpBase$default(path, false, 2, null);
    }

    private AcAdapterHosts() {
    }

    @JvmStatic
    public static final String host() {
        return HOST_OVERSEAS;
    }

    public static /* synthetic */ String httpBase$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return httpBase(str, z);
    }

    @JvmStatic
    public static final String httpBase(String path, boolean testUseHttps) {
        Intrinsics.checkNotNullParameter(path, "path");
        boolean isTest = EvnMgr.isTest();
        String str = (!isTest || testUseHttps) ? "https" : "http";
        String str2 = isTest ? "/dev/ac-adapter" : "/ac-adapter";
        String str3 = path;
        if (StringsKt.isBlank(str3)) {
            path = "";
        } else if (!StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
            path = "/" + path;
        }
        String str4 = str + "://" + host() + str2 + path;
        return (StringsKt.isBlank(str3) || StringsKt.endsWith$default(str4, "/", false, 2, (Object) null)) ? str4 : str4 + "/";
    }
}
