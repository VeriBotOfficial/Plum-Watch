package com.wakeup.module.tts.asr.bean;

import com.google.gson.JsonObject;

/* loaded from: classes4.dex */
public class Result {
    int bg;
    int ed;
    boolean ls;
    String pgs;
    int[] rg;
    int sn;
    JsonObject vad;
    Ws[] ws;

    public Text getText() {
        Text text = new Text();
        StringBuilder sb = new StringBuilder();
        for (Ws ws : this.ws) {
            sb.append(ws.cw[0].w);
        }
        text.sn = this.sn;
        text.text = sb.toString();
        text.sn = this.sn;
        text.rg = this.rg;
        text.pgs = this.pgs;
        text.bg = this.bg;
        text.ed = this.ed;
        text.ls = this.ls;
        JsonObject jsonObject = this.vad;
        if (jsonObject == null) {
            jsonObject = null;
        }
        text.vad = jsonObject;
        return text;
    }
}
