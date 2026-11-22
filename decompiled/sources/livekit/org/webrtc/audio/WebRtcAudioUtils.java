package livekit.org.webrtc.audio;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import livekit.org.webrtc.Logging;

/* loaded from: classes8.dex */
public final class WebRtcAudioUtils {
    private static final String TAG = "WebRtcAudioUtilsExternal";

    public static String getThreadInfo() {
        Thread currentThread = Thread.currentThread();
        return "@[name=" + currentThread.getName() + ", id=" + currentThread.getId() + "]";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu");
    }

    private static void logDeviceInfo(String tag) {
        Logging.d(tag, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static void logAudioState(String tag, Context context, AudioManager audioManager) {
        logDeviceInfo(tag);
        logAudioStateBasic(tag, context, audioManager);
        logAudioStateVolume(tag, audioManager);
        logAudioDeviceInfo(tag, audioManager);
    }

    public static String deviceTypeToString(int type) {
        switch (type) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case 24:
                return "TYPE_BUILTIN_SPEAKER_SAFE";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
            case 26:
                return "TYPE_BLE_HEADSET";
            case 27:
                return "TYPE_BLE_SPEAKER";
            case 28:
            default:
                return "TYPE_UNKNOWN(" + type + Separators.RPAREN;
            case 29:
                return "TYPE_HDMI_EARC";
            case 30:
                return "TYPE_BLE_BROADCAST";
            case 31:
                return "TYPE_DOCK_ANALOG";
        }
    }

    public static String audioSourceToString(int source) {
        switch (source) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    public static String channelMaskToString(int mask) {
        if (mask == 12) {
            return "IN_STEREO";
        }
        if (mask == 16) {
            return "IN_MONO";
        }
        return "INVALID";
    }

    public static String audioEncodingToString(int enc) {
        if (enc == 0) {
            return "INVALID";
        }
        switch (enc) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                return "Invalid encoding: " + enc;
        }
    }

    private static void logAudioStateBasic(String tag, Context context, AudioManager audioManager) {
        Logging.d(tag, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone(context) + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String tag, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(tag, "Audio State: ");
        boolean isVolumeFixed = audioManager.isVolumeFixed();
        Logging.d(tag, "  fixed volume=" + isVolumeFixed);
        if (isVolumeFixed) {
            return;
        }
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append("  " + streamTypeToString(i2) + ": ");
            sb.append("volume=").append(audioManager.getStreamVolume(i2));
            sb.append(", max=").append(audioManager.getStreamMaxVolume(i2));
            sb.append(", muted=").append(audioManager.isStreamMute(i2));
            Logging.d(tag, sb.toString());
        }
    }

    private static void logAudioDeviceInfo(String tag, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.d(tag, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb = new StringBuilder("  ");
            sb.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb.append("channels=").append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb.append("encodings=").append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb.append("sample rates=").append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb.append(", ");
            }
            sb.append("id=").append(audioDeviceInfo.getId());
            Logging.d(tag, sb.toString());
        }
    }

    static String modeToString(int mode) {
        if (mode == 0) {
            return "MODE_NORMAL";
        }
        if (mode == 1) {
            return "MODE_RINGTONE";
        }
        if (mode == 2) {
            return "MODE_IN_CALL";
        }
        if (mode == 3) {
            return "MODE_IN_COMMUNICATION";
        }
        return "MODE_INVALID";
    }

    private static String streamTypeToString(int stream) {
        if (stream == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (stream == 1) {
            return "STREAM_SYSTEM";
        }
        if (stream == 2) {
            return "STREAM_RING";
        }
        if (stream == 3) {
            return "STREAM_MUSIC";
        }
        if (stream == 4) {
            return "STREAM_ALARM";
        }
        if (stream == 5) {
            return "STREAM_NOTIFICATION";
        }
        return "STREAM_INVALID";
    }

    private static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
}
