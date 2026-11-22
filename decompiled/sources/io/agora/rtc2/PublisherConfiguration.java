package io.agora.rtc2;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import io.agora.utils2.internal.Logging;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes6.dex */
public class PublisherConfiguration {
    private JSONObject jsonObject;

    public static class Builder {
        private PublisherParameters params = new PublisherParameters();

        public Builder bitRate(int bitrate) {
            this.params.bitrate = bitrate;
            return this;
        }

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder defaultLayout(int layoutStyle) {
            this.params.defaultLayout = layoutStyle;
            return this;
        }

        public Builder extraInfo(String optionalInfo) {
            this.params.extraInfo = optionalInfo;
            return this;
        }

        public Builder frameRate(int framerate) {
            this.params.framerate = framerate;
            return this;
        }

        public Builder injectStream(String url, int width, int height) {
            if (url != null && width != 0 && height != 0) {
                this.params.injectStreamUrl = url;
                this.params.injectStreamWidth = width;
                this.params.injectStreamHeight = height;
            }
            return this;
        }

        public Builder owner(boolean isRoomOwner) {
            this.params.owner = isRoomOwner;
            return this;
        }

        public Builder publishUrl(String url) {
            this.params.publishUrl = url;
            return this;
        }

        public Builder rawStreamUrl(String url) {
            this.params.rawStreamUrl = url;
            return this;
        }

        public Builder size(int width, int height) {
            this.params.width = width;
            this.params.height = height;
            return this;
        }

        public Builder streamLifeCycle(int lifecycle) {
            this.params.lifecycle = lifecycle;
            return this;
        }
    }

    private PublisherConfiguration(Builder builder) {
        try {
            this.jsonObject = new JSONObject().put("owner", builder.params.owner).put(RequestParameters.SUBRESOURCE_LIFECYCLE, builder.params.lifecycle).put("defaultLayout", builder.params.defaultLayout).put("width", builder.params.width).put("height", builder.params.height).put("framerate", builder.params.framerate).put(IjkMediaMeta.IJKM_KEY_BITRATE, builder.params.bitrate).put("mosaicStream", builder.params.publishUrl).put("rawStream", builder.params.rawStreamUrl).put("extraInfo", builder.params.extraInfo);
            if (builder.params.injectStreamUrl == null || builder.params.injectStreamWidth == 0 || builder.params.injectStreamHeight == 0) {
                return;
            }
            this.jsonObject.put("injectInfo", new JSONObject().put("injectStream", builder.params.injectStreamUrl).put("width", builder.params.injectStreamWidth).put("height", builder.params.injectStreamHeight));
        } catch (JSONException unused) {
            this.jsonObject = null;
            Logging.e("failed to create PublisherConfiguration");
        }
    }

    public String toJsonString() {
        if (validate()) {
            return this.jsonObject.toString();
        }
        return null;
    }

    public boolean validate() {
        return this.jsonObject != null;
    }
}
