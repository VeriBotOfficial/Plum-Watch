package com.anythink.core.b.b;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingListener;

/* loaded from: classes11.dex */
public abstract class c implements ATBiddingListener {
    protected ATBaseAdAdapter c;

    public c(ATBaseAdAdapter aTBaseAdAdapter) {
        this.c = aTBaseAdAdapter;
    }

    private void a() {
        this.c = null;
    }
}
