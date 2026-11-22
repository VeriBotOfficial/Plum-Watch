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

/* compiled from: GlassesLanageMgr.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/ai/GlassesLanguageMgr;", "", "<init>", "()V", "TAG", "", "DEF_LANGUAGE_CODE", "", "getLanguageId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLanguageList", "", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GlassesLanguageMgr {
    private static final int DEF_LANGUAGE_CODE = 83;
    public static final GlassesLanguageMgr INSTANCE = new GlassesLanguageMgr();
    private static final String TAG = "GlassesLanguageMgr";

    private GlassesLanguageMgr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLanguageId(kotlin.coroutines.Continuation<? super java.lang.Integer> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.wakeup.commponent.module.ai.GlassesLanguageMgr$getLanguageId$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.commponent.module.ai.GlassesLanguageMgr$getLanguageId$1 r0 = (com.wakeup.commponent.module.ai.GlassesLanguageMgr$getLanguageId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.commponent.module.ai.GlassesLanguageMgr$getLanguageId$1 r0 = new com.wakeup.commponent.module.ai.GlassesLanguageMgr$getLanguageId$1
            r0.<init>(r8, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3e
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.label = r3
            java.lang.Object r9 = r8.getLanguageList(r0)
            if (r9 != r1) goto L3e
            return r1
        L3e:
            java.util.List r9 = (java.util.List) r9
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r0)
            r1 = 83
            if (r0 == 0) goto L50
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            return r9
        L50:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r2 = com.wakeup.commponent.module.ai.GlassesLanguageMgr.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getCurrentLanguage systemCode: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.wakeup.common.log.LogUtils.i(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getCurrentLanguage list: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.wakeup.common.log.LogUtils.i(r2, r3)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L8c:
            boolean r2 = r9.hasNext()
            r3 = 0
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r9.next()
            r4 = r2
            com.wakeup.common.network.entity.ai.AiLanguage r4 = (com.wakeup.common.network.entity.ai.AiLanguage) r4
            java.lang.String r4 = r4.getLanguageCode()
            if (r4 != 0) goto La2
            java.lang.String r4 = ""
        La2:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 0
            r7 = 2
            boolean r3 = kotlin.text.StringsKt.contains$default(r4, r5, r6, r7, r3)
            if (r3 == 0) goto L8c
            r3 = r2
        Lb3:
            com.wakeup.common.network.entity.ai.AiLanguage r3 = (com.wakeup.common.network.entity.ai.AiLanguage) r3
            if (r3 != 0) goto Lbc
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            return r9
        Lbc:
            int r9 = r3.getLanguageId()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.ai.GlassesLanguageMgr.getLanguageId(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getLanguageList(Continuation<? super List<AiLanguage>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        ServiceManager.getAiService().requestSupportLan(45, new BaseCallback<List<AiLanguage>>() { // from class: com.wakeup.commponent.module.ai.GlassesLanguageMgr$getLanguageList$2$1
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
