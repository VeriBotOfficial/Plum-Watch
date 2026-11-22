package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;

/* loaded from: classes6.dex */
public class External implements JsonSerializable {
    private final String api;
    private final String deliver;

    static External optionalInstance(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return new External(jsonValue);
    }

    External(JsonValue jsonValue) {
        this.api = JsonValueUtils.readString(jsonValue, "api");
        this.deliver = JsonValueUtils.readString(jsonValue, ApiConstants.DELIVER);
    }

    public External(String str, String str2) {
        this.api = str;
        this.deliver = str2;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "api", this.api);
        JsonUtils.addField(beginJson, ApiConstants.DELIVER, this.deliver);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String getApi() {
        return this.api;
    }

    public String getDeliver() {
        return this.deliver;
    }

    public String toString() {
        return "External{api='" + this.api + "', deliver='" + this.deliver + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            External external = (External) obj;
            String str = this.api;
            if (str == null ? external.api != null : !str.equals(external.api)) {
                return false;
            }
            String str2 = this.deliver;
            String str3 = external.deliver;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.api;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.deliver;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String api;
        private String deliver;

        public Builder api(String str) {
            this.api = str;
            return this;
        }

        public Builder deliver(String str) {
            this.deliver = str;
            return this;
        }

        public External build() {
            return new External(this.api, this.deliver);
        }
    }
}
