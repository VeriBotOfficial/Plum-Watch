package org.xmind.core;

import org.xmind.core.util.Point;

/* loaded from: classes7.dex */
public interface IPositioned {
    Point getPosition();

    boolean hasPosition();

    void setPosition(int i, int i2);

    void setPosition(Point point);
}
