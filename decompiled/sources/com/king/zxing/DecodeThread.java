package com.king.zxing;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.king.zxing.camera.CameraManager;
import com.king.zxing.util.LogUtils;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes17.dex */
final class DecodeThread extends Thread {
    public static final String BARCODE_BITMAP = "barcode_bitmap";
    public static final String BARCODE_SCALED_FACTOR = "barcode_scaled_factor";
    private final CameraManager cameraManager;
    private CaptureHandler captureHandler;
    private final Context context;
    private Handler handler;
    private final CountDownLatch handlerInitLatch = new CountDownLatch(1);
    private final Map<DecodeHintType, Object> hints;

    DecodeThread(Context context, CameraManager cameraManager, CaptureHandler captureHandler, Collection<BarcodeFormat> collection, Map<DecodeHintType, Object> map, String str, ResultPointCallback resultPointCallback) {
        this.context = context;
        this.cameraManager = cameraManager;
        this.captureHandler = captureHandler;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.hints = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_1D_PRODUCT, true)) {
                collection.addAll(DecodeFormatManager.PRODUCT_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_1D_INDUSTRIAL, true)) {
                collection.addAll(DecodeFormatManager.INDUSTRIAL_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_QR, true)) {
                collection.addAll(DecodeFormatManager.QR_CODE_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_DATA_MATRIX, true)) {
                collection.addAll(DecodeFormatManager.DATA_MATRIX_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_AZTEC, false)) {
                collection.addAll(DecodeFormatManager.AZTEC_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_PDF417, false)) {
                collection.addAll(DecodeFormatManager.PDF417_FORMATS);
            }
        }
        enumMap.put((EnumMap) DecodeHintType.POSSIBLE_FORMATS, (DecodeHintType) collection);
        if (str != null) {
            enumMap.put((EnumMap) DecodeHintType.CHARACTER_SET, (DecodeHintType) str);
        }
        enumMap.put((EnumMap) DecodeHintType.NEED_RESULT_POINT_CALLBACK, (DecodeHintType) resultPointCallback);
        LogUtils.i("Hints: " + enumMap);
    }

    Handler getHandler() {
        try {
            this.handlerInitLatch.await();
        } catch (InterruptedException unused) {
        }
        return this.handler;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.handler = new DecodeHandler(this.context, this.cameraManager, this.captureHandler, this.hints);
        this.handlerInitLatch.countDown();
        Looper.loop();
    }
}
