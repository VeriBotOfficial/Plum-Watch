package org.xmind.core.internal;

import java.util.List;
import org.xmind.core.ITopicExtensionElement;

/* loaded from: classes7.dex */
public abstract class TopicExtensionElement extends AbstractWorkbookComponent implements ITopicExtensionElement {
    @Override // org.xmind.core.ITopicExtensionElement
    public ITopicExtensionElement getCreatedChild(String str) {
        List<ITopicExtensionElement> children = getChildren(str);
        if (!children.isEmpty()) {
            return children.get(0);
        }
        return createChild(str);
    }
}
