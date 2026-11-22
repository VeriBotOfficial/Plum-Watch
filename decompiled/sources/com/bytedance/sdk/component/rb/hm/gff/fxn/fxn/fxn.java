package com.bytedance.sdk.component.rb.hm.gff.fxn.fxn;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.hie;
import com.bytedance.sdk.component.utils.sg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes13.dex */
public class fxn {
    private int fxn;
    private File kg;

    private fxn(int i, File file) {
        this.fxn = i;
        this.kg = file;
    }

    public static fxn fxn(int i, File file) {
        try {
            fxn fxnVar = new fxn(i, file);
            if (file != null) {
                file.mkdirs();
            }
            return fxnVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public synchronized InputStream fxn(String str) {
        FileInputStream fileInputStream;
        if (this.fxn <= 0) {
            return null;
        }
        File kg = kg(str);
        try {
            try {
                fileInputStream = new FileInputStream(kg);
            } catch (Throwable unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
        }
        try {
            gff(kg);
            return fileInputStream;
        } catch (FileNotFoundException unused3) {
            hie.fxn(fileInputStream);
            return null;
        }
    }

    public synchronized boolean fxn(String str, byte[] bArr) {
        if (this.fxn > 0 && str != null && bArr != null) {
            File gff = gff(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(gff);
                try {
                    fileOutputStream2.write(bArr);
                    if (gff.exists()) {
                        fxn(gff, kg(str), true);
                    }
                    hie.fxn(fileOutputStream2);
                    List<File> fxn = fxn(this.kg);
                    if (fxn != null) {
                        int size = fxn.size();
                        int i = this.fxn;
                        if (size > i) {
                            fxn((int) (i * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.kg;
                        if (file != null) {
                            file.mkdirs();
                        }
                        hie.fxn(fileOutputStream);
                        List<File> fxn2 = fxn(this.kg);
                        if (fxn2 != null) {
                            int size2 = fxn2.size();
                            int i2 = this.fxn;
                            if (size2 > i2) {
                                fxn((int) (i2 * 0.7d));
                            }
                        }
                        return false;
                    } finally {
                        hie.fxn(fileOutputStream);
                        List<File> fxn3 = fxn(this.kg);
                        if (fxn3 != null) {
                            int size3 = fxn3.size();
                            int i3 = this.fxn;
                            if (size3 > i3) {
                                fxn((int) (i3 * 0.7d));
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private List<File> fxn(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                    List<File> asList = Arrays.asList(listFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : asList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void fxn(int i) {
        try {
            if (i > this.fxn) {
                return;
            }
            List<File> kg = kg(this.kg);
            if (kg != null && kg.size() > i) {
                while (i < kg.size()) {
                    File file = kg.get(i);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private List<File> kg(File file) {
        List<File> fxn = fxn(file);
        if (fxn == null || fxn.isEmpty()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        for (File file2 : fxn) {
            hashMap.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(fxn, new Comparator<File>() { // from class: com.bytedance.sdk.component.rb.hm.gff.fxn.fxn.fxn.1
            @Override // java.util.Comparator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) hashMap.get(file4)).longValue(), ((Long) hashMap.get(file3)).longValue());
            }
        });
        return fxn;
    }

    private void gff(File file) {
        if (file == null) {
            return;
        }
        try {
            sg.kg(file);
        } catch (Throwable unused) {
        }
    }

    private void fxn(File file, File file2, boolean z) throws IOException {
        if (z) {
            hm(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static void hm(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private File kg(String str) {
        return new File(this.kg, str);
    }

    private File gff(String str) {
        return new File(this.kg, str + ".temp");
    }
}
