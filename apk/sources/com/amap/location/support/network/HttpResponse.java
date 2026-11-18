package com.amap.location.support.network;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HttpResponse {
    public byte[] body;
    public Map<String, List<String>> headers;
    public int statusCode;
    public InputStream stream;
}
