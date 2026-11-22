package com.bytedance.adsdk.kg.hm;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes13.dex */
public class sg {
    private final rb fxn;

    public sg(rb rbVar) {
        this.fxn = rbVar;
    }

    Pair<gff, InputStream> fxn(String str) {
        gff gffVar;
        try {
            File kg = kg(str);
            if (kg == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(kg);
            if (kg.getAbsolutePath().endsWith(".zip")) {
                gffVar = gff.ZIP;
            } else {
                gffVar = gff.JSON;
            }
            kg.getAbsolutePath();
            return new Pair<>(gffVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File fxn(String str, InputStream inputStream, gff gffVar) throws IOException {
        File file = new File(fxn(), fxn(str, gffVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    void fxn(String str, gff gffVar) {
        File file = new File(fxn(), fxn(str, gffVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        new StringBuilder("Copying temp file to real file (").append(file2);
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File kg(String str) throws FileNotFoundException {
        File file = new File(fxn(), fxn(str, gff.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(fxn(), fxn(str, gff.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File fxn() {
        File fxn = this.fxn.fxn();
        if (fxn.isFile()) {
            fxn.delete();
        }
        if (!fxn.exists()) {
            fxn.mkdirs();
        }
        return fxn;
    }

    private static String fxn(String str, gff gffVar, boolean z) {
        return "lottie_cache_" + str.replaceAll("\\W+", "") + (z ? gffVar.fxn() : gffVar.gff);
    }
}
