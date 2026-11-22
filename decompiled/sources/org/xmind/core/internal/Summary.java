package org.xmind.core.internal;

import android.gov.nist.core.Separators;
import java.util.Collections;
import java.util.List;
import org.xmind.core.ISummary;
import org.xmind.core.ITopic;

/* loaded from: classes7.dex */
public abstract class Summary extends AbstractWorkbookComponent implements ISummary {
    protected static final List<ITopic> NO_ENCLOSING_TOPICS = Collections.emptyList();

    @Override // org.xmind.core.style.IStyled
    public String getStyleType() {
        return "summary";
    }

    @Override // org.xmind.core.ITopicRange
    public List<ITopic> getEnclosingTopics() {
        ITopic parent;
        int startIndex = getStartIndex();
        int endIndex = getEndIndex();
        if (startIndex >= 0 && endIndex >= 0 && endIndex >= startIndex && (parent = getParent()) != null) {
            List<ITopic> children = parent.getChildren(ITopic.ATTACHED);
            if (!children.isEmpty()) {
                return getSubtopics(startIndex, endIndex, children);
            }
        }
        return NO_ENCLOSING_TOPICS;
    }

    private List<ITopic> getSubtopics(int i, int i2, List<ITopic> list) {
        return list.subList(Math.min(i, list.size() - 1), Math.min(i2, list.size() - 1) + 1);
    }

    @Override // org.xmind.core.ITopicRange
    public boolean encloses(ITopic iTopic) {
        ITopic parent;
        if (iTopic != null && (parent = iTopic.getParent()) != null && parent.equals(getParent())) {
            int startIndex = getStartIndex();
            int endIndex = getEndIndex();
            int index = iTopic.getIndex();
            if (index >= startIndex && index <= endIndex) {
                return true;
            }
        }
        return false;
    }

    public ITopic getStartTopic() {
        return getTopic(getStartIndex());
    }

    public ITopic getEndTopic() {
        return getTopic(getEndIndex());
    }

    protected ITopic getTopic(int i) {
        ITopic parent;
        if (i < 0 || (parent = getParent()) == null) {
            return null;
        }
        List<ITopic> children = parent.getChildren(ITopic.ATTACHED);
        if (i < children.size()) {
            return children.get(i);
        }
        return null;
    }

    public String toString() {
        return "SUMMARY (" + getTopicId() + Separators.RPAREN;
    }
}
