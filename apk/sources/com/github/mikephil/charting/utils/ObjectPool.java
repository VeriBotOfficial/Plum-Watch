package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ObjectPool<T extends Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int currentOwnerId = NO_OWNER;

        protected abstract Poolable instantiate();
    }

    public int getPoolId() {
        return this.poolId;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] com.github.mikephil.charting.utils.ObjectPool.class) */
    public static synchronized ObjectPool create(int r2, Poolable poolable) {
        ObjectPool objectPool;
        synchronized (ObjectPool.class) {
            objectPool = new ObjectPool(r2, poolable);
            int r3 = ids;
            objectPool.poolId = r3;
            ids = r3 + 1;
        }
        return objectPool;
    }

    private ObjectPool(int r1, T t) {
        if (r1 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.desiredCapacity = r1;
        this.objects = new Object[r1];
        this.objectsPointer = 0;
        this.modelObject = t;
        this.replenishPercentage = 1.0f;
        refillPool();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
  0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setReplenishPercentage(float f) {
        float f2 = 1.0f;
        if (f > 1.0f) {
            f = f2;
        } else {
            f2 = 0.0f;
            if (f < 0.0f) {
                f = f2;
            }
        }
        this.replenishPercentage = f;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    private void refillPool(float f) {
        int r0 = this.desiredCapacity;
        int r5 = (int) (r0 * f);
        if (r5 < 1) {
            r0 = 1;
        } else if (r5 <= r0) {
            r0 = r5;
        }
        for (int r6 = 0; r6 < r0; r6++) {
            this.objects[r6] = this.modelObject.instantiate();
        }
        this.objectsPointer = r0 - 1;
    }

    public synchronized T get() {
        T t;
        if (this.objectsPointer == -1 && this.replenishPercentage > 0.0f) {
            refillPool();
        }
        t = (T) this.objects[this.objectsPointer];
        t.currentOwnerId = Poolable.NO_OWNER;
        this.objectsPointer--;
        return t;
    }

    public synchronized void recycle(T t) {
        if (t.currentOwnerId != Poolable.NO_OWNER) {
            if (t.currentOwnerId == this.poolId) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
        }
        int r0 = this.objectsPointer + 1;
        this.objectsPointer = r0;
        if (r0 >= this.objects.length) {
            resizePool();
        }
        t.currentOwnerId = this.poolId;
        this.objects[this.objectsPointer] = t;
    }

    public synchronized void recycle(List<T> list) {
        while (list.size() + this.objectsPointer + 1 > this.desiredCapacity) {
            resizePool();
        }
        int size = list.size();
        for (int r1 = 0; r1 < size; r1++) {
            T t = list.get(r1);
            if (t.currentOwnerId != Poolable.NO_OWNER) {
                if (t.currentOwnerId == this.poolId) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            t.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer + 1 + r1] = t;
        }
        this.objectsPointer += size;
    }

    private void resizePool() {
        int r0 = this.desiredCapacity;
        int r1 = r0 * 2;
        this.desiredCapacity = r1;
        Object[] objArr = new Object[r1];
        for (int r2 = 0; r2 < r0; r2++) {
            objArr[r2] = this.objects[r2];
        }
        this.objects = objArr;
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }
}
