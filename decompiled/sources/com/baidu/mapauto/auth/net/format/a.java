package com.baidu.mapauto.auth.net.format;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8253a;
    public static final String b;
    public static final String c;

    static {
        String uuid = UUID.randomUUID().toString();
        f8253a = uuid;
        b = "\r\n--" + uuid + "\r\n";
        c = "\r\n--" + uuid + "--\r\n";
    }

    public final String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            Object obj = hashMap.get(str);
            if (obj instanceof File) {
                throw new UnsupportedOperationException();
            }
            if (obj != null) {
                String obj2 = obj.toString();
                sb.append(b);
                sb.append("Content-Disposition: form-data; name=\"").append(str).append("\"\r\n\r\n");
                sb.append(obj2);
            }
        }
        sb.append(c);
        return sb.toString();
    }
}
