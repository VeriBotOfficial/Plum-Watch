package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.l;
import com.baidu.mapapi.http.HttpClient;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class f extends j<String> {
    private static final String c = "f";
    private Map<String, String> d;
    private com.anythink.expressad.foundation.g.f.c.b[] e;
    private String f;

    private f(int i, String str, Map<String, String> map, com.anythink.expressad.foundation.g.f.c.b[] bVarArr, com.anythink.expressad.foundation.g.f.e<String> eVar) {
        super(i, str, eVar);
        this.f = "---------Ij5ei4KM7KM7ae0KM7cH2ae0Ij5Ef1";
        this.d = map;
        this.e = bVarArr;
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final void i() {
        super.i();
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "multipart/form-data; boundary=" + this.f);
        a((Map<String, String>) hashMap);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final byte[] h() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.d.entrySet()) {
            sb.append(HttpClient.ENDFLAG);
            sb.append(this.f);
            sb.append("\r\n");
            sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
            sb.append(entry.getValue());
            sb.append("\r\n");
        }
        return sb.toString().getBytes();
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final void a(OutputStream outputStream) {
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        try {
            try {
                com.anythink.expressad.foundation.g.f.c.b[] bVarArr = this.e;
                if (bVarArr != null) {
                    for (com.anythink.expressad.foundation.g.f.c.b bVar : bVarArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(HttpClient.ENDFLAG);
                        sb.append(this.f);
                        sb.append("\r\n");
                        sb.append("Content-Disposition: form-data;name=\"" + bVar.f() + "\";filename=\"" + bVar.e() + "\"\r\n");
                        sb.append("Content-Type: " + bVar.g() + "\r\n\r\n");
                        dataOutputStream.write(sb.toString().getBytes());
                        if (bVar.c() != null) {
                            byte[] bArr = new byte[1024];
                            int i = 0;
                            while (true) {
                                int read = bVar.c().read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                dataOutputStream.write(bArr, 0, read);
                                i += read;
                                if (this.b != null) {
                                    this.b.a(bVar.a(), i);
                                }
                            }
                            bVar.c().close();
                        } else {
                            dataOutputStream.write(bVar.d(), 0, bVar.d().length);
                        }
                        dataOutputStream.write("\r\n".getBytes());
                    }
                }
                dataOutputStream.writeBytes(HttpClient.ENDFLAG + this.f + "--\r\n");
                dataOutputStream.flush();
            } catch (IOException e) {
                e.getMessage();
                this.b.a(new com.anythink.expressad.foundation.g.f.a.a(2, null));
                try {
                    dataOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    protected final l<String> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return l.a(new String(cVar.b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.d)), cVar);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
