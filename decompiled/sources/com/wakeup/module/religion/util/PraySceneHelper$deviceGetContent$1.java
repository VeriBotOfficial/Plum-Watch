package com.wakeup.module.religion.util;

import com.haibin.calendarview.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.commons.net.smtp.SMTPReply;

/* compiled from: PraySceneHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.PraySceneHelper", f = "PraySceneHelper.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {339, SMTPReply.START_MAIL_INPUT, BuildConfig.VERSION_CODE, 379}, m = "deviceGetContent", n = {"this", "context", "tag", "sura", "paragraphIndex", "position", "option"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "I$4"})
/* loaded from: classes4.dex */
final class PraySceneHelper$deviceGetContent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PraySceneHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PraySceneHelper$deviceGetContent$1(PraySceneHelper praySceneHelper, Continuation<? super PraySceneHelper$deviceGetContent$1> continuation) {
        super(continuation);
        this.this$0 = praySceneHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deviceGetContent(null, 0, 0, 0, 0, 0, this);
    }
}
