package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class x31<K, V> extends m<K, V> {
    private static final long serialVersionUID = 0;
    transient t32<? extends List<V>> g;

    x31(Map<K, Collection<V>> map, t32<? extends List<V>> t32Var) {
        super(map);
        this.g = (t32) vj1.a(t32Var);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(c());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.g = (t32) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }
}
