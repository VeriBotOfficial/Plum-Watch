package com.sifli.siflicore.btbr.actions;

import com.sifli.siflicore.btbr.BtBRAction;

/* loaded from: classes14.dex */
public abstract class PlainAction extends BtBRAction {
    @Override // com.sifli.siflicore.btbr.BtBRAction
    public boolean expectsResult() {
        return false;
    }

    @Override // com.sifli.siflicore.btbr.BtBRAction
    public String toString() {
        return getClass().getSimpleName();
    }
}
