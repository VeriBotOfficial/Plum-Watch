package com.asni.imageupscale;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageUpscaleTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleTask;", "", "token", "Lcom/asni/imageupscale/ImageUpscaleCancellationToken;", "thread", "Ljava/lang/Thread;", "(Lcom/asni/imageupscale/ImageUpscaleCancellationToken;Ljava/lang/Thread;)V", "cancel", "", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleTask {
    private final Thread thread;
    private final ImageUpscaleCancellationToken token;

    public ImageUpscaleTask(ImageUpscaleCancellationToken token, Thread thread) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(thread, "thread");
        this.token = token;
        this.thread = thread;
    }

    public final void cancel() {
        this.token.cancel();
        this.thread.interrupt();
    }
}
