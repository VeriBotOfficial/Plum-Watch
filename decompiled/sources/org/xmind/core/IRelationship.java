package org.xmind.core;

import org.xmind.core.style.IStyled;

/* loaded from: classes7.dex */
public interface IRelationship extends IAdaptable, IIdentifiable, ITitled, ISheetComponent, IStyled, IModifiable {
    boolean checkAvailable();

    IControlPoint getControlPoint(int i);

    IRelationshipEnd getEnd1();

    String getEnd1Id();

    IRelationshipEnd getEnd2();

    String getEnd2Id();

    ISheet getParent();

    void setEnd1Id(String str);

    void setEnd2Id(String str);
}
