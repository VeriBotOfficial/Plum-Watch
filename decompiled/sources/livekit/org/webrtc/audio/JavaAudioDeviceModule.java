package livekit.org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import livekit.org.webrtc.JniCommon;
import livekit.org.webrtc.Logging;

/* loaded from: classes8.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    public final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    public final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioBufferCallback {
        long onBuffer(ByteBuffer buffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs);
    }

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String errorMessage);

        void onWebRtcAudioRecordInitError(String errorMessage);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode errorCode, String errorMessage);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String errorMessage);

        void onWebRtcAudioTrackInitError(String errorMessage);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode errorCode, String errorMessage);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public interface PlaybackSamplesReadyCallback {
        void onWebRtcAudioTrackSamplesReady(AudioSamples samples);
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples samples);
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord audioInput, WebRtcAudioTrack audioOutput, long webrtcEnvRef, int inputSampleRate, int outputSampleRate, boolean useStereoInput, boolean useStereoOutput);

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private AudioBufferCallback audioBufferCallback;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private int outputSampleRate;
        private PlaybackSamplesReadyCallback playbackSamplesReadyCallback;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        private Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }

        public Builder setScheduler(ScheduledExecutorService scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder setSampleRate(int sampleRate) {
            Logging.d(JavaAudioDeviceModule.TAG, "Input/Output sample rate overridden to: " + sampleRate);
            this.inputSampleRate = sampleRate;
            this.outputSampleRate = sampleRate;
            return this;
        }

        public Builder setInputSampleRate(int inputSampleRate) {
            Logging.d(JavaAudioDeviceModule.TAG, "Input sample rate overridden to: " + inputSampleRate);
            this.inputSampleRate = inputSampleRate;
            return this;
        }

        public Builder setOutputSampleRate(int outputSampleRate) {
            Logging.d(JavaAudioDeviceModule.TAG, "Output sample rate overridden to: " + outputSampleRate);
            this.outputSampleRate = outputSampleRate;
            return this;
        }

        public Builder setAudioSource(int audioSource) {
            this.audioSource = audioSource;
            return this;
        }

        public Builder setAudioFormat(int audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setAudioBufferCallback(AudioBufferCallback audioBufferCallback) {
            this.audioBufferCallback = audioBufferCallback;
            return this;
        }

        public Builder setPlaybackSamplesReadyCallback(PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
            this.playbackSamplesReadyCallback = playbackSamplesReadyCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean useHardwareNoiseSuppressor) {
            if (useHardwareNoiseSuppressor && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                useHardwareNoiseSuppressor = false;
            }
            this.useHardwareNoiseSuppressor = useHardwareNoiseSuppressor;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean useHardwareAcousticEchoCanceler) {
            if (useHardwareAcousticEchoCanceler && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                useHardwareAcousticEchoCanceler = false;
            }
            this.useHardwareAcousticEchoCanceler = useHardwareAcousticEchoCanceler;
            return this;
        }

        public Builder setUseStereoInput(boolean useStereoInput) {
            this.useStereoInput = useStereoInput;
            return this;
        }

        public Builder setUseStereoOutput(boolean useStereoOutput) {
            this.useStereoOutput = useStereoOutput;
            return this;
        }

        public Builder setUseLowLatency(boolean useLowLatency) {
            this.useLowLatency = useLowLatency;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean enableVolumeLogger) {
            this.enableVolumeLogger = enableVolumeLogger;
            return this;
        }

        public JavaAudioDeviceModule createAudioDeviceModule() {
            Logging.d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            if (this.useLowLatency) {
                Logging.d(JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorService = this.scheduler;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = WebRtcAudioRecord.newDefaultScheduler();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, scheduledExecutorService, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.audioBufferCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor, this.inputSampleRate, this.useStereoInput ? 2 : 1), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.playbackSamplesReadyCallback, this.useLowLatency, this.enableVolumeLogger), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int audioFormat, int channelCount, int sampleRate, byte[] data) {
            this.audioFormat = audioFormat;
            this.channelCount = channelCount;
            this.sampleRate = sampleRate;
            this.data = data;
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

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord audioInput, WebRtcAudioTrack audioOutput, int inputSampleRate, int outputSampleRate, boolean useStereoInput, boolean useStereoOutput) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = audioInput;
        this.audioOutput = audioOutput;
        this.inputSampleRate = inputSampleRate;
        this.outputSampleRate = outputSampleRate;
        this.useStereoInput = useStereoInput;
        this.useStereoOutput = useStereoOutput;
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public long getNative(long webrtcEnvRef) {
        long j;
        synchronized (this.nativeLock) {
            if (this.nativeAudioDeviceModule == 0) {
                this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, webrtcEnvRef, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
            }
            j = this.nativeAudioDeviceModule;
        }
        return j;
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            long j = this.nativeAudioDeviceModule;
            if (j != 0) {
                JniCommon.nativeReleaseRef(j);
                this.nativeAudioDeviceModule = 0L;
            }
        }
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean mute) {
        Logging.d(TAG, "setSpeakerMute: " + mute);
        this.audioOutput.setSpeakerMute(mute);
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean mute) {
        Logging.d(TAG, "setMicrophoneMute: " + mute);
        this.audioInput.setMicrophoneMute(mute);
    }

    public void setAudioRecordEnabled(boolean enable) {
        this.audioInput.setUseAudioRecord(enable);
    }

    public void prewarmRecording() {
        this.audioInput.initRecordingIfNeeded();
        this.audioInput.prewarmRecordingIfNeeded();
    }

    public void requestStartRecording() {
        this.audioInput.initRecordingIfNeeded();
        this.audioInput.startRecordingIfNeeded();
    }

    public void requestStopRecording() {
        this.audioInput.initRecordingIfNeeded();
        this.audioInput.stopRecordingIfNeeded();
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public boolean setNoiseSuppressorEnabled(boolean enabled) {
        Logging.d(TAG, "setNoiseSuppressorEnabled: " + enabled);
        return this.audioInput.setNoiseSuppressorEnabled(enabled);
    }

    public void setPreferredInputDevice(AudioDeviceInfo preferredInputDevice) {
        Logging.d(TAG, "setPreferredInputDevice: " + preferredInputDevice.getId());
        this.audioInput.setPreferredDevice(preferredInputDevice);
    }
}
