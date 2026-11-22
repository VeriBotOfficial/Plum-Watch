package org.videolan.libvlc.interfaces;

import org.videolan.libvlc.interfaces.AbstractVLCEvent;

/* loaded from: classes7.dex */
public interface IVLCObject<T extends AbstractVLCEvent> {
    ILibVLC getLibVLC();

    boolean isReleased();

    void release();

    boolean retain();
}
