package com.beken.iot.smartsdk.core.audio;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import androidx.core.app.ActivityCompat;
import com.beken.iot.smartsdk.callback.OnAudioDataCallback;
import com.beken.iot.smartsdk.core.callback.OnDataReceiver;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.realtime.G711Code;
import com.beken.iot.smartsdk.core.realtime.G711UCode;
import com.beken.iot.smartsdk.core.utils.ContextHolder;
import com.hjq.permissions.Permission;

/* loaded from: classes13.dex */
public class RecorderThread extends Thread {
    private static final String TAG = "RecorderThread";
    private MicDevice device;
    private final OnAudioDataCallback onAudioDataCallback;
    private OnDataReceiver onDataReceiver;
    private AudioRecord audioRecord = null;
    private boolean running = true;

    public RecorderThread(MicDevice micDevice, OnDataReceiver onDataReceiver, OnAudioDataCallback onAudioDataCallback) {
        this.device = micDevice;
        this.onDataReceiver = onDataReceiver;
        this.onAudioDataCallback = onAudioDataCallback;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        printD("RecorderThread start");
        try {
            int readBufferSize = this.device.getReadBufferSize();
            if (ActivityCompat.checkSelfPermission(ContextHolder.context, Permission.RECORD_AUDIO) != 0) {
                return;
            }
            this.audioRecord = new AudioRecord(1, this.device.getSampleRate(), this.device.getChannelConfig(), this.device.getRecordFormat(), readBufferSize);
            NoiseSuppressorEnable();
            AcousticEchoCancelerEnable();
            automaticGainControlEnable();
            this.audioRecord.startRecording();
            byte[] bArr = new byte[readBufferSize];
            while (this.running) {
                if (-3 != this.audioRecord.read(bArr, 0, readBufferSize)) {
                    printD("theAudio record data timeStamp: " + System.currentTimeMillis() + " Thread.name " + Thread.currentThread().getName());
                    postOriginalData(bArr);
                    byte[] encoder = encoder(bArr);
                    postEncodedData(encoder);
                    OnDataReceiver onDataReceiver = this.onDataReceiver;
                    if (onDataReceiver != null) {
                        onDataReceiver.onReceive(encoder);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void postEncodedData(byte[] bArr) {
        OnAudioDataCallback onAudioDataCallback = this.onAudioDataCallback;
        if (onAudioDataCallback != null) {
            onAudioDataCallback.onAudioUpEncodedStream(bArr, this.device.getCodecFormat());
        }
    }

    private void postOriginalData(byte[] bArr) {
        OnAudioDataCallback onAudioDataCallback = this.onAudioDataCallback;
        if (onAudioDataCallback != null) {
            onAudioDataCallback.onAudioUpOriginalStream(bArr);
        }
    }

    private byte[] encoder(byte[] bArr) {
        int codecFormat = this.device.getCodecFormat();
        if (codecFormat != 1) {
            return codecFormat != 3 ? bArr : G711UCode.encode(bArr);
        }
        return G711Code.encode(bArr);
    }

    private void automaticGainControlEnable() {
        if (AutomaticGainControl.isAvailable()) {
            printD("AutomaticGainControl is not available");
            return;
        }
        AutomaticGainControl create = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
        if (create == null) {
            printD("create AutomaticGainControl fail");
            return;
        }
        create.setEnabled(true);
        if (create.getEnabled()) {
            printD("AutomaticGainControl already enabled");
            create.setControlStatusListener(new AudioEffect.OnControlStatusChangeListener() { // from class: com.beken.iot.smartsdk.core.audio.RecorderThread.1
                @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
                public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
                    RecorderThread.this.printD("audio ANS " + z);
                }
            });
        }
    }

    private void NoiseSuppressorEnable() {
        if (NoiseSuppressor.isAvailable()) {
            NoiseSuppressor create = NoiseSuppressor.create(0);
            if (create == null) {
                printD("create NoiseSuppressor fail");
            } else if (create.getEnabled()) {
                printD("NoiseSuppressor already enabled");
                create.setControlStatusListener(new AudioEffect.OnControlStatusChangeListener() { // from class: com.beken.iot.smartsdk.core.audio.RecorderThread.2
                    @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
                    public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
                        RecorderThread.this.printD("audio ANS " + z);
                    }
                });
            } else {
                printD("NoiseSuppressor enable");
                create.setEnabled(true);
            }
        }
    }

    public void AcousticEchoCancelerEnable() {
        if (AcousticEchoCanceler.isAvailable()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
            if (create == null) {
                printD("AcousticEchoCanceler was null");
            } else if (create.getEnabled()) {
                printD("audio AcousticEchoCanceler already enabled");
                create.setControlStatusListener(new AudioEffect.OnControlStatusChangeListener() { // from class: com.beken.iot.smartsdk.core.audio.RecorderThread.3
                    @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
                    public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
                        RecorderThread.this.printD("audio AEC " + z);
                    }
                });
            } else {
                printD("AcousticEchoCanceler enable");
                create.setEnabled(true);
            }
        }
    }

    public void close() {
        printD("close");
        this.running = false;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
            this.audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
