package com.baidu.platform.comapi.cache.sp;

/* loaded from: classes13.dex */
public class SpStorageConfig {

    /* renamed from: a, reason: collision with root package name */
    private String f8560a;
    private boolean b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f8561a;
        private boolean b;

        public Builder() {
            this(null);
        }

        public SpStorageConfig build() {
            return new SpStorageConfig(this.f8561a, this.b);
        }

        public Builder setCacheModel(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setStorageName(String str) {
            this.f8561a = str;
            return this;
        }

        public Builder(SpStorageConfig spStorageConfig) {
            if (spStorageConfig != null) {
                this.f8561a = spStorageConfig.f8560a;
                this.b = spStorageConfig.b;
            }
        }
    }

    public String getStorageName() {
        return this.f8560a;
    }

    public boolean isCacheModel() {
        return this.b;
    }

    private SpStorageConfig() {
    }

    private SpStorageConfig(String str, boolean z) {
        this.f8560a = str;
        this.b = z;
    }
}
