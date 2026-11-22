package org.xmind.core;

/* loaded from: classes7.dex */
public interface INotes extends IAdaptable, ITopicComponent {
    public static final String HTML = "html";
    public static final String PLAIN = "plain";

    INotesContent getContent(String str);

    boolean isEmpty();

    void setContent(String str, INotesContent iNotesContent);
}
