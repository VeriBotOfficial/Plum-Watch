package io.agora.base.internal.voiceengine;

import android.gov.nist.core.Separators;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALCULATE_LATENCY_PERIOD = 40;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FORCE_CALC_TIME = 3;
    private static final int DEFAULT_RECORD_LATENCY = 30;
    private static final int MAX_RECORD_LATENCY = 250;
    private static final String TAG = "WebRtcAudioRecord [JavaAdm]";
    private final AudioManager audioManager;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;
    private AudioRecordRoutingListener recordRouteListener;
    private static final int DEFAULT_AUDIO_SOURCE = getDefaultAudioSource();
    private static volatile boolean microphoneMute = false;
    private static WebRtcAudioRecordErrorCallback errorCallback = null;
    private static AudioRecordRouteCallback recordRouteCallback = null;
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback = null;
    private int audioSource = DEFAULT_AUDIO_SOURCE;
    private AudioRecord audioRecord = null;
    private AudioRecordThread audioThread = null;
    private int mLatencyCalcCount = 0;
    private int mRecordLatency = 0;
    private long mFramesRead = 0;
    private int mBytesPerFrame = 2;
    private int mRecordLoopCounter = 0;
    private AudioRecordRoutingListenerForAPI23 recordRouteListenerForAPI23 = null;

    public interface AudioRecordRouteCallback {
        void onAudioRecordRouteNotify(int i, AudioDeviceInfo audioDeviceInfo);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i, int i2, long j);

    static /* synthetic */ long access$1114(WebRtcAudioRecord webRtcAudioRecord, long j) {
        long j2 = webRtcAudioRecord.mFramesRead + j;
        webRtcAudioRecord.mFramesRead = j2;
        return j2;
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setRecordRouteCallback(AudioRecordRouteCallback audioRecordRouteCallback) {
        Logging.d(TAG, "[USB] Set AudioRecordRouteCallback");
        recordRouteCallback = audioRecordRouteCallback;
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public byte[] getData() {
            return this.data;
        }
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.mRecordLatency, WebRtcAudioRecord.this.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
                if (WebRtcAudioRecord.this.mFramesRead == 0) {
                    Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread read first frame : " + (read / WebRtcAudioRecord.this.mBytesPerFrame) + " finished. ");
                }
                WebRtcAudioRecord.access$1114(WebRtcAudioRecord.this, read / r2.mBytesPerFrame);
                try {
                    if (WebRtcAudioRecord.this.mRecordLoopCounter % 40 == 0) {
                        WebRtcAudioRecord.this.calculateLatencyMillis();
                    }
                    WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                    webRtcAudioRecord2.mRecordLoopCounter = (webRtcAudioRecord2.mRecordLoopCounter + 1) % 40;
                } catch (Throwable th) {
                    Logging.e(WebRtcAudioRecord.TAG, "calculateLatencyMillis failed: " + th.getMessage());
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    private class AudioRecordRoutingListenerForAPI23 implements AudioRecord.OnRoutingChangedListener {
        private AudioRecordRoutingListenerForAPI23() {
        }

        @Override // android.media.AudioRecord.OnRoutingChangedListener
        public void onRoutingChanged(AudioRecord audioRecord) {
            AudioDeviceInfo preferredDevice = audioRecord.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRecord.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioRecord.recordRouteCallback != null) {
                WebRtcAudioRecord.recordRouteCallback.onAudioRecordRouteNotify(1, routedDevice);
            }
            Logging.d(WebRtcAudioRecord.TAG, "[USB] [AudioRecord-audioRecord] onRoutingChanged:" + type);
        }

        @Override // android.media.AudioRecord.OnRoutingChangedListener, android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioRecord.recordRouteCallback != null) {
                WebRtcAudioRecord.recordRouteCallback.onAudioRecordRouteNotify(1, routedDevice);
            }
            WebRtcAudioRecord.this.mLatencyCalcCount = 3;
            Logging.d(WebRtcAudioRecord.TAG, "[USB] [AudioRecord-audioRouting] onRoutingChanged: " + type);
        }
    }

    private class AudioRecordRoutingListener implements AudioRouting.OnRoutingChangedListener {
        private AudioRecordRoutingListener() {
        }

        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioRecord.recordRouteCallback != null) {
                WebRtcAudioRecord.recordRouteCallback.onAudioRecordRouteNotify(1, routedDevice);
            }
            WebRtcAudioRecord.this.mLatencyCalcCount = 3;
            Logging.d(WebRtcAudioRecord.TAG, "[USB] [AudioRecord-audioRouting] onRoutingChanged: " + type);
        }
    }

    WebRtcAudioRecord(long j) {
        this.effects = null;
        this.recordRouteListener = null;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.effects = WebRtcAudioEffects.create();
        this.recordRouteListener = new AudioRecordRoutingListener();
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.d(TAG, "enableBuiltInAEC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.d(TAG, "enableBuiltInNS(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private boolean enableBuiltInAGC(boolean z) {
        Logging.d(TAG, "enableBuiltInAGC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in AGC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAGC(z);
    }

    private int initRecording(int i, int i2, int i3) {
        String str;
        this.mBytesPerFrame = i2 * 2;
        int i4 = i / 100;
        Logging.d(TAG, "initRecording(sampleRate=" + i + ", channels=" + i2 + ", minBufMs=" + i3 + ") audioRecord=" + this.audioRecord);
        this.byteBuffer = ByteBuffer.allocateDirect(this.mBytesPerFrame * i4);
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            if (i != audioRecord.getSampleRate() || i2 != this.audioRecord.getChannelCount() || this.audioRecord.getAudioSource() != this.audioSource) {
                Logging.d(TAG, "re-create record object for parameter changed");
                releaseAudioResources();
            } else {
                Logging.d(TAG, "using record object " + this.audioRecord);
                Logging.d(TAG, "status=" + this.audioRecord.getState() + ",recordStatus=" + this.audioRecord.getRecordingState());
                registerRoutingListener();
                return i4;
            }
        }
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        int i5 = i3 * (i / 1000) * i2 * 2;
        int i6 = max < i5 ? i5 : max;
        Logging.d(TAG, "bufferSizeInBytes: " + i6);
        Logging.d(TAG, "initRecording audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()) + ", source: " + WebRtcAudioUtils.sourceToString(this.audioSource) + ", sampleRate: " + i);
        if (!ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone")) {
            Logging.d(TAG, "[USB] Before create audiorecord instance: has no PackageManager.FEATURE_MICROPHONE");
        }
        try {
            AudioRecord audioRecord2 = new AudioRecord(this.audioSource, i, channelCountToConfiguration, 2, i6);
            this.audioRecord = audioRecord2;
            if (audioRecord2.getState() != 1) {
                if (("Failed to create a new AudioRecord instance: instance= " + this.audioRecord) == null) {
                    str = AbstractJsonLexerKt.NULL;
                } else {
                    str = "success state = " + this.audioRecord.getState();
                }
                reportWebRtcAudioRecordInitError(str);
                releaseAudioResources();
                return -1;
            }
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            registerRoutingListener();
            return i4;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    void registerRoutingListener() {
        AudioRecordRouteCallback audioRecordRouteCallback;
        int i = Build.VERSION.SDK_INT;
        AudioDeviceInfo preferredDevice = this.audioRecord.getPreferredDevice();
        if (preferredDevice != null) {
            Logging.d(TAG, "[USB] deviceType = " + preferredDevice.getType());
        } else {
            Logging.d(TAG, "[USB] has no preferred device");
            preferredDevice = this.audioRecord.getRoutedDevice();
            if (preferredDevice != null) {
                Logging.d(TAG, "[USB] initRecording-getRoutedDevice deviceType = " + preferredDevice.getType());
            }
        }
        if (preferredDevice != null && (audioRecordRouteCallback = recordRouteCallback) != null) {
            audioRecordRouteCallback.onAudioRecordRouteNotify(0, preferredDevice);
        }
        Logging.d(TAG, "android.os.Build.VERSION.SDK_INT = " + i);
        AudioRecordRoutingListener audioRecordRoutingListener = this.recordRouteListener;
        if (audioRecordRoutingListener != null) {
            this.audioRecord.addOnRoutingChangedListener(audioRecordRoutingListener, (Handler) null);
        }
    }

    private int startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            int recordingState = this.audioRecord.getRecordingState();
            if (recordingState != 3) {
                releaseAudioResources();
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + recordingState);
                return -1;
            }
            this.mFramesRead = 0L;
            this.mLatencyCalcCount = 3;
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return this.audioRecord.getAudioSessionId();
        } catch (IllegalStateException e) {
            releaseAudioResources();
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
            return -1;
        }
    }

    private boolean stopRecording() {
        AudioRecordRoutingListener audioRecordRoutingListener;
        Logging.d(TAG, "stopRecording");
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            this.audioThread = null;
        }
        if (this.audioRecord == null || (audioRecordRoutingListener = this.recordRouteListener) == null) {
            return true;
        }
        this.audioRecord.removeOnRoutingChangedListener(audioRecordRoutingListener);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateLatencyMillis() {
        if (this.audioRecord == null) {
            Logging.e(TAG, "audioRecord is null");
            return -1;
        }
        int i = this.mLatencyCalcCount;
        if (i <= 0) {
            return -1;
        }
        this.mLatencyCalcCount = i - 1;
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (this.audioRecord.getTimestamp(audioTimestamp, 0) != 0) {
            Logging.e(TAG, "audioTimestamp is unavailable");
            return -1;
        }
        int nanoTime = (int) ((System.nanoTime() - (audioTimestamp.nanoTime + (((this.mFramesRead - audioTimestamp.framePosition) * 1000000000) / this.audioRecord.getSampleRate()))) / 1000000);
        Logging.d(TAG, "AudioRecord calculateLatencyMillis--> latencyMillis: " + nanoTime + ",extraTime:20");
        if (nanoTime > 0 && nanoTime <= 250) {
            this.mRecordLatency = nanoTime + 20;
        }
        return this.mRecordLatency;
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public synchronized int setAudioSource(int i) {
        Logging.w(TAG, "Audio source is changed from: " + this.audioSource + " to " + i);
        this.audioSource = i;
        return 0;
    }

    public static void setMicrophoneMute(boolean z) {
        Logging.w(TAG, "setMicrophoneMute(" + z + Separators.RPAREN);
        microphoneMute = z;
    }

    private boolean releaseAudioResources() {
        Logging.d(TAG, "record releaseAudioResources");
        boolean z = false;
        try {
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.release();
                z = true;
            }
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null) {
                return z;
            }
            audioRecord.release();
            this.audioRecord = null;
            return true;
        } catch (Exception e) {
            Logging.w(TAG, "releaseAudioResources e: " + e.getMessage());
            return z;
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }
}
