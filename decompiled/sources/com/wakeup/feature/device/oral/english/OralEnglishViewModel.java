package com.wakeup.feature.device.oral.english;

import androidx.lifecycle.MutableLiveData;
import com.wakeup.common.base.BaseViewModel;
import com.wakeup.common.network.entity.oral.SessionInfo;
import com.wakeup.common.network.entity.oral.UserTokenBean;
import com.wakeup.common.temp.ResponseThrowable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralEnglishViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0017R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/device/oral/english/OralEnglishViewModel;", "Lcom/wakeup/common/base/BaseViewModel;", "<init>", "()V", "tokenResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wakeup/common/network/entity/oral/UserTokenBean;", "getTokenResult", "()Landroidx/lifecycle/MutableLiveData;", "exit", "", "getExit", "activeSessionId", "", "getActiveSessionId", "()Ljava/lang/String;", "setActiveSessionId", "(Ljava/lang/String;)V", "getToken", "", "endSession", "userToken", "token", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OralEnglishViewModel extends BaseViewModel {
    private final MutableLiveData<UserTokenBean> tokenResult = new MutableLiveData<>();
    private final MutableLiveData<Boolean> exit = new MutableLiveData<>();
    private String activeSessionId = "";

    public final MutableLiveData<UserTokenBean> getTokenResult() {
        return this.tokenResult;
    }

    public final MutableLiveData<Boolean> getExit() {
        return this.exit;
    }

    public final String getActiveSessionId() {
        return this.activeSessionId;
    }

    public final void setActiveSessionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activeSessionId = str;
    }

    public final void getToken() {
        launchIO(new OralEnglishViewModel$getToken$1(this, null));
    }

    public final void endSession() {
        BaseViewModel.launchOnlyResult$default(this, new OralEnglishViewModel$endSession$1(this, null), new Function1() { // from class: com.wakeup.feature.device.oral.english.OralEnglishViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit endSession$lambda$0;
                endSession$lambda$0 = OralEnglishViewModel.endSession$lambda$0(OralEnglishViewModel.this, (SessionInfo) obj);
                return endSession$lambda$0;
            }
        }, new Function1() { // from class: com.wakeup.feature.device.oral.english.OralEnglishViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit endSession$lambda$1;
                endSession$lambda$1 = OralEnglishViewModel.endSession$lambda$1(OralEnglishViewModel.this, (ResponseThrowable) obj);
                return endSession$lambda$1;
            }
        }, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit endSession$lambda$0(OralEnglishViewModel oralEnglishViewModel, SessionInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        oralEnglishViewModel.exit.postValue(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit endSession$lambda$1(OralEnglishViewModel oralEnglishViewModel, ResponseThrowable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        oralEnglishViewModel.exit.postValue(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userToken(java.lang.String r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.wakeup.feature.device.oral.english.OralEnglishViewModel$userToken$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.feature.device.oral.english.OralEnglishViewModel$userToken$1 r0 = (com.wakeup.feature.device.oral.english.OralEnglishViewModel$userToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.feature.device.oral.english.OralEnglishViewModel$userToken$1 r0 = new com.wakeup.feature.device.oral.english.OralEnglishViewModel$userToken$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            com.wakeup.feature.device.oral.english.OralEnglishViewModel r5 = (com.wakeup.feature.device.oral.english.OralEnglishViewModel) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            com.wakeup.common.network.RetrofitManager$Companion r6 = com.wakeup.common.network.RetrofitManager.INSTANCE
            com.wakeup.common.network.RetrofitManager r6 = r6.getInstance()
            com.wakeup.common.network.api.OralService r6 = r6.getOralHost()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.userToken(r5, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            com.wakeup.common.network.BaseResult r6 = (com.wakeup.common.network.BaseResult) r6
            int r0 = r6.getCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L65
            androidx.lifecycle.MutableLiveData<com.wakeup.common.network.entity.oral.UserTokenBean> r5 = r5.tokenResult
            java.lang.Object r6 = r6.getData()
            r5.postValue(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L65:
            androidx.lifecycle.MutableLiveData<com.wakeup.common.network.entity.oral.UserTokenBean> r5 = r5.tokenResult
            r6 = 0
            r5.postValue(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.device.oral.english.OralEnglishViewModel.userToken(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
