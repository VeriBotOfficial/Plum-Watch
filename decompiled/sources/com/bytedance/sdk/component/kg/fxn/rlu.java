package com.bytedance.sdk.component.kg.fxn;

/* loaded from: classes13.dex */
public class rlu {
    public fxn bh;
    public jq gff;
    public String hm;
    public byte[] rb;

    public enum fxn {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public rlu() {
    }

    public rlu(jq jqVar, String str, fxn fxnVar) {
        this.gff = jqVar;
        this.hm = str;
        this.bh = fxnVar;
    }

    public rlu(jq jqVar, byte[] bArr, fxn fxnVar) {
        this.gff = jqVar;
        this.rb = bArr;
        this.bh = fxnVar;
    }

    public static rlu fxn(jq jqVar, String str) {
        return new rlu(jqVar, str, fxn.STRING_TYPE);
    }

    public static rlu fxn(jq jqVar, byte[] bArr) {
        return new rlu(jqVar, bArr, fxn.BYTE_ARRAY_TYPE);
    }
}
