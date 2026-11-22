package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class mm implements mv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16259a;

    public mm(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16259a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.mv
    public byte[][] a() {
        try {
            InputStream openRawResource = this.f16259a.getResources().openRawResource(R.raw.monetization_ads_bundled_cert);
            try {
                Intrinsics.checkNotNull(openRawResource);
                byte[] readBytes = ByteStreamsKt.readBytes(openRawResource);
                CloseableKt.closeFinally(openRawResource, null);
                return new byte[][]{readBytes};
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to create cert", e);
        }
    }
}
