package com.bytedance.sdk.component.tw;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ckl;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
class kg implements Comparable, Runnable {
    private tw fxn;
    private long gff;
    private Thread hm = null;
    private fxn kg;

    private void fxn(String str, String str2, long j) {
    }

    public kg(tw twVar, fxn fxnVar) {
        this.gff = 0L;
        this.fxn = twVar;
        this.kg = fxnVar;
        this.gff = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.gff;
        this.hm = Thread.currentThread();
        tw twVar = this.fxn;
        if (twVar != null) {
            twVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.kg != null) {
            hm.fxn();
        }
        if (ckl.fxn()) {
            fxn fxnVar = this.kg;
            str = AbstractJsonLexerKt.NULL;
            String fxn = fxnVar != null ? fxnVar.fxn() : AbstractJsonLexerKt.NULL;
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(uptimeMillis2);
            tw twVar2 = this.fxn;
            new Object[]{"run: pool  = ", fxn, " waitTime =", valueOf, " taskCost = ", valueOf2, " name=", twVar2 != null ? twVar2.getName() : AbstractJsonLexerKt.NULL};
            String fxn2 = this.kg.fxn();
            fxn2.hashCode();
            switch (fxn2) {
                case "ad":
                case "init":
                    if (uptimeMillis2 > 2000) {
                        fxn fxnVar2 = this.kg;
                        String fxn3 = fxnVar2 != null ? fxnVar2.fxn() : AbstractJsonLexerKt.NULL;
                        tw twVar3 = this.fxn;
                        if (twVar3 != null) {
                            str = twVar3.getName();
                        }
                        fxn(fxn3, str, uptimeMillis2);
                        break;
                    }
                    break;
                case "io":
                    if (uptimeMillis2 > 5000) {
                        fxn fxnVar3 = this.kg;
                        String fxn4 = fxnVar3 != null ? fxnVar3.fxn() : AbstractJsonLexerKt.NULL;
                        tw twVar4 = this.fxn;
                        if (twVar4 != null) {
                            str = twVar4.getName();
                        }
                        fxn(fxn4, str, uptimeMillis2);
                        break;
                    }
                    break;
                case "log":
                    if (uptimeMillis2 > 3000) {
                        fxn fxnVar4 = this.kg;
                        String fxn5 = fxnVar4 != null ? fxnVar4.fxn() : AbstractJsonLexerKt.NULL;
                        tw twVar5 = this.fxn;
                        if (twVar5 != null) {
                            str = twVar5.getName();
                        }
                        fxn(fxn5, str, uptimeMillis2);
                        break;
                    }
                    break;
                case "computation":
                    if (uptimeMillis2 > 1000) {
                        fxn fxnVar5 = this.kg;
                        String fxn6 = fxnVar5 != null ? fxnVar5.fxn() : AbstractJsonLexerKt.NULL;
                        tw twVar6 = this.fxn;
                        if (twVar6 != null) {
                            str = twVar6.getName();
                        }
                        fxn(fxn6, str, uptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    public tw fxn() {
        return this.fxn;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof kg) {
            return this.fxn.compareTo(((kg) obj).fxn());
        }
        return 0;
    }

    public int hashCode() {
        return this.fxn.hashCode();
    }

    public boolean equals(Object obj) {
        tw twVar;
        return (obj instanceof kg) && (twVar = this.fxn) != null && twVar.equals(((kg) obj).fxn());
    }
}
