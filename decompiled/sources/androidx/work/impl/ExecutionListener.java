package androidx.work.impl;

/* loaded from: classes11.dex */
public interface ExecutionListener {
    void onExecuted(String workSpecId, boolean needsReschedule);
}
