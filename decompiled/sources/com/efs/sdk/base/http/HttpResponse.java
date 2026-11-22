package com.efs.sdk.base.http;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.efs.sdk.base.core.model.c;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes14.dex */
public class HttpResponse extends c<Map<String, String>> {
    private static final String KEY_BIZ_CODE = "biz_code";
    private static final String KEY_REQUEST_URL = "req_url";
    public static final int REQUEST_ERROR_DEFAULT = -1;
    public static final int REQUEST_ERROR_NETWORK_DISCONNECT = -2;
    public static final int REQUEST_ERROR_SOCKET_TIMEOUT = -3;

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.HashMap] */
    public HttpResponse() {
        this.extra = new HashMap();
    }

    public void setHttpCode(int i) {
        this.succ = (i >= 200 && i < 300) || i == 304;
        this.code = i;
    }

    public int getHttpCode() {
        return this.code;
    }

    public void setBizCode(String str) {
        ((Map) this.extra).put(KEY_BIZ_CODE, str);
    }

    public String getBizCode() {
        if (!((Map) this.extra).containsKey(KEY_BIZ_CODE)) {
            return "";
        }
        return (String) ((Map) this.extra).get(KEY_BIZ_CODE);
    }

    public void setReqUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.contains(Separators.QUESTION)) {
            str = str.substring(0, str.indexOf(Separators.QUESTION));
        }
        ((Map) this.extra).put("req_url", str);
    }

    public String getReqUrl() {
        if (!((Map) this.extra).containsKey("req_url")) {
            return "";
        }
        return (String) ((Map) this.extra).get("req_url");
    }

    public String toString() {
        return "HttpResponse {succ=" + this.succ + ", code=" + this.code + ", data='" + this.data + "', extra=" + this.extra + AbstractJsonLexerKt.END_OBJ;
    }
}
