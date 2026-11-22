package org.xmind.core;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public interface IRevisionManager extends IWorkbookComponent, IAdaptable {
    IRevision addRevision(IAdaptable iAdaptable) throws IOException, CoreException;

    String getContentType();

    IRevision getLatestRevision();

    int getNextRevisionNumber();

    String getResourceId();

    IRevision getRevision(int i);

    List<IRevision> getRevisions();

    List<IRevision> getRevisionsReversed();

    boolean hasRevisions();

    Iterator<IRevision> iterRevisions();

    Iterator<IRevision> iterRevisionsReversed();

    Object removeRevision(IRevision iRevision);

    void restoreRevision(IRevision iRevision, Object obj);
}
