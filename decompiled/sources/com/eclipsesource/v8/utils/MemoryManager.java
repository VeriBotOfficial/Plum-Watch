package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.ReferenceHandler;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Value;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class MemoryManager {
    private MemoryManagerReferenceHandler memoryManagerReferenceHandler;
    private V8 v8;
    private ArrayList<V8Value> references = new ArrayList<>();
    private boolean releasing = false;
    private boolean released = false;

    public MemoryManager(V8 v8) {
        this.v8 = v8;
        MemoryManagerReferenceHandler memoryManagerReferenceHandler = new MemoryManagerReferenceHandler();
        this.memoryManagerReferenceHandler = memoryManagerReferenceHandler;
        v8.addReferenceHandler(memoryManagerReferenceHandler);
    }

    public int getObjectReferenceCount() {
        checkReleased();
        return this.references.size();
    }

    public void persist(V8Value v8Value) {
        this.v8.getLocker().checkThread();
        checkReleased();
        this.references.remove(v8Value);
    }

    public boolean isReleased() {
        return this.released;
    }

    public void release() {
        this.v8.getLocker().checkThread();
        if (this.released) {
            return;
        }
        this.releasing = true;
        try {
            Iterator<V8Value> it = this.references.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.v8.removeReferenceHandler(this.memoryManagerReferenceHandler);
            this.references.clear();
            this.releasing = false;
            this.released = true;
        } catch (Throwable th) {
            this.releasing = false;
            throw th;
        }
    }

    private void checkReleased() {
        if (this.released) {
            throw new IllegalStateException("Memory manager released");
        }
    }

    private class MemoryManagerReferenceHandler implements ReferenceHandler {
        private MemoryManagerReferenceHandler() {
        }

        @Override // com.eclipsesource.v8.ReferenceHandler
        public void v8HandleCreated(V8Value v8Value) {
            MemoryManager.this.references.add(v8Value);
        }

        @Override // com.eclipsesource.v8.ReferenceHandler
        public void v8HandleDisposed(V8Value v8Value) {
            if (MemoryManager.this.releasing) {
                return;
            }
            Iterator it = MemoryManager.this.references.iterator();
            while (it.hasNext()) {
                if (it.next() == v8Value) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
