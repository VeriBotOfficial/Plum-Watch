package com.baidu.ar.audio;

import com.baidu.ar.h;
import com.baidu.ar.s0;
import com.baidu.ar.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes12.dex */
public class EasyAudio implements IEasyAudio, s0, VolumeListener {
    public static final String f = "EasyAudio";
    public static volatile EasyAudio g;

    /* renamed from: a, reason: collision with root package name */
    public u0 f6796a;
    public ArrayList<EasyAudioCallback> b;
    public ArrayList<VolumeListener> c;
    public final Lock d = new ReentrantLock(true);
    public final Lock e = new ReentrantLock(true);

    public static void b() {
        g = null;
    }

    public static EasyAudio getInstance() {
        if (g == null) {
            synchronized (EasyAudio.class) {
                if (g == null) {
                    g = new EasyAudio();
                }
            }
        }
        return g;
    }

    public final synchronized void a() {
        this.d.lock();
        try {
            ArrayList<EasyAudioCallback> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
                this.b = null;
            }
            this.d.unlock();
            ArrayList<VolumeListener> arrayList2 = this.c;
            if (arrayList2 != null) {
                arrayList2.clear();
                this.c = null;
            }
            b();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final synchronized void c() {
        u0 u0Var = this.f6796a;
        if (u0Var != null) {
            u0Var.l();
            this.f6796a.h();
            this.f6796a = null;
        }
    }

    @Override // com.baidu.ar.s0
    public void onAudioFrameAvailable(ByteBuffer byteBuffer, int i, long j) {
        this.d.lock();
        try {
            ArrayList<EasyAudioCallback> arrayList = this.b;
            if (arrayList != null) {
                Iterator<EasyAudioCallback> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onAudioFrameAvailable(byteBuffer, i, j);
                }
            }
        } finally {
            this.d.unlock();
        }
    }

    @Override // com.baidu.ar.s0
    public void onAudioRelease() {
        a();
    }

    @Override // com.baidu.ar.s0
    public void onAudioSetup(boolean z) {
        if (z) {
            u0 u0Var = this.f6796a;
            if (u0Var != null) {
                u0Var.j();
                return;
            }
            return;
        }
        ArrayList<EasyAudioCallback> arrayList = this.b;
        if (arrayList == null || arrayList.get(0) == null) {
            return;
        }
        this.b.get(0).onAudioStart(false, null);
        release();
    }

    @Override // com.baidu.ar.s0
    public void onAudioStart(boolean z) {
        ArrayList<EasyAudioCallback> arrayList = this.b;
        if (arrayList != null && arrayList.get(0) != null && this.f6796a != null) {
            this.b.get(0).onAudioStart(z, this.f6796a.a());
        }
        if (z) {
            return;
        }
        release();
    }

    @Override // com.baidu.ar.s0
    public void onAudioStop(boolean z) {
        ArrayList<EasyAudioCallback> arrayList = this.b;
        if (arrayList == null || arrayList.get(0) == null) {
            return;
        }
        this.b.get(0).onAudioStop(z);
    }

    @Override // com.baidu.ar.audio.VolumeListener
    public void onRealtimeVolume(int i) {
        this.e.lock();
        try {
            ArrayList<VolumeListener> arrayList = this.c;
            if (arrayList != null) {
                Iterator<VolumeListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onRealtimeVolume(i);
                }
            }
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void release() {
        c();
        a();
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void removeVolumeListener(VolumeListener volumeListener) {
        if (volumeListener == null) {
            h.b(f, "VolumeListener can not be null!!!");
            return;
        }
        this.e.lock();
        try {
            ArrayList<VolumeListener> arrayList = this.c;
            if (arrayList != null && arrayList.size() > 0 && this.c.contains(volumeListener)) {
                this.c.remove(volumeListener);
            }
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void setVolumeListener(VolumeListener volumeListener) {
        if (volumeListener == null) {
            h.b(f, "VolumeListener can not be null!!!");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        if (this.c.contains(volumeListener)) {
            h.b(f, "setVolumeListener volumeListener has been added!!!");
            return;
        }
        if (this.f6796a == null) {
            this.f6796a = u0.b();
        }
        this.e.lock();
        try {
            if (this.c.size() == 0) {
                this.f6796a.a(this);
            }
            this.c.add(volumeListener);
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void startAudio(AudioParams audioParams, EasyAudioCallback easyAudioCallback) {
        if (audioParams == null || easyAudioCallback == null) {
            h.b(f, "AudioParams && EasyAudioCallback can not be null!!!");
            return;
        }
        if (this.f6796a == null) {
            this.f6796a = u0.b();
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        if (this.b.contains(easyAudioCallback)) {
            h.b(f, "EasyAudio has been started!!!");
            return;
        }
        if (this.f6796a.g()) {
            easyAudioCallback.onAudioStart(true, this.f6796a.a());
        } else {
            this.b.clear();
            this.f6796a.a(audioParams, this);
        }
        this.d.lock();
        try {
            ArrayList<EasyAudioCallback> arrayList = this.b;
            if (arrayList != null) {
                arrayList.add(easyAudioCallback);
            }
        } finally {
            this.d.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void stopAudio(EasyAudioCallback easyAudioCallback) {
        if (easyAudioCallback == null) {
            h.b(f, "EasyAudioCallback can not be null!!!");
            return;
        }
        ArrayList<EasyAudioCallback> arrayList = this.b;
        if (arrayList == null || !arrayList.contains(easyAudioCallback)) {
            h.b(f, "Please confirm EasyAudio has been started!!!");
            return;
        }
        if (this.b.size() <= 1) {
            c();
            return;
        }
        this.d.lock();
        try {
            boolean remove = this.b.remove(easyAudioCallback);
            this.d.unlock();
            easyAudioCallback.onAudioStop(remove);
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }
}
