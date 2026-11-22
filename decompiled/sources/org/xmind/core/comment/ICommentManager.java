package org.xmind.core.comment;

import java.util.List;
import org.xmind.core.IAdaptable;
import org.xmind.core.IIdentifiable;
import org.xmind.core.IWorkbook;

/* loaded from: classes7.dex */
public interface ICommentManager extends IAdaptable {
    void addComment(IComment iComment, int i);

    void addComment(IComment iComment, IIdentifiable iIdentifiable);

    IComment createComment();

    List<IComment> getAllComments();

    List<IComment> getComments(IIdentifiable iIdentifiable);

    IWorkbook getOwnedWorkbook();

    boolean isEmpty();

    void removeComment(IComment iComment);
}
