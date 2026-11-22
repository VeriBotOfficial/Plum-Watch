package com.baidu.vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Message;
import android.os.Process;

/* loaded from: classes13.dex */
public class AudioRecorder {

    /* renamed from: a, reason: collision with root package name */
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
            int i = message.what;
            if (i != 1) {
                if (i == 2 && audioRecorder.i) {
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
            int i = 0;
            while (AudioRecorder.this.i) {
                byte[] bArr = new byte[AudioRecorder.this.g];
                if (AudioRecorder.this.b != null) {
                    i = AudioRecorder.this.b.read(bArr, 0, AudioRecorder.this.g);
                }
                if (i == -3 || i == -2 || i == -1 || i == 0) {
                    AudioRecorder.this.a();
                } else {
                    AudioRecorder.this.a(bArr, i);
                }
            }
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        AudioRecorder f9041a;
        byte[] b;
        int c;

        public c(AudioRecorder audioRecorder, byte[] bArr, int i) {
            this.f9041a = audioRecorder;
            this.b = bArr;
            this.c = i;
        }
    }

    public AudioRecorder(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f = true;
        if (i3 == 8) {
            this.e = 3;
        } else {
            this.e = 2;
        }
        if (i4 == 2) {
            this.d = 3;
        } else {
            this.d = 2;
        }
        this.f = i7 == 1;
        this.c = i2;
        this.h = i5;
        this.g = i6;
    }

    native void onReadData(byte[] bArr, int i);

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
    public void a(byte[] bArr, int i) {
        if (this.f) {
            c cVar = new c(this, bArr, i);
            Handler handler = f9039a;
            handler.sendMessage(handler.obtainMessage(1, cVar));
        } else if (this.i) {
            onReadData(bArr, i);
        }
    }
}
