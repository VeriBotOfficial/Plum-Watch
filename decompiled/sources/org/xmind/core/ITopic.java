package org.xmind.core;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmind.core.marker.IMarkerRef;
import org.xmind.core.style.IStyled;

/* loaded from: classes7.dex */
public interface ITopic extends ITitled, IStyled, IRelationshipEnd, IAdaptable, ILabeled, ITopicComponent, IPositioned, IModifiable {
    public static final String ATTACHED = "attached";
    public static final String CALLOUT = "callout";
    public static final String DETACHED = "detached";
    public static final String ROOT = "root";
    public static final String SUMMARY = "summary";
    public static final int UNSPECIFIED = -1;

    void add(ITopic iTopic);

    void add(ITopic iTopic, int i, String str);

    void add(ITopic iTopic, String str);

    void addBoundary(IBoundary iBoundary);

    void addMarker(String str);

    void addSummary(ISummary iSummary);

    ITopicExtension createExtension(String str);

    void deleteExtension(String str);

    List<ITopic> getAllChildren();

    Iterator<ITopic> getAllChildrenIterator();

    Set<IBoundary> getBoundaries();

    List<ITopic> getChildren(String str);

    Iterator<ITopic> getChildrenIterator(String str);

    Set<String> getChildrenTypes();

    ITopicExtension getExtension(String str);

    List<ITopicExtension> getExtensions();

    String getHyperlink();

    IImage getImage();

    int getIndex();

    Set<IMarkerRef> getMarkerRefs();

    @Override // org.xmind.core.IModifiable
    long getModifiedTime();

    INotes getNotes();

    INumbering getNumbering();

    ITopicPath getPath();

    String getStructureClass();

    Set<ISummary> getSummaries();

    int getTitleWidth();

    String getType();

    boolean hasChildren(String str);

    boolean hasMarker(String str);

    boolean isAttached();

    boolean isFolded();

    boolean isRoot();

    void remove(ITopic iTopic);

    void removeBoundary(IBoundary iBoundary);

    void removeMarker(String str);

    void removeSummary(ISummary iSummary);

    void setFolded(boolean z);

    void setHyperlink(String str);

    void setStructureClass(String str);

    void setTitleWidth(int i);
}
