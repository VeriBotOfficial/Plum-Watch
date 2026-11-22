package com.bytedance.sdk.component.rb.gff.fxn.fxn;

import android.util.Log;
import com.bytedance.sdk.component.rb.gff.fxn.fxn.fxn;
import com.bytedance.sdk.component.utils.hie;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class kg implements com.bytedance.sdk.component.rb.gff {
    private long fxn;
    private fxn kg;

    public kg(File file, long j, ExecutorService executorService) {
        this.fxn = j;
        try {
            this.kg = fxn.fxn(file, 20210302, 1, j, executorService);
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.rb.gff
    public InputStream fxn(String str) {
        fxn fxnVar = this.kg;
        if (fxnVar == null) {
            return null;
        }
        try {
            fxn.gff fxn = fxnVar.fxn(str);
            if (fxn != null) {
                return fxn.fxn(0);
            }
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, byte[] bArr) {
        Closeable closeable;
        fxn.C0482fxn kg;
        fxn fxnVar = this.kg;
        if (fxnVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        fxn.C0482fxn c0482fxn = null;
        try {
            try {
                kg = fxnVar.kg(str);
            } catch (IOException e) {
                e = e;
                closeable = null;
            }
            try {
                if (kg == null) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                    hie.fxn(null);
                    return false;
                }
                OutputStream fxn = kg.fxn(0);
                if (fxn == fxn.gff) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                    hie.fxn(fxn);
                    return false;
                }
                fxn.write(bArr);
                kg.fxn();
                this.kg.fxn();
                hie.fxn(fxn);
                return true;
            } catch (IOException e2) {
                e = e2;
                closeable = null;
                c0482fxn = kg;
                try {
                    Log.w("LruCountDiskCache", e.toString());
                    if (c0482fxn != null) {
                        try {
                            c0482fxn.kg();
                        } catch (IOException unused) {
                        }
                    }
                    hie.fxn(closeable);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    hie.fxn(closeable2);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            hie.fxn(closeable2);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    /* renamed from: kg, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] fxn(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        fxn fxnVar = this.kg;
        InputStream inputStream2 = null;
        if (fxnVar == null || str == null) {
            return null;
        }
        try {
            fxn.gff fxn = fxnVar.fxn(str);
            if (fxn == null) {
                hie.fxn(null);
                hie.fxn(null);
                return null;
            }
            inputStream = fxn.fxn(0);
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (IOException e) {
                            e = e;
                            Log.w("LruCountDiskCache", e.toString());
                            hie.fxn(inputStream);
                            hie.fxn(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        hie.fxn(inputStream2);
                        hie.fxn(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    hie.fxn(inputStream);
                    hie.fxn(byteArrayOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    hie.fxn(inputStream2);
                    hie.fxn(byteArrayOutputStream);
                    throw th;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            hie.fxn(inputStream);
            hie.fxn(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            hie.fxn(inputStream2);
            hie.fxn(byteArrayOutputStream);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    /* renamed from: gff, reason: merged with bridge method [inline-methods] */
    public boolean kg(String str) {
        try {
            try {
                fxn.gff fxn = this.kg.fxn(str);
                boolean z = fxn != null;
                hie.fxn(fxn);
                return z;
            } catch (IOException e) {
                Log.w("LruCountDiskCache", e.getMessage());
                hie.fxn(null);
                return false;
            }
        } catch (Throwable th) {
            hie.fxn(null);
            throw th;
        }
    }
}
