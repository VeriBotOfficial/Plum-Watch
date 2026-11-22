package com.yandex.mobile.ads.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader", f = "NativeWrapperVideoLoader.kt", i = {0}, l = {54}, m = "loadWrapperVideoAdsInfo", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class nc1 extends ContinuationImpl {
    pc1 b;
    /* synthetic */ Object c;
    final /* synthetic */ pc1 d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nc1(pc1 pc1Var, Continuation<? super nc1> continuation) {
        super(continuation);
        this.d = pc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return pc1.a(this.d, null, this);
    }
}
