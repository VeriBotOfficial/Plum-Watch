package com.wakeup.module.tts.asr.bean;

/* loaded from: classes4.dex */
public class Decoder {
    private int defc = 10;
    private Text[] texts = new Text[10];

    public synchronized void decode(Text text) {
        if (text.sn >= this.defc) {
            resize();
        }
        if ("rpl".equals(text.pgs)) {
            for (int i = text.rg[0]; i <= text.rg[1]; i++) {
                this.texts[i].deleted = true;
            }
        }
        this.texts[text.sn] = text;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Text text : this.texts) {
            if (text != null && !text.deleted) {
                sb.append(text.text);
            }
        }
        return sb.toString();
    }

    public void resize() {
        int i = this.defc;
        int i2 = i << 1;
        this.defc = i2;
        Text[] textArr = this.texts;
        this.texts = new Text[i2];
        for (int i3 = 0; i3 < i; i3++) {
            this.texts[i3] = textArr[i3];
        }
    }

    public void discard() {
        int i = 0;
        while (true) {
            Text[] textArr = this.texts;
            if (i >= textArr.length) {
                return;
            }
            textArr[i] = null;
            i++;
        }
    }
}
