package org.xmind.core;

import org.xmind.core.style.IStyled;

/* loaded from: classes7.dex */
public interface IBoundary extends IAdaptable, IIdentifiable, ITopicComponent, ITopicRange, ITitled, IStyled, IRelationshipEnd, IModifiable {
    boolean isMasterBoundary();

    void setMasterBoundary(boolean z);
}
