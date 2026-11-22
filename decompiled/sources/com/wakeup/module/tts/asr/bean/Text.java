package com.wakeup.module.tts.asr.bean;

import com.google.gson.JsonObject;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class Text {
    int bg;
    boolean deleted;
    int ed;
    boolean ls;
    String pgs;
    int[] rg;
    int sn;
    String text;
    JsonObject vad;

    public String toString() {
        StringBuilder append = new StringBuilder("Text{bg=").append(this.bg).append(", ed=").append(this.ed).append(", ls=").append(this.ls).append(", sn=").append(this.sn).append(", text='").append(this.text).append("', pgs=").append(this.pgs).append(", rg=").append(Arrays.toString(this.rg)).append(", deleted=").append(this.deleted).append(", vad=");
        JsonObject jsonObject = this.vad;
        return append.append(jsonObject == null ? AbstractJsonLexerKt.NULL : jsonObject.getAsJsonArray("ws").toString()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
