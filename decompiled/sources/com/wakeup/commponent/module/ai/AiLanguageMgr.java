package com.wakeup.commponent.module.ai;

import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.network.entity.ai.AiLanguage;
import com.wakeup.commponent.ServiceManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiLanguageMgr.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/commponent/module/ai/AiLanguageMgr;", "", "<init>", "()V", "TAG", "", "DEF_LANGUAGE_CODE", "", "getLanguageId", "functionId", "defLanguageId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLanguageList", "", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AiLanguageMgr {
    private static final int DEF_LANGUAGE_CODE = 83;
    public static final AiLanguageMgr INSTANCE = new AiLanguageMgr();
    private static final String TAG = "AiLanageMgr";

    private AiLanguageMgr() {
    }

    public static /* synthetic */ Object getLanguageId$default(AiLanguageMgr aiLanguageMgr, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 83;
        }
        return aiLanguageMgr.getLanguageId(i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLanguageId(int r7, int r8, kotlin.coroutines.Continuation<? super java.lang.Integer> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.wakeup.commponent.module.ai.AiLanguageMgr$getLanguageId$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.commponent.module.ai.AiLanguageMgr$getLanguageId$1 r0 = (com.wakeup.commponent.module.ai.AiLanguageMgr$getLanguageId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.commponent.module.ai.AiLanguageMgr$getLanguageId$1 r0 = new com.wakeup.commponent.module.ai.AiLanguageMgr$getLanguageId$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r8 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L42
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r9 = r6.getLanguageList(r7, r0)
            if (r9 != r1) goto L42
            return r1
        L42:
            java.util.List r9 = (java.util.List) r9
            r7 = r9
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r7)
            if (r7 == 0) goto L52
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            return r7
        L52:
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getLanguage()
            java.lang.String r0 = com.wakeup.commponent.module.ai.AiLanguageMgr.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentLanguage systemCode: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.wakeup.common.log.LogUtils.i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentLanguage list: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.wakeup.common.log.LogUtils.i(r0, r1)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L8e:
            boolean r0 = r9.hasNext()
            r1 = 0
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r9.next()
            r2 = r0
            com.wakeup.common.network.entity.ai.AiLanguage r2 = (com.wakeup.common.network.entity.ai.AiLanguage) r2
            java.lang.String r2 = r2.getLanguageCode()
            if (r2 != 0) goto La4
            java.lang.String r2 = ""
        La4:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r3 = r7
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 2
            boolean r1 = kotlin.text.StringsKt.contains$default(r2, r3, r4, r5, r1)
            if (r1 == 0) goto L8e
            r1 = r0
        Lb5:
            com.wakeup.common.network.entity.ai.AiLanguage r1 = (com.wakeup.common.network.entity.ai.AiLanguage) r1
            if (r1 != 0) goto Lbe
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            return r7
        Lbe:
            int r7 = r1.getLanguageId()
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.ai.AiLanguageMgr.getLanguageId(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getLanguageList(int i, Continuation<? super List<AiLanguage>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        ServiceManager.getAiService().requestSupportLan(i, new BaseCallback<List<AiLanguage>>() { // from class: com.wakeup.commponent.module.ai.AiLanguageMgr$getLanguageList$2$1
            @Override // com.wakeup.common.base.BaseCallback
            public void callback(int code, List<AiLanguage> t) {
                Intrinsics.checkNotNullParameter(t, "t");
                Continuation<List<AiLanguage>> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m14057constructorimpl(t));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
