package org.xmind.core.internal;

import org.xmind.core.IRevision;

/* loaded from: classes7.dex */
public abstract class Revision extends AbstractWorkbookComponent implements IRevision {
    @Override // java.lang.Comparable
    public int compareTo(IRevision iRevision) {
        int revisionNumber = getRevisionNumber() - iRevision.getRevisionNumber();
        return revisionNumber == 0 ? (int) (getTimestamp() - iRevision.getTimestamp()) : revisionNumber;
    }
}
