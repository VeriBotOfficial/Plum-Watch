package livekit.org.webrtc;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.Range;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import livekit.org.webrtc.CameraEnumerationAndroid;
import livekit.org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public class Camera2Enumerator implements CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final String TAG = "Camera2Enumerator";
    private static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();
    final CameraManager cameraManager;
    final Context context;

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService(PixelReadParams.DEFAULT_FILTER_ID);
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (CameraAccessException e) {
            Logging.e(TAG, "Camera access exception", e);
            return new String[0];
        }
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String deviceName) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(deviceName);
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public boolean isBackFacing(String deviceName) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(deviceName);
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String deviceName) {
        return getSupportedFormats(this.context, deviceName);
    }

    @Override // livekit.org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String deviceName, CameraVideoCapturer.CameraEventsHandler eventsHandler) {
        return new Camera2Capturer(this.context, deviceName, eventsHandler);
    }

    private CameraCharacteristics getCameraCharacteristics(String deviceName) {
        try {
            return this.cameraManager.getCameraCharacteristics(deviceName);
        } catch (CameraAccessException | RuntimeException e) {
            Logging.e(TAG, "Camera access exception", e);
            return null;
        }
    }

    public static boolean isSupported(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService(PixelReadParams.DEFAULT_FILTER_ID);
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (CameraAccessException | RuntimeException e) {
            Logging.e(TAG, "Failed to check if camera2 is supported", e);
            return false;
        }
    }

    static int getFpsUnitFactor(Range<Integer>[] fpsRanges) {
        return (fpsRanges.length != 0 && fpsRanges[0].getUpper().intValue() >= 1000) ? 1 : 1000;
    }

    static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return convertSizes(streamConfigurationMap.getOutputSizes(SurfaceTexture.class));
    }

    static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context, String cameraId) {
        return getSupportedFormats((CameraManager) context.getSystemService(PixelReadParams.DEFAULT_FILTER_ID), cameraId);
    }

    static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String cameraId) {
        long j;
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            if (map.containsKey(cameraId)) {
                return map.get(cameraId);
            }
            Logging.d(TAG, "Get supported formats for camera index " + cameraId + ".");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                Iterator<CameraEnumerationAndroid.CaptureFormat.FramerateRange> it = convertFramerates.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i = Math.max(i, it.next().max);
                }
                ArrayList arrayList = new ArrayList();
                for (Size size : supportedSizes) {
                    try {
                        j = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new android.util.Size(size.width, size.height));
                    } catch (Exception unused) {
                        j = 0;
                    }
                    int round = j == 0 ? i : ((int) Math.round(NANO_SECONDS_PER_SECOND / j)) * 1000;
                    arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, round));
                    Logging.d(TAG, "Format: " + size.width + "x" + size.height + Separators.AT + round);
                }
                cachedSupportedFormats.put(cameraId, arrayList);
                Logging.d(TAG, "Get supported formats for camera index " + cameraId + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                return arrayList;
            } catch (Exception e) {
                Logging.e(TAG, "getCameraCharacteristics()", e);
                return new ArrayList();
            }
        }
    }

    private static List<Size> convertSizes(android.util.Size[] cameraSizes) {
        if (cameraSizes == null || cameraSizes.length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(cameraSizes.length);
        for (android.util.Size size : cameraSizes) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] arrayRanges, int unitFactor) {
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : arrayRanges) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(range.getLower().intValue() * unitFactor, range.getUpper().intValue() * unitFactor));
        }
        return arrayList;
    }
}
