package com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn;

import android.content.Context;
import com.bytedance.sdk.component.bh.fxn.tw;

/* loaded from: classes13.dex */
public class bh extends sg {
    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.sg
    public byte fxn() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.sg
    public byte gff() {
        return (byte) 3;
    }

    public bh(Context context, com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        super(context, fxnVar);
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.sg, com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff
    public String kg() {
        return tw.sg().hm().rb();
    }

    public static String fxn(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
