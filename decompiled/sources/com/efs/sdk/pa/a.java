package com.efs.sdk.pa;

/* loaded from: classes14.dex */
public final class a implements PAANRListener {

    /* renamed from: a, reason: collision with root package name */
    private PAFactory f9961a;
    private PATraceListener b;

    public a(PAFactory pAFactory) {
        this.f9961a = pAFactory;
        this.b = pAFactory.getTraceListener();
        boolean enableTracer = pAFactory.getConfigManager().enableTracer();
        PATraceListener pATraceListener = this.b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(enableTracer);
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void anrStack(String str) {
        if (str == null || str.length() <= 200) {
            return;
        }
        c.a(this.f9961a, "patrace", str);
        PATraceListener pATraceListener = this.b;
        if (pATraceListener != null) {
            pATraceListener.onAnrTrace();
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
