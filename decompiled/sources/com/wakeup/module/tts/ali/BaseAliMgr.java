package com.wakeup.module.tts.ali;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAliMgr.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u000e\u0010\t\u001a\u00020\u0006H\u0087@¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/tts/ali/BaseAliMgr;", "", "<init>", "()V", "mapKey", "", "", "getMapKey", "language", "getToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BaseAliMgr {
    public static final BaseAliMgr INSTANCE = new BaseAliMgr();
    private static final Map<String, String> mapKey = MapsKt.mapOf(TuplesKt.to("0", "IkBJ6VRYACzNCiLY"), TuplesKt.to("1", "HAcdviJlOAoFk9VU"), TuplesKt.to("2", "tCmbW8iLqCReVfdD"), TuplesKt.to("3", "yFOBFFEpNPcK41Kx"), TuplesKt.to("4", "7AQalB4EjTjoah2O"), TuplesKt.to("5", "mwXt1tiPNSw1B78K"), TuplesKt.to("6", "6OfU23pmUTqQn1Or"), TuplesKt.to("8", "mMWVY51iV6wphFaT"), TuplesKt.to("9", "Jnrm7ovLYPlAB0Zz"), TuplesKt.to("10", "otKwPKfwwP8fM8X1"), TuplesKt.to("11", "DUVTxwD5zuOVZhhH"), TuplesKt.to("13", "LO1HeclqHo2VUZRJ"), TuplesKt.to("15", "DQmOAbwJQaBfMPAS"), TuplesKt.to("16", "398lamZQoDO3qsYx"), TuplesKt.to("24", "yJOCP1EBvIfqlYDD"));

    private BaseAliMgr() {
    }

    @JvmStatic
    public static final String getMapKey(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        Map<String, String> map = mapKey;
        if (!map.containsKey(language)) {
            return "IkBJ6VRYACzNCiLY";
        }
        String str = map.get(language);
        Intrinsics.checkNotNull(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getToken(kotlin.coroutines.Continuation<? super java.lang.String> r4) {
        /*
            boolean r0 = r4 instanceof com.wakeup.module.tts.ali.BaseAliMgr$getToken$1
            if (r0 == 0) goto L14
            r0 = r4
            com.wakeup.module.tts.ali.BaseAliMgr$getToken$1 r0 = (com.wakeup.module.tts.ali.BaseAliMgr$getToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r4 = r0.label
            int r4 = r4 - r2
            r0.label = r4
            goto L19
        L14:
            com.wakeup.module.tts.ali.BaseAliMgr$getToken$1 r0 = new com.wakeup.module.tts.ali.BaseAliMgr$getToken$1
            r0.<init>(r4)
        L19:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L53
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r4)
            boolean r4 = com.wakeup.common.network.host.EvnMgr.isTest()
            if (r4 == 0) goto L3e
            java.lang.String r4 = "https://test.iwhopro.com/howeartest/aliyun/nls/getToken"
            goto L40
        L3e:
            java.lang.String r4 = "https://howear.iwhop.com/howearapi/aliyun/nls/getToken"
        L40:
            com.wakeup.common.network.RetrofitManager$Companion r2 = com.wakeup.common.network.RetrofitManager.INSTANCE
            com.wakeup.common.network.RetrofitManager r2 = r2.getInstance()
            com.wakeup.common.network.api.AliService r2 = r2.getApiAli()
            r0.label = r3
            java.lang.Object r4 = r2.getToken(r4, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            com.wakeup.common.network.BaseResult r4 = (com.wakeup.common.network.BaseResult) r4
            java.lang.Object r4 = r4.getData()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.tts.ali.BaseAliMgr.getToken(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
