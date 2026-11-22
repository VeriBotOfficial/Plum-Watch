package com.wakeup.module.religion.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: PraySceneHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.PraySceneHelper", f = "PraySceneHelper.kt", i = {0}, l = {TelnetCommand.AYT}, m = "deviceGetPrayTextByServer", n = {"suraId"}, s = {"I$0"})
/* loaded from: classes4.dex */
final class PraySceneHelper$deviceGetPrayTextByServer$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PraySceneHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PraySceneHelper$deviceGetPrayTextByServer$1(PraySceneHelper praySceneHelper, Continuation<? super PraySceneHelper$deviceGetPrayTextByServer$1> continuation) {
        super(continuation);
        this.this$0 = praySceneHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deviceGetPrayTextByServer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        deviceGetPrayTextByServer = this.this$0.deviceGetPrayTextByServer(0, this);
        return deviceGetPrayTextByServer;
    }
}
