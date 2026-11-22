package com.iflytek.cloud.record;

import android.media.AudioRecord;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public class PcmRecorder extends Thread {
    public static final int RATE16K = 16000;
    public static final int READ_INTERVAL40MS = 40;

    /* renamed from: a, reason: collision with root package name */
    private final short f11197a;
    private byte[] b;
    private AudioRecord c;
    private PcmRecordListener d;
    private PcmRecordListener e;
    private volatile boolean f;
    private double g;
    private double h;
    private int i;
    private int j;
    private int k;
    private int l;

    public interface PcmRecordListener {
        void onError(SpeechError speechError);

        void onRecordBuffer(byte[] bArr, int i, int i2);

        void onRecordReleased();

        void onRecordStarted(boolean z);
    }

    public PcmRecorder(int i, int i2) {
        this(i, i2, 1);
    }

    private void b() {
        synchronized (this) {
            try {
                if (this.c != null) {
                    DebugLog.LogD("release record begin");
                    this.c.release();
                    this.c = null;
                    PcmRecordListener pcmRecordListener = this.e;
                    if (pcmRecordListener != null) {
                        pcmRecordListener.onRecordReleased();
                        this.e = null;
                    }
                    DebugLog.LogD("release record over");
                }
            } catch (Exception e) {
                DebugLog.LogE(e.toString());
            }
        }
    }

    protected void a(short s, int i, int i2) throws SpeechError {
        if (this.c != null) {
            DebugLog.LogD("[initRecord] recoder release first");
            b();
        }
        int i3 = (i2 * i) / 1000;
        int i4 = ((i3 * 64) * s) / 8;
        int i5 = s == 1 ? 2 : 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i5, 2);
        int i6 = i4 < minBufferSize ? minBufferSize : i4;
        this.c = new AudioRecord(this.l, i, i5, 2, i6);
        this.b = new byte[((s * i3) * 16) / 8];
        DebugLog.LogD("\nSampleRate:" + i + "\nChannel:" + i5 + "\nFormat:2\nFramePeriod:" + i3 + "\nBufferSize:" + i6 + "\nMinBufferSize:" + minBufferSize + "\nActualBufferSize:" + this.b.length + "\n");
        if (this.c.getState() == 1) {
            return;
        }
        DebugLog.LogD("create AudioRecord error");
        throw new SpeechError(20006);
    }

    protected void finalize() throws Throwable {
        DebugLog.LogD("[finalize] release recoder");
        b();
        super.finalize();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            boolean z = true;
            if (!this.f) {
                try {
                    a((short) 1, this.i, this.j);
                } catch (Exception unused) {
                    Thread.sleep(40L);
                    throw new SpeechError(20006);
                }
            }
            int i = 0;
            while (!this.f) {
                try {
                    this.c.startRecording();
                    if (this.c.getRecordingState() == 3) {
                        break;
                    }
                    DebugLog.LogE("recorder state is not recoding");
                    throw new SpeechError(20006);
                } catch (Exception unused2) {
                    i++;
                    if (i >= 10) {
                        DebugLog.LogE("recoder start failed");
                        throw new SpeechError(20006);
                    }
                    Thread.sleep(40L);
                }
            }
            PcmRecordListener pcmRecordListener = this.d;
            if (pcmRecordListener != null) {
                pcmRecordListener.onRecordStarted(true);
            }
            long currentTimeMillis = System.currentTimeMillis();
            while (!this.f) {
                int a2 = a();
                if (z) {
                    this.g += a2;
                    double d = this.h;
                    byte[] bArr = this.b;
                    this.h = d + a(bArr, bArr.length);
                    if (System.currentTimeMillis() - currentTimeMillis >= 1000) {
                        if (this.g == 0.0d || this.h == 0.0d) {
                            DebugLog.LogE("cannot get record permission, get invalid audio data.");
                            throw new SpeechError(20006);
                        }
                        z = false;
                    }
                }
                if (this.b.length > a2) {
                    DebugLog.LogI("current record read size is less than buffer size: " + a2);
                    Thread.sleep(this.k);
                }
            }
        } catch (Exception e) {
            DebugLog.LogE(e);
            PcmRecordListener pcmRecordListener2 = this.d;
            if (pcmRecordListener2 != null) {
                pcmRecordListener2.onError(new SpeechError(20006));
            }
        }
        b();
    }

    public void startRecording(PcmRecordListener pcmRecordListener) throws SpeechError {
        this.d = pcmRecordListener;
        setPriority(10);
        start();
    }

    public void stopRecord(boolean z) {
        this.f = true;
        if (this.e == null) {
            this.e = this.d;
        }
        this.d = null;
        if (z) {
            synchronized (this) {
                try {
                    DebugLog.LogD("stopRecord...release");
                    AudioRecord audioRecord = this.c;
                    if (audioRecord != null) {
                        if (3 == audioRecord.getRecordingState() && 1 == this.c.getState()) {
                            DebugLog.LogD("stopRecord releaseRecording ing...");
                            this.c.release();
                            DebugLog.LogD("stopRecord releaseRecording end...");
                            this.c = null;
                        }
                        PcmRecordListener pcmRecordListener = this.e;
                        if (pcmRecordListener != null) {
                            pcmRecordListener.onRecordReleased();
                            this.e = null;
                        }
                    }
                } catch (Exception e) {
                    DebugLog.LogE(e.toString());
                }
            }
        }
        DebugLog.LogD("stop record");
    }

    public PcmRecorder(int i, int i2, int i3) {
        this.f11197a = (short) 16;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = 0.0d;
        this.h = 0.0d;
        this.k = 40;
        this.l = i3;
        this.i = i;
        this.j = i2;
        if (i2 < 40 || i2 > 100) {
            this.j = 40;
        }
        this.k = 10;
    }

    private int a() throws SpeechError {
        PcmRecordListener pcmRecordListener;
        AudioRecord audioRecord = this.c;
        if (audioRecord == null || this.d == null) {
            return 0;
        }
        byte[] bArr = this.b;
        int read = audioRecord.read(bArr, 0, bArr.length);
        if (read > 0 && (pcmRecordListener = this.d) != null) {
            pcmRecordListener.onRecordBuffer(this.b, 0, read);
            return read;
        }
        if (read >= 0) {
            return read;
        }
        DebugLog.LogE("Record read data error: " + read);
        throw new SpeechError(20006);
    }

    private double a(byte[] bArr, int i) {
        double d = 0.0d;
        if (bArr == null || i <= 0) {
            return 0.0d;
        }
        double d2 = 0.0d;
        for (byte b : bArr) {
            d2 += b;
        }
        double length = d2 / bArr.length;
        for (byte b2 : bArr) {
            d += Math.pow(b2 - length, 2.0d);
        }
        return Math.sqrt(d / (bArr.length - 1));
    }
}
