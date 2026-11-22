package com.asni.imageupscale;

import kotlin.Metadata;

/* compiled from: ImageUpscaleTask.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleCancellationToken;", "", "()V", "<set-?>", "", "isCancelled", "()Z", "cancel", "", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageUpscaleCancellationToken {
    private volatile boolean isCancelled;

    /* renamed from: isCancelled, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    public final void cancel() {
        this.isCancelled = true;
    }
}
