package com.bykv.vk.openvk.fxn.fxn.kg.fxn;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.gff;
import com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.kg;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class fxn extends MediaDataSource {
    public static final ConcurrentHashMap<String, fxn> fxn = new ConcurrentHashMap<>();
    private long gff = -2147483648L;
    private final Context hm;
    private final gff kg;
    private final com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff rb;

    public fxn(Context context, com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        this.hm = context;
        this.rb = gffVar;
        this.kg = new kg(context, gffVar);
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int fxn2 = this.kg.fxn(j, bArr, i, i2);
        new StringBuilder("readAt: position = ").append(j).append("  buffer.length =").append(bArr.length).append("  offset = ").append(i).append(" size =").append(fxn2).append("  current = ").append(Thread.currentThread());
        return fxn2;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.gff == -2147483648L) {
            if (this.hm == null || TextUtils.isEmpty(this.rb.xdg())) {
                return -1L;
            }
            this.gff = this.kg.gff();
        }
        return this.gff;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        new Object[]{"close: ", this.rb.xdg()};
        gff gffVar = this.kg;
        if (gffVar != null) {
            gffVar.kg();
        }
        fxn.remove(this.rb.rmu());
    }

    public com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff fxn() {
        return this.rb;
    }

    public static fxn fxn(Context context, com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        fxn fxnVar = new fxn(context, gffVar);
        fxn.put(gffVar.rmu(), fxnVar);
        return fxnVar;
    }
}
