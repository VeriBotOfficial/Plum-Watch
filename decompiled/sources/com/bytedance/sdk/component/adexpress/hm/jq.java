package com.bytedance.sdk.component.adexpress.hm;

import android.net.Uri;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.phancy.mini.utils.MimeExtKt;

/* loaded from: classes13.dex */
public class jq {
    public static fxn fxn(String str) {
        fxn fxnVar = fxn.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return fxn.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return fxn.JS;
                    }
                    if (!path.endsWith(PictureMimeType.JPG) && !path.endsWith(".gif") && !path.endsWith(PictureMimeType.PNG) && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(PictureMimeType.BMP) && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            return fxn.HTML;
                        }
                    }
                    return fxn.IMAGE;
                }
            } catch (Throwable unused) {
            }
        }
        return fxnVar;
    }

    public static boolean kg(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    public enum fxn {
        HTML(MimeExtKt.MIME_TYPE_HTML),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE(SelectMimeType.SYSTEM_IMAGE);

        private String rb;

        fxn(String str) {
            this.rb = str;
        }

        public String fxn() {
            return this.rb;
        }
    }
}
