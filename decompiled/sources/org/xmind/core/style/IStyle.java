package org.xmind.core.style;

import java.util.Iterator;
import org.xmind.core.IAdaptable;
import org.xmind.core.IIdentifiable;
import org.xmind.core.INamed;
import org.xmind.core.IProperties;
import org.xmind.core.util.Property;

/* loaded from: classes7.dex */
public interface IStyle extends IAdaptable, IIdentifiable, IProperties, INamed {
    public static final String BOUNDARY = "boundary";
    public static final String MAP = "map";
    public static final String PARAGRAPH = "paragraph";
    public static final String RELATIONSHIP = "relationship";
    public static final String SUMMARY = "summary";
    public static final String TEXT = "text";
    public static final String THEME = "theme";
    public static final String TOPIC = "topic";

    Iterator<Property> defaultStyles();

    IStyle getDefaultStyle(String str);

    IStyle getDefaultStyleById(String str);

    String getDefaultStyleId(String str);

    IStyleSheet getOwnedStyleSheet();

    String getType();

    void setDefaultStyleId(String str, String str2);
}
