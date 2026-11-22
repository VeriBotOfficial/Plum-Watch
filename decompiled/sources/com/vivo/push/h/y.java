package com.vivo.push.h;

/* compiled from: OnNotifyGuideDialogResultTask.java */
/* loaded from: classes2.dex */
public final class y extends ab {
    y(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        int e = ((com.vivo.push.b.r) vVar).e();
        if (this.b != null) {
            this.b.onNotifyGuideDialogResult(e);
        }
    }
}
