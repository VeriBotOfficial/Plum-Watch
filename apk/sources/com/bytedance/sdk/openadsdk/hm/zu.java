package com.bytedance.sdk.openadsdk.hm;

/* JADX INFO: loaded from: classes11.dex */
public class zu {
    public static String fxn() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String kg() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }
}
