package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class FileObserverC3465p6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f18445a;
    public final File b;
    public final C3270ha c;

    public FileObserverC3465p6(File file, G1 g1, C3270ha c3270ha) {
        super(file.getAbsolutePath(), 4095);
        this.f18445a = g1;
        this.b = file;
        this.c = c3270ha;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f18445a;
        C3270ha c3270ha = this.c;
        File file = this.b;
        c3270ha.getClass();
        consumer.consume(new File(file, str));
    }
}
