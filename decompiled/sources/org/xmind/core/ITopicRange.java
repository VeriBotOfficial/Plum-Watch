package org.xmind.core;

import java.util.List;

/* loaded from: classes7.dex */
public interface ITopicRange extends IRange {
    boolean encloses(ITopic iTopic);

    List<ITopic> getEnclosingTopics();

    ITopic getParent();
}
