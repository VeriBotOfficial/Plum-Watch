package com.beken.iot.smartsdk.options;

import com.beken.iot.smartsdk.callback.OnVideoCallback;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BkSmartCameraVideoOptions.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\f¨\u0006&"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraVideoOptions;", "", "builder", "Lcom/beken/iot/smartsdk/options/BkSmartCameraVideoOptions$Builder;", "(Lcom/beken/iot/smartsdk/options/BkSmartCameraVideoOptions$Builder;)V", "cameraCallback", "Lcom/beken/iot/smartsdk/callback/OnVideoCallback;", "getCameraCallback", "()Lcom/beken/iot/smartsdk/callback/OnVideoCallback;", "cameraId", "", "getCameraId", "()I", "frameFormat", "getFrameFormat", "height", "getHeight", "imageEncodingProtocolType", "Lcom/beken/iot/smartsdk/options/ImageEncodingProtocolType;", "getImageEncodingProtocolType", "()Lcom/beken/iot/smartsdk/options/ImageEncodingProtocolType;", "protocolVersion", "getProtocolVersion", "rotate", "getRotate", "secondHeight", "getSecondHeight", "secondWidth", "getSecondWidth", ApiConstants.STREAM, "getStream", "width", "getWidth", "checkPrams", "", "toString", "", "Builder", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BkSmartCameraVideoOptions {
    private final OnVideoCallback cameraCallback;
    private final int cameraId;
    private final int frameFormat;
    private final int height;
    private final ImageEncodingProtocolType imageEncodingProtocolType;
    private final int protocolVersion;
    private final int rotate;
    private final int secondHeight;
    private final int secondWidth;
    private final int stream;
    private final int width;

    public BkSmartCameraVideoOptions(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.cameraId = builder.getCameraId().getId();
        this.frameFormat = builder.getFrameFormat().getFormat();
        this.protocolVersion = builder.getCameraProtocolVersion().getVersion();
        this.rotate = builder.getRotate().getRotate();
        this.height = builder.getHeight();
        this.width = builder.getWidth();
        this.stream = builder.getStream().getStream();
        this.secondWidth = builder.getSecondWidth();
        this.secondHeight = builder.getSecondHeight();
        this.cameraCallback = builder.getCameraCallback();
        this.imageEncodingProtocolType = builder.getType();
        if (!checkPrams()) {
            throw new IllegalArgumentException("camera options is illegal");
        }
    }

    public final int getCameraId() {
        return this.cameraId;
    }

    public final int getFrameFormat() {
        return this.frameFormat;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final int getStream() {
        return this.stream;
    }

    public final int getSecondWidth() {
        return this.secondWidth;
    }

    public final int getSecondHeight() {
        return this.secondHeight;
    }

    public final OnVideoCallback getCameraCallback() {
        return this.cameraCallback;
    }

    public final ImageEncodingProtocolType getImageEncodingProtocolType() {
        return this.imageEncodingProtocolType;
    }

    private final boolean checkPrams() {
        return this.cameraId >= 0 && this.frameFormat >= 0 && this.height > 0 && this.width >= 0 && this.protocolVersion >= 0 && this.rotate >= 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BkSmartCameraVideoOptions(cameraId=");
        sb.append(this.cameraId).append(", frameFormat=").append(this.frameFormat).append(", height=").append(this.height).append(", protocolVersion=").append(this.protocolVersion).append(", width=").append(this.width).append(", rotate=").append(this.rotate).append(", stream=").append(this.stream).append(", secondWidth=").append(this.secondWidth).append(", secondHeight=").append(this.secondHeight).append(", cameraCallback=").append(this.cameraCallback).append(", imageEncodingProtocolType=").append(this.imageEncodingProtocolType).append(')');
        return sb.toString();
    }

    /* compiled from: BkSmartCameraVideoOptions.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\u000eJ\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraVideoOptions$Builder;", "", "()V", "cameraCallback", "Lcom/beken/iot/smartsdk/callback/OnVideoCallback;", "cameraId", "Lcom/beken/iot/smartsdk/options/CameraId;", "cameraProtocolVersion", "Lcom/beken/iot/smartsdk/options/CameraProtocolVersion;", "frameFormat", "Lcom/beken/iot/smartsdk/options/CameraFormat;", "height", "", "rotate", "Lcom/beken/iot/smartsdk/options/Rotate;", "secondHeight", "secondWidth", ApiConstants.STREAM, "Lcom/beken/iot/smartsdk/options/Stream;", "type", "Lcom/beken/iot/smartsdk/options/ImageEncodingProtocolType;", "width", "build", "Lcom/beken/iot/smartsdk/options/BkSmartCameraVideoOptions;", "getCameraCallback", "getCameraId", "getFrameFormat", "getHeight", "getImageEncodingProtocolType", "getProtocolVersion", "getRotate", "getSecondHeight", "getSecondWidth", "getStream", "getWidth", "setCameraCallback", "callback", "setCameraId", "setFrameFormat", "setHeight", "setImageEncodingProtocolType", "setRotate", "setSecondHeight", "setSecondWidth", "setStream", "setWidth", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private OnVideoCallback cameraCallback;
        private int secondHeight;
        private int secondWidth;
        private CameraId cameraId = CameraId.DVP;
        private CameraFormat frameFormat = CameraFormat.H264;
        private CameraProtocolVersion cameraProtocolVersion = CameraProtocolVersion.V2;
        private Rotate rotate = Rotate.ROTATE_0;
        private int height = 480;
        private int width = 640;
        private Stream stream = Stream.SINGLE_STREAM;
        private ImageEncodingProtocolType type = ImageEncodingProtocolType.BEKEN;

        public final Builder setCameraId(CameraId cameraId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            this.cameraId = cameraId;
            return this;
        }

        public final CameraId getCameraId() {
            return this.cameraId;
        }

        public final Builder setFrameFormat(CameraFormat frameFormat) {
            Intrinsics.checkNotNullParameter(frameFormat, "frameFormat");
            this.frameFormat = frameFormat;
            return this;
        }

        public final CameraFormat getFrameFormat() {
            return this.frameFormat;
        }

        public final Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public final int getHeight() {
            return this.height;
        }

        /* renamed from: getProtocolVersion, reason: from getter */
        public final CameraProtocolVersion getCameraProtocolVersion() {
            return this.cameraProtocolVersion;
        }

        public final Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        public final int getWidth() {
            return this.width;
        }

        public final Builder setRotate(Rotate rotate) {
            Intrinsics.checkNotNullParameter(rotate, "rotate");
            this.rotate = rotate;
            return this;
        }

        public final Rotate getRotate() {
            return this.rotate;
        }

        public final Builder setStream(Stream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            this.stream = stream;
            return this;
        }

        public final Stream getStream() {
            return this.stream;
        }

        public final Builder setSecondWidth(int secondWidth) {
            this.secondWidth = secondWidth;
            return this;
        }

        public final int getSecondWidth() {
            return this.secondWidth;
        }

        public final Builder setSecondHeight(int secondHeight) {
            this.secondHeight = secondHeight;
            return this;
        }

        public final int getSecondHeight() {
            return this.secondHeight;
        }

        public final Builder setCameraCallback(OnVideoCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.cameraCallback = callback;
            return this;
        }

        public final OnVideoCallback getCameraCallback() {
            return this.cameraCallback;
        }

        public final Builder setImageEncodingProtocolType(ImageEncodingProtocolType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            return this;
        }

        /* renamed from: getImageEncodingProtocolType, reason: from getter */
        public final ImageEncodingProtocolType getType() {
            return this.type;
        }

        public final BkSmartCameraVideoOptions build() {
            return new BkSmartCameraVideoOptions(this);
        }
    }
}
