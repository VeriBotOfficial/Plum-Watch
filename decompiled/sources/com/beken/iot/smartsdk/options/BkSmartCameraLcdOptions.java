package com.beken.iot.smartsdk.options;

import com.beken.iot.smartsdk.callback.OnLcdCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BkSmartCameraLcdOptions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraLcdOptions;", "", "builder", "Lcom/beken/iot/smartsdk/options/BkSmartCameraLcdOptions$Builder;", "(Lcom/beken/iot/smartsdk/options/BkSmartCameraLcdOptions$Builder;)V", "callback", "Lcom/beken/iot/smartsdk/callback/OnLcdCallback;", "getCallback", "()Lcom/beken/iot/smartsdk/callback/OnLcdCallback;", "format", "", "getFormat", "()I", "id", "getId", "rotate", "getRotate", "toString", "", "Builder", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BkSmartCameraLcdOptions {
    private final OnLcdCallback callback;
    private final int format;
    private final int id;
    private final int rotate;

    public BkSmartCameraLcdOptions(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.format = builder.getFormat().getFormat();
        this.id = builder.getId();
        this.rotate = builder.getRotate().getRotate();
        this.callback = builder.getCallback();
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getId() {
        return this.id;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final OnLcdCallback getCallback() {
        return this.callback;
    }

    /* compiled from: BkSmartCameraLcdOptions.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraLcdOptions$Builder;", "", "()V", "callback", "Lcom/beken/iot/smartsdk/callback/OnLcdCallback;", "format", "Lcom/beken/iot/smartsdk/options/LcdFormat;", "id", "", "rotate", "Lcom/beken/iot/smartsdk/options/Rotate;", "build", "Lcom/beken/iot/smartsdk/options/BkSmartCameraLcdOptions;", "getFormat", "getId", "getLcdCallback", "getRotate", "setFormat", "setId", "setLcdCallback", "setRotate", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private OnLcdCallback callback;
        private LcdFormat format = LcdFormat.RGB565;
        private int id = 1;
        private Rotate rotate = Rotate.ROTATE_0;

        public final Builder setFormat(LcdFormat format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.format = format;
            return this;
        }

        public final LcdFormat getFormat() {
            return this.format;
        }

        public final Builder setId(int id2) {
            this.id = id2;
            return this;
        }

        public final int getId() {
            return this.id;
        }

        public final Builder setRotate(Rotate rotate) {
            Intrinsics.checkNotNullParameter(rotate, "rotate");
            this.rotate = rotate;
            return this;
        }

        public final Rotate getRotate() {
            return this.rotate;
        }

        public final Builder setLcdCallback(OnLcdCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
            return this;
        }

        /* renamed from: getLcdCallback, reason: from getter */
        public final OnLcdCallback getCallback() {
            return this.callback;
        }

        public final BkSmartCameraLcdOptions build() {
            return new BkSmartCameraLcdOptions(this);
        }
    }

    public String toString() {
        return "BkSmartCameraLcdOptions(format=" + this.format + ", id=" + this.id + ", rotate=" + this.rotate + ')';
    }
}
