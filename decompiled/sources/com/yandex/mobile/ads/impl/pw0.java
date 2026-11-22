package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mx1;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface pw0 extends mx1 {

    public interface a extends mx1.a<pw0> {
        void a(pw0 pw0Var);
    }

    long a(long j, fx1 fx1Var);

    long a(h70[] h70VarArr, boolean[] zArr, lt1[] lt1VarArr, boolean[] zArr2, long j);

    void a(a aVar, long j);

    void discardBuffer(long j, boolean z);

    z52 getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    long seekToUs(long j);
}
