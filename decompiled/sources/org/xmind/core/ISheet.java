package org.xmind.core;

import java.util.Set;
import org.xmind.core.style.IStyle;
import org.xmind.core.style.IStyled;

/* loaded from: classes7.dex */
public interface ISheet extends IIdentifiable, ITitled, IWorkbookComponent, IAdaptable, IStyled, IModifiable {
    void addRelationship(IRelationship iRelationship);

    int getIndex();

    ILegend getLegend();

    IWorkbook getParent();

    Set<IRelationship> getRelationships();

    ITopic getRootTopic();

    ISheetSetting getSetting();

    IStyle getTheme();

    String getThemeId();

    void removeRelationship(IRelationship iRelationship);

    void replaceRootTopic(ITopic iTopic);

    void setThemeId(String str);
}
