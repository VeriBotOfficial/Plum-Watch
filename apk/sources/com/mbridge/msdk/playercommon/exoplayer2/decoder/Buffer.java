package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Buffer {
    private int flags;

    public final void addFlag(int r2) {
        this.flags = r2 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int r2) {
        this.flags = (~r2) & this.flags;
    }

    protected final boolean getFlag(int r2) {
        return (this.flags & r2) == r2;
    }

    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int r1) {
        this.flags = r1;
    }
}
