package com.wakeup.howear.view.home.viewmodel;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;

/* compiled from: LatestFunctionComponentRequestTracker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/howear/view/home/viewmodel/LatestFunctionComponentRequestTracker;", "", "<init>", "()V", "generation", "Ljava/util/concurrent/atomic/AtomicLong;", "begin", "", "isLatest", "", "token", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LatestFunctionComponentRequestTracker {
    private final AtomicLong generation = new AtomicLong(0);

    public final long begin() {
        return this.generation.incrementAndGet();
    }

    public final boolean isLatest(long token) {
        return this.generation.get() == token;
    }
}
