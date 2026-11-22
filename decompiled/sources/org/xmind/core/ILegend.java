package org.xmind.core;

import java.util.Set;

/* loaded from: classes7.dex */
public interface ILegend extends IAdaptable, ISheetComponent, IPositioned {
    String getMarkerDescription(String str);

    Set<String> getMarkerIds();

    boolean isEmpty();

    boolean isVisible();

    void setMarkerDescription(String str, String str2);

    void setVisible(boolean z);
}
