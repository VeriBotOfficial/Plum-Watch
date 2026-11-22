package com.wakeup.common.network.entity.book;

import kotlin.Metadata;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: EBookEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/book/EBookEntity;", "", "<init>", "()V", "id", "", "getId", "()J", "name", "", "getName", "()Ljava/lang/String;", "cover", "getCover", "innerCover", "getInnerCover", "summary", "getSummary", DOMConstants.ATTR_AUTHOR, "getAuthor", "filePath", "getFilePath", "fileSize", "getFileSize", "setFileSize", "(J)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EBookEntity {
    private long fileSize;
    private final long id;
    private final String name = "";
    private final String cover = "";
    private final String innerCover = "";
    private final String summary = "";
    private final String author = "";
    private final String filePath = "";

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getInnerCover() {
        return this.innerCover;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }
}
