package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.Validator;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class Placement implements JsonSerializable {
    private final String cluster;
    private final List<String> tags;

    static Placement optionalInstance(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return new Placement(jsonValue);
    }

    Placement(JsonValue jsonValue) {
        this.cluster = JsonValueUtils.readString(jsonValue, ApiConstants.CLUSTER);
        this.tags = JsonValueUtils.readOptionalStringList(jsonValue, "tags");
    }

    public Placement(String str, List<String> list) {
        this.cluster = str;
        this.tags = (list == null || list.size() == 0) ? null : list;
    }

    public String getCluster() {
        return this.cluster;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String toString() {
        return "Placement{cluster='" + this.cluster + "', tags=" + this.tags + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, ApiConstants.CLUSTER, this.cluster);
        JsonUtils.addStrings(beginJson, "tags", this.tags);
        return JsonUtils.endJson(beginJson).toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cluster;
        private List<String> tags;

        public Builder cluster(String str) {
            this.cluster = str;
            return this;
        }

        public Builder tags(String... strArr) {
            this.tags = Arrays.asList(strArr);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = list;
            return this;
        }

        public Placement build() {
            Validator.required(this.cluster, "Cluster");
            return new Placement(this.cluster, this.tags);
        }
    }
}
