package org.xmind.core;

import java.util.List;

/* loaded from: classes7.dex */
public interface ITopicExtensionElement extends IAdaptable, IWorkbookComponent {
    void addChild(ITopicExtensionElement iTopicExtensionElement, int i);

    ITopicExtensionElement createChild(String str);

    void deleteChild(ITopicExtensionElement iTopicExtensionElement);

    void deleteChildren();

    void deleteChildren(String str);

    String getAttribute(String str);

    List<ITopicExtensionElement> getChildren();

    List<ITopicExtensionElement> getChildren(String str);

    ITopicExtensionElement getCreatedChild(String str);

    ITopicExtension getExtension();

    ITopicExtensionElement getFirstChild(String str);

    String getName();

    ITopicExtensionElement getParent();

    String getTextContent();

    ITopic getTopic();

    void setAttribute(String str, String str2);

    void setTextContent(String str);
}
