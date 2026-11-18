package androidx.webkit;

/* JADX INFO: loaded from: classes7.dex */
public class SpeculativeLoadingConfig {
    private final int mMaxPrefetches;
    private final int mMaxPrerenders;
    private final int mPrefetchTTLSeconds;

    private SpeculativeLoadingConfig(int r1, int r2, int r3) {
        this.mPrefetchTTLSeconds = r1;
        this.mMaxPrefetches = r2;
        this.mMaxPrerenders = r3;
    }

    public int getPrefetchTtlSeconds() {
        return this.mPrefetchTTLSeconds;
    }

    public int getMaxPrefetches() {
        return this.mMaxPrefetches;
    }

    public int getMaxPrerenders() {
        return this.mMaxPrerenders;
    }

    public static final class Builder {
        private int mMaxPrefetches;
        private int mMaxPrerenders;
        private int mPrefetchTTLSeconds;

        public Builder setPrefetchTtlSeconds(int r2) {
            if (r2 <= 0) {
                throw new IllegalArgumentException("Prefetch TTL must be greater than 0");
            }
            this.mPrefetchTTLSeconds = r2;
            return this;
        }

        public Builder setMaxPrefetches(int r2) {
            if (r2 < 1) {
                throw new IllegalArgumentException("Max prefetches must be greater than 0");
            }
            this.mMaxPrefetches = r2;
            return this;
        }

        public Builder setMaxPrerenders(int r2) {
            if (r2 < 1) {
                throw new IllegalArgumentException("Max prerenders must be greater than 0");
            }
            this.mMaxPrerenders = r2;
            return this;
        }

        public SpeculativeLoadingConfig build() {
            return new SpeculativeLoadingConfig(this.mPrefetchTTLSeconds, this.mMaxPrefetches, this.mMaxPrerenders);
        }
    }
}
