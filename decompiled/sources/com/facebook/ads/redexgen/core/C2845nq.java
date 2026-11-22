package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.nq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2845nq implements InterfaceC12113u {
    public Message A00;
    public C2844np A01;

    public C2845nq() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C2844np.A01(this);
    }

    public final C2845nq A01(Message message, C2844np c2844np) {
        this.A00 = message;
        this.A01 = c2844np;
        return this;
    }

    public final void A02() {
        ((Message) C3M.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) C3M.A01(this.A00));
        A00();
        return success;
    }
}
