package com.bytedance.sdk.component.sg.gff;

/* loaded from: classes13.dex */
public class gff {
    private fxn fxn;
    private kg kg;

    public enum fxn {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface kg {
    }

    private gff() {
        this.fxn = fxn.OFF;
        this.kg = new com.bytedance.sdk.component.sg.gff.kg();
    }

    /* renamed from: com.bytedance.sdk.component.sg.gff.gff$gff, reason: collision with other inner class name */
    private static class C0486gff {
        private static final gff fxn = new gff();
    }

    public static void fxn(fxn fxnVar) {
        synchronized (gff.class) {
            C0486gff.fxn.fxn = fxnVar;
        }
    }
}
