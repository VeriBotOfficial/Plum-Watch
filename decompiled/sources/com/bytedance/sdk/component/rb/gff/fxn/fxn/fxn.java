package com.bytedance.sdk.component.rb.gff.fxn.fxn;

import android.util.Log;
import com.bytedance.sdk.component.utils.hie;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public final class fxn implements Closeable {
    static final Pattern fxn = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream gff = new OutputStream() { // from class: com.bytedance.sdk.component.rb.gff.fxn.fxn.fxn.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    private final File bh;
    private final int hie;
    private final File hm;
    private long jq;
    final ExecutorService kg;
    private Writer mvp;
    private final File rb;

    /* renamed from: sg, reason: collision with root package name */
    private final File f9380sg;
    private final int tw;
    private int zu;
    private long dgx = 0;
    private final LinkedHashMap<String, kg> rlu = new LinkedHashMap<>(0, 0.75f, true);
    private long ckl = -1;
    private long xdg = 0;
    private final Callable<Void> rmu = new Callable<Void>() { // from class: com.bytedance.sdk.component.rb.gff.fxn.fxn.fxn.1
        @Override // java.util.concurrent.Callable
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (fxn.this) {
                if (fxn.this.mvp == null) {
                    return null;
                }
                fxn.this.tw();
                if (fxn.this.bh()) {
                    fxn.this.rb();
                    fxn.this.zu = 0;
                }
                return null;
            }
        }
    };

    private fxn(File file, int i, int i2, long j, ExecutorService executorService) {
        this.hm = file;
        this.tw = i;
        this.rb = new File(file, "journal");
        this.bh = new File(file, "journal.tmp");
        this.f9380sg = new File(file, "journal.bkp");
        this.hie = i2;
        this.jq = j;
        this.kg = executorService;
    }

    public static fxn fxn(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                fxn(file2, file3, false);
            }
        }
        fxn fxnVar = new fxn(file, i, i2, j, executorService);
        if (fxnVar.rb.exists()) {
            try {
                fxnVar.gff();
                fxnVar.hm();
                return fxnVar;
            } catch (IOException e) {
                Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                fxnVar.kg();
            }
        }
        file.mkdirs();
        fxn fxnVar2 = new fxn(file, i, i2, j, executorService);
        fxnVar2.rb();
        return fxnVar2;
    }

    private void gff() throws IOException {
        com.bytedance.sdk.component.rb.gff.fxn.fxn.gff gffVar = new com.bytedance.sdk.component.rb.gff.fxn.fxn.gff(new FileInputStream(this.rb), hm.fxn);
        try {
            String fxn2 = gffVar.fxn();
            String fxn3 = gffVar.fxn();
            String fxn4 = gffVar.fxn();
            String fxn5 = gffVar.fxn();
            String fxn6 = gffVar.fxn();
            if (!"libcore.io.DiskLruCache".equals(fxn2) || !"1".equals(fxn3) || !Integer.toString(this.tw).equals(fxn4) || !Integer.toString(this.hie).equals(fxn5) || !"".equals(fxn6)) {
                throw new IOException("unexpected journal header: [" + fxn2 + ", " + fxn3 + ", " + fxn5 + ", " + fxn6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    hm(gffVar.fxn());
                    i++;
                } catch (EOFException unused) {
                    this.zu = i - this.rlu.size();
                    if (gffVar.kg()) {
                        rb();
                    } else {
                        this.mvp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.rb, true), hm.fxn));
                    }
                    hie.fxn(gffVar);
                    return;
                }
            }
        } catch (Throwable th) {
            hie.fxn(gffVar);
            throw th;
        }
    }

    private void hm(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.rlu.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        kg kgVar = this.rlu.get(substring);
        if (kgVar == null) {
            kgVar = new kg(substring);
            this.rlu.put(substring, kgVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            kgVar.hm = true;
            kgVar.rb = null;
            kgVar.fxn(split);
            return;
        }
        if (indexOf2 != -1 || indexOf != 5 || !str.startsWith("DIRTY")) {
            if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
            }
            return;
        }
        kgVar.rb = new C0482fxn(kgVar);
    }

    private void hm() throws IOException {
        fxn(this.bh);
        Iterator<kg> it = this.rlu.values().iterator();
        while (it.hasNext()) {
            kg next = it.next();
            int i = 0;
            if (next.rb == null) {
                while (i < this.hie) {
                    this.dgx += next.gff[i];
                    i++;
                }
            } else {
                next.rb = null;
                while (i < this.hie) {
                    fxn(next.fxn(i));
                    fxn(next.kg(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void rb() throws IOException {
        Writer writer = this.mvp;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.bh), hm.fxn));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.tw));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.hie));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (kg kgVar : this.rlu.values()) {
                if (kgVar.rb != null) {
                    bufferedWriter.write("DIRTY " + kgVar.kg + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + kgVar.kg + kgVar.fxn() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.rb.exists()) {
                fxn(this.rb, this.f9380sg, true);
            }
            fxn(this.bh, this.rb, false);
            this.f9380sg.delete();
            this.mvp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.rb, true), hm.fxn));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void fxn(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void fxn(File file, File file2, boolean z) throws IOException {
        if (z) {
            fxn(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized gff fxn(String str) throws IOException {
        Throwable th;
        InputStream inputStream;
        try {
            sg();
            rb(str);
            kg kgVar = this.rlu.get(str);
            if (kgVar == null) {
                return null;
            }
            if (!kgVar.hm) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.hie];
            for (int i = 0; i < this.hie; i++) {
                try {
                    try {
                        try {
                            inputStreamArr[i] = new FileInputStream(kgVar.fxn(i));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < this.hie && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            hie.fxn(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
            this.zu++;
            this.mvp.append((CharSequence) ("READ " + str + '\n'));
            if (bh()) {
                this.kg.submit(this.rmu);
            }
            return new gff(str, kgVar.bh, inputStreamArr, kgVar.gff);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public C0482fxn kg(String str) throws IOException {
        return fxn(str, -1L);
    }

    private synchronized C0482fxn fxn(String str, long j) throws IOException {
        sg();
        rb(str);
        kg kgVar = this.rlu.get(str);
        if (j != -1 && (kgVar == null || kgVar.bh != j)) {
            return null;
        }
        if (kgVar == null) {
            kgVar = new kg(str);
            this.rlu.put(str, kgVar);
        } else if (kgVar.rb != null) {
            return null;
        }
        C0482fxn c0482fxn = new C0482fxn(kgVar);
        kgVar.rb = c0482fxn;
        this.mvp.write("DIRTY " + str + '\n');
        this.mvp.flush();
        return c0482fxn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fxn(C0482fxn c0482fxn, boolean z) throws IOException {
        kg kgVar = c0482fxn.kg;
        if (kgVar.rb != c0482fxn) {
            throw new IllegalStateException();
        }
        if (z && !kgVar.hm) {
            for (int i = 0; i < this.hie; i++) {
                if (!c0482fxn.gff[i]) {
                    c0482fxn.kg();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                }
                if (!kgVar.kg(i).exists()) {
                    c0482fxn.kg();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.hie; i2++) {
            File kg2 = kgVar.kg(i2);
            if (z) {
                if (kg2.exists()) {
                    File fxn2 = kgVar.fxn(i2);
                    kg2.renameTo(fxn2);
                    long j = kgVar.gff[i2];
                    long length = fxn2.length();
                    kgVar.gff[i2] = length;
                    this.dgx = (this.dgx - j) + length;
                }
            } else {
                fxn(kg2);
            }
        }
        this.zu++;
        kgVar.rb = null;
        if (kgVar.hm | z) {
            kgVar.hm = true;
            this.mvp.write("CLEAN " + kgVar.kg + kgVar.fxn() + '\n');
            if (z) {
                long j2 = this.xdg;
                this.xdg = 1 + j2;
                kgVar.bh = j2;
            }
        } else {
            this.rlu.remove(kgVar.kg);
            this.mvp.write("REMOVE " + kgVar.kg + '\n');
        }
        this.mvp.flush();
        if (this.dgx > this.jq || bh()) {
            this.kg.submit(this.rmu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bh() {
        int i = this.zu;
        return i >= 2000 && i >= this.rlu.size();
    }

    public synchronized boolean gff(String str) throws IOException {
        sg();
        rb(str);
        kg kgVar = this.rlu.get(str);
        if (kgVar != null && kgVar.rb == null) {
            for (int i = 0; i < this.hie; i++) {
                File fxn2 = kgVar.fxn(i);
                if (fxn2.exists() && !fxn2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(fxn2)));
                }
                this.dgx -= kgVar.gff[i];
                kgVar.gff[i] = 0;
            }
            this.zu++;
            this.mvp.append((CharSequence) ("REMOVE " + str + '\n'));
            this.rlu.remove(str);
            if (bh()) {
                this.kg.submit(this.rmu);
            }
            return true;
        }
        return false;
    }

    private void sg() {
        if (this.mvp == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void fxn() throws IOException {
        sg();
        tw();
        this.mvp.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.mvp == null) {
            return;
        }
        Iterator it = new ArrayList(this.rlu.values()).iterator();
        while (it.hasNext()) {
            kg kgVar = (kg) it.next();
            if (kgVar.rb != null) {
                kgVar.rb.kg();
            }
        }
        tw();
        this.mvp.close();
        this.mvp = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tw() throws IOException {
        long j = this.jq;
        long j2 = this.ckl;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.dgx > j) {
            gff(this.rlu.entrySet().iterator().next().getKey());
        }
        this.ckl = -1L;
    }

    public void kg() throws IOException {
        close();
        hm.fxn(this.hm);
    }

    private void rb(String str) {
        if (!fxn.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final class gff implements Closeable {
        private final long gff;
        private final InputStream[] hm;
        private final String kg;
        private final long[] rb;

        private gff(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.kg = str;
            this.gff = j;
            this.hm = inputStreamArr;
            this.rb = jArr;
        }

        public InputStream fxn(int i) {
            return this.hm[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.hm) {
                hie.fxn(inputStream);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.rb.gff.fxn.fxn.fxn$fxn, reason: collision with other inner class name */
    public final class C0482fxn {
        private final boolean[] gff;
        private boolean hm;
        private final kg kg;
        private boolean rb;

        private C0482fxn(kg kgVar) {
            this.kg = kgVar;
            this.gff = kgVar.hm ? null : new boolean[fxn.this.hie];
        }

        public OutputStream fxn(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C0483fxn c0483fxn;
            if (i < 0 || i >= fxn.this.hie) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + fxn.this.hie);
            }
            synchronized (fxn.this) {
                if (this.kg.rb != this) {
                    throw new IllegalStateException();
                }
                if (!this.kg.hm) {
                    this.gff[i] = true;
                }
                File kg = this.kg.kg(i);
                try {
                    fileOutputStream = new FileOutputStream(kg);
                } catch (FileNotFoundException unused) {
                    fxn.this.hm.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(kg);
                    } catch (FileNotFoundException unused2) {
                        return fxn.gff;
                    }
                }
                c0483fxn = new C0483fxn(fileOutputStream);
            }
            return c0483fxn;
        }

        public void fxn() throws IOException {
            if (this.hm) {
                fxn.this.fxn(this, false);
                fxn.this.gff(this.kg.kg);
            } else {
                fxn.this.fxn(this, true);
            }
            this.rb = true;
        }

        public void kg() throws IOException {
            fxn.this.fxn(this, false);
        }

        /* renamed from: com.bytedance.sdk.component.rb.gff.fxn.fxn.fxn$fxn$fxn, reason: collision with other inner class name */
        private class C0483fxn extends FilterOutputStream {
            private C0483fxn(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C0482fxn.this.hm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0482fxn.this.hm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0482fxn.this.hm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0482fxn.this.hm = true;
                }
            }
        }
    }

    private final class kg {
        private long bh;
        private final long[] gff;
        private boolean hm;
        private final String kg;
        private C0482fxn rb;

        private kg(String str) {
            this.kg = str;
            this.gff = new long[fxn.this.hie];
        }

        public String fxn() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.gff) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fxn(String[] strArr) throws IOException {
            if (strArr.length != fxn.this.hie) {
                throw kg(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.gff[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw kg(strArr);
                }
            }
        }

        private IOException kg(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File fxn(int i) {
            return new File(fxn.this.hm, this.kg + "." + i);
        }

        public File kg(int i) {
            return new File(fxn.this.hm, this.kg + "." + i + DefaultDiskStorage.FileType.TEMP);
        }
    }
}
