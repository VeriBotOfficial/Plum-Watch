package com.yandex.div.internal.viewpool.optimization;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: PerformanceDependentSession.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/MutableViewObtainmentStatistics;", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSession$ViewObtainmentStatistics;", "()V", "currentSuccessiveBlocked", "", "maxSuccessiveBlocked", "getMaxSuccessiveBlocked", "()I", "setMaxSuccessiveBlocked", "(I)V", "minUnused", "getMinUnused", "()Ljava/lang/Integer;", "setMinUnused", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", SDPKeywords.CLEAR, "", "report", "availableViews", "isObtainedWithBlock", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MutableViewObtainmentStatistics extends PerformanceDependentSession.ViewObtainmentStatistics {
    private int currentSuccessiveBlocked;
    private int maxSuccessiveBlocked;
    private Integer minUnused;

    public MutableViewObtainmentStatistics() {
        super(null);
    }

    @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession.ViewObtainmentStatistics
    public int getMaxSuccessiveBlocked() {
        return this.maxSuccessiveBlocked;
    }

    public void setMaxSuccessiveBlocked(int i) {
        this.maxSuccessiveBlocked = i;
    }

    @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession.ViewObtainmentStatistics
    public Integer getMinUnused() {
        return this.minUnused;
    }

    public void setMinUnused(Integer num) {
        this.minUnused = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1 < r2.intValue()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void report(int r1, boolean r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r2 == 0) goto L15
            int r1 = r0.currentSuccessiveBlocked     // Catch: java.lang.Throwable -> L36
            int r1 = r1 + 1
            r0.currentSuccessiveBlocked = r1     // Catch: java.lang.Throwable -> L36
            int r2 = r0.getMaxSuccessiveBlocked()     // Catch: java.lang.Throwable -> L36
            if (r1 <= r2) goto L32
            int r1 = r0.currentSuccessiveBlocked     // Catch: java.lang.Throwable -> L36
            r0.setMaxSuccessiveBlocked(r1)     // Catch: java.lang.Throwable -> L36
            goto L32
        L15:
            r2 = 0
            r0.currentSuccessiveBlocked = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r2 = r0.getMinUnused()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L2b
            java.lang.Integer r2 = r0.getMinUnused()     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L36
            if (r1 >= r2) goto L32
        L2b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L36
            r0.setMinUnused(r1)     // Catch: java.lang.Throwable -> L36
        L32:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            return
        L36:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.optimization.MutableViewObtainmentStatistics.report(int, boolean):void");
    }

    public final void clear() {
        synchronized (this) {
            setMaxSuccessiveBlocked(0);
            this.currentSuccessiveBlocked = 0;
            setMinUnused(0);
            Unit unit = Unit.INSTANCE;
        }
    }
}
