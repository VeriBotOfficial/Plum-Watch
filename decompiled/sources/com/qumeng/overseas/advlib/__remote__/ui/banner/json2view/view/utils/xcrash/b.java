package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.qumeng.overseas.advlib.__remote__.utils.j;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class b {
    private static final b j = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f13066a = ReactTextInputShadowNode.PROP_PLACEHOLDER;
    private final String b = ".clean.xcrash";
    private final String c = ".dirty.xcrash";
    private String d = null;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private AtomicInteger i = new AtomicInteger();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a();
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$b, reason: collision with other inner class name */
    class C0827b implements FilenameFilter {
        C0827b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
        }
    }

    class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
        }
    }

    class d implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13070a;

        d(String str) {
            this.f13070a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("tombstone_") && str.endsWith(this.f13070a);
        }
    }

    class e implements Comparator<File> {
        e() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    class f implements FilenameFilter {
        f() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
        }
    }

    class g implements FilenameFilter {
        g() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("placeholder_") && str.endsWith(".dirty.xcrash");
        }
    }

    class h implements FilenameFilter {
        h() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
        }
    }

    class i implements FilenameFilter {
        i() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("placeholder_") && str.endsWith(".dirty.xcrash");
        }
    }

    private b() {
    }

    public static b b() {
        return j;
    }

    private void c(File file) {
        a(file, ".java.xcrash", this.e);
    }

    public void d() {
        int i2;
        if (this.d == null || (i2 = this.h) < 0) {
            return;
        }
        try {
            if (i2 == 0) {
                a();
            } else {
                j.b().postDelayed(new a(), this.h);
            }
        } catch (Exception e2) {
            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager maintain start failed", new Object[0]);
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[EDGE_INSN: B:16:0x0080->B:17:0x0080 BREAK  A[LOOP:0: B:6:0x0021->B:35:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:6:0x0021->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.io.File r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$f r2 = new com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$f
            r2.<init>()
            java.io.File[] r2 = r1.listFiles(r2)
            if (r2 != 0) goto L11
            goto Lb8
        L11:
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$g r3 = new com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$g
            r3.<init>()
            java.io.File[] r3 = r1.listFiles(r3)
            if (r3 != 0) goto L1e
            goto Lb8
        L1e:
            int r4 = r2.length
            int r5 = r3.length
            r7 = 0
        L21:
            int r8 = r0.f
            if (r4 >= r8) goto L7e
            if (r5 <= 0) goto L38
            int r8 = r5 + (-1)
            r8 = r3[r8]
            boolean r8 = r0.a(r8)
            if (r8 == 0) goto L33
            int r4 = r4 + 1
        L33:
            int r5 = r5 + (-1)
        L35:
            r17 = r7
            goto L75
        L38:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Exception -> L35
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Exception -> L35
            java.lang.String r10 = "%s/%s_%020d%s"
            java.lang.String r11 = r0.d     // Catch: java.lang.Exception -> L35
            java.lang.String r12 = "placeholder"
            java.util.Date r13 = new java.util.Date     // Catch: java.lang.Exception -> L35
            r13.<init>()     // Catch: java.lang.Exception -> L35
            long r13 = r13.getTime()     // Catch: java.lang.Exception -> L35
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            int r15 = r0.c()     // Catch: java.lang.Exception -> L35
            r17 = r7
            long r6 = (long) r15
            long r13 = r13 + r6
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Exception -> L75
            java.lang.String r7 = ".dirty.xcrash"
            java.lang.Object[] r6 = new java.lang.Object[]{r11, r12, r6, r7}     // Catch: java.lang.Exception -> L75
            java.lang.String r6 = java.lang.String.format(r9, r10, r6)     // Catch: java.lang.Exception -> L75
            r8.<init>(r6)     // Catch: java.lang.Exception -> L75
            boolean r6 = r8.createNewFile()     // Catch: java.lang.Exception -> L75
            if (r6 == 0) goto L75
            boolean r6 = r0.a(r8)     // Catch: java.lang.Exception -> L75
            if (r6 == 0) goto L75
            int r4 = r4 + 1
        L75:
            int r7 = r17 + 1
            int r6 = r0.f
            int r6 = r6 * 2
            if (r7 <= r6) goto L21
            goto L80
        L7e:
            r17 = r7
        L80:
            if (r7 <= 0) goto L94
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$h r2 = new com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$h
            r2.<init>()
            java.io.File[] r2 = r1.listFiles(r2)
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$i r3 = new com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b$i
            r3.<init>()
            java.io.File[] r3 = r1.listFiles(r3)
        L94:
            if (r2 == 0) goto Laa
            int r1 = r2.length
            int r4 = r0.f
            if (r1 <= r4) goto Laa
            r1 = 0
        L9c:
            int r4 = r2.length
            int r5 = r0.f
            int r4 = r4 - r5
            if (r1 >= r4) goto Laa
            r4 = r2[r1]
            r4.delete()
            int r1 = r1 + 1
            goto L9c
        Laa:
            if (r3 == 0) goto Lb8
            int r1 = r3.length
            r6 = 0
        Lae:
            if (r6 >= r1) goto Lb8
            r2 = r3[r6]
            r2.delete()
            int r6 = r6 + 1
            goto Lae
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b(java.io.File):void");
    }

    private int c() {
        int incrementAndGet = this.i.incrementAndGet();
        if (incrementAndGet >= 999) {
            this.i.set(0);
        }
        return incrementAndGet;
    }

    void a(String str, int i2, int i3, int i4, int i5) {
        File[] listFiles;
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        if (name.startsWith("tombstone_")) {
                            if (name.endsWith(".java.xcrash")) {
                                i6++;
                            }
                        } else if (name.startsWith("placeholder_")) {
                            if (name.endsWith(".clean.xcrash")) {
                                i7++;
                            } else if (name.endsWith(".dirty.xcrash")) {
                                i8++;
                            }
                        }
                    }
                }
                int i9 = this.e;
                if (i6 <= i9 && i7 == this.f && i8 == 0) {
                    this.h = -1;
                    return;
                }
                if (i6 <= i9 + 10) {
                    int i10 = this.f;
                    if (i7 <= i10 + 10 && i8 <= 10) {
                        if (i6 > i9 || i7 > i10 || i8 > 0) {
                            this.h = 0;
                            return;
                        }
                        return;
                    }
                }
                a();
                this.h = -1;
            }
        } catch (Exception e2) {
            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager init failed", new Object[0]);
            e2.printStackTrace();
        }
    }

    boolean d(File file) {
        if (file == null) {
            return false;
        }
        if (this.d != null && this.f > 0) {
            try {
                File[] listFiles = new File(this.d).listFiles(new c());
                if (listFiles != null && listFiles.length >= this.f) {
                    try {
                        return file.delete();
                    } catch (Exception unused) {
                        return false;
                    }
                }
                File file2 = new File(String.format(Locale.US, "%s/%s_%020d%s", this.d, ReactTextInputShadowNode.PROP_PLACEHOLDER, Long.valueOf((new Date().getTime() * 1000) + c()), ".dirty.xcrash"));
                if (!file.renameTo(file2)) {
                    try {
                        return file.delete();
                    } catch (Exception unused2) {
                        return false;
                    }
                }
                return a(file2);
            } catch (Exception e2) {
                n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager recycleLogFile failed", new Object[0]);
                e2.printStackTrace();
                try {
                    return file.delete();
                } catch (Exception unused3) {
                    return false;
                }
            }
        }
        try {
            return file.delete();
        } catch (Exception unused4) {
            return false;
        }
    }

    File a(String str) {
        String str2 = this.d;
        if (str2 == null || !com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.a(str2)) {
            return null;
        }
        File file = new File(str);
        File[] listFiles = new File(this.d).listFiles(new C0827b());
        try {
            if (listFiles != null) {
                int length = listFiles.length;
                while (true) {
                    if (length > 0) {
                        File file2 = listFiles[length - 1];
                        try {
                        } catch (Exception e2) {
                            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager createLogFile by renameTo failed", new Object[0]);
                            e2.printStackTrace();
                        }
                        if (file2.renameTo(file)) {
                            break;
                        }
                        file2.delete();
                        length--;
                    }
                }
                return file;
            }
            if (!file.createNewFile()) {
                n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager createLogFile by createNewFile failed, file already exists", new Object[0]);
                return null;
            }
            return file;
        } catch (Exception unused) {
            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager createLogFile by createNewFile failed", new Object[0]);
            return null;
        }
    }

    boolean a(String str, String str2) {
        Exception exc;
        Throwable th;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "rws");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            exc = e2;
        }
        try {
            long j2 = 0;
            if (randomAccessFile.length() > 0) {
                MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                long length = randomAccessFile.length();
                while (length > 0 && map.get(((int) length) - 1) == 0) {
                    length--;
                }
                j2 = length;
            }
            randomAccessFile.seek(j2);
            randomAccessFile.write(str2.getBytes("UTF-8"));
            try {
                randomAccessFile.close();
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e3) {
            exc = e3;
            randomAccessFile2 = randomAccessFile;
            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager appendText failed", new Object[0]);
            exc.printStackTrace();
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception unused2) {
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    throw th;
                } catch (Exception unused3) {
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.a(this.d)) {
            File file = new File(this.d);
            try {
                c(file);
            } catch (Exception e2) {
                n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager doMaintainTombstone failed", new Object[0]);
                e2.printStackTrace();
            }
            try {
                b(file);
            } catch (Exception e3) {
                n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "FileManager doMaintainPlaceholder failed", new Object[0]);
                e3.printStackTrace();
            }
        }
    }

    private boolean a(File file, String str, int i2) {
        File[] listFiles = file.listFiles(new d(str));
        boolean z = true;
        if (listFiles != null && listFiles.length > i2) {
            if (i2 > 0) {
                Arrays.sort(listFiles, new e());
            }
            for (int i3 = 0; i3 < listFiles.length - i2; i3++) {
                if (!d(listFiles[i3])) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[Catch: Exception -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x00aa, blocks: (B:30:0x00a7, B:54:0x0086), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.File r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1024(0x400, float:1.435E-42)
            r2 = 0
            r3 = 0
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.util.Arrays.fill(r4, r3)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            int r5 = r1.g     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            long r7 = r17.length()     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            int r9 = r1.g     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            int r9 = r9 * r0
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r9 = 0
            r11 = 1024(0x400, double:5.06E-321)
            if (r0 <= 0) goto L29
            long r5 = r7 / r11
            long r13 = r7 % r11
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L29
            r13 = 1
            long r5 = r5 + r13
        L29:
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.io.File r0 = r17.getAbsoluteFile()     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            r13.<init>(r0, r3)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            r0 = r3
        L33:
            long r14 = (long) r0
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 >= 0) goto L50
            int r0 = r0 + 1
            long r14 = (long) r0
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 != 0) goto L4c
            long r14 = r7 % r11
            int r2 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r2 == 0) goto L4c
            long r14 = r7 % r11
            int r2 = (int) r14     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r13.write(r4, r3, r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            goto L33
        L4c:
            r13.write(r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            goto L33
        L50:
            r13.flush()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r2 = "%s/%s_%020d%s"
            java.lang.String r4 = r1.d     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r5 = "placeholder"
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r6.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            long r6 = r6.getTime()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            int r8 = r1.c()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            long r6 = r6 + r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r7 = ".clean.xcrash"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r0 = java.lang.String.format(r0, r2, r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r4 = r17
            boolean r3 = r4.renameTo(r2)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L8c
            r13.close()     // Catch: java.lang.Exception -> Laa
            goto Laa
        L8a:
            r0 = move-exception
            goto L91
        L8c:
            r0 = move-exception
            goto Lb1
        L8e:
            r0 = move-exception
            r4 = r17
        L91:
            r2 = r13
            goto L98
        L93:
            r0 = move-exception
            goto Lb0
        L95:
            r0 = move-exception
            r4 = r17
        L98:
            java.lang.String r5 = "xcrash"
            java.lang.String r6 = "FileManager cleanTheDirtyFile failed"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L93
            com.qumeng.overseas.advlib.__remote__.utils.n.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L93
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto Laa
            r2.close()     // Catch: java.lang.Exception -> Laa
        Laa:
            if (r3 != 0) goto Laf
            r4.delete()     // Catch: java.lang.Exception -> Laf
        Laf:
            return r3
        Lb0:
            r13 = r2
        Lb1:
            if (r13 == 0) goto Lb6
            r13.close()     // Catch: java.lang.Exception -> Lb6
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.a(java.io.File):boolean");
    }
}
