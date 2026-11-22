package com.otaliastudios.cameraview.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.size.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes17.dex */
public class DeviceEncoders {
    public static final int MODE_PREFER_HARDWARE = 1;
    public static final int MODE_RESPECT_ORDER = 0;
    private final MediaCodecInfo.AudioCapabilities mAudioCapabilities;
    private final MediaCodecInfo mAudioEncoder;
    private final MediaCodecInfo.VideoCapabilities mVideoCapabilities;
    private final MediaCodecInfo mVideoEncoder;
    private static final String TAG = "DeviceEncoders";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    static boolean ENABLED = true;

    public class VideoException extends RuntimeException {
        private VideoException(String str) {
            super(str);
        }
    }

    public class AudioException extends RuntimeException {
        private AudioException(String str) {
            super(str);
        }
    }

    public DeviceEncoders(int i, String str, String str2, int i2, int i3) {
        if (ENABLED) {
            List<MediaCodecInfo> deviceEncoders = getDeviceEncoders();
            MediaCodecInfo findDeviceEncoder = findDeviceEncoder(deviceEncoders, str, i, i2);
            this.mVideoEncoder = findDeviceEncoder;
            CameraLogger cameraLogger = LOG;
            cameraLogger.i("Enabled. Found video encoder:", findDeviceEncoder.getName());
            MediaCodecInfo findDeviceEncoder2 = findDeviceEncoder(deviceEncoders, str2, i, i3);
            this.mAudioEncoder = findDeviceEncoder2;
            cameraLogger.i("Enabled. Found audio encoder:", findDeviceEncoder2.getName());
            this.mVideoCapabilities = findDeviceEncoder.getCapabilitiesForType(str).getVideoCapabilities();
            this.mAudioCapabilities = findDeviceEncoder2.getCapabilitiesForType(str2).getAudioCapabilities();
            return;
        }
        this.mVideoEncoder = null;
        this.mAudioEncoder = null;
        this.mVideoCapabilities = null;
        this.mAudioCapabilities = null;
        LOG.i("Disabled.");
    }

