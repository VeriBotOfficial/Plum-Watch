package org.xmind.core;

/* loaded from: classes7.dex */
public interface INumbering extends IAdaptable, ITopicComponent {
    String getComputedFormat();

    String getComputedSeparator();

    String getNumberFormat();

    String getParentFormat();

    String getParentSeparator();

    String getPrefix();

    String getSeparator();

    String getSuffix();

    boolean prependsParentNumbers();

    void setFormat(String str);

    void setPrefix(String str);

    void setPrependsParentNumbers(boolean z);

    void setSeparator(String str);

    void setSuffix(String str);
}
