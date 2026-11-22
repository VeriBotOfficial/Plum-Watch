package org.xmind.core;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import org.xmind.core.comment.ICommentManager;
import org.xmind.core.io.IOutputTarget;
import org.xmind.core.io.IStorage;
import org.xmind.core.marker.IMarkerSheet;
import org.xmind.core.style.IStyleSheet;

/* loaded from: classes7.dex */
public interface IWorkbook extends IAdaptable, IModifiable {
    void addSheet(ISheet iSheet);

    void addSheet(ISheet iSheet, int i);

    ICloneData clone(Collection<? extends Object> collection);

    ITopic cloneTopic(ITopic iTopic);

    IBoundary createBoundary();

    INotesContent createNotesContent(String str);

    IRelationship createRelationship();

    IRelationship createRelationship(IRelationshipEnd iRelationshipEnd, IRelationshipEnd iRelationshipEnd2);

    IResourceRef createResourceRef(String str, String str2);

    ISheet createSheet();

    ISummary createSummary();

    ITopic createTopic();

    Object findElement(String str, IAdaptable iAdaptable);

    ITopic findTopic(String str);

    ITopic findTopic(String str, IAdaptable iAdaptable);

    ICommentManager getCommentManager();

    Object getElementById(String str);

    String getFile();

    IManifest getManifest();

    IMarkerSheet getMarkerSheet();

    IMeta getMeta();

    String getPassword();

    ISheet getPrimarySheet();

    IRevisionRepository getRevisionRepository();

    List<ISheet> getSheets();

    IStyleSheet getStyleSheet();

    String getTempLocation();

    IStorage getTempStorage();

    String getVersion();

    IAdaptable importElement(IAdaptable iAdaptable);

    boolean isSkipRevisionsWhenSaving();

    void moveSheet(int i, int i2);

    void removeSheet(ISheet iSheet);

    void save() throws IOException, CoreException;

    void save(OutputStream outputStream) throws IOException, CoreException;

    void save(String str) throws IOException, CoreException;

    void save(IOutputTarget iOutputTarget) throws IOException, CoreException;

    void saveTemp() throws IOException, CoreException;

    void setFile(String str);

    void setPassword(String str);

    void setTempLocation(String str);

    void setTempStorage(IStorage iStorage);
}
