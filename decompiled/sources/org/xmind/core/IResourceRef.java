package org.xmind.core;

/* loaded from: classes7.dex */
public interface IResourceRef extends IAdaptable, IWorkbookComponent {
    public static final String FILE_ENTRY = "file-entry";

    Object getResource();

    String getResourceId();

    String getType();
}
