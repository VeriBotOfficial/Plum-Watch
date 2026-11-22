package com.baidu.mapsdkplatform.comapi.map;

import android.os.Message;

/* compiled from: LocalMapNotifier.java */
/* loaded from: classes13.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private n f8381a;

    o() {
    }

    void a(n nVar) {
        this.f8381a = nVar;
    }

    void b(n nVar) {
        this.f8381a = null;
    }

    void a(Message message) {
        if (message.what != 65289) {
            return;
        }
        int i = message.arg1;
        if (i != 12 && i != 101 && i != 102) {
            switch (i) {
            }
        }
        n nVar = this.f8381a;
        if (nVar != null) {
            nVar.a(i, message.arg2);
        }
    }
}