    List<MediaCodecInfo> getDeviceEncoders() {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    boolean isHardwareEncoder(String str) {
        String lowerCase = str.toLowerCase();
        return !(lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")));
    }

    MediaCodecInfo findDeviceEncoder(List<MediaCodecInfo> list, String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : list) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            int length = supportedTypes.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (supportedTypes[i3].equalsIgnoreCase(str)) {
                    arrayList.add(mediaCodecInfo);
                    break;
                }
                i3++;
            }
        }
        LOG.i("findDeviceEncoder -", "type:", str, "encoders:", Integer.valueOf(arrayList.size()));
        if (i == 1) {
            Collections.sort(arrayList, new Comparator<MediaCodecInfo>() { // from class: com.otaliastudios.cameraview.internal.DeviceEncoders.1
                @Override // java.util.Comparator
                public int compare(MediaCodecInfo mediaCodecInfo2, MediaCodecInfo mediaCodecInfo3) {
                    return Boolean.compare(DeviceEncoders.this.isHardwareEncoder(mediaCodecInfo3.getName()), DeviceEncoders.this.isHardwareEncoder(mediaCodecInfo2.getName()));
                }
            });
        }
        if (arrayList.size() < i2 + 1) {
            throw new RuntimeException("No encoders for type:" + str);
        }
        return (MediaCodecInfo) arrayList.get(i2);
    }

    public Size getSupportedVideoSize(Size size) {
        if (!ENABLED) {
            return size;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        double d = width / height;
        CameraLogger cameraLogger = LOG;
        cameraLogger.i("getSupportedVideoSize - started. width:", Integer.valueOf(width), "height:", Integer.valueOf(height));
        if (this.mVideoCapabilities.getSupportedWidths().getUpper().intValue() < width) {
            width = this.mVideoCapabilities.getSupportedWidths().getUpper().intValue();
            height = (int) Math.round(width / d);
            cameraLogger.i("getSupportedVideoSize - exceeds maxWidth! width:", Integer.valueOf(width), "height:", Integer.valueOf(height));
        }
        if (this.mVideoCapabilities.getSupportedHeights().getUpper().intValue() < height) {
            height = this.mVideoCapabilities.getSupportedHeights().getUpper().intValue();
            width = (int) Math.round(height * d);
            cameraLogger.i("getSupportedVideoSize - exceeds maxHeight! width:", Integer.valueOf(width), "height:", Integer.valueOf(height));
        }
        while (width % this.mVideoCapabilities.getWidthAlignment() != 0) {
            width--;
        }
        while (height % this.mVideoCapabilities.getHeightAlignment() != 0) {
            height--;
        }
        LOG.i("getSupportedVideoSize - aligned. width:", Integer.valueOf(width), "height:", Integer.valueOf(height));
        if (!this.mVideoCapabilities.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(width))) {
            throw new VideoException("Width not supported after adjustment. Desired:" + width + " Range:" + this.mVideoCapabilities.getSupportedWidths());
        }
        if (!this.mVideoCapabilities.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(height))) {
            throw new VideoException("Height not supported after adjustment. Desired:" + height + " Range:" + this.mVideoCapabilities.getSupportedHeights());
        }
        try {
            if (!this.mVideoCapabilities.getSupportedHeightsFor(width).contains((Range<Integer>) Integer.valueOf(height))) {
                int intValue = this.mVideoCapabilities.getSupportedWidths().getLower().intValue();
                int widthAlignment = this.mVideoCapabilities.getWidthAlignment();
                int i = width;
                while (i >= intValue) {
                    i -= 32;
                    while (i % widthAlignment != 0) {
                        i--;
                    }
                    int round = (int) Math.round(i / d);
                    if (this.mVideoCapabilities.getSupportedHeightsFor(i).contains((Range<Integer>) Integer.valueOf(round))) {
                        LOG.w("getSupportedVideoSize - restarting with smaller size.");
                        return getSupportedVideoSize(new Size(i, round));
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        if (!this.mVideoCapabilities.isSizeSupported(width, height)) {
            throw new VideoException("Size not supported for unknown reason. Might be an aspect ratio issue. Desired size:" + new Size(width, height));
        }
        return new Size(width, height);
    }

    public int getSupportedVideoBitRate(int i) {
        if (!ENABLED) {
            return i;
        }
        int intValue = this.mVideoCapabilities.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
        LOG.i("getSupportedVideoBitRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(intValue));
        return intValue;
    }

    public int getSupportedVideoFrameRate(Size size, int i) {
        if (!ENABLED) {
            return i;
        }
        int doubleValue = (int) this.mVideoCapabilities.getSupportedFrameRatesFor(size.getWidth(), size.getHeight()).clamp(Double.valueOf(i)).doubleValue();
        LOG.i("getSupportedVideoFrameRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(doubleValue));
        return doubleValue;
    }

    public int getSupportedAudioBitRate(int i) {
        if (!ENABLED) {
            return i;
        }
        int intValue = this.mAudioCapabilities.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
        LOG.i("getSupportedAudioBitRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(intValue));
        return intValue;
    }

    public String getVideoEncoder() {
        MediaCodecInfo mediaCodecInfo = this.mVideoEncoder;
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getName();
        }
        return null;
    }

    public String getAudioEncoder() {
        MediaCodecInfo mediaCodecInfo = this.mAudioEncoder;
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getName();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryConfigureVideo(java.lang.String r4, com.otaliastudios.cameraview.size.Size r5, int r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "Failed to configure video codec: "
            android.media.MediaCodecInfo r1 = r3.mVideoEncoder
            if (r1 == 0) goto L63
            r1 = 0
            int r2 = r5.getWidth()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            android.media.MediaFormat r4 = android.media.MediaFormat.createVideoFormat(r4, r2, r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r5 = "color-format"
            r2 = 2130708361(0x7f000789, float:1.701803E38)
            r4.setInteger(r5, r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r5 = "bitrate"
            r4.setInteger(r5, r7)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r5 = "frame-rate"
            r4.setInteger(r5, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r5 = "i-frame-interval"
            r6 = 1
            r4.setInteger(r5, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            android.media.MediaCodecInfo r5 = r3.mVideoEncoder     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            android.media.MediaCodec r5 = android.media.MediaCodec.createByCodecName(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r5.configure(r4, r1, r1, r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L5b
            if (r5 == 0) goto L63
            r5.release()     // Catch: java.lang.Exception -> L63
            return
        L3e:
            r4 = move-exception
            goto L44
        L40:
            r4 = move-exception
            goto L5d
        L42:
            r4 = move-exception
            r5 = r1
        L44:
            com.otaliastudios.cameraview.internal.DeviceEncoders$VideoException r6 = new com.otaliastudios.cameraview.internal.DeviceEncoders$VideoException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r4 = r7.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5b
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r4 = move-exception
            r1 = r5
        L5d:
            if (r1 == 0) goto L62
            r1.release()     // Catch: java.lang.Exception -> L62
        L62:
            throw r4
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.DeviceEncoders.tryConfigureVideo(java.lang.String, com.otaliastudios.cameraview.size.Size, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryConfigureAudio(java.lang.String r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to configure video audio: "
            android.media.MediaCodecInfo r1 = r2.mAudioEncoder
            if (r1 == 0) goto L56
            r1 = 0
            android.media.MediaFormat r3 = android.media.MediaFormat.createAudioFormat(r3, r5, r6)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r5 = 2
            if (r6 != r5) goto L11
            r5 = 12
            goto L13
        L11:
            r5 = 16
        L13:
            java.lang.String r6 = "channel-mask"
            r3.setInteger(r6, r5)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.String r5 = "bitrate"
            r3.setInteger(r5, r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            android.media.MediaCodecInfo r4 = r2.mAudioEncoder     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r5 = 1
            r4.configure(r3, r1, r1, r5)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L4e
            if (r4 == 0) goto L56
            r4.release()     // Catch: java.lang.Exception -> L56
            return
        L31:
            r3 = move-exception
            goto L37
        L33:
            r3 = move-exception
            goto L50
        L35:
            r3 = move-exception
            r4 = r1
        L37:
            com.otaliastudios.cameraview.internal.DeviceEncoders$AudioException r5 = new com.otaliastudios.cameraview.internal.DeviceEncoders$AudioException     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4e
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r3 = move-exception
            r1 = r4
        L50:
            if (r1 == 0) goto L55
            r1.release()     // Catch: java.lang.Exception -> L55
        L55:
            throw r3
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.DeviceEncoders.tryConfigureAudio(java.lang.String, int, int, int):void");
    }
}
