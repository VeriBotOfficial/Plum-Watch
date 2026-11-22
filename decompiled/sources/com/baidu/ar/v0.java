package com.baidu.ar;

import android.media.AudioRecord;
import com.baidu.ar.audio.AudioParams;
import com.baidu.ar.audio.VolumeListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class v0 {
    public static final String i = "v0";
    public static volatile boolean j = false;

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f7252a;
    public AudioParams b;
    public s0 f;
    public VolumeListener g;
    public byte[] c = null;
    public ArrayList<ByteBuffer> d = null;
    public int e = 0;
    public boolean h = false;

    public AudioParams a() {
        return this.b;
    }

    public final void a(long j2) {
        if (j2 >= 20) {
            a(false);
        } else if (w0.a(this.c) == 0.0d) {
            return;
        } else {
            a(true);
        }
        this.h = true;
    }

    public final void a(long j2, int i2) {
        ByteBuffer byteBuffer = this.d.get(this.e);
        if (i2 == -3) {
            h.b(i, "Audio read error");
        } else if (this.f != null && byteBuffer != null && byteBuffer.capacity() >= i2) {
            if (this.b.getAmplifyVolume() != 1.0f) {
                w0.a(this.c, this.b.getAmplifyVolume());
            }
            try {
                byteBuffer.clear();
                byteBuffer.position(0);
                byteBuffer.put(this.c, 0, i2);
                byteBuffer.flip();
                this.f.onAudioFrameAvailable(byteBuffer, i2, j2);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        int i3 = this.e + 1;
        this.e = i3;
        this.e = i3 % this.b.getFrameBufferCount();
        if (this.g != null) {
            this.g.onRealtimeVolume((int) w0.b(this.c));
        }
    }

    public void a(AudioParams audioParams) {
        int minBufferSize = AudioRecord.getMinBufferSize(audioParams.getSampleRate(), audioParams.getChannelConfig(), audioParams.getAudioFormat());
        if (audioParams.getFrameSize() < minBufferSize) {
            audioParams.setAudioBufferSize(((minBufferSize / 1024) + 1) * 2048);
        }
        this.f7252a = new AudioRecord(audioParams.getAudioSource(), audioParams.getSampleRate(), audioParams.getChannelConfig(), audioParams.getAudioFormat(), audioParams.getAudioBufferSize());
        this.b = audioParams;
        this.h = false;
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.onAudioSetup(true);
        }
    }

    public void a(VolumeListener volumeListener) {
        this.g = volumeListener;
    }

    public void a(s0 s0Var) {
        this.f = s0Var;
    }

    public final void a(boolean z) {
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.onAudioStart(z);
        }
    }

    public final void b() {
        if (this.b.getFrameSize() <= 0) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList<>();
            for (int i2 = 0; i2 < this.b.getFrameBufferCount(); i2++) {
                this.d.add(ByteBuffer.allocate(this.b.getFrameSize()));
            }
        }
        this.e = 0;
        if (this.c == null) {
            this.c = new byte[this.b.getFrameSize()];
        }
        int i3 = 0;
        while (j) {
            long nanoTime = System.nanoTime();
            AudioRecord audioRecord = this.f7252a;
            byte[] bArr = this.c;
            int read = audioRecord.read(bArr, 0, bArr.length);
            if (!this.h || this.b == null) {
                a(i3);
                i3++;
            } else {
                a(nanoTime, read);
            }
        }
        this.d = null;
        this.c = null;
        try {
            this.f7252a.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.onAudioStop(true);
        }
    }

    public void c() {
        if (j) {
            return;
        }
        this.f7252a.release();
        this.f7252a = null;
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.onAudioRelease();
        }
        this.f = null;
        this.g = null;
    }

    public void d() {
        e();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            java.lang.String r0 = "startAudioRecord state = "
            android.media.AudioRecord r1 = r5.f7252a
            int r1 = r1.getState()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L39
            android.media.AudioRecord r1 = r5.f7252a     // Catch: java.lang.IllegalStateException -> L2e
            r1.startRecording()     // Catch: java.lang.IllegalStateException -> L2e
            android.media.AudioRecord r1 = r5.f7252a     // Catch: java.lang.IllegalStateException -> L2e
            int r1 = r1.getRecordingState()     // Catch: java.lang.IllegalStateException -> L2e
            r4 = 3
            if (r1 != r4) goto L1b
            goto L3a
        L1b:
            java.lang.String r3 = com.baidu.ar.v0.i     // Catch: java.lang.IllegalStateException -> L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L2e
            r4.<init>(r0)     // Catch: java.lang.IllegalStateException -> L2e
            java.lang.StringBuilder r0 = r4.append(r1)     // Catch: java.lang.IllegalStateException -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalStateException -> L2e
            com.baidu.ar.h.b(r3, r0)     // Catch: java.lang.IllegalStateException -> L2e
            goto L39
        L2e:
            r0 = move-exception
            java.lang.String r1 = com.baidu.ar.v0.i
            java.lang.String r3 = "startAudioRecord error!!!"
            com.baidu.ar.h.b(r1, r3)
            r0.printStackTrace()
        L39:
            r3 = r2
        L3a:
            com.baidu.ar.v0.j = r3
            if (r3 != 0) goto L5b
            java.lang.String r0 = com.baidu.ar.v0.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "startAudioRecord error!!! mAudioRecord.getState() = "
            r1.<init>(r3)
            android.media.AudioRecord r3 = r5.f7252a
            int r3 = r3.getState()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.baidu.ar.h.b(r0, r1)
            r5.a(r2)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.v0.e():void");
    }

    public void f() {
        j = false;
    }
}
