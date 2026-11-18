package com.bytedance.sdk.component.adexpress.hm;

import android.net.Uri;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.phancy.mini.utils.MimeExtKt;

/* JADX INFO: loaded from: classes15.dex */
public class jq {
    public static fxn fxn(String str) {
        fxn fxnVar = fxn.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        fxnVar = fxn.CSS;
                    } else if (path.endsWith(".js")) {
                        fxnVar = fxn.JS;
                    } else if (path.endsWith(PictureMimeType.JPG) || path.endsWith(".gif") || path.endsWith(PictureMimeType.PNG) || path.endsWith(".jpeg") || path.endsWith(".webp") || path.endsWith(PictureMimeType.BMP) || path.endsWith(".ico")) {
                        fxnVar = fxn.IMAGE;
                    } else if (path.endsWith(".html")) {
                        fxnVar = fxn.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return fxnVar;
    }

    public static boolean kg(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
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
