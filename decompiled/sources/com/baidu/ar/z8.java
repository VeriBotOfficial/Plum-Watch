package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class z8 {
    public static final String d = "z8";

    /* renamed from: a, reason: collision with root package name */
    public MediaMuxer f7361a;
    public volatile boolean b = false;
    public d9 c;

    public synchronized int a(MediaFormat mediaFormat) {
        try {
            int addTrack = this.f7361a.addTrack(mediaFormat);
            if (addTrack >= 0) {
                return addTrack;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        h.b(d, "addMuxerTrack error!!!");
        return -1;
    }

    public boolean a() {
        return this.b;
    }

    public boolean a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (i == -1) {
            return false;
        }
        try {
            this.f7361a.writeSampleData(i, byteBuffer, bufferInfo);
            return true;
        } catch (Exception unused) {
            h.b(d, "startMuxer error!!!");
            return false;
        }
    }

    public boolean a(String str, int i, d9 d9Var) {
        if (!i4.a(str)) {
            i4.b(str);
        }
        try {
            this.f7361a = new MediaMuxer(str, i);
            this.c = d9Var;
            this.b = false;
            return true;
        } catch (Exception e) {
            h.b(d, "initMovieMuxer init error!!!");
            e.printStackTrace();
            return false;
        }
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.f7361a.release();
        this.f7361a = null;
    }

    public synchronized void c() {
        boolean z;
        try {
            this.f7361a.start();
            z = true;
            this.b = true;
        } catch (Exception unused) {
            h.b(d, "startMuxer error!!!");
            z = false;
        }
        d9 d9Var = this.c;
        if (d9Var != null) {
            d9Var.a(z);
        }
    }

    public synchronized void d() {
        boolean z = false;
        try {
            this.f7361a.stop();
            this.b = false;
            z = true;
        } catch (Exception unused) {
            h.b(d, "stopMuxer error!!!");
        }
        d9 d9Var = this.c;
        if (d9Var != null) {
            d9Var.b(z);
        }
    }
}
