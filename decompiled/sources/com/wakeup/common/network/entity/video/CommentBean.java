package com.wakeup.common.network.entity.video;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CommentBean {
    public int countId;
    public boolean hitCount;
    public int maxLimit;
    public boolean optimizeCountSql;
    public List orders;
    public boolean searchCount;
    public int total;
    public int pages = 0;
    public int size = 0;
    public int current = 0;
    public List<CommentItem> records = new ArrayList();

    public static final class ReportItem {
        public boolean accusationResult;
        public String reason;
    }

    public static class CommentItem {
        public String content;
        public String createTime;

        /* renamed from: id, reason: collision with root package name */
        public int f14255id;
        public int itemId;
        public int itemType;
        public int levelId;
        public int likeCount;
        public int likeStatus;
        public int parentCommentId;
        public String parentUserAvatar;
        public String parentUserName;
        public int status;
        public String statusInfo;
        public int subCommentCount;
        public int topCommentId;
        public String userAvatar;
        public long userId;
        public String userName;
        public CommentBean children = new CommentBean();
        public int secondaryShowCount = 0;
        public boolean isShowMore = false;
        public boolean isAttachExpand = false;

        public boolean isMore() {
            return this.isShowMore;
        }

        public boolean isLike() {
            return this.likeStatus == 1;
        }

        public void setLike() {
            this.likeStatus = this.likeStatus == 1 ? 0 : 1;
        }
    }
}
