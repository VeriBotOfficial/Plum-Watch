package com.wakeup.common.network.entity.opts;

import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import kotlin.Metadata;

/* compiled from: BiMgr4.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/opts/BiMgr4;", "", "<init>", "()V", "TAG", "", "EXTRAINFO_SHEBEI_BANNER", "getEXTRAINFO_SHEBEI_BANNER", "()Ljava/lang/String;", "EXTRAINFO_SHOUYE_BANNER", "getEXTRAINFO_SHOUYE_BANNER", "optionDataReport", "", RnBuryPointApi.KEY_PAGE_ID, RnBuryPointApi.KEY_ACTION_NAME, "extraInfo", "extraInfo2", "appVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiMgr4 {
    public static final BiMgr4 INSTANCE = new BiMgr4();
    private static final String TAG = "BiMgr4";
    private static final String EXTRAINFO_SHEBEI_BANNER = "Shebei_Banneri1_Loan";
    private static final String EXTRAINFO_SHOUYE_BANNER = "Shouye_Banner1_Loan";

    private BiMgr4() {
    }

    public final String getEXTRAINFO_SHEBEI_BANNER() {
        return EXTRAINFO_SHEBEI_BANNER;
    }

    public final String getEXTRAINFO_SHOUYE_BANNER() {
        return EXTRAINFO_SHOUYE_BANNER;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011d, code lost:
    
        com.wakeup.common.log.LogUtils.e(com.wakeup.common.network.entity.opts.BiMgr4.TAG, "optionDataReport err code " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object optionDataReport(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, kotlin.coroutines.Continuation<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.opts.BiMgr4.optionDataReport(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
