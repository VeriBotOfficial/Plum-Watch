package org.xmind.core.comment;

import org.w3c.dom.Element;
import org.xmind.core.IAdaptable;
import org.xmind.core.IIdentifiable;
import org.xmind.core.IWorkbookComponent;

/* loaded from: classes7.dex */
public interface IComment extends IAdaptable, IWorkbookComponent, IIdentifiable {
    String getAuthor();

    String getContent();

    Element getImplementation();

    String getObjectId();

    IIdentifiable getTarget();

    String getTime();

    void setContent(String str);

    void setTarget(IIdentifiable iIdentifiable);
}
