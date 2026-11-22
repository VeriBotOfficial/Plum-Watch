package com.hispark.clouddiag.manager;

import com.hispark.crashdump.protocol.BoardFileCommands;
import com.hispark.crashdump.protocol.BoardProtocolFrame;
import com.hispark.crashdump.protocol.ProtocolFrameType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardFileDebugLogFilter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/hispark/clouddiag/manager/BoardFileDebugLogFilter;", "", "<init>", "()V", "boardFileMcids", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "isBoardFileProtocolPayload", "", "payload", "", "MIN_BOARD_FILE_FRAME_BYTES", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardFileDebugLogFilter {
    public static final BoardFileDebugLogFilter INSTANCE = new BoardFileDebugLogFilter();
    private static final int MIN_BOARD_FILE_FRAME_BYTES = 8;
    private static final HashSet<String> boardFileMcids;

    private BoardFileDebugLogFilter() {
    }

    static {
        ProtocolFrameType[] values = ProtocolFrameType.values();
        HashSet<String> hashSet = new HashSet<>();
        for (ProtocolFrameType protocolFrameType : values) {
            hashSet.add(protocolFrameType.getValue());
        }
        boardFileMcids = hashSet;
    }

    public final boolean isBoardFileProtocolPayload(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 8) {
            return false;
        }
        List<BoardProtocolFrame> resolveFrames = BoardFileCommands.INSTANCE.resolveFrames(payload);
        if ((resolveFrames instanceof Collection) && resolveFrames.isEmpty()) {
            return false;
        }
        Iterator<T> it = resolveFrames.iterator();
        while (it.hasNext()) {
            if (boardFileMcids.contains(((BoardProtocolFrame) it.next()).getMcid())) {
                return true;
            }
        }
        return false;
    }
}
