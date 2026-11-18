package androidx.media3.decoder;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Buffer {
    private int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean notDependedOn() {
        return getFlag(67108864);
    }

    public final void setFlags(int r1) {
        this.flags = r1;
    }

    public final void addFlag(int r2) {
        this.flags = r2 | this.flags;
    }

    public final void clearFlag(int r2) {
        this.flags = (~r2) & this.flags;
    }

    protected final boolean getFlag(int r2) {
        return (this.flags & r2) == r2;
    }
}
