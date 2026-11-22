package org.xmind.core.marker;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.xmind.core.CoreException;
import org.xmind.core.IAdaptable;
import org.xmind.core.io.IInputSource;

/* loaded from: classes7.dex */
public interface IMarkerSheet extends IAdaptable {
    void addMarkerGroup(IMarkerGroup iMarkerGroup);

    IMarker createMarker(String str);

    IMarkerGroup createMarkerGroup(boolean z);

    IMarker findMarker(String str);

    IMarkerGroup findMarkerGroup(String str);

    IMarker getMarker(String str);

    IMarkerGroup getMarkerGroup(String str);

    List<IMarkerGroup> getMarkerGroups();

    IMarkerSheet getParentSheet();

    void importFrom(String str) throws IOException, CoreException;

    void importFrom(IInputSource iInputSource) throws IOException, CoreException;

    void importFrom(IInputSource iInputSource, String str) throws IOException, CoreException;

    void importFrom(IMarkerSheet iMarkerSheet);

    IMarkerGroup importGroup(IMarkerGroup iMarkerGroup);

    boolean isEmpty();

    boolean isPermanent();

    void removeMarkerGroup(IMarkerGroup iMarkerGroup);

    void save(OutputStream outputStream) throws IOException, CoreException;

    void setParentSheet(IMarkerSheet iMarkerSheet);
}
