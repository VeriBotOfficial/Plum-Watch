package org.xmind.core.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmind.core.IRevision;
import org.xmind.core.IRevisionManager;

/* loaded from: classes7.dex */
public abstract class RevisionManager extends AbstractWorkbookComponent implements IRevisionManager {
    @Override // org.xmind.core.IRevisionManager
    public List<IRevision> getRevisions() {
        ArrayList arrayList = new ArrayList();
        Iterator<IRevision> iterRevisions = iterRevisions();
        while (iterRevisions.hasNext()) {
            arrayList.add(iterRevisions.next());
        }
        return arrayList;
    }

    @Override // org.xmind.core.IRevisionManager
    public List<IRevision> getRevisionsReversed() {
        ArrayList arrayList = new ArrayList();
        Iterator<IRevision> iterRevisionsReversed = iterRevisionsReversed();
        while (iterRevisionsReversed.hasNext()) {
            arrayList.add(iterRevisionsReversed.next());
        }
        return arrayList;
    }

    @Override // org.xmind.core.IRevisionManager
    public boolean hasRevisions() {
        return iterRevisions().hasNext();
    }

    @Override // org.xmind.core.IRevisionManager
    public IRevision getLatestRevision() {
        Iterator<IRevision> iterRevisionsReversed = iterRevisionsReversed();
        if (iterRevisionsReversed.hasNext()) {
            return iterRevisionsReversed.next();
        }
        return null;
    }

    @Override // org.xmind.core.IRevisionManager
    public IRevision getRevision(int i) {
        Iterator<IRevision> iterRevisionsReversed = iterRevisionsReversed();
        while (iterRevisionsReversed.hasNext()) {
            IRevision next = iterRevisionsReversed.next();
            if (next.getRevisionNumber() == i) {
                return next;
            }
        }
        return null;
    }
}
