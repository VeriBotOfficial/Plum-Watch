package com.xmly.businesssdk.webview.bridge;

import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AuthBridgeModule.kt */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.xmly.businesssdk.webview.bridge.AuthBridgeModule$updateAuthEntityAsync$3", f = "AuthBridgeModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AuthBridgeModule$updateAuthEntityAsync$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSBridgeCallback $callback;
    public final /* synthetic */ Exception $e;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthBridgeModule$updateAuthEntityAsync$3(JSBridgeCallback jSBridgeCallback, Exception exc, Continuation<? super AuthBridgeModule$updateAuthEntityAsync$3> continuation) {
        super(2, continuation);
        this.$callback = jSBridgeCallback;
        this.$e = exc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthBridgeModule$updateAuthEntityAsync$3(this.$callback, this.$e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AuthBridgeModule$updateAuthEntityAsync$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        JSBridgeCallback jSBridgeCallback = this.$callback;
        a.a(this.$e, c.a("更新认证信息失败: "), jSBridgeCallback, 3003);
        return Unit.INSTANCE;
    }
}
