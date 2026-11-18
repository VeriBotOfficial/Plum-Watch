package com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    private static final String h = "aey_qm_video_cache";
    private static final String i = ".cache";
    private static final String j = ".tmp";
    private static final String k = ".meta";
    private static final long l = 52428800;
    private static volatile d m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f13012a;
    private long b = l;
    private final ConcurrentHashMap<String, ReentrantLock> c = new ConcurrentHashMap<>();
    private final ReentrantLock d = new ReentrantLock();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicLong f = new AtomicLong(0);
    private final ConcurrentHashMap<String, String> g = new ConcurrentHashMap<>();

    class a implements Comparator<File> {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return Long.compare(file.lastModified(), file2.lastModified());
        }
    }

    class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(d.k);
        }
    }

    class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(d.i) || str.endsWith(".tmp");
        }
    }

    private d() {
    }

    static d c() {
        if (m == null) {
            synchronized (d.class) {
                if (m == null) {
                    m = new d();
                }
            }
        }
        return m;
    }

    static String h(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(32);
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Integer.valueOf(b2 & 255)));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "vc_" + Integer.toHexString(str.hashCode());
        }
    }

    void a(Context context) {
        if (this.e.getAndSet(true)) {
            return;
        }
        try {
            File file = new File(context.getCacheDir(), h);
            this.f13012a = file;
            if (!file.exists()) {
                this.f13012a.mkdirs();
            }
            e();
            a();
            b();
        } catch (Throwable unused) {
        }
    }

    File b(String str) {
        return new File(this.f13012a, h(str) + i);
    }

    ReentrantLock d(String str) {
        String strH = h(str);
        ReentrantLock reentrantLock = this.c.get(strH);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        ReentrantLock reentrantLockPutIfAbsent = this.c.putIfAbsent(strH, reentrantLock2);
        return reentrantLockPutIfAbsent != null ? reentrantLockPutIfAbsent : reentrantLock2;
    }

    File e(String str) {
        return new File(this.f13012a, h(str) + ".tmp");
    }

    long f(String str) {
        try {
            File fileE = e(str);
            if (fileE.exists()) {
                return fileE.length();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    boolean g(String str) {
        try {
            File fileB = b(str);
            return fileB.exists() && fileB.length() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    void i(String str) {
        try {
            File fileB = b(str);
            if (fileB.exists()) {
                fileB.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    private void e() {
        long length;
        try {
            File[] fileArrD = d();
            if (fileArrD != null) {
                length = 0;
                for (File file : fileArrD) {
                    length += file.length();
                }
            } else {
                length = 0;
            }
            this.f.set(length);
        } catch (Throwable unused) {
            this.f.set(0L);
        }
    }

    void b(String str, String str2) {
        FileWriter fileWriter;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        String strH = h(str);
        this.g.put(strH, str2);
        try {
            fileWriter = new FileWriter(new File(this.f13012a, strH + k));
            try {
                fileWriter.write(str2);
            } catch (Throwable unused) {
                if (fileWriter == null) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            fileWriter = null;
        }
        try {
            fileWriter.close();
        } catch (Throwable unused3) {
        }
    }

    private File[] d() {
        try {
            return this.f13012a.listFiles(new c());
        } catch (Throwable unused) {
            return null;
        }
    }

    String c(String str) {
        String strH = h(str);
        String str2 = this.g.get(strH);
        if (str2 != null) {
            return str2;
        }
        BufferedReader bufferedReader = null;
        try {
            File file = new File(this.f13012a, strH + k);
            if (file.exists()) {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file), 64);
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null && !line.isEmpty()) {
                        this.g.put(strH, line);
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused) {
                        }
                        return line;
                    }
                    bufferedReader = bufferedReader2;
                } catch (Throwable unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return "video/mp4";
                    }
                }
            }
            if (bufferedReader == null) {
                return "video/mp4";
            }
        } catch (Throwable unused3) {
        }
        try {
            bufferedReader.close();
            return "video/mp4";
        } catch (Throwable unused4) {
            return "video/mp4";
        }
    }

    boolean a(String str, String str2) {
        try {
            File fileE = e(str);
            File fileB = b(str);
            if (fileE.exists() && fileE.length() != 0) {
                if (fileB.exists()) {
                    long length = fileB.length();
                    fileB.delete();
                    this.f.addAndGet(-length);
                }
                boolean zRenameTo = fileE.renameTo(fileB);
                if (zRenameTo) {
                    b(str, str2);
                } else {
                    long length2 = fileE.length();
                    fileE.delete();
                    this.f.addAndGet(-length2);
                }
                return zRenameTo;
            }
            long length3 = fileE.length();
            fileE.delete();
            if (length3 > 0) {
                this.f.addAndGet(-length3);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    void b() {
        String strSubstring;
        ReentrantLock reentrantLock;
        if (this.f.get() > this.b && this.d.tryLock()) {
            try {
                if (this.f.get() <= this.b) {
                    this.d.unlock();
                    return;
                }
                File[] fileArrD = d();
                if (fileArrD != null && fileArrD.length != 0) {
                    Arrays.sort(fileArrD, new a());
                    for (File file : fileArrD) {
                        if (this.f.get() <= this.b) {
                            break;
                        }
                        String name = file.getName();
                        int r6 = name.lastIndexOf(46);
                        if (r6 > 0 && ((reentrantLock = this.c.get((strSubstring = name.substring(0, r6)))) == null || !reentrantLock.isLocked())) {
                            long length = file.length();
                            if (file.delete()) {
                                this.f.addAndGet(-length);
                                this.c.remove(strSubstring);
                                if (name.endsWith(i)) {
                                    this.g.remove(strSubstring);
                                    new File(this.f13012a, strSubstring + k).delete();
                                }
                            }
                        }
                    }
                }
                this.d.unlock();
                return;
            } catch (Throwable unused) {
            }
            this.d.unlock();
        }
    }

    void a(String str) {
        try {
            File fileE = e(str);
            if (fileE.exists()) {
                long length = fileE.length();
                if (fileE.delete()) {
                    this.f.addAndGet(-length);
                }
            }
        } catch (Throwable unused) {
        }
    }

    void a(long j2) {
        if (j2 > 0) {
            this.f.addAndGet(j2);
        }
    }

    private void a() {
        try {
            File[] fileArrListFiles = this.f13012a.listFiles(new b());
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (!new File(this.f13012a, name.substring(0, name.length() - 5) + i).exists()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
