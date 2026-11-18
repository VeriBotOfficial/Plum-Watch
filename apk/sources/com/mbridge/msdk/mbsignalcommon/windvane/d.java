package com.mbridge.msdk.mbsignalcommon.windvane;

import com.phancy.mini.utils.MimeExtKt;
import org.xmind.core.INotes;

/* JADX INFO: compiled from: MimeTypeEnum.java */
/* JADX INFO: loaded from: classes2.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", MimeExtKt.MIME_TYPE_HTML),
    HTML(INotes.HTML, MimeExtKt.MIME_TYPE_HTML);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11876a;
    private String b;

    d(String str, String str2) {
        this.f11876a = str;
        this.b = str2;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f11876a;
    }
}
