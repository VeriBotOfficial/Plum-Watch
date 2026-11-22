package com.beken.iot.smartsdk.core.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.beken.iot.smartsdk.callback.OnAudioDataCallback;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.realtime.G711Code;
import com.beken.iot.smartsdk.core.realtime.G711UCode;
import com.beken.iot.smartsdk.core.utils.ContextHolder;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes13.dex */
public class PlayerThread extends Thread {
    private static final String TAG = "PlayerThread";
    private AudioTrack audioTrack;
    private final SpeakerDevice device;
    private final OnAudioDataCallback onAudioDataCallback;
    private boolean running = false;
    private final ArrayBlockingQueue<byte[]> writeQueue = new ArrayBlockingQueue<>(5000);

    public PlayerThread(SpeakerDevice speakerDevice, OnAudioDataCallback onAudioDataCallback) {
        this.device = speakerDevice;
        this.onAudioDataCallback = onAudioDataCallback;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        printD("PlayerThread start");
        this.running = true;
        enableSpeaker(true);
        int readBufferSize = this.device.getReadBufferSize();
        int i = 1;
        while (true) {
            try {
                AudioTrack audioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setSampleRate(this.device.getSampleRate()).setEncoding(2).setChannelMask(this.device.getChannelConfig()).build(), readBufferSize, 1, 0);
                this.audioTrack = audioTrack;
                audioTrack.play();
                playInner();
                return;
            } catch (Exception e) {
                printD(e.getMessage());
                if (i > 10) {
                    return;
                }
                i++;
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e2) {
                    printD(e2.getMessage());
                }
            }
        }
    }

    private void playInner() {
        while (this.running) {
            try {
                byte[] take = this.writeQueue.take();
                if (take != null && take.length != 0) {
                    postEncodedData(take);
                    byte[] decoder = decoder(take);
                    postDecodedData(decoder);
                    printDetail("playInner: " + decoder.length);
                    this.audioTrack.write(decoder, 0, decoder.length);
                }
                printD("null data");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void postDecodedData(byte[] bArr) {
        OnAudioDataCallback onAudioDataCallback = this.onAudioDataCallback;
        if (onAudioDataCallback != null) {
            onAudioDataCallback.onAudioDownDecodedStream(bArr);
        }
    }

    private void postEncodedData(byte[] bArr) {
        OnAudioDataCallback onAudioDataCallback = this.onAudioDataCallback;
        if (onAudioDataCallback != null) {
            onAudioDataCallback.onAudioDownUnpackedStream(bArr, this.device.getCodecFormat());
        }
    }

    public byte[] decoder(byte[] bArr) {
        int codecFormat = this.device.getCodecFormat();
        if (codecFormat != 1) {
            return codecFormat != 3 ? bArr : G711UCode.decode(bArr);
        }
        return G711Code.decode(bArr);
    }

    public void write(byte[] bArr) {
        if (this.writeQueue.offer(bArr)) {
            return;
        }
        printE("Queue buffer full");
    }

    public void enableSpeaker(boolean z) {
        AudioManager audioManager = (AudioManager) ContextHolder.context.getSystemService("audio");
        if (audioManager == null) {
            printE("GET audio manager failed");
            return;
        }
        audioManager.setSpeakerphoneOn(z);
        if (z) {
            audioManager.setMode(3);
            audioManager.setStreamVolume(0, audioManager.getStreamMaxVolume(0), 0);
        } else {
            audioManager.setMode(3);
        }
    }

    public void close() {
        try {
            printD("close");
            this.running = false;
            enableSpeaker(false);
        } catch (Exception e) {
            printE(e.getMessage());
        }
    }

    private void printE(String str) {
        BKSmartLog.INSTANCE.e(TAG, str);
    }

    private void printDetail(String str) {
        BKSmartLog.INSTANCE.detail(TAG, str);
    }

    private void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
