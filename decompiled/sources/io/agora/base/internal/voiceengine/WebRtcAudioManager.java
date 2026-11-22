package io.agora.base.internal.voiceengine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import com.hjq.permissions.Permission;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static AudioRecordingCallbackImpl mRecordingCallback;
    private static AudioManager mockedAudioManager;
    private final AudioManager audioManager;
    private HardwareEarMonitorController mHardwareEarMonitorController;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private final Object recorderCallbackLock = new Object();
    private AudioAttributes custAudioAttr = null;
    private boolean initialized = false;
    private boolean mNeedUpdateVolume = false;
    private int mCacheAudioMode = 0;
    private VolumeChangeReceiver mVolumeChangeReceiver = null;
    private int playoutVolume = 0;

    private native void nativeNotifyPlayoutVolumeChange(int i, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyRecordingStateChanged(int i, long j);

    public static void setMockedAudioManager(AudioManager audioManager) {
        mockedAudioManager = audioManager;
    }

    private class AudioRecordingCallbackImpl extends AudioManager.AudioRecordingCallback {
        private WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        AudioRecordingCallbackImpl() {
            Logging.d(WebRtcAudioManager.TAG, "AudioRecordingCallbackImpl ctor " + this);
        }

        int registerRtcAudioManager(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
            return 0;
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            Logging.d(WebRtcAudioManager.TAG, "onRecordingConfigChanged " + list.size());
            if (webRtcAudioManager == null) {
                return;
            }
            synchronized (webRtcAudioManager.recorderCallbackLock) {
                if (!webRtcAudioManager.initialized) {
                    Logging.w(WebRtcAudioManager.TAG, "dont handle recording callback when destroy!");
                    return;
                }
                super.onRecordingConfigChanged(list);
                Iterator<AudioRecordingConfiguration> it = list.iterator();
                while (it.hasNext()) {
                    Logging.d(WebRtcAudioManager.TAG, " recording client session ID: " + it.next().getClientAudioSessionId());
                }
                webRtcAudioManager.nativeNotifyRecordingStateChanged(list.size(), webRtcAudioManager.nativeAudioManager);
            }
        }
    }

    WebRtcAudioManager(long j, int i, boolean z) {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo() + ", this " + this);
        this.nativeAudioManager = j;
        Logging.w(TAG, "bufferPeriodMs is: " + i);
        AudioManager audioManager = mockedAudioManager;
        if (audioManager != null) {
            this.audioManager = audioManager;
        } else {
            this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        }
        if (ContextUtils.getApplicationContext() != null) {
            if (mRecordingCallback == null) {
                AudioRecordingCallbackImpl audioRecordingCallbackImpl = new AudioRecordingCallbackImpl();
                mRecordingCallback = audioRecordingCallbackImpl;
                this.audioManager.registerAudioRecordingCallback(audioRecordingCallbackImpl, null);
            }
            mRecordingCallback.registerRtcAudioManager(this);
        }
        this.mHardwareEarMonitorController = new HardwareEarMonitorController(z);
        Logging.w(TAG, "ctor finish");
    }

    private boolean init() {
        Logging.d(TAG, "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        this.mHardwareEarMonitorController.initialize();
        this.initialized = true;
        return true;
    }

    private void dispose() {
        Logging.d(TAG, "dispose" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            this.mHardwareEarMonitorController.terminate();
            enableChatMode(false);
            AudioRecordingCallbackImpl audioRecordingCallbackImpl = mRecordingCallback;
            if (audioRecordingCallbackImpl != null) {
                audioRecordingCallbackImpl.registerRtcAudioManager(null);
            }
            synchronized (this.recorderCallbackLock) {
                this.initialized = false;
            }
        }
    }

    public boolean isHardwareEarMonitorSupported() {
        return this.mHardwareEarMonitorController.isHardwareEarMonitorSupported();
    }

    public int enableHardwareEarMonitor(boolean z) {
        return this.mHardwareEarMonitorController.enableHardwareEarMonitor(z);
    }

    public int setHardwareEarMonitorVolume(int i) {
        return this.mHardwareEarMonitorController.setHardwareEarMonitorVolume(i);
    }

    private boolean isCommunicationModeEnabled() {
        return getAudioMode() == 3;
    }

    private boolean enableChatMode(boolean z) {
        assertTrue(this.audioManager != null);
        int i = z ? 3 : 0;
        this.mCacheAudioMode = i;
        try {
            Logging.d(TAG, "set audio mode to: " + WebRtcAudioUtils.modeToString(i) + " curr: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            this.audioManager.setMode(i);
        } catch (Exception e) {
            Logging.e(TAG, "audioManager.setMode failed: " + e.getMessage());
        }
        return true;
    }

    private int getCallState() {
        if (mockedAudioManager != null) {
            Logging.d(TAG, "mock call state: " + mockedAudioManager.getRingerMode());
            return mockedAudioManager.getRingerMode();
        }
        return getAudioMode();
    }

    private int getAudioMode() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return 0;
        }
        try {
            return audioManager.getMode();
        } catch (Exception e) {
            Logging.e(TAG, "get audio mode failed ", e);
            return 0;
        }
    }

    private int getBufferSizeByPeriod(int i, int i2) {
        return (i / 1000) * i2;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public boolean isLowLatencyInputSupported() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported();
    }

    private boolean isProAudioSupported() {
        return WebRtcAudioUtils.runningOnMarshmallowOrHigher() && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private boolean isAAudioSupported() {
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private int getNativeOutputSampleRate() {
        int defaultSampleRateHz;
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
            defaultSampleRateHz = getSampleRateOnJellyBeanMR10OrHigher();
        } else {
            defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        Logging.d(TAG, "Sample rate is set to " + defaultSampleRateHz + " Hz");
        return defaultSampleRateHz;
    }

    private int getSampleRateOnJellyBeanMR10OrHigher() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        assertTrue(isLowLatencyOutputSupported());
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() && (property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    private int setAudioAttrCtx(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        Logging.d(TAG, "audioAttr " + audioAttributes.toString());
        this.custAudioAttr = audioAttributes;
        return 0;
    }

    public AudioAttributes getCustAudioAttrCtx() {
        return this.custAudioAttr;
    }

    private int getCurrentPlayoutDevices() {
        int i = 0;
        try {
            i = ((Integer) AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE).invoke(this.audioManager, Integer.valueOf(getStreamType()))).intValue();
            Logging.d(TAG, "get current playout devices: " + i);
            return i;
        } catch (Exception e) {
            Logging.e(TAG, "Error getDevicesForStream! ", e);
            return i;
        }
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int getStreamType() {
        return this.mCacheAudioMode == 3 ? 0 : 3;
    }

    private boolean setStreamVolume(int i) {
        Logging.d(TAG, "setStreamVolume(" + i + Separators.RPAREN);
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(getStreamType(), i, 0);
        return true;
    }

    private boolean isVolumeFixed() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    private boolean monitorPlayoutVolumeChange(boolean z) {
        Logging.d(TAG, "monitorPlayoutVolumeChange monitor: " + z);
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null && mockedAudioManager == null) {
            if (z) {
                int streamType = getStreamType();
                int streamVolume = this.audioManager.getStreamVolume(streamType);
                if (this.mVolumeChangeReceiver == null) {
                    try {
                        this.mVolumeChangeReceiver = new VolumeChangeReceiver(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                        applicationContext.registerReceiver(this.mVolumeChangeReceiver, intentFilter);
                        notifyPlayoutVolumeChange(streamVolume, streamType);
                        Logging.d(TAG, "register volume change receiver " + this.mVolumeChangeReceiver);
                        return true;
                    } catch (Exception e) {
                        Logging.e(TAG, "Unable to create VolumeChangeReceiver, ", e);
                    }
                }
                return false;
            }
            try {
                if (this.mVolumeChangeReceiver != null) {
                    new Thread(new DelayVolumeTask(this.mVolumeChangeReceiver)).start();
                    this.mVolumeChangeReceiver = null;
                }
                return true;
            } catch (Exception e2) {
                Logging.e(TAG, "unregister VolumeChangeReceiver failed ", e2);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayoutVolumeChange(boolean z) {
        this.mNeedUpdateVolume = z;
    }

    private boolean updatePlayoutVolumeIfNeeded() {
        if (!this.mNeedUpdateVolume) {
            return false;
        }
        int streamType = getStreamType();
        int streamVolume = this.audioManager.getStreamVolume(streamType);
        notifyPlayoutVolumeChange(streamVolume, streamType);
        this.mNeedUpdateVolume = false;
        Logging.d(TAG, "playout volume is update to " + streamVolume + ", type " + streamType);
        return true;
    }

    private void notifyPlayoutVolumeChange(int i, int i2) {
        if (this.playoutVolume == i) {
            return;
        }
        this.playoutVolume = i;
        int streamMaxVolume = this.audioManager.getStreamMaxVolume(i2);
        if (streamMaxVolume != 0) {
            i = (int) ((i / streamMaxVolume) * 255.0f);
        }
        nativeNotifyPlayoutVolumeChange(i, this.nativeAudioManager);
        Logging.d(TAG, "notifyPlayoutVolumeChange: " + i);
    }

    private boolean checkRecordingPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext == null || applicationContext.checkSelfPermission(Permission.RECORD_AUDIO) == 0;
    }

    private class DelayVolumeTask implements Runnable {
        private VolumeChangeReceiver volumeChangeReceiver;

        public DelayVolumeTask(VolumeChangeReceiver volumeChangeReceiver) {
            this.volumeChangeReceiver = volumeChangeReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            VolumeChangeReceiver volumeChangeReceiver;
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (applicationContext != null && (volumeChangeReceiver = this.volumeChangeReceiver) != null) {
                    applicationContext.unregisterReceiver(volumeChangeReceiver);
                    Logging.d(WebRtcAudioManager.TAG, "unregister volume change receiver " + this.volumeChangeReceiver);
                }
            } catch (Exception e) {
                Logging.e(WebRtcAudioManager.TAG, "unregister VolumeChangeReceiver failed ", e);
            }
        }
    }

    private static class VolumeChangeReceiver extends BroadcastReceiver {
        private WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        public VolumeChangeReceiver(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            if (webRtcAudioManager == null) {
                return;
            }
            webRtcAudioManager.updatePlayoutVolumeChange(true);
        }
    }
}
