package io.livekit.android.memory;

import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloseableManager.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0001J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/livekit/android/memory/CloseableManager;", "Ljava/io/Closeable;", "()V", "isClosed", "", "resources", "", "", "close", "", "registerClosable", "closable", "registerResource", "key", "closer", "unregisterResource", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseableManager implements Closeable {
    private boolean isClosed;
    private final Map<Object, Closeable> resources = new LinkedHashMap();

    public final synchronized void registerResource(Object key, Closeable closer) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (this.isClosed) {
            closer.close();
        } else {
            this.resources.put(key, closer);
        }
    }

    public final synchronized void registerClosable(Closeable closable) {
        Intrinsics.checkNotNullParameter(closable, "closable");
        if (this.isClosed) {
            closable.close();
        } else {
            this.resources.put(closable, closable);
        }
    }

    public final synchronized Closeable unregisterResource(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.resources.remove(key);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.isClosed = true;
        Iterator<T> it = this.resources.values().iterator();
        while (it.hasNext()) {
            ((Closeable) it.next()).close();
        }
        this.resources.clear();
    }
}
