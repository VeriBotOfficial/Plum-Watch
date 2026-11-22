package com.asni.imageupscale;

import com.autonavi.aps.amapapi.config.Const;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageUpscaleError.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0017\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "Lcom/asni/imageupscale/ImageUpscaleErrorCode;", "message", "", "(Lcom/asni/imageupscale/ImageUpscaleErrorCode;Ljava/lang/String;)V", "getCode", "()Lcom/asni/imageupscale/ImageUpscaleErrorCode;", "Cancelled", "CannotDecodeImage", "CannotEncodeImage", "ImageNotFound", "InputTooLarge", "InvalidLimit", "InvalidTargetPixelCount", "OpenCvUnavailable", "OutputTooLarge", "TimedOut", "Lcom/asni/imageupscale/ImageUpscaleException$Cancelled;", "Lcom/asni/imageupscale/ImageUpscaleException$CannotDecodeImage;", "Lcom/asni/imageupscale/ImageUpscaleException$CannotEncodeImage;", "Lcom/asni/imageupscale/ImageUpscaleException$ImageNotFound;", "Lcom/asni/imageupscale/ImageUpscaleException$InputTooLarge;", "Lcom/asni/imageupscale/ImageUpscaleException$InvalidLimit;", "Lcom/asni/imageupscale/ImageUpscaleException$InvalidTargetPixelCount;", "Lcom/asni/imageupscale/ImageUpscaleException$OpenCvUnavailable;", "Lcom/asni/imageupscale/ImageUpscaleException$OutputTooLarge;", "Lcom/asni/imageupscale/ImageUpscaleException$TimedOut;", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ImageUpscaleException extends Exception {
    private final ImageUpscaleErrorCode code;

    public /* synthetic */ ImageUpscaleException(ImageUpscaleErrorCode imageUpscaleErrorCode, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageUpscaleErrorCode, str);
    }

    public final ImageUpscaleErrorCode getCode() {
        return this.code;
    }

    private ImageUpscaleException(ImageUpscaleErrorCode imageUpscaleErrorCode, String str) {
        super(str);
        this.code = imageUpscaleErrorCode;
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$InvalidTargetPixelCount;", "Lcom/asni/imageupscale/ImageUpscaleException;", "targetPixelCount", "", "(I)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidTargetPixelCount extends ImageUpscaleException {
        public InvalidTargetPixelCount(int i) {
            super(ImageUpscaleErrorCode.INVALID_ARGUMENT, "targetPixelCount must be positive: " + i, null);
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$InvalidLimit;", "Lcom/asni/imageupscale/ImageUpscaleException;", "name", "", "(Ljava/lang/String;)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidLimit extends ImageUpscaleException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidLimit(String name) {
            super(ImageUpscaleErrorCode.INVALID_ARGUMENT, name + " must be positive", null);
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$ImageNotFound;", "Lcom/asni/imageupscale/ImageUpscaleException;", "path", "", "(Ljava/lang/String;)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageNotFound extends ImageUpscaleException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageNotFound(String path) {
            super(ImageUpscaleErrorCode.IMAGE_NOT_FOUND, "Image not found: " + path, null);
            Intrinsics.checkNotNullParameter(path, "path");
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$CannotDecodeImage;", "Lcom/asni/imageupscale/ImageUpscaleException;", "path", "", "(Ljava/lang/String;)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CannotDecodeImage extends ImageUpscaleException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CannotDecodeImage(String path) {
            super(ImageUpscaleErrorCode.DECODE_FAILED, "Cannot decode image: " + path, null);
            Intrinsics.checkNotNullParameter(path, "path");
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$CannotEncodeImage;", "Lcom/asni/imageupscale/ImageUpscaleException;", "path", "", "(Ljava/lang/String;)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CannotEncodeImage extends ImageUpscaleException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CannotEncodeImage(String path) {
            super(ImageUpscaleErrorCode.ENCODE_FAILED, "Cannot encode image: " + path, null);
            Intrinsics.checkNotNullParameter(path, "path");
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$InputTooLarge;", "Lcom/asni/imageupscale/ImageUpscaleException;", "pixelCount", "", ApiConstants.LIMIT, "(II)V", "", "(JJ)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputTooLarge extends ImageUpscaleException {
        public InputTooLarge(long j, long j2) {
            super(ImageUpscaleErrorCode.INPUT_TOO_LARGE, "Input image is too large: " + j + " > " + j2, null);
        }

        public InputTooLarge(int i, int i2) {
            this(i, i2);
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$OutputTooLarge;", "Lcom/asni/imageupscale/ImageUpscaleException;", "pixelCount", "", ApiConstants.LIMIT, "(II)V", "", "(JJ)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OutputTooLarge extends ImageUpscaleException {
        public OutputTooLarge(long j, long j2) {
            super(ImageUpscaleErrorCode.OUTPUT_TOO_LARGE, "Output image is too large: " + j + " > " + j2, null);
        }

        public OutputTooLarge(int i, int i2) {
            this(i, i2);
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$TimedOut;", "Lcom/asni/imageupscale/ImageUpscaleException;", "timeoutMillis", "", "(J)V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimedOut extends ImageUpscaleException {
        public TimedOut(long j) {
            super(ImageUpscaleErrorCode.TIMED_OUT, "Image upscale timed out after " + j + Const.SP_KEY_GSM_UPLOAD_MXSIZE, null);
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$Cancelled;", "Lcom/asni/imageupscale/ImageUpscaleException;", "()V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Cancelled extends ImageUpscaleException {
        public Cancelled() {
            super(ImageUpscaleErrorCode.CANCELLED, "Image upscale was cancelled", null);
        }
    }

    /* compiled from: ImageUpscaleError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/asni/imageupscale/ImageUpscaleException$OpenCvUnavailable;", "Lcom/asni/imageupscale/ImageUpscaleException;", "()V", "image-upscale-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenCvUnavailable extends ImageUpscaleException {
        public OpenCvUnavailable() {
            super(ImageUpscaleErrorCode.OPENCV_UNAVAILABLE, "OpenCV failed to initialize", null);
        }
    }
}
