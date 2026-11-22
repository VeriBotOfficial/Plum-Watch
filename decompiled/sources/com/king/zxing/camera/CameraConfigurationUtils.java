package com.king.zxing.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.king.zxing.util.LogUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final double MAX_ASPECT_DISTORTION = 0.05d;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final int MIN_PREVIEW_PIXELS = 153600;
    private static final Pattern SEMICOLON = Pattern.compile(";");

    private CameraConfigurationUtils() {
    }

    public static void setFocus(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        String str;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z) {
            str = (z3 || z2) ? findSettableValue("focus mode", supportedFocusModes, "auto") : findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else {
            str = null;
        }
        if (!z3 && str == null) {
            str = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (str != null) {
            if (str.equals(parameters.getFocusMode())) {
                LogUtils.d("Focus mode already set to " + str);
            } else {
                parameters.setFocusMode(str);
            }
        }
    }

    public static void setTorch(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String findSettableValue = z ? findSettableValue("flash mode", supportedFlashModes, "torch", "on") : findSettableValue("flash mode", supportedFlashModes, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        if (findSettableValue != null) {
            if (findSettableValue.equals(parameters.getFlashMode())) {
                LogUtils.d("Flash mode already set to " + findSettableValue);
            } else {
                LogUtils.d("Setting flash mode to " + findSettableValue);
                parameters.setFlashMode(findSettableValue);
            }
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int round = Math.round((z ? 0.0f : MAX_EXPOSURE_COMPENSATION) / exposureCompensationStep);
                float f = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    LogUtils.d("Exposure compensation already set to " + max + " / " + f);
                    return;
                } else {
                    LogUtils.d("Setting exposure compensation to " + max + " / " + f);
                    parameters.setExposureCompensation(max);
                    return;
                }
            }
        }
        LogUtils.d("Camera does not support exposure compensation");
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i, int i2) {
        int[] iArr;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        LogUtils.d("Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                iArr = null;
                break;
            }
            iArr = it.next();
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                break;
            }
        }
        if (iArr == null) {
            LogUtils.d("No suitable FPS range?");
            return;
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        if (Arrays.equals(iArr2, iArr)) {
            LogUtils.d("FPS range already set to " + Arrays.toString(iArr));
        } else {
            LogUtils.d("Setting FPS range to " + Arrays.toString(iArr));
            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
        }
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            LogUtils.d("Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas()));
            List<Camera.Area> buildMiddleArea = buildMiddleArea(400);
            LogUtils.d("Setting focus area to : " + toString((Iterable<Camera.Area>) buildMiddleArea));
            parameters.setFocusAreas(buildMiddleArea);
            return;
        }
        LogUtils.d("Device does not support focus areas");
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            LogUtils.d("Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> buildMiddleArea = buildMiddleArea(400);
            LogUtils.d("Setting metering area to : " + toString((Iterable<Camera.Area>) buildMiddleArea));
            parameters.setMeteringAreas(buildMiddleArea);
            return;
        }
        LogUtils.d("Device does not support metering areas");
    }

    private static List<Camera.Area> buildMiddleArea(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported()) {
            if (parameters.getVideoStabilization()) {
                LogUtils.d("Video stabilization already enabled");
                return;
            } else {
                LogUtils.d("Enabling video stabilization...");
                parameters.setVideoStabilization(true);
                return;
            }
        }
        LogUtils.d("This device does not support video stabilization");
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            LogUtils.d("Barcode scene mode already set");
            return;
        }
        String findSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (findSettableValue != null) {
            parameters.setSceneMode(findSettableValue);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d) {
        if (parameters.isZoomSupported()) {
            Integer indexOfClosestZoom = indexOfClosestZoom(parameters, d);
            if (indexOfClosestZoom == null) {
                return;
            }
            if (parameters.getZoom() == indexOfClosestZoom.intValue()) {
                LogUtils.d("Zoom is already set to " + indexOfClosestZoom);
                return;
            } else {
                LogUtils.d("Setting zoom to " + indexOfClosestZoom);
                parameters.setZoom(indexOfClosestZoom.intValue());
                return;
            }
        }
        LogUtils.d("Zoom is not supported");
    }

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        LogUtils.d("Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            LogUtils.w("Invalid zoom ratios!");
            return null;
        }
        double d2 = d * 100.0d;
        double d3 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double abs = Math.abs(zoomRatios.get(i2).intValue() - d2);
            if (abs < d3) {
                i = i2;
                d3 = abs;
            }
        }
        LogUtils.d("Chose zoom ratio of " + (zoomRatios.get(i).intValue() / 100.0d));
        return Integer.valueOf(i);
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            LogUtils.d("Negative effect already set");
            return;
        }
        String findSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), "negative");
        if (findSettableValue != null) {
            parameters.setColorEffect(findSettableValue);
        }
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        double d;
        int i;
        Camera.Size size;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            LogUtils.w("Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize == null) {
                throw new IllegalStateException("Parameters contained no preview size!");
            }
            return new Point(previewSize.width, previewSize.height);
        }
        if (LogUtils.isShowLog()) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size2 : supportedPreviewSizes) {
                sb.append(size2.width).append('x').append(size2.height).append(' ');
            }
            LogUtils.d("Supported preview sizes: " + ((Object) sb));
        }
        if (point.x < point.y) {
            d = point.x;
            i = point.y;
        } else {
            d = point.y;
            i = point.x;
        }
        double d2 = d / i;
        LogUtils.d("screenAspectRatio: " + d2);
        Camera.Size size3 = null;
        int i2 = 0;
        for (Camera.Size size4 : supportedPreviewSizes) {
            int i3 = size4.width;
            int i4 = size4.height;
            int i5 = i3 * i4;
            if (i5 < MIN_PREVIEW_PIXELS) {
                size = size3;
            } else {
                boolean z = i3 < i4;
                int i6 = z ? i3 : i4;
                int i7 = z ? i4 : i3;
                LogUtils.d(String.format("maybeFlipped:%d * %d", Integer.valueOf(i6), Integer.valueOf(i7)));
                size = size3;
                double d3 = i6 / i7;
                LogUtils.d("aspectRatio: " + d3);
                double abs = Math.abs(d3 - d2);
                LogUtils.d("distortion: " + abs);
                if (abs <= MAX_ASPECT_DISTORTION) {
                    if (i6 == point.x && i7 == point.y) {
                        Point point2 = new Point(i3, i4);
                        LogUtils.d("Found preview size exactly matching screen size: " + point2);
                        return point2;
                    }
                    if (i5 > i2) {
                        size3 = size4;
                        i2 = i5;
                    }
                }
            }
            size3 = size;
        }
        Camera.Size size5 = size3;
        if (size5 != null) {
            Point point3 = new Point(size5.width, size5.height);
            LogUtils.d("Using largest suitable preview size: " + point3);
            return point3;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 == null) {
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        Point point4 = new Point(previewSize2.width, previewSize2.height);
        LogUtils.d("No suitable preview sizes, using default: " + point4);
        return point4;
    }

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
        LogUtils.d("Requesting " + str + " value from among: " + Arrays.toString(strArr));
        LogUtils.d("Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    LogUtils.d("Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        LogUtils.d("No supported values match");
        return null;
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect).append(AbstractJsonLexerKt.COLON).append(area.weight).append(' ');
        }
        return sb.toString();
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=").append(Build.BOARD).append("\nBRAND=");
        sb.append(Build.BRAND).append("\nCPU_ABI=");
        sb.append(Build.CPU_ABI).append("\nDEVICE=");
        sb.append(Build.DEVICE).append("\nDISPLAY=");
        sb.append(Build.DISPLAY).append("\nFINGERPRINT=");
        sb.append(Build.FINGERPRINT).append("\nHOST=");
        sb.append(Build.HOST).append("\nID=");
        sb.append(Build.ID).append("\nMANUFACTURER=");
        sb.append(Build.MANUFACTURER).append("\nMODEL=");
        sb.append(Build.MODEL).append("\nPRODUCT=");
        sb.append(Build.PRODUCT).append("\nTAGS=");
        sb.append(Build.TAGS).append("\nTIME=");
        sb.append(Build.TIME).append("\nTYPE=");
        sb.append(Build.TYPE).append("\nUSER=");
        sb.append(Build.USER).append("\nVERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME).append("\nVERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL).append("\nVERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE).append("\nVERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT).append('\n');
        if (charSequence != null) {
            String[] split = SEMICOLON.split(charSequence);
            Arrays.sort(split);
            for (String str : split) {
                sb.append(str).append('\n');
            }
        }
        return sb.toString();
    }
}
