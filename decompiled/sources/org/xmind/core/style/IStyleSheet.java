package org.xmind.core.style;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import org.xmind.core.CoreException;
import org.xmind.core.IAdaptable;

/* loaded from: classes7.dex */
public interface IStyleSheet extends IAdaptable {
    public static final String AUTOMATIC_STYLES = "automatic-styles";
    public static final String MASTER_STYLES = "master-styles";
    public static final String NORMAL_STYLES = "normal-styles";

    void addStyle(IStyle iStyle, String str);

    IStyle createStyle(String str);

    String findOwnedGroup(IStyle iStyle);

    IStyle findStyle(String str);

    Set<IStyle> getAllStyles();

    IStyleSheet getParentSheet();

    Set<IStyle> getStyles(String str);

    IStyle importStyle(IStyle iStyle);

    boolean isEmpty();

    void removeStyle(IStyle iStyle);

    void save(OutputStream outputStream) throws IOException, CoreException;

    void setParentSheet(IStyleSheet iStyleSheet);
}
