package com.qumeng.overseas.advlib.__remote__.utils.network;

import com.qumeng.overseas.advlib.__remote__.utils.ADBaseException;
import java.net.HttpURLConnection;
import java.util.AbstractMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public class NetAPIException extends ADBaseException {
    public NetAPIException(String str, HttpURLConnection httpURLConnection, Throwable th) {
        super(str, th, new AbstractMap.SimpleEntry("conn", httpURLConnection));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.valueOf(super.getMessage()));
        try {
            Object stashObject = getStashObject("conn");
            if (stashObject instanceof HttpURLConnection) {
                sb.append(' ');
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(stashObject.toString());
                sb.append(AbstractJsonLexerKt.END_LIST);
            }
        } catch (Exception e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_NetAPIException_getMessage", String.valueOf(e.getMessage()), e);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public NetAPIException(String str, HttpURLConnection httpURLConnection) {
        super(str, null, new AbstractMap.SimpleEntry("conn", httpURLConnection));
    }

    public NetAPIException(String str) {
        super(str);
    }
}
