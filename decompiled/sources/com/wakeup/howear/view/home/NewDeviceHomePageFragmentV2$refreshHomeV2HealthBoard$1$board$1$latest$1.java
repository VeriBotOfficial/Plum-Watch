package com.wakeup.howear.view.home;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NewDeviceHomePageFragmentV2.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1", f = "NewDeviceHomePageFragmentV2.kt", i = {}, l = {638}, m = "invokeSuspend$latest", n = {}, s = {})
/* loaded from: classes4.dex */
final class NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1(Continuation<? super NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend$latest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        invokeSuspend$latest = NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1.invokeSuspend$latest(0, this);
        return invokeSuspend$latest;
    }
}
