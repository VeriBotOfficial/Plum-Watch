package com.baidu.vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Message;
import android.os.Process;

/* JADX INFO: loaded from: classes15.dex */
public class AudioRecorder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f9039a = new a();
    private volatile AudioRecord b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private volatile boolean i = false;
    private Object j = new Object();
    private Thread k = new b("AudioRecorder-Record");

    static class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AudioRecorder audioRecorder = ((c) message.obj).f9041a;
            int r1 = message.what;
            if (r1 != 1) {
                if (r1 == 2 && audioRecorder.i) {
                    audioRecorder.onReadError();
                    return;
                }
                return;
            }
            if (audioRecorder.i) {
                c cVar = (c) message.obj;
                audioRecorder.onReadData(cVar.b, cVar.c);
            }
        }
    }

    class b extends Thread {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            AudioRecorder.this.b.startRecording();
            int r1 = 0;
            while (AudioRecorder.this.i) {
                byte[] bArr = new byte[AudioRecorder.this.g];
                if (AudioRecorder.this.b != null) {
                    r1 = AudioRecorder.this.b.read(bArr, 0, AudioRecorder.this.g);
                }
                if (r1 == -3 || r1 == -2 || r1 == -1 || r1 == 0) {
                    AudioRecorder.this.a();
                } else {
                    AudioRecorder.this.a(bArr, r1);
                }
            }
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AudioRecorder f9041a;
        byte[] b;
        int c;

        public c(AudioRecorder audioRecorder, byte[] bArr, int r4) {
            this.f9041a = audioRecorder;
            this.b = bArr;
            this.c = r4;
        }
    }

    public AudioRecorder(int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        this.f = true;
        if (r7 == 8) {
            this.e = 3;
        } else {
            this.e = 2;
        }
        if (r8 == 2) {
            this.d = 3;
        } else {
            this.d = 2;
        }
        this.f = r11 == 1;
        this.c = r6;
        this.h = r9;
        this.g = r10;
    }

    native void onReadData(byte[] bArr, int r2);

    native void onReadError();

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f) {
            c cVar = new c(this, null, 0);
            Handler handler = f9039a;
            handler.sendMessage(handler.obtainMessage(2, cVar));
        } else if (this.i) {
            onReadError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, int r3) {
        if (this.f) {
            c cVar = new c(this, bArr, r3);
            Handler handler = f9039a;
            handler.sendMessage(handler.obtainMessage(1, cVar));
        } else if (this.i) {
            onReadData(bArr, r3);
        }
    }
}
