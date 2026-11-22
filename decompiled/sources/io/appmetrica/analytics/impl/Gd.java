package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Gd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Lg f17871a;
    public final Function1 b;

    public Gd(Lg lg, Function1<? super String, Unit> function1) {
        this.f17871a = lg;
        this.b = function1;
    }

    public static final void a(Gd gd, NativeCrash nativeCrash, File file) {
        gd.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    public static final void b(Gd gd, NativeCrash nativeCrash, File file) {
        gd.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        C3683y0 c3683y0;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C3708z0 a2 = A0.a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(a2);
            c3683y0 = new C3683y0(source, handlerVersion, str, dumpFile, creationTime, a2);
        } catch (Throwable unused) {
            c3683y0 = null;
        }
        if (c3683y0 == null) {
            this.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        Lg lg = this.f17871a;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Gd$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Gd.a(Gd.this, nativeCrash, (File) obj);
            }
        };
        lg.getClass();
        lg.a(c3683y0, consumer, new Ig(c3683y0));
    }

    public final void a(List<NativeCrash> list) {
        C3683y0 c3683y0;
        for (final NativeCrash nativeCrash : list) {
            try {
                NativeCrashSource source = nativeCrash.getSource();
                String handlerVersion = nativeCrash.getHandlerVersion();
                String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
                String dumpFile = nativeCrash.getDumpFile();
                long creationTime = nativeCrash.getCreationTime();
                C3708z0 a2 = A0.a(nativeCrash.getMetadata());
                Intrinsics.checkNotNull(a2);
                c3683y0 = new C3683y0(source, handlerVersion, str, dumpFile, creationTime, a2);
            } catch (Throwable unused) {
                c3683y0 = null;
            }
            if (c3683y0 != null) {
                Lg lg = this.f17871a;
                Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Gd$$ExternalSyntheticLambda1
                    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                    public final void consume(Object obj) {
                        Gd.b(Gd.this, nativeCrash, (File) obj);
                    }
                };
                lg.getClass();
                lg.a(c3683y0, consumer, new Jg(c3683y0));
            } else {
                this.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            }
        }
    }
}
