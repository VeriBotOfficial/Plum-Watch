package com.baidu.mapauto.auth.net.format;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8253a;
    public static final String b;
    public static final String c;

    static {
        String string = UUID.randomUUID().toString();
        f8253a = string;
        b = "\r\n--" + string + "\r\n";
        c = "\r\n--" + string + "--\r\n";
    }

    public final String a(HashMap map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof File) {
                throw new UnsupportedOperationException();
            }
            if (obj != null) {
                String string = obj.toString();
                sb.append(b);
                sb.append("Content-Disposition: form-data; name=\"").append(str).append("\"\r\n\r\n");
                sb.append(string);
            }
        }
        sb.append(c);
        return sb.toString();
    }
}
