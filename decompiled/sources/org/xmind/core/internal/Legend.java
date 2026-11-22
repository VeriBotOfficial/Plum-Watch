package org.xmind.core.internal;

import java.util.Collections;
import java.util.Set;
import org.xmind.core.ILegend;
import org.xmind.core.util.Point;

/* loaded from: classes7.dex */
public abstract class Legend extends AbstractWorkbookComponent implements ILegend {
    protected static final Set<String> NO_MARKER_IDS = Collections.emptySet();

    protected abstract void removePosition();

    @Override // org.xmind.core.IPositioned
    public void setPosition(Point point) {
        if (point == null) {
            removePosition();
        } else {
            setPosition(point.x, point.y);
        }
    }

    @Override // org.xmind.core.IPositioned
    public boolean hasPosition() {
        return getPosition() != null;
    }
}
