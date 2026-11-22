package com.wakeup.commponent.module.ai;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.FileUtils;
import com.wakeup.common.log.LogUtils;
import java.io.FileInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioTrackMgr.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\tH\u0002J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u000fJ\u0006\u0010$\u001a\u00020\u001bJ\b\u0010%\u001a\u00020\u001bH\u0002J\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/wakeup/commponent/module/ai/AudioTrackMgr;", "", "<init>", "()V", "TAG", "", "mAudioTrack", "Landroid/media/AudioTrack;", "streamType", "", "sampleRateInHz", "channelConfig", "audioFormat", "bufferSizeInBytes", "mListener", "Lcom/wakeup/commponent/module/ai/AudioTrackMgr$OnAudioPlayListener;", "PLAY_START_STATE", "PLAY_ERROR_STATE", "PLAY_COMPLETE_STATE", "PLAY_ING_STATE", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "mHandler$delegate", "Lkotlin/Lazy;", "startPlayTts", "", "dataArray", "", "", "startFilePlay", "audioFile", "initAudioTrack", "registerListener", "listener", "stopAudioTrack", "listenerOnComplete", "isPlaying", "", "OnAudioPlayListener", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioTrackMgr {
    private static final int PLAY_START_STATE = 0;
    private static final String TAG = "AudioTrackMgr";
    private static AudioTrack mAudioTrack;
    private static OnAudioPlayListener mListener;
    public static final AudioTrackMgr INSTANCE = new AudioTrackMgr();
    private static final int streamType = 3;
    private static final int sampleRateInHz = 16000;
    private static final int channelConfig = 4;
    private static int audioFormat = 2;
    private static final int bufferSizeInBytes = AudioTrack.getMinBufferSize(16000, 4, 2);
    private static final int PLAY_ERROR_STATE = 1;
    private static final int PLAY_COMPLETE_STATE = 2;
    private static final int PLAY_ING_STATE = 3;

    /* renamed from: mHandler$delegate, reason: from kotlin metadata */
    private static final Lazy mHandler = LazyKt.lazy(new Function0() { // from class: com.wakeup.commponent.module.ai.AudioTrackMgr$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Handler mHandler_delegate$lambda$0;
            mHandler_delegate$lambda$0 = AudioTrackMgr.mHandler_delegate$lambda$0();
            return mHandler_delegate$lambda$0;
        }
    });

    /* compiled from: AudioTrackMgr.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commponent/module/ai/AudioTrackMgr$OnAudioPlayListener;", "", "onPlayState", "", "sate", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnAudioPlayListener {
        void onPlayState(int sate);
    }

    private AudioTrackMgr() {
    }

    private final Handler getMHandler() {
        return (Handler) mHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r6.intValue() != (-3)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startPlayTts(byte[] r6) {
        /*
            r5 = this;
            java.lang.String r0 = "AudioTrackMgr"
            java.lang.String r1 = "writeResult error = "
            android.media.AudioTrack r2 = com.wakeup.commponent.module.ai.AudioTrackMgr.mAudioTrack
            if (r2 == 0) goto Lc
            r2.release()
        Lc:
            if (r6 == 0) goto L7b
            int r2 = r6.length
            if (r2 != 0) goto L12
            goto L7b
        L12:
            r2 = 2
            r5.initAudioTrack(r2)     // Catch: java.lang.Exception -> L52
            android.media.AudioTrack r2 = com.wakeup.commponent.module.ai.AudioTrackMgr.mAudioTrack     // Catch: java.lang.Exception -> L52
            if (r2 == 0) goto L25
            int r3 = r6.length     // Catch: java.lang.Exception -> L52
            r4 = 0
            int r6 = r2.write(r6, r4, r3)     // Catch: java.lang.Exception -> L52
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L52
            goto L26
        L25:
            r6 = 0
        L26:
            if (r6 != 0) goto L29
            goto L30
        L29:
            int r2 = r6.intValue()     // Catch: java.lang.Exception -> L52
            r3 = -3
            if (r2 == r3) goto L3a
        L30:
            if (r6 != 0) goto L33
            goto L7a
        L33:
            int r2 = r6.intValue()     // Catch: java.lang.Exception -> L52
            r3 = -2
            if (r2 != r3) goto L7a
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L52
            r2.<init>(r1)     // Catch: java.lang.Exception -> L52
            java.lang.StringBuilder r6 = r2.append(r6)     // Catch: java.lang.Exception -> L52
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L52
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L52
            com.wakeup.common.log.LogUtils.d(r0, r6)     // Catch: java.lang.Exception -> L52
            r5.stopAudioTrack()     // Catch: java.lang.Exception -> L52
            return
        L52:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "write audioTrack error = "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.wakeup.common.log.LogUtils.e(r0, r6)
            com.wakeup.commponent.module.ai.AudioTrackMgr$OnAudioPlayListener r6 = com.wakeup.commponent.module.ai.AudioTrackMgr.mListener
            if (r6 == 0) goto L77
            int r0 = com.wakeup.commponent.module.ai.AudioTrackMgr.PLAY_ERROR_STATE
            r6.onPlayState(r0)
        L77:
            r5.stopAudioTrack()
        L7a:
            return
        L7b:
            r5.stopAudioTrack()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.ai.AudioTrackMgr.startPlayTts(byte[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
    
        if (r6.intValue() != (-3)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startPlayTts(float[] r6) {
        /*
            r5 = this;
            java.lang.String r0 = "AudioTrackMgr"
            java.lang.String r1 = "writeResult error = "
            if (r6 == 0) goto L74
            int r2 = r6.length
            if (r2 != 0) goto Lb
            goto L74
        Lb:
            r2 = 4
            r5.initAudioTrack(r2)     // Catch: java.lang.Exception -> L4b
            android.media.AudioTrack r2 = com.wakeup.commponent.module.ai.AudioTrackMgr.mAudioTrack     // Catch: java.lang.Exception -> L4b
            if (r2 == 0) goto L1e
            int r3 = r6.length     // Catch: java.lang.Exception -> L4b
            r4 = 0
            int r6 = r2.write(r6, r4, r3, r4)     // Catch: java.lang.Exception -> L4b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L4b
            goto L1f
        L1e:
            r6 = 0
        L1f:
            if (r6 != 0) goto L22
            goto L29
        L22:
            int r2 = r6.intValue()     // Catch: java.lang.Exception -> L4b
            r3 = -3
            if (r2 == r3) goto L33
        L29:
            if (r6 != 0) goto L2c
            goto L73
        L2c:
            int r2 = r6.intValue()     // Catch: java.lang.Exception -> L4b
            r3 = -2
            if (r2 != r3) goto L73
        L33:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r2.<init>(r1)     // Catch: java.lang.Exception -> L4b
            java.lang.StringBuilder r6 = r2.append(r6)     // Catch: java.lang.Exception -> L4b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L4b
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L4b
            com.wakeup.common.log.LogUtils.d(r0, r6)     // Catch: java.lang.Exception -> L4b
            r5.stopAudioTrack()     // Catch: java.lang.Exception -> L4b
            return
        L4b:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "write audioTrack error = "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.wakeup.common.log.LogUtils.e(r0, r6)
            com.wakeup.commponent.module.ai.AudioTrackMgr$OnAudioPlayListener r6 = com.wakeup.commponent.module.ai.AudioTrackMgr.mListener
            if (r6 == 0) goto L70
            int r0 = com.wakeup.commponent.module.ai.AudioTrackMgr.PLAY_ERROR_STATE
            r6.onPlayState(r0)
        L70:
            r5.stopAudioTrack()
        L73:
            return
        L74:
            r5.stopAudioTrack()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.ai.AudioTrackMgr.startPlayTts(float[]):void");
    }

    public final void startFilePlay(String audioFile) {
        if (!FileUtils.isFile(audioFile)) {
            stopAudioTrack();
            return;
        }
        byte[] bArr = new byte[2048];
        try {
            initAudioTrack(2);
            FileInputStream fileInputStream = new FileInputStream(audioFile);
            boolean z = false;
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    AudioTrack audioTrack = mAudioTrack;
                    if (audioTrack != null) {
                        audioTrack.write(bArr, 0, read);
                    }
                    if (!z) {
                        OnAudioPlayListener onAudioPlayListener = mListener;
                        if (onAudioPlayListener != null) {
                            onAudioPlayListener.onPlayState(PLAY_ING_STATE);
                        }
                        z = true;
                    }
                } else {
                    stopAudioTrack();
                    return;
                }
            }
        } catch (Exception e) {
            OnAudioPlayListener onAudioPlayListener2 = mListener;
            if (onAudioPlayListener2 != null) {
                onAudioPlayListener2.onPlayState(PLAY_ERROR_STATE);
            }
            LogUtils.d(TAG, "startFilePlay", e);
            stopAudioTrack();
        }
    }

    private final void initAudioTrack(int audioFormat2) {
        if (mAudioTrack != null) {
            return;
        }
        audioFormat = audioFormat2;
        AudioTrack audioTrack = new AudioTrack(streamType, sampleRateInHz, channelConfig, audioFormat2, bufferSizeInBytes, 1);
        mAudioTrack = audioTrack;
        audioTrack.play();
        OnAudioPlayListener onAudioPlayListener = mListener;
        if (onAudioPlayListener != null) {
            onAudioPlayListener.onPlayState(PLAY_START_STATE);
        }
        listenerOnComplete();
    }

    public final void registerListener(OnAudioPlayListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        mListener = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void stopAudioTrack() {
        AudioTrack audioTrack = mAudioTrack;
        if (audioTrack == null) {
            return;
        }
        if (audioTrack != null) {
            try {
                audioTrack.release();
            } catch (Exception e) {
                LogUtils.e(TAG, "stopAudioTrack error " + e.getMessage());
                OnAudioPlayListener onAudioPlayListener = mListener;
                if (onAudioPlayListener != null) {
                    onAudioPlayListener.onPlayState(PLAY_ERROR_STATE);
                }
                return;
            } finally {
                mAudioTrack = null;
                mListener = null;
                getMHandler().removeCallbacksAndMessages(null);
            }
        }
        OnAudioPlayListener onAudioPlayListener2 = mListener;
        if (onAudioPlayListener2 != null) {
            onAudioPlayListener2.onPlayState(PLAY_COMPLETE_STATE);
        }
    }

    private final void listenerOnComplete() {
        getMHandler().postDelayed(new Runnable() { // from class: com.wakeup.commponent.module.ai.AudioTrackMgr$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AudioTrackMgr.listenerOnComplete$lambda$2();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenerOnComplete$lambda$2() {
        AudioTrack audioTrack = mAudioTrack;
        if (audioTrack == null || audioTrack.getPlayState() != 1) {
            INSTANCE.listenerOnComplete();
        } else {
            INSTANCE.stopAudioTrack();
        }
    }

    public final boolean isPlaying() {
        AudioTrack audioTrack = mAudioTrack;
        return audioTrack != null && audioTrack.getPlayState() == 3;
    }
}
