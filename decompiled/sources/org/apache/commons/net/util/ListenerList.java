package org.apache.commons.net.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class ListenerList implements Serializable, Iterable<EventListener> {
    private static final long serialVersionUID = -1934227607974228213L;
    private final CopyOnWriteArrayList<EventListener> listeners = new CopyOnWriteArrayList<>();

    public void addListener(EventListener eventListener) {
        this.listeners.add(eventListener);
    }

    public int getListenerCount() {
        return this.listeners.size();
    }

    @Override // java.lang.Iterable
    public Iterator<EventListener> iterator() {
        return this.listeners.iterator();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    public void removeListener(EventListener eventListener) {
        this.listeners.remove(eventListener);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
