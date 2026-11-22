package com.wakeup.commponent.module.device.glasses;

import android.graphics.Bitmap;
import com.anyka.neural.ncnn.MyImageUtils;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GlassesFileProcessMgr.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.commponent.module.device.glasses.GlassesFileProcessMgr$processImgTask$2", f = "GlassesFileProcessMgr.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class GlassesFileProcessMgr$processImgTask$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ int $outputHeight;
    final /* synthetic */ int $outputWidth;
    final /* synthetic */ ByteBuffer $rgbBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlassesFileProcessMgr$processImgTask$2(ByteBuffer byteBuffer, int i, int i2, Continuation<? super GlassesFileProcessMgr$processImgTask$2> continuation) {
        super(2, continuation);
        this.$rgbBuffer = byteBuffer;
        this.$outputWidth = i;
        this.$outputHeight = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlassesFileProcessMgr$processImgTask$2(this.$rgbBuffer, this.$outputWidth, this.$outputHeight, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((GlassesFileProcessMgr$processImgTask$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MyImageUtils.rgbBufferToBitmap(this.$rgbBuffer, this.$outputWidth, this.$outputHeight);
    }
}
