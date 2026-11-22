package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.util.MapTaskManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes13.dex */
public abstract class BmObject implements AutoCloseable {
    private static final boolean DEBUG = false;
    protected static final int LOCK_WAIT_TIME = 2000;
    private boolean isRelease;
    private String mName;
    protected final ReadWriteLock mNativeLock;
    protected final int mObjType;
    private String mTag;
    protected final long nativeInstance;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8541a;

        a(long j) {
            this.f8541a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BmFinalizerObject.a(this.f8541a);
        }
    }

    private BmObject() {
        this.mName = "";
        this.mTag = "";
        this.isRelease = false;
        this.mNativeLock = new ReentrantReadWriteLock(true);
        this.mObjType = 0;
        this.nativeInstance = 0L;
    }

    private void dispose() {
        boolean z = false;
        try {
            z = this.mNativeLock.writeLock().tryLock(2000L, TimeUnit.MILLISECONDS);
            if (z) {
                long j = this.nativeInstance;
                if (j != 0 && !this.isRelease) {
                    this.isRelease = true;
                    MapTaskManager.getSingleThreadPool().submit(new a(j));
                }
            }
            if (!z) {
                return;
            }
        } catch (InterruptedException unused) {
            if (!z) {
                return;
            }
        } catch (Throwable th) {
            if (z) {
                this.mNativeLock.writeLock().unlock();
            }
            throw th;
        }
        this.mNativeLock.writeLock().unlock();
    }

    private static native void nativeFinalizer(long j);

    private static native boolean nativeSetLayerTag(long j, String str);

    private void printDebugFinalize() {
    }

    private void printDebugNew() {
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        try {
            dispose();
        } catch (Throwable unused) {
        }
    }

    public String getName() {
        return this.mName;
    }

    public long getNativeInstance() {
        if (this.isRelease) {
            return 0L;
        }
        return this.nativeInstance;
    }

    public int getObjType() {
        return this.mObjType;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean setLayerTag(String str) {
        return nativeSetLayerTag(this.nativeInstance, str);
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public BmObject(int i, long j) {
        this.mName = "";
        this.mTag = "";
        this.isRelease = false;
        this.mNativeLock = new ReentrantReadWriteLock(true);
        this.mObjType = i;
        this.nativeInstance = j;
    }
}
