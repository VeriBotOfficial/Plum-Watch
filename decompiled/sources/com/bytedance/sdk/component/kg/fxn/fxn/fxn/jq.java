package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import com.bytedance.sdk.component.kg.fxn.ckl;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes13.dex */
public class jq extends ckl {
    HttpURLConnection fxn;
    InputStream kg;

    jq(HttpURLConnection httpURLConnection) throws IOException {
        this.fxn = httpURLConnection;
        this.kg = new sg(httpURLConnection.getInputStream(), httpURLConnection);
    }

    jq(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.fxn = httpURLConnection;
        this.kg = new sg(inputStream, httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.kg.fxn.ckl
    public long fxn() {
        try {
            return this.fxn.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.ckl
    public String kg() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.kg));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.ckl, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.kg.close();
            this.fxn.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.ckl
    public InputStream gff() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.ckl
    public byte[] hm() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.kg.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.ckl
    public com.bytedance.sdk.component.kg.fxn.jq rb() {
        if (this.fxn.getContentType() != null) {
            return com.bytedance.sdk.component.kg.fxn.jq.fxn(this.fxn.getContentType());
        }
        return null;
    }
}
