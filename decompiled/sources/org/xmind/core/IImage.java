package org.xmind.core;

/* loaded from: classes7.dex */
public interface IImage extends IAdaptable, ITopicComponent {
    public static final String BOTTOM = "bottom";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String TOP = "top";
    public static final int UNSPECIFIED = -1;

    String getAlignment();

    int getHeight();

    String getSource();

    int getWidth();

    void setAlignment(String str);

    void setHeight(int i);

    void setSize(int i, int i2);

    void setSource(String str);

    void setWidth(int i);
}
