package com.phancy.mini.core.app.status;

import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;

/* compiled from: RequestTrack.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/phancy/mini/core/app/status/RequestTrack;", "", "()V", Const.SP_KEY_CALL_LOC_COUNT, "", "getCount", "()J", "setCount", "(J)V", "failCount", "getFailCount", "setFailCount", "successCount", "getSuccessCount", "setSuccessCount", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestTrack {
    private long count;
    private long failCount;
    private long successCount;

    public final long getCount() {
        return this.count;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final long getSuccessCount() {
        return this.successCount;
    }

    public final void setSuccessCount(long j) {
        this.successCount = j;
    }

    public final long getFailCount() {
        return this.failCount;
    }

    public final void setFailCount(long j) {
        this.failCount = j;
    }
}
