package com.wakeup.module.device.work;

import android.content.Context;
import android.text.TextUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.tts.record.RecordListener;
import com.wakeup.commponent.module.tts.record.VolumeUtil;
import defpackage.AudioRecorder;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: RecordManager.kt */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\tH\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\u0014H\u0007J\b\u0010\u001d\u001a\u00020\u0014H\u0007J\b\u0010\u001e\u001a\u00020\u0014H\u0007J\b\u0010\u001f\u001a\u00020\rH\u0007J\b\u0010 \u001a\u00020\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006!"}, d2 = {"Lcom/wakeup/module/device/work/RecordManager;", "", "<init>", "()V", "TAG", "", "record", "LAudioRecorder;", "cancelFlag", "", "saveFile", "Ljava/io/File;", "mRecordType", "", "mCallback", "Lcom/wakeup/commponent/module/tts/record/RecordListener;", "mListener", "com/wakeup/module/device/work/RecordManager$mListener$1", "Lcom/wakeup/module/device/work/RecordManager$mListener$1;", "startRecord", "", "recordType", "savePath", "callback", "filterConfig", "LAudioRecorder$Config;", "isWorking", "isPause", "pause", "resume", "cancel", "getRecordType", "stopRecord", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RecordManager {
    private static boolean cancelFlag;
    private static RecordListener mCallback;
    private static File saveFile;
    public static final RecordManager INSTANCE = new RecordManager();
    private static final String TAG = "RecordManager";
    private static AudioRecorder record = new AudioRecorder(null, 1, null);
    private static int mRecordType = -1;
    private static final RecordManager$mListener$1 mListener = new AudioRecorder.OnRecordDataListener() { // from class: com.wakeup.module.device.work.RecordManager$mListener$1
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            r4 = com.wakeup.module.device.work.RecordManager.mCallback;
         */
        @Override // AudioRecorder.OnRecordDataListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onStateChanged(AudioRecorder.RecordingState r4) {
            /*
                r3 = this;
                java.lang.String r0 = "state"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = com.wakeup.module.device.work.RecordManager.access$getTAG$p()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "onStateChanged: state "
                r1.<init>(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                com.wakeup.common.log.LogUtils.i(r0, r1)
                AudioRecorder$RecordingState r0 = AudioRecorder.RecordingState.RECORDING
                if (r4 != r0) goto L2d
                com.wakeup.commponent.module.tts.record.RecordListener r4 = com.wakeup.module.device.work.RecordManager.access$getMCallback$p()
                if (r4 == 0) goto L47
                r4.onRecordStart()
                return
            L2d:
                AudioRecorder$RecordingState r0 = AudioRecorder.RecordingState.STOPPED
                if (r4 != r0) goto L47
                com.wakeup.module.device.work.RecordManager r4 = com.wakeup.module.device.work.RecordManager.INSTANCE
                r4 = -1
                com.wakeup.module.device.work.RecordManager.access$setMRecordType$p(r4)
                boolean r4 = com.wakeup.module.device.work.RecordManager.access$getCancelFlag$p()
                if (r4 == 0) goto L3e
                goto L47
            L3e:
                com.wakeup.commponent.module.tts.record.RecordListener r4 = com.wakeup.module.device.work.RecordManager.access$getMCallback$p()
                if (r4 == 0) goto L47
                r4.onRecordSComplete()
            L47:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.device.work.RecordManager$mListener$1.onStateChanged(AudioRecorder$RecordingState):void");
        }

        @Override // AudioRecorder.OnRecordDataListener
        public void onRecordData(byte[] data, int size) {
            RecordListener recordListener;
            File file;
            File file2;
            Intrinsics.checkNotNullParameter(data, "data");
            int coerceIn = RangesKt.coerceIn(size, 0, data.length);
            if (coerceIn <= 0) {
                return;
            }
            if (coerceIn != data.length) {
                data = Arrays.copyOf(data, coerceIn);
                Intrinsics.checkNotNullExpressionValue(data, "copyOf(...)");
            }
            recordListener = RecordManager.mCallback;
            if (recordListener != null) {
                recordListener.onRecordData(data, coerceIn, VolumeUtil.computeVolume(data, coerceIn));
            }
            file = RecordManager.saveFile;
            if (file != null) {
                file2 = RecordManager.saveFile;
                FileIOUtils.writeFileFromBytesByChannel(file2, data, true, true);
            }
        }

        @Override // AudioRecorder.OnRecordDataListener
        public void onError(String message) {
            String str;
            RecordListener recordListener;
            Intrinsics.checkNotNullParameter(message, "message");
            str = RecordManager.TAG;
            LogUtils.e(str, "onError: " + message);
            RecordManager recordManager = RecordManager.INSTANCE;
            RecordManager.mRecordType = -1;
            recordListener = RecordManager.mCallback;
            if (recordListener != null) {
                recordListener.onRecordSErr(message);
            }
        }
    };

    private RecordManager() {
    }

    public static /* synthetic */ void startRecord$default(int i, String str, RecordListener recordListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        startRecord(i, str, recordListener);
    }

    @JvmStatic
    public static final void startRecord(int recordType, String savePath, RecordListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        RecordManager recordManager = INSTANCE;
        mRecordType = recordType;
        mCallback = callback;
        cancelFlag = false;
        AudioRecorder audioRecorder = record;
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        audioRecorder.startRecording(context, recordManager.filterConfig(), mListener);
        if (TextUtils.isEmpty(savePath)) {
            return;
        }
        saveFile = new File(savePath);
    }

    private final AudioRecorder.Config filterConfig() {
        if (mRecordType == 5) {
            return new AudioRecorder.Config(0, 0, 7, 0, 0, 27, null);
        }
        return null;
    }

    @JvmStatic
    public static final boolean isWorking() {
        return record.getCurrentState() == AudioRecorder.RecordingState.RECORDING;
    }

    @JvmStatic
    public static final boolean isPause() {
        return record.getCurrentState() == AudioRecorder.RecordingState.PAUSED;
    }

    @JvmStatic
    public static final void pause() {
        record.pauseRecording();
    }

    @JvmStatic
    public static final void resume() {
        record.resumeRecording();
    }

    @JvmStatic
    public static final void cancel() {
        cancelFlag = true;
        record.stopRecording();
    }

    @JvmStatic
    public static final int getRecordType() {
        return mRecordType;
    }

    @JvmStatic
    public static final void stopRecord() {
        record.stopRecording();
    }
}
