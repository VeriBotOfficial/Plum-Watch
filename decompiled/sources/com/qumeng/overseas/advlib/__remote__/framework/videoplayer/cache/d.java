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

/* loaded from: classes17.dex */
final class d {
    private static final String h = "aey_qm_video_cache";
    private static final String i = ".cache";
    private static final String j = ".tmp";
    private static final String k = ".meta";
    private static final long l = 52428800;
    private static volatile d m;

    /* renamed from: a, reason: collision with root package name */
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
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(32);
            for (byte b2 : digest) {
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
        ReentrantLock putIfAbsent;
        String h2 = h(str);
        ReentrantLock reentrantLock = this.c.get(h2);
        return (reentrantLock != null || (putIfAbsent = this.c.putIfAbsent(h2, (reentrantLock = new ReentrantLock()))) == null) ? reentrantLock : putIfAbsent;
    }

    File e(String str) {
        return new File(this.f13012a, h(str) + ".tmp");
    }

    long f(String str) {
        try {
            File e = e(str);
            if (e.exists()) {
                return e.length();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    boolean g(String str) {
        try {
            File b2 = b(str);
            if (b2.exists()) {
                if (b2.length() > 0) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    void i(String str) {
        try {
            File b2 = b(str);
            if (b2.exists()) {
                b2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    private void e() {
        long j2;
        try {
            File[] d = d();
            if (d != null) {
                j2 = 0;
                for (File file : d) {
                    j2 += file.length();
                }
            } else {
                j2 = 0;
            }
            this.f.set(j2);
        } catch (Throwable unused) {
            this.f.set(0L);
        }
    }

    void b(String str, String str2) {
        FileWriter fileWriter;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        String h2 = h(str);
        this.g.put(h2, str2);
        try {
            try {
                fileWriter = new FileWriter(new File(this.f13012a, h2 + k));
            } catch (Throwable unused) {
                fileWriter = null;
            }
            try {
                fileWriter.write(str2);
                fileWriter.close();
            } catch (Throwable unused2) {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
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
        String h2 = h(str);
        String str2 = this.g.get(h2);
        if (str2 != null) {
            return str2;
        }
        BufferedReader bufferedReader = null;
        try {
            File file = new File(this.f13012a, h2 + k);
            if (file.exists()) {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file), 64);
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null && !readLine.isEmpty()) {
                        this.g.put(h2, readLine);
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused) {
                        }
                        return readLine;
                    }
                    bufferedReader = bufferedReader2;
                } catch (Throwable unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return "video/mp4";
                    }
                    bufferedReader.close();
                    return "video/mp4";
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
            File e = e(str);
            File b2 = b(str);
            if (e.exists() && e.length() != 0) {
                if (b2.exists()) {
                    long length = b2.length();
                    b2.delete();
                    this.f.addAndGet(-length);
                }
                boolean renameTo = e.renameTo(b2);
                if (renameTo) {
                    b(str, str2);
                    return renameTo;
                }
                long length2 = e.length();
                e.delete();
                this.f.addAndGet(-length2);
                return renameTo;
            }
            long length3 = e.length();
            e.delete();
            if (length3 > 0) {
                this.f.addAndGet(-length3);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    void b() {
        String substring;
        ReentrantLock reentrantLock;
        if (this.f.get() > this.b && this.d.tryLock()) {
            if (this.f.get() <= this.b) {
                this.d.unlock();
                return;
            }
            File[] d = d();
            if (d != null && d.length != 0) {
                Arrays.sort(d, new a());
                for (File file : d) {
                    if (this.f.get() <= this.b) {
                        break;
                    }
                    String name = file.getName();
                    int lastIndexOf = name.lastIndexOf(46);
                    if (lastIndexOf > 0 && ((reentrantLock = this.c.get((substring = name.substring(0, lastIndexOf)))) == null || !reentrantLock.isLocked())) {
                        long length = file.length();
                        if (file.delete()) {
                            this.f.addAndGet(-length);
                            this.c.remove(substring);
                            if (name.endsWith(i)) {
                                this.g.remove(substring);
                                new File(this.f13012a, substring + k).delete();
                            }
                        }
                    }
                }
                this.d.unlock();
                return;
            }
            this.d.unlock();
        }
    }

    void a(String str) {
        try {
            File e = e(str);
            if (e.exists()) {
                long length = e.length();
                if (e.delete()) {
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
            File[] listFiles = this.f13012a.listFiles(new b());
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                if (!new File(this.f13012a, file.getName().substring(0, r5.length() - 5) + i).exists()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
