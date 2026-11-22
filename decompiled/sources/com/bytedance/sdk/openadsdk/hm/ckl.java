package com.bytedance.sdk.openadsdk.hm;

/* loaded from: classes14.dex */
public class ckl {
    public static String fxn() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String kg() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
