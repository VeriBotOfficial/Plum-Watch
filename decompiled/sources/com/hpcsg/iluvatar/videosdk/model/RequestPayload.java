package com.hpcsg.iluvatar.videosdk.model;

import androidx.camera.core.Preview$$ExternalSyntheticBackport0;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes12.dex */
public class RequestPayload {

    @SerializedName("respVideoHeight")
    private final int respVideoHeight;

    @SerializedName("respVideoWidth")
    private final int respVideoWidth;
    private final Sources sources;
    private final String topicCode;

    private RequestPayload(Builder builder) {
        this.sources = builder.sources;
        this.topicCode = builder.topicCode;
        this.respVideoWidth = builder.respVideoWidth;
        this.respVideoHeight = builder.respVideoHeight;
    }

    public static class Builder {
        private int respVideoHeight;
        private int respVideoWidth;
        private Sources sources;
        private String topicCode;

        public Builder topicCode(String str) {
            this.topicCode = str;
            return this;
        }

        public Builder sources(Sources sources) {
            this.sources = sources;
            return this;
        }

        public Builder responseVideoSize(int i, int i2) {
            this.respVideoWidth = i;
            this.respVideoHeight = i2;
            return this;
        }

        public RequestPayload build() {
            String str = this.topicCode;
            if (str == null || Preview$$ExternalSyntheticBackport0.m154m(str)) {
                throw new IllegalStateException("Topic code must be set using .topicCode() and cannot be empty.");
            }
            if (this.sources == null) {
                throw new IllegalStateException("Sources must be set using .sources().");
            }
            return new RequestPayload(this);
        }
    }
}
