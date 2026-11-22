package com.baidu.ar;

/* loaded from: classes12.dex */
public class a5 extends e5 implements b2 {
    public String c = "*";

    @Override // com.baidu.ar.a2
    public String a() {
        return this.c;
    }

    @Override // com.baidu.ar.b2
    public void b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.c = str;
    }
}
