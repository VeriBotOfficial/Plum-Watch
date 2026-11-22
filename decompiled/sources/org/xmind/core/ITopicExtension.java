package org.xmind.core;

import java.util.List;

/* loaded from: classes7.dex */
public interface ITopicExtension extends IAdaptable, ITopicComponent {
    void addResourceRef(IResourceRef iResourceRef);

    ITopicExtensionElement getContent();

    String getProviderName();

    List<IResourceRef> getResourceRefs();

    void removeResourceRef(IResourceRef iResourceRef);
}
