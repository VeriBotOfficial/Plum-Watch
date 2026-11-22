package com.beken.iot.smartsdk.delegate;

import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.p2p.P2PSDK;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: BKSmart.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/beken/iot/smartsdk/delegate/BKSmart;", "", "()V", "deInit", "", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BKSmart {
    public static final BKSmart INSTANCE = new BKSmart();

    private BKSmart() {
    }

    public final void deInit() {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(Integer.valueOf(P2PSDK.getInstance().deInitializeP2P()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m14060exceptionOrNullimpl = Result.m14060exceptionOrNullimpl(m14057constructorimpl);
        if (m14060exceptionOrNullimpl != null) {
            BKSmartLog.INSTANCE.d("BKSmart", "deInit fail " + m14060exceptionOrNullimpl.getMessage());
        }
        if (Result.m14064isSuccessimpl(m14057constructorimpl)) {
            ((Number) m14057constructorimpl).intValue();
            BKSmartLog.INSTANCE.d("BKSmart", "deInit success");
        }
    }
}
