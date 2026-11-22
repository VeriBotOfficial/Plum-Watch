package com.xmly.businesssdk;

import com.xmly.businesssdk.login.ExternalLoginCallback;
import com.xmly.businesssdk.login.ExternalLoginError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BusinessSDK.kt */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.xmly.businesssdk.BusinessSDK$refreshNativeAuthEntityAsync$3", f = "BusinessSDK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class BusinessSDK$refreshNativeAuthEntityAsync$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ExternalLoginCallback $callback;
    public final /* synthetic */ Exception $e;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessSDK$refreshNativeAuthEntityAsync$3(ExternalLoginCallback externalLoginCallback, Exception exc, Continuation<? super BusinessSDK$refreshNativeAuthEntityAsync$3> continuation) {
        super(2, continuation);
        this.$callback = externalLoginCallback;
        this.$e = exc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BusinessSDK$refreshNativeAuthEntityAsync$3(this.$callback, this.$e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BusinessSDK$refreshNativeAuthEntityAsync$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$callback.onLoginFailed(b.a(this.$e, c.a("刷新native认证信息失败: ")), ExternalLoginError.LOGIN_FAILED);
        return Unit.INSTANCE;
    }
}
