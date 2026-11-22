package io.appmetrica.analytics.impl;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3473pe {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18453a;
    public final Ln b;
    public final Mn c;

    public C3473pe(Context context) {
        this(context, new Ln(), new Mn());
    }

    public final String a(String str) {
        try {
            this.c.getClass();
            if (!Mn.a(str)) {
                this.b.getClass();
                str = StringsKt.replace$default(UUID.randomUUID().toString(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, (Object) null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f18453a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Qa.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3473pe(Context context, Ln ln, Mn mn) {
        this.f18453a = context;
        this.b = ln;
        this.c = mn;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f18453a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f18453a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
