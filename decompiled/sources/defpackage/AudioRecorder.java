package defpackage;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import com.hjq.permissions.Permission;
import defpackage.AudioRecorder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioRecorder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003\u001f !B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0006\u0010\u001c\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"LAudioRecorder;", "", "recordingThread", "Ljava/util/concurrent/ExecutorService;", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "audioRecord", "Landroid/media/AudioRecord;", "currentState", "LAudioRecorder$RecordingState;", "bufferSizeInBytes", "", "mainHandler", "Landroid/os/Handler;", "config", "LAudioRecorder$Config;", "listener", "LAudioRecorder$OnRecordDataListener;", "startRecording", "", "context", "Landroid/content/Context;", "c", "pauseRecording", "resumeRecording", "stopRecording", "processAudioStream", "bufferSize", "getCurrentState", "updateState", "newState", "Config", "RecordingState", "OnRecordDataListener", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AudioRecorder {
    private AudioRecord audioRecord;
    private int bufferSizeInBytes;
    private Config config;
    private volatile RecordingState currentState;
    private OnRecordDataListener listener;
    private final Handler mainHandler;
    private final ExecutorService recordingThread;

    /* compiled from: AudioRecorder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"LAudioRecorder$OnRecordDataListener;", "", "onStateChanged", "", "state", "LAudioRecorder$RecordingState;", "onRecordData", "data", "", "size", "", "onError", "message", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface OnRecordDataListener {
        void onError(String message);

        void onRecordData(byte[] data, int size);

        void onStateChanged(RecordingState state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioRecorder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AudioRecorder(ExecutorService recordingThread) {
        Intrinsics.checkNotNullParameter(recordingThread, "recordingThread");
        this.recordingThread = recordingThread;
        this.currentState = RecordingState.STOPPED;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.config = new Config(0, 0, 0, 0, 0, 31, null);
    }

    public /* synthetic */ AudioRecorder(ExecutorService executorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Executors.newSingleThreadExecutor() : executorService);
    }

    public static /* synthetic */ void startRecording$default(AudioRecorder audioRecorder, Context context, Config config, OnRecordDataListener onRecordDataListener, int i, Object obj) {
        if ((i & 2) != 0) {
            config = null;
        }
        audioRecorder.startRecording(context, config, onRecordDataListener);
    }

    public final void startRecording(Context context, Config c, final OnRecordDataListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.currentState != RecordingState.STOPPED) {
            return;
        }
        this.listener = listener;
        if (ActivityCompat.checkSelfPermission(context, Permission.RECORD_AUDIO) != 0) {
            this.mainHandler.post(new Runnable() { // from class: AudioRecorder$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRecorder.OnRecordDataListener.this.onError("无录音权限");
                }
            });
            return;
        }
        if (c != null) {
            this.config = c;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(this.config.getSampleRate(), this.config.getChannelConfig(), this.config.getAudioFormat());
        this.bufferSizeInBytes = minBufferSize;
        if (minBufferSize == -2) {
            this.mainHandler.post(new Runnable() { // from class: AudioRecorder$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRecorder.OnRecordDataListener.this.onError("无效的录音参数");
                }
            });
            return;
        }
        AudioRecord audioRecord = new AudioRecord(this.config.getAudioSource(), this.config.getSampleRate(), this.config.getChannelConfig(), this.config.getAudioFormat(), this.bufferSizeInBytes);
        this.audioRecord = audioRecord;
        if (audioRecord.getState() != 1) {
            this.mainHandler.post(new Runnable() { // from class: AudioRecorder$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRecorder.OnRecordDataListener.this.onError("AudioRecord 初始化失败");
                }
            });
            return;
        }
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            audioRecord2.startRecording();
        }
        updateState(RecordingState.RECORDING);
        this.recordingThread.execute(new Runnable() { // from class: AudioRecorder$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AudioRecorder.startRecording$lambda$3(AudioRecorder.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecording$lambda$3(AudioRecorder audioRecorder) {
        audioRecorder.processAudioStream(audioRecorder.bufferSizeInBytes);
    }

    public final void pauseRecording() {
        if (this.currentState == RecordingState.RECORDING) {
            updateState(RecordingState.PAUSED);
        }
    }

    public final void resumeRecording() {
        if (this.currentState == RecordingState.PAUSED) {
            updateState(RecordingState.RECORDING);
        }
    }

    public final void stopRecording() {
        if (this.currentState == RecordingState.STOPPED) {
            return;
        }
        updateState(RecordingState.STOPPED);
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                try {
                    audioRecord.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            audioRecord.release();
        }
        this.audioRecord = null;
    }

    private final void processAudioStream(int bufferSize) {
        OnRecordDataListener onRecordDataListener;
        byte[] bArr = new byte[bufferSize];
        while (this.currentState != RecordingState.STOPPED) {
            AudioRecord audioRecord = this.audioRecord;
            int read = audioRecord != null ? audioRecord.read(bArr, 0, bufferSize) : 0;
            if (this.currentState == RecordingState.RECORDING && read > 0 && (onRecordDataListener = this.listener) != null) {
                onRecordDataListener.onRecordData((byte[]) bArr.clone(), read);
            }
        }
    }

    public final RecordingState getCurrentState() {
        return this.currentState;
    }

    private final void updateState(final RecordingState newState) {
        if (this.currentState == newState) {
            return;
        }
        this.currentState = newState;
        this.mainHandler.post(new Runnable() { // from class: AudioRecorder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AudioRecorder.updateState$lambda$5(AudioRecorder.this, newState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateState$lambda$5(AudioRecorder audioRecorder, RecordingState recordingState) {
        OnRecordDataListener onRecordDataListener = audioRecorder.listener;
        if (onRecordDataListener != null) {
            onRecordDataListener.onStateChanged(recordingState);
        }
    }

    /* compiled from: AudioRecorder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"LAudioRecorder$Config;", "", "sampleRate", "", "timeInterval", "audioSource", "channelConfig", "audioFormat", "<init>", "(IIIII)V", "getSampleRate", "()I", "getTimeInterval", "getAudioSource", "getChannelConfig", "getAudioFormat", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Config {
        private final int audioFormat;
        private final int audioSource;
        private final int channelConfig;
        private final int sampleRate;
        private final int timeInterval;

        public Config() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ Config copy$default(Config config, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = config.sampleRate;
            }
            if ((i6 & 2) != 0) {
                i2 = config.timeInterval;
            }
            if ((i6 & 4) != 0) {
                i3 = config.audioSource;
            }
            if ((i6 & 8) != 0) {
                i4 = config.channelConfig;
            }
            if ((i6 & 16) != 0) {
                i5 = config.audioFormat;
            }
            int i7 = i5;
            int i8 = i3;
            return config.copy(i, i2, i8, i4, i7);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSampleRate() {
            return this.sampleRate;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTimeInterval() {
            return this.timeInterval;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAudioSource() {
            return this.audioSource;
        }

        /* renamed from: component4, reason: from getter */
        public final int getChannelConfig() {
            return this.channelConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final int getAudioFormat() {
            return this.audioFormat;
        }

        public final Config copy(int sampleRate, int timeInterval, int audioSource, int channelConfig, int audioFormat) {
            return new Config(sampleRate, timeInterval, audioSource, channelConfig, audioFormat);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.sampleRate == config.sampleRate && this.timeInterval == config.timeInterval && this.audioSource == config.audioSource && this.channelConfig == config.channelConfig && this.audioFormat == config.audioFormat;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.sampleRate) * 31) + Integer.hashCode(this.timeInterval)) * 31) + Integer.hashCode(this.audioSource)) * 31) + Integer.hashCode(this.channelConfig)) * 31) + Integer.hashCode(this.audioFormat);
        }

        public String toString() {
            return "Config(sampleRate=" + this.sampleRate + ", timeInterval=" + this.timeInterval + ", audioSource=" + this.audioSource + ", channelConfig=" + this.channelConfig + ", audioFormat=" + this.audioFormat + Separators.RPAREN;
        }

        public Config(int i, int i2, int i3, int i4, int i5) {
            this.sampleRate = i;
            this.timeInterval = i2;
            this.audioSource = i3;
            this.channelConfig = i4;
            this.audioFormat = i5;
        }

        public /* synthetic */ Config(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 16000 : i, (i6 & 2) != 0 ? 40 : i2, (i6 & 4) != 0 ? 1 : i3, (i6 & 8) != 0 ? 16 : i4, (i6 & 16) != 0 ? 2 : i5);
        }

        public final int getSampleRate() {
            return this.sampleRate;
        }

        public final int getTimeInterval() {
            return this.timeInterval;
        }

        public final int getAudioSource() {
            return this.audioSource;
        }

        public final int getChannelConfig() {
            return this.channelConfig;
        }

        public final int getAudioFormat() {
            return this.audioFormat;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioRecorder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LAudioRecorder$RecordingState;", "", "<init>", "(Ljava/lang/String;I)V", "STOPPED", "RECORDING", "PAUSED", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class RecordingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecordingState[] $VALUES;
        public static final RecordingState STOPPED = new RecordingState("STOPPED", 0);
        public static final RecordingState RECORDING = new RecordingState("RECORDING", 1);
        public static final RecordingState PAUSED = new RecordingState("PAUSED", 2);

        private static final /* synthetic */ RecordingState[] $values() {
            return new RecordingState[]{STOPPED, RECORDING, PAUSED};
        }

        public static EnumEntries<RecordingState> getEntries() {
            return $ENTRIES;
        }

        private RecordingState(String str, int i) {
        }

        static {
            RecordingState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static RecordingState valueOf(String str) {
            return (RecordingState) Enum.valueOf(RecordingState.class, str);
        }

        public static RecordingState[] values() {
            return (RecordingState[]) $VALUES.clone();
        }
    }
}
