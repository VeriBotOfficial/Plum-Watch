package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: OnSetTagsReceiveTask.java */
/* loaded from: classes2.dex */
final class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f14088a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ ac e;

    ad(ac acVar, int i, List list, List list2, String str) {
        this.e = acVar;
        this.f14088a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.e.b;
        context = this.e.f14137a;
        pushMessageCallback.onSetTags(context, this.f14088a, this.b, this.c, this.d);
    }
}
