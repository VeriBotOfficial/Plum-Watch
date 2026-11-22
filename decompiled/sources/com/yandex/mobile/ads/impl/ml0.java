package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.yandex.mobile.ads.impl.ll0;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class ml0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16256a;
    private final jl0 b;

    public ml0(Context context, jl0 fileProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileProvider, "fileProvider");
        this.f16256a = context;
        this.b = fileProvider;
    }

    public final ll0 a(String reportText) {
        Intrinsics.checkNotNullParameter(reportText, "reportText");
        try {
            File a2 = this.b.a();
            File parentFile = a2.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = reportText.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes.length >= freeSpace) {
                return new ll0.a("Not enough space error");
            }
            FilesKt.writeBytes(a2, bytes);
            Uri uriForFile = FileProvider.getUriForFile(this.f16256a, this.f16256a.getPackageName() + ".monetization.ads.inspector.fileprovider", a2);
            Intrinsics.checkNotNull(uriForFile);
            return new ll0.c(uriForFile);
        } catch (Exception unused) {
            sp0.c(new Object[0]);
            return new ll0.a("Failed to save report");
        }
    }
}
