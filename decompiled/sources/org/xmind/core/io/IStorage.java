package org.xmind.core.io;

/* loaded from: classes7.dex */
public interface IStorage {
    void clear();

    String getFullPath();

    IInputSource getInputSource();

    String getName();

    IOutputTarget getOutputTarget();
}
