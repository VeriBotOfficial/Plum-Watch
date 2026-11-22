package com.bytedance.sdk.openadsdk.kg;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes14.dex */
public class kg extends fxn {
    private int gff;
    private volatile boolean hm;
    private int kg;

    public kg(int i, int i2) {
        this.kg = 15;
        this.gff = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.kg = i;
        this.gff = i2;
    }

    public kg(int i, int i2, boolean z) {
        this.kg = 15;
        this.gff = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.kg = i;
        this.gff = i2;
        this.hm = z;
    }

    @Override // com.bytedance.sdk.openadsdk.kg.fxn
    protected boolean fxn(long j, int i) {
        return i <= this.kg;
    }

    @Override // com.bytedance.sdk.openadsdk.kg.fxn
    protected boolean fxn(File file, long j, int i) {
        return i <= this.gff;
    }

    @Override // com.bytedance.sdk.openadsdk.kg.fxn
    protected void fxn(List<File> list) {
        if (this.hm) {
            hm(list);
            this.hm = false;
        } else {
            gff(list);
        }
    }

    private void gff(List<File> list) {
        long kg = kg(list);
        int size = list.size();
        if (fxn(kg, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                kg -= length;
            }
            if (fxn(file, kg, size)) {
                return;
            }
        }
    }

    private void hm(List<File> list) {
        long kg;
        int size;
        boolean fxn;
        if (list != null) {
            try {
                if (list.size() != 0 && !(fxn = fxn((kg = kg(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !fxn) {
                            ((Long) entry.getKey()).longValue();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                kg -= length;
                            }
                            if (fxn(file2, kg, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
