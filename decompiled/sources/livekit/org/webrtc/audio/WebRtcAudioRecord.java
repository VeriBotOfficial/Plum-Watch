package livekit.org.webrtc.audio;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.ThreadUtils;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes8.dex */
class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback;
    private final int audioFormat;
    private final AudioManager audioManager;
    private volatile AudioRecord audioRecord;
    private final Object audioRecordStateLock;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private final Object audioThreadStateLock;
    private ByteBuffer byteBuffer;
    private int channelCount;
    private AtomicBoolean clientCalledStartRecording;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private int expectedChannelCount;
    private int expectedSampleRate;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AtomicBoolean nativeCalledInitRecording;
    private AtomicBoolean nativeCalledStartRecording;
    private AudioDeviceInfo preferredDevice;
    private int sampleRate;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    private boolean useAudioRecord;

    private int channelCountToConfiguration(int channels) {
        return channels == 1 ? 16 : 12;
    }

    private native void nativeCacheDirectBufferAddress(long nativeAudioRecordJni, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long nativeAudioRecordJni, int bytes, long captureTimestampNs);

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String name) {
            super(name);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioRecord audioRecord;
            boolean z;
            int i;
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord != null) {
                WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                    audioRecord = WebRtcAudioRecord.this.audioRecord;
                    z = WebRtcAudioRecord.this.nativeCalledInitRecording.get();
                }
                AudioRecord audioRecord2 = null;
                if (audioRecord == null && WebRtcAudioRecord.this.useAudioRecord) {
                    if (!WebRtcAudioRecord.this.initAudioRecord()) {
                        WebRtcAudioRecord.this.useAudioRecord = false;
                    } else {
                        synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                            audioRecord = WebRtcAudioRecord.this.audioRecord;
                        }
                        WebRtcAudioRecord.assertTrue(audioRecord != null);
                        try {
                            audioRecord.startRecording();
                        } catch (IllegalStateException e) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                        if (WebRtcAudioRecord.this.useAudioRecord && audioRecord.getRecordingState() != 3) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + audioRecord.getRecordingState());
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                    }
                }
                if (audioRecord == null || WebRtcAudioRecord.this.useAudioRecord) {
                    audioRecord2 = audioRecord;
                } else {
                    WebRtcAudioRecord.this.releaseAudioResources();
                }
                long j = 0;
                if (audioRecord2 != null) {
                    int read = audioRecord2.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                        if (WebRtcAudioRecord.this.microphoneMute) {
                            WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                        }
                        if (this.keepAlive && audioRecord2.getTimestamp(audioTimestamp, 0) == 0) {
                            j = audioTimestamp.nanoTime;
                        }
                        i = read;
                    } else {
                        String str = "AudioRecord.read failed: " + read;
                        Logging.e(WebRtcAudioRecord.TAG, str);
                        if (read == -3) {
                            this.keepAlive = false;
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                        }
                    }
                } else {
                    WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    i = 0;
                }
                long j2 = j;
                if (this.keepAlive && WebRtcAudioRecord.this.audioBufferCallback != null) {
                    j2 = WebRtcAudioRecord.this.audioBufferCallback.onBuffer(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, i, j2);
                    i = WebRtcAudioRecord.this.byteBuffer.capacity();
                }
                int i2 = i;
                long j3 = j2;
                if (this.keepAlive && z) {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i2, j3);
                }
                if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                    WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset())));
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e2) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e2.getMessage());
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported(), WebRtcAudioManager.getSampleRate(audioManager), 1);
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduler, AudioManager audioManager, int audioSource, int audioFormat, JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback, JavaAudioDeviceModule.AudioRecordStateCallback stateCallback, JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback, JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback, boolean isAcousticEchoCancelerSupported, boolean isNoiseSuppressorSupported, int expectedSampleRate, int expectedChannelCount) {
        this.effects = new WebRtcAudioEffects();
        this.audioRecordStateLock = new Object();
        this.useAudioRecord = true;
        this.audioThreadStateLock = new Object();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        this.clientCalledStartRecording = new AtomicBoolean(false);
        this.nativeCalledInitRecording = new AtomicBoolean(false);
        this.nativeCalledStartRecording = new AtomicBoolean(false);
        if (isAcousticEchoCancelerSupported && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (isNoiseSuppressorSupported && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduler;
        this.audioManager = audioManager;
        this.audioSource = audioSource;
        this.audioFormat = audioFormat;
        this.errorCallback = errorCallback;
        this.stateCallback = stateCallback;
        this.audioSamplesReadyCallback = audioSamplesReadyCallback;
        this.audioBufferCallback = audioBufferCallback;
        this.isAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported;
        this.isNoiseSuppressorSupported = isNoiseSuppressorSupported;
        this.expectedSampleRate = expectedSampleRate;
        this.expectedChannelCount = expectedChannelCount;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    public void setNativeAudioRecord(long nativeAudioRecord) {
        this.nativeAudioRecord = nativeAudioRecord;
    }

    boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool == null) {
            Logging.w(TAG, "Audio configuration has not yet been verified");
            return false;
        }
        return bool.booleanValue();
    }

    private boolean enableBuiltInAEC(boolean enable) {
        Logging.d(TAG, "enableBuiltInAEC(" + enable + Separators.RPAREN);
        return this.effects.setAEC(enable);
    }

    private boolean enableBuiltInNS(boolean enable) {
        Logging.d(TAG, "enableBuiltInNS(" + enable + Separators.RPAREN);
        return this.effects.setNS(enable);
    }

    public void setUseAudioRecord(boolean enable) {
        Logging.d(TAG, "setUseAudioRecord(" + enable + Separators.RPAREN);
        this.useAudioRecord = enable;
    }

    public boolean initRecordingIfNeeded() {
        synchronized (this.audioRecordStateLock) {
            boolean z = true;
            if (this.audioRecord != null) {
                return true;
            }
            if (initRecordingImpl(this.expectedSampleRate, this.expectedChannelCount, false) < 0) {
                z = false;
            }
            return z;
        }
    }

    private int initRecording(int sampleRate, int channels) {
        Logging.d(TAG, "initRecording(sampleRate=" + sampleRate + ", channels=" + channels + Separators.RPAREN);
        synchronized (this.audioRecordStateLock) {
            if (!this.nativeCalledInitRecording.compareAndSet(false, true)) {
                reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
                return -1;
            }
            if (this.audioRecord == null) {
                return initRecordingImpl(sampleRate, channels, true);
            }
            int framesPerBuffer = getFramesPerBuffer(sampleRate);
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer == null) {
                throw new IllegalStateException("initRecording: byteBuffer is null!");
            }
            nativeCacheDirectBufferAddress(this.nativeAudioRecord, byteBuffer);
            return framesPerBuffer;
        }
    }

    private int initRecordingImpl(int sampleRate, int channels, boolean nativeCall) {
        Logging.d(TAG, "initRecordingImpl(sampleRate=" + sampleRate + ", channels=" + channels + Separators.RPAREN);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        this.sampleRate = sampleRate;
        this.channelCount = channels;
        int bytesPerFrame = getBytesPerFrame(channels, this.audioFormat);
        int framesPerBuffer = getFramesPerBuffer(sampleRate);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytesPerFrame * framesPerBuffer);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        if (nativeCall) {
            nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        }
        if (this.useAudioRecord && !initAudioRecord()) {
            return -1;
        }
        int logRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
        if (logRecordingConfigurations != 0) {
            Logging.w(TAG, "Potential microphone conflict. Active sessions: " + logRecordingConfigurations);
        }
        return framesPerBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initAudioRecord() {
        if (this.sampleRate == 0 || this.channelCount == 0) {
            Logging.w(TAG, "initAudioRecord called before initRecord!");
            return false;
        }
        synchronized (this.audioRecordStateLock) {
            if (this.audioRecord != null) {
                reportWebRtcAudioRecordInitError("InitAudioRecord called twice without StopRecording.");
                return false;
            }
            int channelCountToConfiguration = channelCountToConfiguration(this.channelCount);
            int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRate, channelCountToConfiguration, this.audioFormat);
            if (minBufferSize != -1 && minBufferSize != -2) {
                Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
                int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                Logging.d(TAG, "bufferSizeInBytes: " + max);
                try {
                    this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, this.sampleRate, channelCountToConfiguration, this.audioFormat, max);
                    this.audioSourceMatchesRecordingSessionRef.set(null);
                    AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                    if (audioDeviceInfo != null) {
                        setPreferredDevice(audioDeviceInfo);
                    }
                    if (this.audioRecord != null && this.audioRecord.getState() == 1) {
                        this.effects.enable(this.audioRecord.getAudioSessionId());
                        logMainParameters();
                        logMainParametersExtended();
                        return true;
                    }
                    reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                    releaseAudioResources();
                    return false;
                } catch (IllegalArgumentException e) {
                    e = e;
                    reportWebRtcAudioRecordInitError(e.getMessage());
                    releaseAudioResources();
                    return false;
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    reportWebRtcAudioRecordInitError(e.getMessage());
                    releaseAudioResources();
                    return false;
                }
            }
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return false;
        }
    }

    void setPreferredDevice(AudioDeviceInfo preferredDevice) {
        Logging.d(TAG, "setPreferredDevice " + (preferredDevice != null ? Integer.valueOf(preferredDevice.getId()) : null));
        this.preferredDevice = preferredDevice;
        if (this.audioRecord == null || this.audioRecord.setPreferredDevice(preferredDevice)) {
            return;
        }
        Logging.e(TAG, "setPreferredDevice failed");
    }

    public boolean prewarmRecordingIfNeeded() {
        if (this.audioThread != null) {
            return true;
        }
        synchronized (this.audioRecordStateLock) {
            synchronized (this.audioThreadStateLock) {
                if (this.audioThread != null) {
                    return true;
                }
                return startRecordingImpl();
            }
        }
    }

    public boolean startRecordingIfNeeded() {
        this.clientCalledStartRecording.set(true);
        if (this.audioThread == null) {
            synchronized (this.audioRecordStateLock) {
                synchronized (this.audioThreadStateLock) {
                    if (this.audioThread == null) {
                        return startRecordingImpl();
                    }
                }
            }
        }
        return true;
    }

    private boolean startRecording() {
        if (!this.nativeCalledStartRecording.compareAndSet(false, true)) {
            throw new IllegalStateException("startRecording called twice without stopRecording");
        }
        if (this.audioThread == null) {
            synchronized (this.audioRecordStateLock) {
                synchronized (this.audioThreadStateLock) {
                    if (this.audioThread == null) {
                        return startRecordingImpl();
                    }
                }
            }
        }
        return true;
    }

    private boolean startRecordingImpl() {
        Logging.d(TAG, "startRecording");
        synchronized (this.audioRecordStateLock) {
            synchronized (this.audioThreadStateLock) {
                assertTrue(this.audioThread == null);
                if (this.useAudioRecord) {
                    assertTrue(this.audioRecord != null);
                    try {
                        this.audioRecord.startRecording();
                        if (this.audioRecord.getRecordingState() != 3) {
                            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                            return false;
                        }
                    } catch (IllegalStateException e) {
                        reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
                        return false;
                    }
                }
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                scheduleLogRecordingConfigurationsTask(this.audioRecord);
                return true;
            }
        }
    }

    public boolean stopRecordingIfNeeded() {
        Logging.d(TAG, "stopRecordingIfNeeded");
        synchronized (this.audioRecordStateLock) {
            this.clientCalledStartRecording.set(false);
            if (this.audioThread == null) {
                return true;
            }
            return stopRecordingIfNeededImpl();
        }
    }

    private boolean stopRecording() {
        boolean stopRecordingIfNeededImpl;
        Logging.d(TAG, "stopRecording");
        synchronized (this.audioRecordStateLock) {
            this.nativeCalledStartRecording.set(false);
            this.nativeCalledInitRecording.set(false);
            stopRecordingIfNeededImpl = stopRecordingIfNeededImpl();
        }
        return stopRecordingIfNeededImpl;
    }

    private boolean stopRecordingIfNeededImpl() {
        synchronized (this.audioRecordStateLock) {
            if (!this.clientCalledStartRecording.get() && !this.nativeCalledStartRecording.get()) {
                Logging.d(TAG, "stopping recording");
                assertTrue(this.audioThread != null);
                ScheduledFuture<String> scheduledFuture = this.future;
                if (scheduledFuture != null) {
                    if (!scheduledFuture.isDone()) {
                        this.future.cancel(true);
                    }
                    this.future = null;
                }
                this.audioThread.stopThread();
                if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                    Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
                    WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
                }
                this.audioThread = null;
                releaseAudioResources();
                return true;
            }
            return true;
        }
    }

    private static AudioRecord createAudioRecordOnMOrHigher(int audioSource, int sampleRate, int channelConfig, int audioFormat, int bufferSizeInBytes) {
        Logging.d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(audioSource).setAudioFormat(new AudioFormat.Builder().setEncoding(audioFormat).setSampleRate(sampleRate).setChannelMask(channelConfig).build()).setBufferSizeInBytes(bufferSizeInBytes).build();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int audioSource, int sampleRate, int channelConfig, int audioFormat, int bufferSizeInBytes) {
        Logging.d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(audioSource, sampleRate, channelConfig, audioFormat, bufferSizeInBytes);
    }

    private void logMainParameters() {
        synchronized (this.audioRecordStateLock) {
            if (this.audioRecord != null) {
                Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
            }
        }
    }

    private void logMainParametersExtended() {
        synchronized (this.audioRecordStateLock) {
            if (this.audioRecord != null) {
                Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
            }
        }
    }

    private int logRecordingConfigurations(AudioRecord audioRecord, boolean verifyAudioConfig) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        Logging.d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (verifyAudioConfig) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public void setMicrophoneMute(boolean mute) {
        Logging.w(TAG, "setMicrophoneMute(" + mute + Separators.RPAREN);
        this.microphoneMute = mute;
    }

    public boolean setNoiseSuppressorEnabled(boolean enabled) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.e(TAG, "Noise suppressor is not supported.");
            return false;
        }
        Logging.w(TAG, "SetNoiseSuppressorEnabled(" + enabled + Separators.RPAREN);
        return this.effects.toggleNS(enabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        synchronized (this.audioRecordStateLock) {
            this.effects.release();
            if (this.audioRecord != null) {
                this.audioRecord.release();
                this.audioRecord = null;
            }
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    private void reportWebRtcAudioRecordInitError(String errorMessage) {
        Logging.e(TAG, "Init recording error: " + errorMessage);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(errorMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode errorCode, String errorMessage) {
        Logging.e(TAG, "Start recording error: " + String.valueOf(errorCode) + ". " + errorMessage);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(errorCode, errorMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String errorMessage) {
        Logging.e(TAG, "Run-time recording error: " + errorMessage);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(errorMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int audioState) {
        Logging.d(TAG, "doAudioRecordStateCallback: " + audioStateToString(audioState));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (audioState == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (audioState == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    private static int getBytesPerSample(int audioFormat) {
        int i = 1;
        if (audioFormat != 1 && audioFormat != 2) {
            if (audioFormat != 3) {
                i = 4;
                if (audioFormat != 4) {
                    if (audioFormat != 13) {
                        throw new IllegalArgumentException("Bad audio format " + audioFormat);
                    }
                }
            }
            return i;
        }
        return 2;
    }

    private static int getBytesPerFrame(int channels, int audioFormat) {
        return channels * getBytesPerSample(audioFormat);
    }

    private static int getFramesPerBuffer(int sampleRate) {
        return sampleRate / 100;
    }

    private void scheduleLogRecordingConfigurationsTask(final AudioRecord audioRecord) {
        Logging.d(TAG, "scheduleLogRecordingConfigurationsTask");
        Callable callable = new Callable() { // from class: livekit.org.webrtc.audio.WebRtcAudioRecord$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$scheduleLogRecordingConfigurationsTask$0;
                lambda$scheduleLogRecordingConfigurationsTask$0 = WebRtcAudioRecord.this.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
            }
        };
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) throws Exception {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    private static boolean logActiveRecordingConfigs(int session, List<AudioRecordingConfiguration> configs) {
        assertTrue(!configs.isEmpty());
        Logging.d(TAG, "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : configs) {
            StringBuilder sb = new StringBuilder("  client audio source=");
            sb.append(WebRtcAudioUtils.audioSourceToString(audioRecordingConfiguration.getClientAudioSource())).append(", client session id=").append(audioRecordingConfiguration.getClientAudioSessionId()).append(" (").append(session).append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = audioRecordingConfiguration.getFormat();
            sb.append(format.getChannelCount()).append(", channel index mask=").append(format.getChannelIndexMask()).append(", channel mask=").append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask())).append(", encoding=").append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding())).append(", sample rate=").append(format.getSampleRate()).append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb.append(clientFormat.getChannelCount()).append(", channel index mask=").append(clientFormat.getChannelIndexMask()).append(", channel mask=").append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask())).append(", encoding=").append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding())).append(", sample rate=").append(clientFormat.getSampleRate()).append("\n");
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb.append("  AudioDevice: type=").append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType())).append(", id=").append(audioDevice.getId());
            }
            Logging.d(TAG, sb.toString());
        }
        return true;
    }

    private static boolean verifyAudioConfig(int source, int session, AudioFormat format, AudioDeviceInfo device, List<AudioRecordingConfiguration> configs) {
        assertTrue(!configs.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : configs) {
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == source && audioRecordingConfiguration.getClientAudioSessionId() == session && audioRecordingConfiguration.getClientFormat().getEncoding() == format.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == format.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == format.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == format.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, device)) {
                    Logging.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    private static boolean checkDeviceMatch(AudioDeviceInfo devA, AudioDeviceInfo devB) {
        return devA.getId() == devB.getId() && devA.getType() == devB.getType();
    }

    private static String audioStateToString(int state) {
        if (state == 0) {
            return "START";
        }
        if (state == 1) {
            return "STOP";
        }
        return "INVALID";
    }

    static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: livekit.org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable r) {
                Thread newThread = Executors.defaultThreadFactory().newThread(r);
                newThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Integer.valueOf(WebRtcAudioRecord.nextSchedulerId.getAndIncrement()), Integer.valueOf(atomicInteger.getAndIncrement())));
                return newThread;
            }
        });
    }
}
