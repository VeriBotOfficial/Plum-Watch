package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes11.dex */
public class TouchEventCoalescingKeyHelper {
    private final SparseIntArray mDownTimeToCoalescingKey = new SparseIntArray();

    public void addCoalescingKey(long j) {
        this.mDownTimeToCoalescingKey.put((int) j, 0);
    }

    public void incrementCoalescingKey(long j) {
        int r2 = (int) j;
        int r0 = this.mDownTimeToCoalescingKey.get(r2, -1);
        if (r0 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.mDownTimeToCoalescingKey.put(r2, r0 + 1);
    }

    public short getCoalescingKey(long j) {
        int r2 = this.mDownTimeToCoalescingKey.get((int) j, -1);
        if (r2 != -1) {
            return (short) (r2 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public void removeCoalescingKey(long j) {
        this.mDownTimeToCoalescingKey.delete((int) j);
    }

    public boolean hasCoalescingKey(long j) {
        return this.mDownTimeToCoalescingKey.get((int) j, -1) != -1;
    }
}
