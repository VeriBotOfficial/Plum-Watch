package com.xmly.businesssdk.network.bean.track;

import android.text.TextUtils;
import com.xmly.businesssdk.c;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class PlayUrlInfo {
    private int duration;
    private long file_size;
    private boolean is_paid;
    private String play_url_type;
    private String url;

    public int getDuration() {
        return this.duration;
    }

    public long getFileSize() {
        return this.file_size;
    }

    public String getPlayUrl() {
        return !TextUtils.isEmpty(this.url) ? this.url : "";
    }

    public String getPlayUrlType() {
        return this.play_url_type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPaid() {
        return this.is_paid;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setFileSize(long j) {
        this.file_size = j;
    }

    public void setPaid(boolean z) {
        this.is_paid = z;
    }

    public void setPlayUrlType(String str) {
        this.play_url_type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return c.a("PlayUrlInfo{url='").append(this.url).append('\'').append(", file_size=").append(this.file_size).append(", is_paid=").append(this.is_paid).append(", duration=").append(this.duration).append(", play_url_type='").append(this.play_url_type).append('\'').append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
