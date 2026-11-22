package com.baidu.ar;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes12.dex */
public class z0 implements p5 {

    /* renamed from: a, reason: collision with root package name */
    public AudioTrack f7355a = new AudioTrack(3, 16000, 4, 2, AudioTrack.getMinBufferSize(16000, 4, 2), 1);
    public HandlerThread b;
    public Handler c;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                if (z0.this.f7355a != null) {
                    z0.this.f7355a.play();
                }
            } else if (i == 7 && (message.obj instanceof byte[]) && z0.this.f7355a != null) {
                if (z0.this.f7355a.getPlayState() != 3) {
                    z0.this.f7355a.play();
                }
                byte[] bArr = (byte[]) message.obj;
                z0.this.f7355a.write(bArr, 0, bArr.length);
            }
        }
    }

    public z0() {
        HandlerThread handlerThread = new HandlerThread("AudioTrackPlayer");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new a(this.b.getLooper());
    }

    @Override // com.baidu.ar.p5
    public void a() {
        Message.obtain(this.c, 2).sendToTarget();
    }

    @Override // com.baidu.ar.p5
    public void a(byte[] bArr) {
        Message.obtain(this.c, 7, bArr).sendToTarget();
    }

    @Override // com.baidu.ar.p5
    public boolean b() {
        AudioTrack audioTrack = this.f7355a;
        return audioTrack != null && audioTrack.getPlayState() == 3;
    }

    @Override // com.baidu.ar.p5
    public void pause() {
        AudioTrack audioTrack = this.f7355a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f7355a.pause();
    }

    @Override // com.baidu.ar.p5
    public void release() {
        AudioTrack audioTrack = this.f7355a;
        if (audioTrack != null) {
            audioTrack.release();
        }
        this.c.removeCallbacksAndMessages(null);
        this.b.quitSafely();
    }

    @Override // com.baidu.ar.p5
    public void resume() {
        AudioTrack audioTrack = this.f7355a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f7355a.play();
    }

    @Override // com.baidu.ar.p5
    public void stop() {
        AudioTrack audioTrack = this.f7355a;
        if (audioTrack != null) {
            audioTrack.stop();
        }
    }
}
