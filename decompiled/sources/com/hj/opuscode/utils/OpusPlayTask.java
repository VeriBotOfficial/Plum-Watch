package com.hj.opuscode.utils;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.hj.opuscode.presenter.DecodeOpusPresenter;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.yandex.div.core.timer.TimerController;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpusPlayTask.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020#H\u0016J\u0006\u0010'\u001a\u00020#R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/hj/opuscode/utils/OpusPlayTask;", "Ljava/lang/Runnable;", "Lcom/hj/opuscode/presenter/DecodeOpusPresenter;", "audioManager", "Landroid/media/AudioManager;", "opusAudioPath", "", "recorderDecodedPcmFilePath", "isPCM", "", "(Landroid/media/AudioManager;Ljava/lang/String;Ljava/lang/String;Z)V", "audioAttributes", "Landroid/media/AudioAttributes;", "audioFormat", "Landroid/media/AudioFormat;", "audioTrack", "Landroid/media/AudioTrack;", "bufferSize", "", "filePcmBufferedOutputStream", "Ljava/io/BufferedOutputStream;", "filePcmOutputStream", "Ljava/io/FileOutputStream;", "isPlay", "()Z", "setPlay", "(Z)V", "onOpusPlayListener", "Lcom/hj/opuscode/utils/OpusPlayTask$OnOpusPlayListener;", "getOnOpusPlayListener", "()Lcom/hj/opuscode/utils/OpusPlayTask$OnOpusPlayListener;", "setOnOpusPlayListener", "(Lcom/hj/opuscode/utils/OpusPlayTask$OnOpusPlayListener;)V", JsonStorageKeyNames.SESSION_ID_KEY, "opusDecode", "", "formatShortArray", "", "run", TimerController.STOP_COMMAND, "OnOpusPlayListener", "opusCode_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OpusPlayTask implements Runnable, DecodeOpusPresenter {
    private final AudioAttributes audioAttributes;
    private final AudioFormat audioFormat;
    private AudioTrack audioTrack;
    private final int bufferSize;
    private BufferedOutputStream filePcmBufferedOutputStream;
    private FileOutputStream filePcmOutputStream;
    private final boolean isPCM;
    private boolean isPlay;
    private OnOpusPlayListener onOpusPlayListener;
    private final String opusAudioPath;
    private final int sessionId;

    /* compiled from: OpusPlayTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/hj/opuscode/utils/OpusPlayTask$OnOpusPlayListener;", "", "onCompere", "", "opusCode_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnOpusPlayListener {
        void onCompere();
    }

    public OpusPlayTask(AudioManager audioManager, String opusAudioPath, String str, boolean z) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(opusAudioPath, "opusAudioPath");
        this.opusAudioPath = opusAudioPath;
        this.isPCM = z;
        int minBufferSize = AudioTrack.getMinBufferSize(16000, 4, 2);
        this.bufferSize = minBufferSize;
        AudioAttributes build = new AudioAttributes.Builder().setLegacyStreamType(3).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.audioAttributes = build;
        AudioFormat build2 = new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(4).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        this.audioFormat = build2;
        int generateAudioSessionId = audioManager.generateAudioSessionId();
        this.sessionId = generateAudioSessionId;
        this.audioTrack = new AudioTrack(build, build2, minBufferSize, 1, generateAudioSessionId);
        String str2 = str;
        if (str2 == null || str2.length() == 0 || z) {
            return;
        }
        File file = new File(str);
        File file2 = new File(file.getParent());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        this.filePcmOutputStream = new FileOutputStream(file, true);
        this.filePcmBufferedOutputStream = new BufferedOutputStream(this.filePcmOutputStream);
    }

    public /* synthetic */ OpusPlayTask(AudioManager audioManager, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioManager, str, str2, (i & 8) != 0 ? false : z);
    }

    @Override // com.hj.opuscode.presenter.DecodeOpusPresenter
    public short[] byteArrayToShortArray(byte[] bArr) {
        return DecodeOpusPresenter.DefaultImpls.byteArrayToShortArray(this, bArr);
    }

    @Override // com.hj.opuscode.presenter.DecodeOpusPresenter
    public void cancelDecode() {
        DecodeOpusPresenter.DefaultImpls.cancelDecode(this);
    }

    @Override // com.hj.opuscode.presenter.DecodeOpusPresenter
    public void decodeOpusFile(String str, boolean z) {
        DecodeOpusPresenter.DefaultImpls.decodeOpusFile(this, str, z);
    }

    @Override // com.hj.opuscode.presenter.DecodeOpusPresenter
    public void opusDecodeFinish() {
        DecodeOpusPresenter.DefaultImpls.opusDecodeFinish(this);
    }

    @Override // com.hj.opuscode.presenter.DecodeOpusPresenter
    public void readFile(String str, boolean z) {
        DecodeOpusPresenter.DefaultImpls.readFile(this, str, z);
    }

    public final OnOpusPlayListener getOnOpusPlayListener() {
        return this.onOpusPlayListener;
    }

    public final void setOnOpusPlayListener(OnOpusPlayListener onOpusPlayListener) {
        this.onOpusPlayListener = onOpusPlayListener;
    }

    /* renamed from: isPlay, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    public final void setPlay(boolean z) {
        this.isPlay = z;
    }

    @Override // com.hj.opuscode.presenter.DecodeOpusPresenter
    public void opusDecode(short[] formatShortArray) {
        Intrinsics.checkNotNullParameter(formatShortArray, "formatShortArray");
        DecodeOpusPresenter.DefaultImpls.opusDecode(this, formatShortArray);
        this.audioTrack.write(formatShortArray, 0, formatShortArray.length);
        BufferedOutputStream bufferedOutputStream = this.filePcmBufferedOutputStream;
        if (bufferedOutputStream != null) {
            Intrinsics.checkNotNull(bufferedOutputStream);
            bufferedOutputStream.write(Uilts.INSTANCE.shortArrayToByteArray(formatShortArray));
        }
    }

    public final void stop() {
        if (this.isPlay) {
            this.isPlay = false;
            cancelDecode();
            this.audioTrack.stop();
            this.audioTrack.release();
            BufferedOutputStream bufferedOutputStream = this.filePcmBufferedOutputStream;
            if (bufferedOutputStream != null) {
                Intrinsics.checkNotNull(bufferedOutputStream);
                bufferedOutputStream.close();
                this.filePcmBufferedOutputStream = null;
            }
            FileOutputStream fileOutputStream = this.filePcmOutputStream;
            if (fileOutputStream != null) {
                Intrinsics.checkNotNull(fileOutputStream);
                fileOutputStream.close();
                this.filePcmOutputStream = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.audioTrack.play();
        this.isPlay = true;
        if (!this.isPCM) {
            decodeOpusFile(this.opusAudioPath, false);
        } else {
            readFile(this.opusAudioPath, false);
        }
        if (this.isPlay) {
            stop();
            OnOpusPlayListener onOpusPlayListener = this.onOpusPlayListener;
            if (onOpusPlayListener != null) {
                Intrinsics.checkNotNull(onOpusPlayListener);
                onOpusPlayListener.onCompere();
            }
        }
    }
}
