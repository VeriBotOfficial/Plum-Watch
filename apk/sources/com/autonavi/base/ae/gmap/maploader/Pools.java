package com.autonavi.base.ae.gmap.maploader;

/* JADX INFO: loaded from: classes16.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        void destory();

        boolean release(T t);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int r2) {
            if (r2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[r2];
        }

        private boolean isInPool(T t) {
            for (int r1 = 0; r1 < this.mPoolSize; r1++) {
                if (this.mPool[r1] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.autonavi.base.ae.gmap.maploader.Pools.Pool
        public T acquire() {
            int r0 = this.mPoolSize;
            if (r0 <= 0) {
                return null;
            }
            int r1 = r0 - 1;
            Object[] objArr = this.mPool;
            T t = (T) objArr[r1];
            objArr[r1] = null;
            this.mPoolSize = r1;
            return t;
        }

        @Override // com.autonavi.base.ae.gmap.maploader.Pools.Pool
        public void destory() {
            int r0 = 0;
            while (true) {
                Object[] objArr = this.mPool;
                if (r0 >= objArr.length) {
                    return;
                }
                objArr[r0] = null;
                r0++;
            }
        }

        @Override // com.autonavi.base.ae.gmap.maploader.Pools.Pool
        public boolean release(T t) {
            if (isInPool(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int r0 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (r0 >= objArr.length) {
                return false;
            }
            objArr[r0] = t;
            this.mPoolSize = r0 + 1;
            return true;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock;

        public SynchronizedPool(int r1) {
            super(r1);
            this.mLock = new Object();
        }

        @Override // com.autonavi.base.ae.gmap.maploader.Pools.SimplePool, com.autonavi.base.ae.gmap.maploader.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // com.autonavi.base.ae.gmap.maploader.Pools.SimplePool, com.autonavi.base.ae.gmap.maploader.Pools.Pool
        public boolean release(T t) {
            boolean zRelease;
            synchronized (this.mLock) {
                zRelease = super.release(t);
            }
            return zRelease;
        }
    }

    private Pools() {
    }
}
