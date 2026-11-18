package com.baidu.ar.arrender;

/* JADX INFO: loaded from: classes16.dex */
public class Texture {
    public static final long NOT_CREATE_INSIDE = -1;
    public static final int NO_TEXTURE = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6788a;
    public int b;
    public int c;

    public Texture() {
        this.f6788a = -1L;
        this.b = -1;
        this.c = 3553;
    }

    public Texture(int r3, int r4) {
        this.f6788a = -1L;
        this.b = r3;
        this.c = r4;
    }

    public long getHandle() {
        return this.f6788a;
    }

    public int getId() {
        return this.b;
    }

    public int getType() {
        return this.c;
    }

    public void setHandle(long j) {
        this.f6788a = j;
    }

    public void setId(int r1) {
        this.b = r1;
    }

    public void setType(int r1) {
        this.c = r1;
    }
}
