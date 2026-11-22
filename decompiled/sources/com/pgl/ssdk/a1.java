package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;
import java.lang.ref.WeakReference;

/* loaded from: classes17.dex */
public class a1 extends a4 implements a2 {
    private final HandlerThread b;

    a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f12728a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
