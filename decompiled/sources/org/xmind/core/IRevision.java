package org.xmind.core;

/* loaded from: classes7.dex */
public interface IRevision extends IAdaptable, IWorkbookComponent, Comparable<IRevision> {
    public static final String SHEET = "application/vnd.xmind.sheet";

    IAdaptable getContent();

    String getContentType();

    IRevisionManager getOwnedManager();

    String getResourceId();

    int getRevisionNumber();

    long getTimestamp();
}
