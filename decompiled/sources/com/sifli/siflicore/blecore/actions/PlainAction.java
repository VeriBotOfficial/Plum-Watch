package com.sifli.siflicore.blecore.actions;

import com.sifli.siflicore.blecore.queue.BtLEAction;

/* loaded from: classes14.dex */
public abstract class PlainAction extends BtLEAction {
    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean expectsResult() {
        return false;
    }

    public PlainAction() {
        super(null);
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public String toString() {
        return ": " + getClass().getSimpleName();
    }
}
