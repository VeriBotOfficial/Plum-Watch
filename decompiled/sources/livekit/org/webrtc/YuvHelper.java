package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class YuvHelper {
    private static native void nativeABGRToI420(ByteBuffer src, int srcStride, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int width, int height);

    private static native void nativeCopyPlane(ByteBuffer src, int srcStride, ByteBuffer dst, int dstStride, int width, int height);

    private static native void nativeI420Copy(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int width, int height);

    private static native void nativeI420Rotate(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int srcWidth, int srcHeight, int rotationMode);

    private static native void nativeI420ToNV12(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dstY, int dstStrideY, ByteBuffer dstUV, int dstStrideUV, int width, int height);

    public static void I420Copy(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dst, int dstWidth, int dstHeight, int dstStrideY, int dstSliceHeightY, int dstStrideU, int dstSliceHeightU) {
        int i = (dstHeight + 1) / 2;
        int i2 = dstStrideY * dstHeight;
        int i3 = dstStrideY * dstSliceHeightY;
        int i4 = (dstStrideU * i) + i3;
        int i5 = (dstStrideU * dstSliceHeightU) + i3;
        int i6 = ((i - 1) * dstStrideU) + i5 + ((dstWidth + 1) / 2);
        if (dst.capacity() < i6) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i6 + " was " + dst.capacity());
        }
        ByteBuffer slice = dst.slice();
        ByteBuffer slice2 = dst.slice();
        I420Copy(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, slice, dstStrideY, slice2, dstStrideU, dst.slice(), dstStrideU, dstWidth, dstHeight);
    }

    public static void I420Copy(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dst, int dstWidth, int dstHeight) {
        I420Copy(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, dst, dstWidth, dstHeight, dstWidth, dstHeight, (dstWidth + 1) / 2, (dstHeight + 1) / 2);
    }

    public static void I420Copy(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dst, int dstWidth, int dstHeight, int dstStride, int dstSliceHeight) {
        I420Copy(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, dst, dstWidth, dstHeight, dstStride, dstSliceHeight, (dstStride + 1) / 2, (dstSliceHeight + 1) / 2);
    }

    public static void I420ToNV12(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dst, int dstWidth, int dstHeight, int dstStrideY, int dstSliceHeightY) {
        int i = (dstWidth + 1) / 2;
        int i2 = dstStrideY * dstHeight;
        int i3 = dstStrideY * dstSliceHeightY;
        int i4 = (((dstHeight + 1) / 2) * i * 2) + i3;
        if (dst.capacity() < i4) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i4 + " was " + dst.capacity());
        }
        ByteBuffer slice = dst.slice();
        I420ToNV12(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, slice, dstStrideY, dst.slice(), i * 2, dstWidth, dstHeight);
    }

    public static void I420ToNV12(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dst, int dstWidth, int dstHeight) {
        I420ToNV12(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, dst, dstWidth, dstHeight, dstWidth, dstHeight);
    }

    public static void I420Rotate(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dst, int srcWidth, int srcHeight, int rotationMode) {
        checkNotNull(srcY, "srcY");
        checkNotNull(srcU, "srcU");
        checkNotNull(srcV, "srcV");
        checkNotNull(dst, "dst");
        int i = rotationMode % 180;
        int i2 = i == 0 ? srcWidth : srcHeight;
        int i3 = i == 0 ? srcHeight : srcWidth;
        int i4 = (i3 + 1) / 2;
        int i5 = (i2 + 1) / 2;
        int i6 = i3 * i2;
        int i7 = i4 * i5;
        int i8 = (i7 * 2) + i6;
        if (dst.capacity() < i8) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i8 + " was " + dst.capacity());
        }
        int i9 = i7 + i6;
        ByteBuffer slice = dst.slice();
        ByteBuffer slice2 = dst.slice();
        nativeI420Rotate(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, slice, i2, slice2, i5, dst.slice(), i5, srcWidth, srcHeight, rotationMode);
    }

    public static void copyPlane(ByteBuffer src, int srcStride, ByteBuffer dst, int dstStride, int width, int height) {
        nativeCopyPlane((ByteBuffer) checkNotNull(src, "src"), srcStride, (ByteBuffer) checkNotNull(dst, "dst"), dstStride, width, height);
    }

    public static void ABGRToI420(ByteBuffer src, int srcStride, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int width, int height) {
        nativeABGRToI420((ByteBuffer) checkNotNull(src, "src"), srcStride, (ByteBuffer) checkNotNull(dstY, "dstY"), dstStrideY, (ByteBuffer) checkNotNull(dstU, "dstU"), dstStrideU, (ByteBuffer) checkNotNull(dstV, "dstV"), dstStrideV, width, height);
    }

    public static void I420Copy(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int width, int height) {
        checkNotNull(srcY, "srcY");
        checkNotNull(srcU, "srcU");
        checkNotNull(srcV, "srcV");
        checkNotNull(dstY, "dstY");
        checkNotNull(dstU, "dstU");
        checkNotNull(dstV, "dstV");
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("I420Copy: width and height should not be negative");
        }
        nativeI420Copy(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, dstY, dstStrideY, dstU, dstStrideU, dstV, dstStrideV, width, height);
    }

    public static void I420ToNV12(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dstY, int dstStrideY, ByteBuffer dstUV, int dstStrideUV, int width, int height) {
        checkNotNull(srcY, "srcY");
        checkNotNull(srcU, "srcU");
        checkNotNull(srcV, "srcV");
        checkNotNull(dstY, "dstY");
        checkNotNull(dstUV, "dstUV");
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
        }
        nativeI420ToNV12(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, dstY, dstStrideY, dstUV, dstStrideUV, width, height);
    }

    public static void I420Rotate(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int srcWidth, int srcHeight, int rotationMode) {
        checkNotNull(srcY, "srcY");
        checkNotNull(srcU, "srcU");
        checkNotNull(srcV, "srcV");
        checkNotNull(dstY, "dstY");
        checkNotNull(dstU, "dstU");
        checkNotNull(dstV, "dstV");
        nativeI420Rotate(srcY, srcStrideY, srcU, srcStrideU, srcV, srcStrideV, dstY, dstStrideY, dstU, dstStrideU, dstV, dstStrideV, srcWidth, srcHeight, rotationMode);
    }

    private static <T> T checkNotNull(T obj, String description) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(description + " should not be null");
    }
}
