package com.sifli.siflicore.blecore.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public class Transaction extends AbstractTransaction {
    private GattCallback gattCallback;
    private final List<BtLEAction> mActions;
    private boolean modifyGattCallback;

    public Transaction(String str) {
        super(str);
        this.mActions = new ArrayList(4);
    }

    public void add(BtLEAction btLEAction) {
        this.mActions.add(btLEAction);
    }

    public List<BtLEAction> getActions() {
        return Collections.unmodifiableList(this.mActions);
    }

    public boolean isEmpty() {
        return this.mActions.isEmpty();
    }

    public void setCallback(GattCallback gattCallback) {
        this.gattCallback = gattCallback;
        this.modifyGattCallback = true;
    }

    public GattCallback getGattCallback() {
        return this.gattCallback;
    }

    public boolean isModifyGattCallback() {
        return this.modifyGattCallback;
    }

    @Override // com.sifli.siflicore.blecore.queue.AbstractTransaction
    public int getActionCount() {
        return this.mActions.size();
    }
}
