package com.beken.iot.smartsdk.options;

import com.beken.iot.smartsdk.callback.OnBleScanCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BkSmartBleScanOptions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartBleScanOptions;", "", "builder", "Lcom/beken/iot/smartsdk/options/BkSmartBleScanOptions$Builder;", "(Lcom/beken/iot/smartsdk/options/BkSmartBleScanOptions$Builder;)V", "onBleScanCallback", "Lcom/beken/iot/smartsdk/callback/OnBleScanCallback;", "getOnBleScanCallback", "()Lcom/beken/iot/smartsdk/callback/OnBleScanCallback;", "scanTimeout", "", "getScanTimeout", "()J", "toString", "", "Builder", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BkSmartBleScanOptions {
    private final OnBleScanCallback onBleScanCallback;
    private final long scanTimeout;

    public BkSmartBleScanOptions(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.scanTimeout = builder.getScanTimeout();
        this.onBleScanCallback = builder.getCallback();
    }

    public final long getScanTimeout() {
        return this.scanTimeout;
    }

    public final OnBleScanCallback getOnBleScanCallback() {
        return this.onBleScanCallback;
    }

    /* compiled from: BkSmartBleScanOptions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartBleScanOptions$Builder;", "", "()V", "callback", "Lcom/beken/iot/smartsdk/callback/OnBleScanCallback;", "scanTimeout", "", "build", "Lcom/beken/iot/smartsdk/options/BkSmartBleScanOptions;", "getOnBleScanCallback", "getScanTimeout", "setOnBleScanCallback", "setScanTimeout", "timeout", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private OnBleScanCallback callback;
        private long scanTimeout = 5000;

        public final Builder setScanTimeout(long timeout) {
            if (timeout > 0) {
                this.scanTimeout = timeout;
            }
            return this;
        }

        public final long getScanTimeout() {
            return this.scanTimeout;
        }

        public final Builder setOnBleScanCallback(OnBleScanCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
            return this;
        }

        /* renamed from: getOnBleScanCallback, reason: from getter */
        public final OnBleScanCallback getCallback() {
            return this.callback;
        }

        public final BkSmartBleScanOptions build() {
            return new BkSmartBleScanOptions(this);
        }
    }

    public String toString() {
        return "BkSmartBleScanOptions(scanTimeout=" + this.scanTimeout + ", onBleScanCallback=" + this.onBleScanCallback + ')';
    }
}
