package com.anyka.neural.ncnn;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.anyka.neural.ncnn.YuvProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/* loaded from: classes11.dex */
public class NcnnNative {
    static {
        System.loadLibrary("imageDenoise-lib");
    }

    private byte[] doImageDenoisingInternal(String str, int i) {
        Log.e("ImageDenoise", "doImageDenoisingInternal start");
        byte[] imageDenoiseWithPartition = imageDenoiseWithPartition(str, i);
        Log.e("ImageDenoise", "imageDenoise end");
        if (imageDenoiseWithPartition != null) {
            return imageDenoiseWithPartition;
        }
        Log.e("ImageDenoise", "推理失败，返回 null");
        return null;
    }

    private CompletableFuture<Boolean> doSuperResolution(final String str, final String str2) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.anyka.neural.ncnn.NcnnNative$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return NcnnNative.this.m6913lambda$doSuperResolution$1$comanykaneuralncnnNcnnNative(str, str2);
            }
        });
    }

    private boolean doSuperResolutionInternal(String str, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Log.e("Mety0208", "inputBitmap width: " + decodeFile.getWidth() + " ,height: " + decodeFile.getHeight());
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        YuvProcessor.YuvData bitmapToYuv420 = YuvProcessor.bitmapToYuv420(decodeFile);
        bitmapToYuv420.uvPlane = YuvProcessor.upscaleUvData4x(bitmapToYuv420.uvPlane, width, height);
        Log.e("Mety0208", "uvPlane: " + bitmapToYuv420.uvPlane.capacity());
        ByteBuffer superResolution = superResolution(bitmapToYuv420.yFloatPlane, new int[]{1, 1, height, width});
        Log.e("Mety0208", "yFloatPlane asFloatBuffer begin... ");
        bitmapToYuv420.yFloatPlane = superResolution.order(ByteOrder.nativeOrder()).asFloatBuffer();
        StringBuilder sb = new StringBuilder("yFloatPlane: ");
        FloatBuffer floatBuffer = bitmapToYuv420.yFloatPlane;
        Log.e("Mety0208", sb.append(floatBuffer == null ? -1 : floatBuffer.capacity()).toString());
        if (bitmapToYuv420.yFloatPlane == null) {
            return false;
        }
        if (str2 == null) {
            YuvProcessor.yuv420ToBitmap(bitmapToYuv420, width * 2, height * 2);
        } else {
            YuvProcessor.saveYuvAsJpeg(bitmapToYuv420, width * 2, height * 2, str2, 100);
        }
        bitmapToYuv420.yFloatPlane = null;
        bitmapToYuv420.uvPlane = null;
        return true;
    }

    private native boolean initNcnnModel(AssetManager assetManager, String str, String str2);

    private CompletableFuture<Boolean> initSuperResolution(final AssetManager assetManager) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.anyka.neural.ncnn.NcnnNative$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return NcnnNative.this.m6914lambda$initSuperResolution$0$comanykaneuralncnnNcnnNative(assetManager);
            }
        });
    }

    private native ByteBuffer superResolution(FloatBuffer floatBuffer, int[] iArr);

    public CompletableFuture<ByteBuffer> doImageDenoising(final String str, final int i) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.anyka.neural.ncnn.NcnnNative$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return NcnnNative.this.m6912lambda$doImageDenoising$2$comanykaneuralncnnNcnnNative(str, i);
            }
        });
    }

    public native ByteBuffer imageDenoise(String str, int[] iArr);

    public native byte[] imageDenoiseWithPartition(String str, int i);

    public Boolean initImageDenoising(AssetManager assetManager, int i) {
        return i != 1 ? i != 2 ? i != 3 ? Boolean.FALSE : Boolean.valueOf(initNcnnModel(assetManager, "PMRID_13b0_dynamic_night_20260309.param.aes", "PMRID_13b0_dynamic_night_20260309.bin.aes")) : Boolean.valueOf(initNcnnModel(assetManager, "PMRID_13b0_dynamic_day_20260109.param.aes", "PMRID_13b0_dynamic_day_20260109.bin.aes")) : Boolean.valueOf(initNcnnModel(assetManager, "PMRID_3M5_dynamic_day_20260325.param.aes", "PMRID_3M5_dynamic_day_20260325.bin.aes"));
    }

    /* renamed from: lambda$doImageDenoising$2$com-anyka-neural-ncnn-NcnnNative, reason: not valid java name */
    /* synthetic */ ByteBuffer m6912lambda$doImageDenoising$2$comanykaneuralncnnNcnnNative(String str, int i) {
        byte[] doImageDenoisingInternal = doImageDenoisingInternal(str, i);
        if (doImageDenoisingInternal == null) {
            return null;
        }
        return ByteBuffer.wrap(doImageDenoisingInternal);
    }

    /* renamed from: lambda$doSuperResolution$1$com-anyka-neural-ncnn-NcnnNative, reason: not valid java name */
    /* synthetic */ Boolean m6913lambda$doSuperResolution$1$comanykaneuralncnnNcnnNative(String str, String str2) {
        return Boolean.valueOf(doSuperResolutionInternal(str, str2));
    }

    /* renamed from: lambda$initSuperResolution$0$com-anyka-neural-ncnn-NcnnNative, reason: not valid java name */
    /* synthetic */ Boolean m6914lambda$initSuperResolution$0$comanykaneuralncnnNcnnNative(AssetManager assetManager) {
        return Boolean.valueOf(initNcnnModel(assetManager, "fsrcnn_x2_height_width.param", "fsrcnn_x2_height_width.bin"));
    }

    public native boolean releaseNcnnModel();
}
