package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes9.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private String f19649a;

    public b(String str, Looper looper) {
        super(looper);
        this.f19649a = str;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final String toString() {
        return "HandlerEx (" + this.f19649a + ") {}";
    }
}
