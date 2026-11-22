package com.bytedance.sdk.component.rb.gff.fxn;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import androidx.media3.exoplayer.DefaultLoadControl;
import java.io.File;

/* loaded from: classes13.dex */
public class fxn implements com.bytedance.sdk.component.rb.kg, Cloneable {
    private static volatile com.bytedance.sdk.component.rb.kg bh;
    private long fxn;
    private boolean gff;
    private boolean hm;
    private int kg;
    private File rb;

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean bh() {
        return false;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public int gff() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public int hm() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean jq() {
        return true;
    }

    public fxn(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public fxn(int i, long j, boolean z, boolean z2, File file) {
        this.fxn = j;
        this.kg = i;
        this.gff = z;
        this.hm = z2;
        this.rb = file;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public long fxn() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public int kg() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean rb() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean sg() {
        return this.hm;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public File tw() {
        return this.rb;
    }

    public static void fxn(Context context, com.bytedance.sdk.component.rb.kg kgVar) {
        if (kgVar != null) {
            bh = kgVar;
        } else {
            bh = fxn(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.rb.kg fxn(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (bh == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(dgx() / 16, 41943040L);
        } else {
            min = Math.min(bh.kg() / 2, 31457280);
            min2 = Math.min(bh.fxn() / 2, 41943040L);
        }
        return new fxn(Math.max(min, DefaultLoadControl.DEFAULT_IMAGE_BUFFER_SIZE), Math.max(min2, 20971520L), file);
    }

    public static com.bytedance.sdk.component.rb.kg hie() {
        return bh;
    }

    private static long dgx() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
