package com.wakeup.howear.diet;

import android.gov.nist.core.Separators;
import com.baidu.ar.constants.HttpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DietRetrofit.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/wakeup/howear/diet/BoardWrapper;", "", HttpConstants.HTTP_BOARD, "Lcom/wakeup/howear/diet/BoardData;", "<init>", "(Lcom/wakeup/howear/diet/BoardData;)V", "getBoard", "()Lcom/wakeup/howear/diet/BoardData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoardWrapper {
    private final BoardData board;

    /* JADX WARN: Multi-variable type inference failed */
    public BoardWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BoardWrapper copy$default(BoardWrapper boardWrapper, BoardData boardData, int i, Object obj) {
        if ((i & 1) != 0) {
            boardData = boardWrapper.board;
        }
        return boardWrapper.copy(boardData);
    }

    /* renamed from: component1, reason: from getter */
    public final BoardData getBoard() {
        return this.board;
    }

    public final BoardWrapper copy(BoardData board) {
        return new BoardWrapper(board);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BoardWrapper) && Intrinsics.areEqual(this.board, ((BoardWrapper) other).board);
    }

    public int hashCode() {
        BoardData boardData = this.board;
        if (boardData == null) {
            return 0;
        }
        return boardData.hashCode();
    }

    public String toString() {
        return "BoardWrapper(board=" + this.board + Separators.RPAREN;
    }

    public BoardWrapper(BoardData boardData) {
        this.board = boardData;
    }

    public /* synthetic */ BoardWrapper(BoardData boardData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : boardData);
    }

    public final BoardData getBoard() {
        return this.board;
    }
}
