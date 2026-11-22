package com.wakeup.common.ftp;

import com.wakeup.module.device.work.BleFailStage;
import io.nats.client.support.ApiConstants;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* compiled from: WkFtpClient.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/ftp/ProgressOutputStream;", "Ljava/io/OutputStream;", "wrapped", "onProgress", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/io/OutputStream;Lkotlin/jvm/functions/Function1;)V", "transferred", BleFailStage.WRITE, "b", "", "", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "update", ApiConstants.BYTES, "close", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProgressOutputStream extends OutputStream {
    private final Function1<Long, Unit> onProgress;
    private long transferred;
    private final OutputStream wrapped;

    /* JADX WARN: Multi-variable type inference failed */
    public ProgressOutputStream(OutputStream wrapped, Function1<? super Long, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.wrapped = wrapped;
        this.onProgress = onProgress;
    }

    @Override // java.io.OutputStream
    public void write(int b) {
        this.wrapped.write(b);
        update(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int off, int len) {
        Intrinsics.checkNotNullParameter(b, "b");
        this.wrapped.write(b, off, len);
        update(len);
    }

    private final void update(long bytes) {
        long j = this.transferred + bytes;
        this.transferred = j;
        this.onProgress.invoke(Long.valueOf(j));
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.wrapped.close();
    }
}
