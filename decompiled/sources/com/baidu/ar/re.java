package com.baidu.ar;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class re {

    /* renamed from: a, reason: collision with root package name */
    public String f7148a;
    public int b;
    public String c;
    public String d;
    public int e;
    public short f;
    public short g;
    public int h;
    public int i;
    public short j;
    public short k;
    public String l;
    public int m;

    public int a(int i) {
        return (i * 1000) / this.i;
    }

    public String toString() {
        return "WavFileHeader{mChunkID='" + this.f7148a + "', mChunkSize=" + this.b + ", mFormat='" + this.c + "', mSubChunk1ID='" + this.d + "', mSubChunk1Size=" + this.e + ", mAudioFormat=" + ((int) this.f) + ", mNumChannel=" + ((int) this.g) + ", mSampleRate=" + this.h + ", mByteRate=" + this.i + ", mBlockAlign=" + ((int) this.j) + ", mBitsPerSample=" + ((int) this.k) + ", mSubChunk2ID='" + this.l + "', mSubChunk2Size=" + this.m + AbstractJsonLexerKt.END_OBJ;
    }
}
