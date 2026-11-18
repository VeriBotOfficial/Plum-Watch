package com.bytedance.sdk.openadsdk.hm;

/* JADX INFO: loaded from: classes11.dex */
public class hm {
    public static String fxn() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }

    public static String kg() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }
}
