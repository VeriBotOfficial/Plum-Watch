package com.bytedance.adsdk.kg.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes13.dex */
public class fxn implements hm {
    private final HttpURLConnection fxn;

    public fxn(HttpURLConnection httpURLConnection) {
        this.fxn = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.kg.hm.hm
    public boolean fxn() {
        try {
            return this.fxn.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.kg.hm.hm
    public InputStream kg() throws IOException {
        return this.fxn.getInputStream();
    }

    @Override // com.bytedance.adsdk.kg.hm.hm
    public String gff() {
        return this.fxn.getContentType();
    }

    @Override // com.bytedance.adsdk.kg.hm.hm
    public String hm() {
        try {
            if (fxn()) {
                return null;
            }
            return "Unable to fetch " + this.fxn.getURL() + ". Failed with " + this.fxn.getResponseCode() + "\n" + fxn(this.fxn);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.fxn.disconnect();
    }

    private String fxn(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine).append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
