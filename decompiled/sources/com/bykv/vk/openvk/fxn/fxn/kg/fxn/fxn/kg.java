package com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn;

import android.content.Context;
import com.bytedance.sdk.component.kg.fxn.ckl;
import com.bytedance.sdk.component.kg.fxn.dgx;
import com.bytedance.sdk.component.kg.fxn.mvp;
import com.bytedance.sdk.component.kg.fxn.zu;
import com.bytedance.sdk.component.utils.dx;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class kg implements gff {
    private final com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff dgx;
    private File gff;
    private RandomAccessFile hie;
    private File hm;
    private long rb;
    private volatile long fxn = -2147483648L;
    private final Object kg = new Object();
    private volatile long bh = -1;

    /* renamed from: sg, reason: collision with root package name */
    private volatile int f9082sg = -100;
    private volatile boolean tw = false;
    private volatile boolean jq = false;

    public kg(Context context, com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        this.rb = 0L;
        this.hie = null;
        this.dgx = gffVar;
        try {
            this.gff = com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.kg(gffVar.rb(), gffVar.rmu());
            this.hm = com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.gff(gffVar.rb(), gffVar.rmu());
            if (hm()) {
                this.hie = new RandomAccessFile(this.hm, "r");
            } else {
                this.hie = new RandomAccessFile(this.gff, "rw");
            }
            if (hm()) {
                return;
            }
            this.rb = this.gff.length();
            fxn();
        } catch (Throwable unused) {
            new Object[]{"Error using file ", gffVar.xdg(), " as disc cache"};
        }
    }

    private boolean hm() {
        return this.hm.exists();
    }

    public void fxn() {
        dgx.fxn fxnVar;
        if (com.bykv.vk.openvk.fxn.fxn.fxn.gff.hm() != null) {
            fxnVar = com.bykv.vk.openvk.fxn.fxn.fxn.gff.hm().kg();
        } else {
            fxnVar = new dgx.fxn("v_cache");
        }
        fxnVar.fxn(this.dgx.ud(), TimeUnit.MILLISECONDS).kg(this.dgx.dx(), TimeUnit.MILLISECONDS).gff(this.dgx.ums(), TimeUnit.MILLISECONDS);
        dgx fxn = fxnVar.fxn();
        new Object[]{"RANGE, bytes=", Long.valueOf(this.rb), " file hash=", this.dgx.rmu()};
        fxn.fxn(new mvp.fxn().fxn("RANGE", "bytes=" + this.rb + Constants.ACCEPT_TIME_SEPARATOR_SERVER).kg(this.dgx.xdg()).fxn().fxn("videoLoadWhenPlaying").fxn(9).kg()).fxn(new com.bytedance.sdk.component.kg.fxn.gff() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.kg.1
            @Override // com.bytedance.sdk.component.kg.fxn.gff
            public void fxn(com.bytedance.sdk.component.kg.fxn.kg kgVar, IOException iOException) {
                kg.this.fxn(30000, iOException.getMessage());
            }

            @Override // com.bytedance.sdk.component.kg.fxn.gff
            public void fxn(com.bytedance.sdk.component.kg.fxn.kg kgVar, zu zuVar) throws IOException {
                ckl cklVar;
                boolean z;
                if (zuVar == null) {
                    kg.this.fxn(30002, "response is empty");
                    return;
                }
                InputStream inputStream = null;
                try {
                    try {
                        kg.this.jq = zuVar.hm();
                        if (kg.this.jq) {
                            cklVar = zuVar.bh();
                            try {
                                if (kg.this.jq && cklVar != null) {
                                    kg.this.fxn = cklVar.fxn() + kg.this.rb;
                                    inputStream = cklVar.gff();
                                }
                                if (inputStream == null) {
                                    kg.this.fxn(30003, "input_stream is empty");
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (cklVar != null) {
                                        cklVar.close();
                                    }
                                    if (zuVar != null) {
                                        zuVar.close();
                                    }
                                    if (!kg.this.jq || kg.this.gff.length() != kg.this.fxn) {
                                        return;
                                    }
                                    kg.this.bh();
                                }
                                byte[] bArr = new byte[8192];
                                long j = kg.this.rb;
                                long j2 = 0;
                                loop0: while (true) {
                                    int i = 0;
                                    do {
                                        int read = inputStream.read(bArr, i, 8192 - i);
                                        z = true;
                                        if (read == -1) {
                                            break loop0;
                                        }
                                        i += read;
                                        j2 += read;
                                        if (j2 % 8192 != 0 && j2 != kg.this.fxn - kg.this.rb) {
                                            z = false;
                                        }
                                        new Object[]{"Write segment,execAppend =", Boolean.valueOf(z), " offset=", Integer.valueOf(i), " totalLength = ", Long.valueOf(kg.this.fxn), " saveSize =", Long.valueOf(j2), " startSaved=", Long.valueOf(kg.this.rb), " fileHash=", kg.this.dgx.rmu(), " url=", kg.this.dgx.xdg()};
                                    } while (!z);
                                    synchronized (kg.this.kg) {
                                        com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.fxn(kg.this.hie, bArr, Long.valueOf(j).intValue(), i, kg.this.dgx.rmu());
                                    }
                                    j += i;
                                }
                                Long valueOf = Long.valueOf(kg.this.rb);
                                Long valueOf2 = Long.valueOf(kg.this.fxn);
                                Long valueOf3 = Long.valueOf(j2);
                                if (j2 != kg.this.fxn - kg.this.rb) {
                                    z = false;
                                }
                                new Object[]{"Write segment,Write over, startIndex =", valueOf, " totalLength = ", valueOf2, " saveSize = ", valueOf3, " writeEndSegment =", Boolean.valueOf(z), " url=", kg.this.dgx.xdg()};
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    kg.this.fxn(30001, th.getMessage());
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (cklVar != null) {
                                        cklVar.close();
                                    }
                                    if (zuVar != null) {
                                        zuVar.close();
                                    }
                                    if (kg.this.jq && kg.this.gff.length() == kg.this.fxn) {
                                        kg.this.bh();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused) {
                                            throw th2;
                                        }
                                    }
                                    if (cklVar != null) {
                                        cklVar.close();
                                    }
                                    if (zuVar != null) {
                                        zuVar.close();
                                    }
                                    if (kg.this.jq && kg.this.gff.length() == kg.this.fxn) {
                                        kg.this.bh();
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            kg.this.fxn(zuVar.gff(), zuVar.rb());
                            cklVar = null;
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (cklVar != null) {
                            cklVar.close();
                        }
                        if (zuVar != null) {
                            zuVar.close();
                        }
                        if (!kg.this.jq || kg.this.gff.length() != kg.this.fxn) {
                            return;
                        }
                        kg.this.bh();
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cklVar = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(int i, String str) {
        JSONObject gff;
        this.jq = false;
        this.f9082sg = i;
        this.fxn = this.bh;
        dx.kg("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar = this.dgx;
        if (gffVar == null || !gffVar.fxn() || (gff = this.dgx.gff()) == null) {
            return;
        }
        try {
            gff.put("error_real_code", i);
            gff.put("error_real_msg", str);
        } catch (Throwable th) {
            dx.fxn("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.gff
    public int fxn(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.fxn) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.tw) {
                synchronized (this.kg) {
                    long rb = rb();
                    if (j < rb) {
                        new StringBuilder("read:  read ").append(j);
                        this.hie.seek(j);
                        i4 = this.hie.read(bArr, i, i2);
                    } else {
                        new Object[]{"read: wait at ", Long.valueOf(j), "  file size = ", Long.valueOf(rb)};
                        i3 += 33;
                        this.kg.wait(33L);
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar = this.dgx;
                if (gffVar != null && gffVar.fxn() && this.f9082sg != -100 && (!this.jq || this.fxn == this.bh)) {
                    throw new IOException();
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.gff
    public void kg() {
        try {
            if (!this.tw) {
                this.hie.close();
            }
            File file = this.gff;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.hm;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.tw = true;
    }

    private long rb() {
        if (hm()) {
            return this.hm.length();
        }
        return this.gff.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bh() throws IOException {
        synchronized (this.kg) {
            if (hm()) {
                new Object[]{"complete: isCompleted ", this.dgx.xdg(), this.dgx.rmu()};
                return;
            }
            try {
            } finally {
            }
            if (!this.gff.renameTo(this.hm)) {
                throw new IOException("Error renaming file " + this.gff + " to " + this.hm + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.hie;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.hie = new RandomAccessFile(this.hm, "rw");
            new Object[]{"complete: rename ", this.dgx.rmu(), this.dgx.xdg()};
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.gff
    public long gff() throws IOException {
        if (hm()) {
            this.fxn = this.hm.length();
        } else {
            synchronized (this.kg) {
                int i = 0;
                do {
                    if (this.fxn == -2147483648L) {
                        i += 15;
                        try {
                            this.kg.wait(5L);
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i <= 20000);
                return -1L;
            }
        }
        new Object[]{"totalLength= ", Long.valueOf(this.fxn)};
        return this.fxn;
    }
}
