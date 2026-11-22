package com.bytedance.sdk.component.sg;

import com.bytedance.sdk.component.kg.fxn.hie;
import java.io.File;
import java.util.Map;

/* loaded from: classes13.dex */
public class kg {
    final long bh;
    final int fxn;
    final Map<String, String> gff;
    final String hm;
    private final boolean jq;
    final String kg;
    final long rb;

    /* renamed from: sg, reason: collision with root package name */
    hie f9396sg;
    private File tw = null;
    private byte[] hie = null;

    public kg(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.jq = z;
        this.fxn = i;
        this.kg = str;
        this.gff = map;
        this.hm = str2;
        this.rb = j;
        this.bh = j2;
    }

    public int fxn() {
        return this.fxn;
    }

    public String kg() {
        return this.kg;
    }

    public Map<String, String> gff() {
        return this.gff;
    }

    public String hm() {
        return this.hm;
    }

    public File rb() {
        return this.tw;
    }

    public void fxn(File file) {
        this.tw = file;
    }

    public boolean bh() {
        return this.jq;
    }

    public void fxn(byte[] bArr) {
        this.hie = bArr;
    }

    public hie sg() {
        return this.f9396sg;
    }

    public void fxn(hie hieVar) {
        this.f9396sg = hieVar;
    }
}
