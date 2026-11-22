package com.baidu.ar;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class c8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f6838a;
    public int b;
    public volatile boolean c;
    public Object d;
    public d8[] e;

    public c8(Context context, Object obj, d8[] d8VarArr) {
        d8VarArr.getClass();
        this.f6838a = new WeakReference<>(context);
        this.b = 0;
        this.c = false;
        this.d = obj;
        this.e = d8VarArr;
    }

    public void b() {
        this.c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x000c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.c8.run():void");
    }
}
