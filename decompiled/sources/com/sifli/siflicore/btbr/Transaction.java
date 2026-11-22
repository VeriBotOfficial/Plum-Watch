package com.sifli.siflicore.btbr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public class Transaction extends AbstractTransaction {
    private final List<BtBRAction> mActions;
    private SocketCallback socketCallback;

    public Transaction(String str) {
        super(str);
        this.mActions = new ArrayList(4);
    }

    public void add(BtBRAction btBRAction) {
        this.mActions.add(btBRAction);
    }

    public List<BtBRAction> getActions() {
        return Collections.unmodifiableList(this.mActions);
    }

    public boolean isEmpty() {
        return this.mActions.isEmpty();
    }

    public void setCallback(SocketCallback socketCallback) {
        this.socketCallback = socketCallback;
    }

    public SocketCallback getSocketCallback() {
        return this.socketCallback;
    }

    @Override // com.sifli.siflicore.btbr.AbstractTransaction
    public int getActionCount() {
        return this.mActions.size();
    }
}
