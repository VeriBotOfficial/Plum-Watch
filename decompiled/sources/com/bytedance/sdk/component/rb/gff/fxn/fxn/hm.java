package com.bytedance.sdk.component.rb.gff.fxn.fxn;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes13.dex */
final class hm {
    static final Charset fxn = Charset.forName("US-ASCII");
    static final Charset kg = Charset.forName("UTF-8");

    static void fxn(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                fxn(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }
}
