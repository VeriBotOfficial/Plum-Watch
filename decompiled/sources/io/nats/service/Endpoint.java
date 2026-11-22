package io.nats.service;

import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.Validator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public class Endpoint implements JsonSerializable {
    private final Map<String, String> metadata;
    private final String name;
    private final String subject;

    public Endpoint(String str) {
        this(str, null, null, true);
    }

    public Endpoint(String str, Map<String, String> map) {
        this(str, null, map, true);
    }

    public Endpoint(String str, String str2) {
        this(str, str2, null, true);
    }

    public Endpoint(String str, String str2, Map<String, String> map) {
        this(str, str2, map, true);
    }

    Endpoint(String str, String str2, Map<String, String> map, boolean z) {
        if (z) {
            String validateIsRestrictedTerm = Validator.validateIsRestrictedTerm(str, "Endpoint Name", true);
            this.name = validateIsRestrictedTerm;
            if (str2 == null) {
                this.subject = validateIsRestrictedTerm;
            } else {
                this.subject = Validator.validateSubject(str2, "Endpoint Subject", false, false);
            }
        } else {
            this.name = str;
            this.subject = str2;
        }
        this.metadata = (map == null || map.isEmpty()) ? null : map;
    }

    Endpoint(JsonValue jsonValue) {
        this.name = JsonValueUtils.readString(jsonValue, "name");
        this.subject = JsonValueUtils.readString(jsonValue, "subject");
        this.metadata = JsonValueUtils.readStringStringMap(jsonValue, "metadata");
    }

    Endpoint(Builder builder) {
        this(builder.name, builder.subject, builder.metadata, true);
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "name", this.name);
        JsonUtils.addField(beginJson, "subject", this.subject);
        JsonUtils.addField(beginJson, "metadata", this.metadata);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String toString() {
        return JsonUtils.toKey(getClass()) + toJson();
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public Map<String, String> getMetadata() {
        if (this.metadata == null) {
            return null;
        }
        return new HashMap(this.metadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Map<String, String> metadata;
        private String name;
        private String subject;

        public Builder endpoint(Endpoint endpoint) {
            return name(endpoint.getName()).subject(endpoint.getSubject()).metadata(endpoint.getMetadata());
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder subject(String str) {
            this.subject = str;
            return this;
        }

        public Builder metadata(Map<String, String> map) {
            if (map == null || map.isEmpty()) {
                this.metadata = null;
                return this;
            }
            this.metadata = new HashMap(map);
            return this;
        }

        public Endpoint build() {
            return new Endpoint(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Endpoint endpoint = (Endpoint) obj;
        if (Objects.equals(this.name, endpoint.name) && Objects.equals(this.subject, endpoint.subject)) {
            return JsonUtils.mapEquals(this.metadata, endpoint.metadata);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subject;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }
}
