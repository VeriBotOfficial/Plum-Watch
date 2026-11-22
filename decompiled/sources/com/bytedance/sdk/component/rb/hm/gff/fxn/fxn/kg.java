package com.bytedance.sdk.component.rb.hm.gff.fxn.fxn;

import com.bytedance.sdk.component.rb.gff;
import com.bytedance.sdk.component.utils.hie;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes13.dex */
public class kg implements gff {
    private int fxn;
    private fxn kg;

    public kg(File file, long j) {
        int i = (int) j;
        this.fxn = i;
        this.kg = fxn.fxn(i, file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.rb.gff
    public InputStream fxn(String str) {
        fxn fxnVar = this.kg;
        if (fxnVar == null) {
            return null;
        }
        return fxnVar.fxn(str);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, byte[] bArr) {
        fxn fxnVar = this.kg;
        if (fxnVar == null || bArr == null || str == null) {
            return false;
        }
        return fxnVar.fxn(str, bArr);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    /* renamed from: kg, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] fxn(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        fxn fxnVar = this.kg;
        if (fxnVar != null && str != null) {
            try {
                inputStream = fxnVar.fxn(str);
                if (inputStream != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            hie.fxn(inputStream);
                            hie.fxn(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        hie.fxn(inputStream);
                        hie.fxn(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    hie.fxn(inputStream);
                    hie.fxn(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStream = null;
            }
            hie.fxn(inputStream);
            hie.fxn(byteArrayOutputStream);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    /* renamed from: gff, reason: merged with bridge method [inline-methods] */
    public boolean kg(String str) {
        try {
            InputStream fxn = this.kg.fxn(str);
            boolean z = fxn != null;
            hie.fxn(fxn);
            return z;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                hie.fxn(null);
            }
        }
    }
}
