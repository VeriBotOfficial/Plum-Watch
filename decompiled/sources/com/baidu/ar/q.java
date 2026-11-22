package com.baidu.ar;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.SSLParameters;

/* loaded from: classes12.dex */
public class q extends ve {
    public h7 w;

    public q(URI uri) {
        super(uri);
    }

    @Override // com.baidu.ar.ve
    public void a(int i, String str, boolean z) {
        h7 h7Var = this.w;
        if (h7Var != null) {
            h7Var.a(i, str, z);
        }
    }

    public void a(h7 h7Var) {
        this.w = h7Var;
    }

    @Override // com.baidu.ar.ve
    public void a(pb pbVar) {
        h7 h7Var = this.w;
        if (h7Var != null) {
            h7Var.onOpen();
        }
    }

    @Override // com.baidu.ar.ve
    public void a(Exception exc) {
        h7 h7Var = this.w;
        if (h7Var != null) {
            h7Var.onError(1001, exc != null ? exc.getMessage() : "");
        }
    }

    @Override // com.baidu.ar.ve
    public void a(String str) {
        h7 h7Var = this.w;
        if (h7Var != null) {
            h7Var.a(str);
        }
    }

    @Override // com.baidu.ar.ve
    public void a(ByteBuffer byteBuffer) {
        String str;
        super.a(byteBuffer);
        try {
            str = StandardCharsets.UTF_8.newDecoder().decode(byteBuffer.asReadOnlyBuffer()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        h7 h7Var = this.w;
        if (h7Var != null) {
            h7Var.a(str);
        }
    }

    @Override // com.baidu.ar.ve
    public void a(SSLParameters sSLParameters) {
    }

    public void s() {
        this.w = null;
    }
}
