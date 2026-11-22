package com.xiaomi.push;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ey extends es {
    public ey() {
        a("PING", (String) null);
        a("0");
        a(0);
    }

    @Override // com.xiaomi.push.es
    public int c() {
        if (a().length == 0) {
            return 0;
        }
        return super.c();
    }

    @Override // com.xiaomi.push.es
    /* renamed from: a */
    ByteBuffer mo12124a(ByteBuffer byteBuffer) {
        return a().length == 0 ? byteBuffer : super.mo12124a(byteBuffer);
    }
}
