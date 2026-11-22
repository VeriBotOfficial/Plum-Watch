package com.anythink.core.common.m;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class n extends b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4024a = "n";
    private final q c;
    private volatile boolean g;
    private volatile boolean h;
    private final Object b = new Object();
    private final AtomicInteger d = new AtomicInteger(0);
    private final List<a> e = new ArrayList();
    private final int f = 2;

    public n(q qVar) {
        this.c = qVar;
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        synchronized (this.b) {
            new Object[]{Boolean.valueOf(this.g)};
            this.h = true;
            if (this.c != null && !this.g) {
                this.g = true;
                this.c.onLoadFinish(i, obj);
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadError(int i, String str, AdError adError) {
        synchronized (this.b) {
            a aVar = new a(i, str, adError);
            this.e.add(aVar);
            int incrementAndGet = this.d.incrementAndGet();
            new Object[]{Integer.valueOf(incrementAndGet), Boolean.valueOf(this.g), Integer.valueOf(this.f), aVar};
            if (incrementAndGet == this.f) {
                new Object[]{Boolean.valueOf(this.g), Integer.valueOf(this.f)};
                if (this.c != null && !this.g) {
                    this.g = true;
                    StringBuilder sb = new StringBuilder();
                    AdError adError2 = null;
                    for (a aVar2 : new ArrayList(this.e)) {
                        if (aVar2 != null) {
                            if (TextUtils.isEmpty(sb.toString())) {
                                sb.append(aVar2.b);
                            } else {
                                sb.append(",");
                                sb.append(aVar2.b);
                            }
                            adError2 = aVar2.c;
                        }
                    }
                    this.e.clear();
                    if (adError2 == null) {
                        adError2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
                    }
                    this.c.onLoadError(0, sb.toString(), adError2);
                }
            }
        }
    }

    private void a(int i, Object obj) {
        new Object[]{Boolean.valueOf(this.g)};
        this.h = true;
        if (this.c == null || this.g) {
            return;
        }
        this.g = true;
        this.c.onLoadFinish(i, obj);
    }

    private void b() {
        new Object[]{Boolean.valueOf(this.g), Integer.valueOf(this.f)};
        if (this.c == null || this.g) {
            return;
        }
        this.g = true;
        StringBuilder sb = new StringBuilder();
        AdError adError = null;
        for (a aVar : new ArrayList(this.e)) {
            if (aVar != null) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(aVar.b);
                } else {
                    sb.append(",");
                    sb.append(aVar.b);
                }
                adError = aVar.c;
            }
        }
        this.e.clear();
        if (adError == null) {
            adError = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
        }
        this.c.onLoadError(0, sb.toString(), adError);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.h;
        }
        return z;
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f4025a;
        String b;
        AdError c;

        public a(int i, String str, AdError adError) {
            this.f4025a = i;
            this.b = str;
            this.c = adError;
        }
    }
}
