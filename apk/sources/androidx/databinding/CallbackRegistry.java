package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c, T t, int r3, A a2);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    public synchronized void notifyCallbacks(T t, int r5, A a2) {
        this.mNotificationLevel++;
        notifyRecurse(t, r5, a2);
        int r4 = this.mNotificationLevel - 1;
        this.mNotificationLevel = r4;
        if (r4 == 0) {
            long[] jArr = this.mRemainderRemoved;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.mRemainderRemoved[length];
                    if (j != 0) {
                        removeRemovedCallbacks((length + 1) * 64, j);
                        this.mRemainderRemoved[length] = 0;
                    }
                }
            }
            long j2 = this.mFirst64Removed;
            if (j2 != 0) {
                removeRemovedCallbacks(0, j2);
                this.mFirst64Removed = 0L;
            }
        }
    }

    private void notifyFirst64(T t, int r12, A a2) {
        notifyCallbacks(t, r12, a2, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T t, int r11, A a2) {
        int size = this.mCallbacks.size();
        long[] jArr = this.mRemainderRemoved;
        int length = jArr == null ? -1 : jArr.length - 1;
        notifyRemainder(t, r11, a2, length);
        notifyCallbacks(t, r11, a2, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t, int r11, A a2, int r13) {
        if (r13 < 0) {
            notifyFirst64(t, r11, a2);
            return;
        }
        long j = this.mRemainderRemoved[r13];
        int r5 = (r13 + 1) * 64;
        int r6 = Math.min(this.mCallbacks.size(), r5 + 64);
        notifyRemainder(t, r11, a2, r13 - 1);
        notifyCallbacks(t, r11, a2, r5, r6, j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void notifyCallbacks(T t, int r8, A a2, int r10, int r11, long j) {
        long j2 = 1;
        while (r10 < r11) {
            if ((j & j2) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(r10), t, r8, a2);
            }
            j2 <<= 1;
            r10++;
        }
    }

    public synchronized void add(C c) {
        try {
            if (c == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int r0 = this.mCallbacks.lastIndexOf(c);
            if (r0 < 0 || isRemoved(r0)) {
                this.mCallbacks.add(c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean isRemoved(int r11) {
        int r8;
        if (r11 < 64) {
            return ((1 << r11) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (r8 = (r11 / 64) - 1) < jArr.length) {
            return ((1 << (r11 % 64)) & jArr[r8]) != 0;
        }
        return false;
    }

    private void removeRemovedCallbacks(int r8, long j) {
        long j2 = Long.MIN_VALUE;
        for (int r0 = r8 + 63; r0 >= r8; r0--) {
            if ((j & j2) != 0) {
                this.mCallbacks.remove(r0);
            }
            j2 >>>= 1;
        }
    }

    public synchronized void remove(C c) {
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.remove(c);
        } else {
            int r2 = this.mCallbacks.lastIndexOf(c);
            if (r2 >= 0) {
                setRemovalBit(r2);
            }
        }
    }

    private void setRemovalBit(int r9) {
        if (r9 < 64) {
            this.mFirst64Removed = (1 << r9) | this.mFirst64Removed;
            return;
        }
        int r3 = (r9 / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= r3) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j = 1 << (r9 % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[r3] = j | jArr4[r3];
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int r2 = 0; r2 < size; r2++) {
            if (!isRemoved(r2)) {
                arrayList.add(this.mCallbacks.get(r2));
            }
        }
        return arrayList;
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.mCallbacks.size();
        for (int r1 = 0; r1 < size; r1++) {
            if (!isRemoved(r1)) {
                list.add(this.mCallbacks.get(r1));
            }
        }
    }

    public synchronized boolean isEmpty() {
        if (this.mCallbacks.isEmpty()) {
            return true;
        }
        if (this.mNotificationLevel == 0) {
            return false;
        }
        int size = this.mCallbacks.size();
        for (int r3 = 0; r3 < size; r3++) {
            if (!isRemoved(r3)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void clear() {
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.clear();
        } else if (!this.mCallbacks.isEmpty()) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                setRemovalBit(size);
            }
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m6370clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
            try {
                callbackRegistry.mFirst64Removed = 0L;
                callbackRegistry.mRemainderRemoved = null;
                callbackRegistry.mNotificationLevel = 0;
                callbackRegistry.mCallbacks = new ArrayList();
                int size = this.mCallbacks.size();
                for (int r0 = 0; r0 < size; r0++) {
                    if (!isRemoved(r0)) {
                        callbackRegistry.mCallbacks.add(this.mCallbacks.get(r0));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (CloneNotSupportedException e3) {
            callbackRegistry = null;
            e = e3;
        }
        return callbackRegistry;
    }
}
