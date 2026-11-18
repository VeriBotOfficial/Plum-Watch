package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f9214a = new HashMap();
    private final int b;
    private final String c;

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int r0) throws Exception;

    private static native void nLockFileSegment(int r0, int r1) throws Exception;

    private static native void nRelease(int r0) throws Exception;

    private static native boolean nTryLock(int r0) throws Exception;

    private static native void nUnlockFile(int r0) throws Exception;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int r2) {
        this.c = str;
        this.b = r2;
    }

    public static FileLock a(String str) {
        try {
            int r0 = d(str);
            nLockFile(r0);
            return new FileLock(str, r0);
        } catch (Exception e) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e.getMessage());
        }
    }

    public static FileLock b(String str) {
        try {
            int r0 = d(str);
            if (nTryLock(r0)) {
                return new FileLock(str, r0);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int r0 = d(str);
            if (!nTryLock(r0)) {
                new FileLock(str, r0).b();
                return null;
            }
            return new FileLock(str, r0);
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    public static FileLock a(String str, int r4) {
        try {
            int r0 = d(str);
            nLockFileSegment(r0, r4);
            return new FileLock(str, r0);
        } catch (Exception e) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f9214a;
        synchronized (map) {
            numValueOf = map.get(str);
            if (numValueOf == null) {
                new File(str).getParentFile().mkdirs();
                numValueOf = Integer.valueOf(nGetFD(str));
                map.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    public final void a() {
        try {
            nUnlockFile(this.b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.c);
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f9214a;
        synchronized (map) {
            numRemove = map.remove(this.c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e) {
            throw new RuntimeException("release lock failed, file:" + this.c + " caused by:" + e.getMessage());
        }
    }
}
