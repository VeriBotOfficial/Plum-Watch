package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r10 {
    public static File a(Context context, String cacheDirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheDirName, "cacheDirName");
        return new File(context.getCacheDir().getPath() + File.separator + cacheDirName);
    }
}
