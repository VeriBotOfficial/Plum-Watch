package com.wakeup.feature.device.white.record;

import android.content.Context;
import com.blankj.utilcode.util.FileIOUtils;
import com.iflytek.cloud.SpeechConstant;
import com.wakeup.commponent.module.tts.record.VolumeUtil;
import com.wakeup.feature.device.white.record.SleepPcmRecorder;
import com.wakeup.module.record.Constants;
import com.yandex.div.core.timer.TimerController;
import defpackage.AudioRecorder;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepPcmRecorder.kt */
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\r\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/device/white/record/SleepPcmRecorder;", "", "<init>", "()V", "recorder", "LAudioRecorder;", "saveFile", "Ljava/io/File;", "listener", "Lcom/wakeup/feature/device/white/record/SleepPcmRecorder$Listener;", "cancelFlag", "", "dataListener", "com/wakeup/feature/device/white/record/SleepPcmRecorder$dataListener$1", "Lcom/wakeup/feature/device/white/record/SleepPcmRecorder$dataListener$1;", "start", "", "context", "Landroid/content/Context;", "savePath", "", "isWorking", TimerController.STOP_COMMAND, "cancel", "Listener", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepPcmRecorder {
    private volatile boolean cancelFlag;
    private Listener listener;
    private File saveFile;
    private final AudioRecorder recorder = new AudioRecorder(null, 1, null);
    private final SleepPcmRecorder$dataListener$1 dataListener = new AudioRecorder.OnRecordDataListener() { // from class: com.wakeup.feature.device.white.record.SleepPcmRecorder$dataListener$1

        /* compiled from: SleepPcmRecorder.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AudioRecorder.RecordingState.values().length];
                try {
                    iArr[AudioRecorder.RecordingState.RECORDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AudioRecorder.RecordingState.STOPPED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            r2 = r1.this$0.listener;
         */
        @Override // AudioRecorder.OnRecordDataListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onStateChanged(AudioRecorder.RecordingState r2) {
            /*
                r1 = this;
                java.lang.String r0 = "state"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int[] r0 = com.wakeup.feature.device.white.record.SleepPcmRecorder$dataListener$1.WhenMappings.$EnumSwitchMapping$0
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L28
                r0 = 2
                if (r2 == r0) goto L14
                goto L33
            L14:
                com.wakeup.feature.device.white.record.SleepPcmRecorder r2 = com.wakeup.feature.device.white.record.SleepPcmRecorder.this
                boolean r2 = com.wakeup.feature.device.white.record.SleepPcmRecorder.access$getCancelFlag$p(r2)
                if (r2 != 0) goto L33
                com.wakeup.feature.device.white.record.SleepPcmRecorder r2 = com.wakeup.feature.device.white.record.SleepPcmRecorder.this
                com.wakeup.feature.device.white.record.SleepPcmRecorder$Listener r2 = com.wakeup.feature.device.white.record.SleepPcmRecorder.access$getListener$p(r2)
                if (r2 == 0) goto L33
                r2.onComplete()
                return
            L28:
                com.wakeup.feature.device.white.record.SleepPcmRecorder r2 = com.wakeup.feature.device.white.record.SleepPcmRecorder.this
                com.wakeup.feature.device.white.record.SleepPcmRecorder$Listener r2 = com.wakeup.feature.device.white.record.SleepPcmRecorder.access$getListener$p(r2)
                if (r2 == 0) goto L33
                r2.onStart()
            L33:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.device.white.record.SleepPcmRecorder$dataListener$1.onStateChanged(AudioRecorder$RecordingState):void");
        }

        @Override // AudioRecorder.OnRecordDataListener
        public void onRecordData(byte[] data, int size) {
            File file;
            SleepPcmRecorder.Listener listener;
            Intrinsics.checkNotNullParameter(data, "data");
            file = SleepPcmRecorder.this.saveFile;
            if (file != null) {
                FileIOUtils.writeFileFromBytesByChannel(file, data, true, true);
            }
            listener = SleepPcmRecorder.this.listener;
            if (listener != null) {
                listener.onVolume(VolumeUtil.computeVolume(data, size));
            }
        }

        @Override // AudioRecorder.OnRecordDataListener
        public void onError(String message) {
            SleepPcmRecorder.Listener listener;
            Intrinsics.checkNotNullParameter(message, "message");
            listener = SleepPcmRecorder.this.listener;
            if (listener != null) {
                listener.onError(message);
            }
        }
    };

    /* compiled from: SleepPcmRecorder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/wakeup/feature/device/white/record/SleepPcmRecorder$Listener;", "", Constants.ON_START_KEY, "", "onVolume", SpeechConstant.VOLUME, "", Constants.ON_COMPLETE_KEY, "onError", "message", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onComplete();

        void onError(String message);

        void onStart();

        void onVolume(int volume);
    }

    public final void start(Context context, String savePath, Listener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.saveFile = new File(savePath);
        this.cancelFlag = false;
        this.recorder.startRecording(context, null, this.dataListener);
    }

    public final boolean isWorking() {
        return this.recorder.getCurrentState() == AudioRecorder.RecordingState.RECORDING || this.recorder.getCurrentState() == AudioRecorder.RecordingState.PAUSED;
    }

    public final void stop() {
        this.recorder.stopRecording();
    }

    public final void cancel() {
        this.cancelFlag = true;
        this.recorder.stopRecording();
    }
}
