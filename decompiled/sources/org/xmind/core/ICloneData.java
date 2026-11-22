package org.xmind.core;

import java.util.Collection;

/* loaded from: classes7.dex */
public interface ICloneData {
    public static final String MARKERSHEET_COMPONENTS = "markerSheetComponents";
    public static final String STYLESHEET_COMPONENTS = "styleSheetComponents";
    public static final String URLS = "urls";
    public static final String WORKBOOK_COMPONENTS = "workbookComponents";

    Object get(Object obj);

    Collection<Object> getCloneds();

    Collection<Object> getSources();

    String getString(String str, String str2);

    boolean hasCloned();

    boolean isCloned(Object obj);

    boolean isCloned(String str, String str2);

    void put(Object obj, Object obj2);

    void putString(String str, String str2, String str3);
}
