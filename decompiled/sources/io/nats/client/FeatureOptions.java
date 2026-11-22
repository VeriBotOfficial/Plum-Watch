package io.nats.client;

import io.nats.client.JetStreamOptions;
import java.time.Duration;

/* loaded from: classes6.dex */
public abstract class FeatureOptions {
    private final JetStreamOptions jso;

    protected FeatureOptions(Builder builder) {
        this.jso = builder.jsoBuilder.build();
    }

    public JetStreamOptions getJetStreamOptions() {
        return this.jso;
    }

    protected static abstract class Builder<B, FO> {
        private JetStreamOptions.Builder jsoBuilder;

        public abstract FO build();

        protected abstract B getThis();

        protected Builder() {
            this.jsoBuilder = JetStreamOptions.builder();
        }

        protected Builder(FeatureOptions featureOptions) {
            if (featureOptions != null) {
                this.jsoBuilder = JetStreamOptions.builder(featureOptions.jso);
            } else {
                this.jsoBuilder = JetStreamOptions.builder();
            }
        }

        public B jetStreamOptions(JetStreamOptions jetStreamOptions) {
            this.jsoBuilder = JetStreamOptions.builder(jetStreamOptions);
            return getThis();
        }

        public B jsRequestTimeout(Duration duration) {
            this.jsoBuilder.requestTimeout(duration);
            return getThis();
        }

        public B jsPrefix(String str) {
            this.jsoBuilder.prefix(str);
            return getThis();
        }

        public B jsDomain(String str) {
            this.jsoBuilder.domain(str);
            return getThis();
        }
    }
}
