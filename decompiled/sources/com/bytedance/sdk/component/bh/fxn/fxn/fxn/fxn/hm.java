package com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn;

import android.content.Context;
import com.bytedance.sdk.component.bh.fxn.tw;

/* loaded from: classes13.dex */
public class hm extends fxn {
    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.fxn
    public byte gff() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.fxn
    public byte hm() {
        return (byte) 0;
    }

    public hm(Context context, com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        super(context, fxnVar);
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.fxn, com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff
    public String kg() {
        com.bytedance.sdk.component.bh.fxn.fxn.rb hm = tw.sg().hm();
        if (hm != null) {
            return hm.fxn();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff
    protected long bh() {
        return com.bytedance.sdk.component.bh.fxn.sg.fxn.kg();
    }

    public static String gff(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
