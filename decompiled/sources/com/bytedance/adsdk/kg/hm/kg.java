package com.bytedance.adsdk.kg.hm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes13.dex */
public class kg implements bh {
    @Override // com.bytedance.adsdk.kg.hm.bh
    public hm fxn(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new fxn(httpURLConnection);
    }
}
