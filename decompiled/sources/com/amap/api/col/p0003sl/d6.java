package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.ServiceSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BasicLBSRestHandler.java */
/* loaded from: classes11.dex */
public abstract class d6<T, V> extends c6<T, V> {
    public d6(Context context, T t) {
        super(context, t);
    }

    public String c(String str) {
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            if (str2 != null) {
                try {
                    str2 = URLDecoder.decode(str2, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    b6.a(e, "ProtocalHandler", "strReEncoder");
                    str2 = "";
                    stringBuffer.append(str2);
                    stringBuffer.append("&");
                } catch (Exception e2) {
                    b6.a(e2, "ProtocalHandler", "strReEncoderException");
                    str2 = "";
                    stringBuffer.append(str2);
                    stringBuffer.append("&");
                }
            }
            stringBuffer.append(str2);
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() > 1 ? (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1) : str;
    }

    protected String d(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            b6.a(e, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (Exception e2) {
            b6.a(e2, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    @Override // com.amap.api.col.p0003sl.c6
    protected V g() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public byte[] getEntityBytes() {
        try {
            String h = h();
            StringBuffer stringBuffer = new StringBuffer();
            if (h != null) {
                stringBuffer.append(h);
                stringBuffer.append("&");
            }
            String language = ServiceSettings.getInstance().getLanguage();
            if (language != null && !ServiceSettings.CHINESE.equals(language)) {
                stringBuffer.append("langCode=").append(language);
            }
            String stringBuffer2 = stringBuffer.toString();
            String c = c(stringBuffer2);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            String a2 = c9.a();
            stringBuffer3.append("&ts=" + a2);
            stringBuffer3.append("&scode=" + c9.a(this.r, a2, c));
            return stringBuffer3.toString().getBytes("utf-8");
        } catch (Throwable th) {
            b6.a(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.c6, com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Search 9.7.4");
        hashMap.put("X-INFO", c9.a(this.r));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "9.7.4", "sea"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    protected abstract String h();
}
