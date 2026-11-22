package livekit.org.webrtc;

/* loaded from: classes8.dex */
public final class Environment implements AutoCloseable {
    private final long webrtcEnv;

    private static native long nativeCreate(String fieldTrials);

    private static native void nativeFree(long webrtcEnv);

    public static class Builder {
        private String fieldTrials;

        public Builder setFieldTrials(String fieldTrials) {
            this.fieldTrials = fieldTrials;
            return this;
        }

        public Environment build() {
            return new Environment(this.fieldTrials);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public long ref() {
        return this.webrtcEnv;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        nativeFree(this.webrtcEnv);
    }

    private Environment(String fieldTrials) {
        this.webrtcEnv = nativeCreate(fieldTrials);
    }
}
