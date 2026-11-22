package io.nats.service;

import com.alipay.sdk.m.t.e;
import io.nats.client.support.JsonParseException;
import io.nats.client.support.JsonParser;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.Validator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class ServiceResponse implements JsonSerializable {

    /* renamed from: id, reason: collision with root package name */
    protected final String f18723id;
    protected final Map<String, String> metadata;
    protected final String name;
    protected final String type;
    protected final String version;

    protected void subToJson(StringBuilder sb) {
    }

    protected ServiceResponse(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.type = str;
        this.f18723id = str2;
        this.name = str3;
        this.version = str4;
        this.metadata = (map == null || map.isEmpty()) ? null : map;
    }

    protected ServiceResponse(String str, ServiceResponse serviceResponse) {
        this(str, serviceResponse.f18723id, serviceResponse.name, serviceResponse.version, serviceResponse.metadata);
    }

    protected ServiceResponse(String str, JsonValue jsonValue) {
        String readString = JsonValueUtils.readString(jsonValue, "type");
        if (Validator.emptyAsNull(readString) == null) {
            throw new IllegalArgumentException("Type cannot be null or empty.");
        }
        if (!str.equals(readString)) {
            throw new IllegalArgumentException("Invalid type for " + getClass().getSimpleName() + ". Expecting: " + str + ". Received " + readString);
        }
        this.type = str;
        this.f18723id = Validator.required(JsonValueUtils.readString(jsonValue, "id"), "Id");
        this.name = Validator.required(JsonValueUtils.readString(jsonValue, "name"), "Name");
        this.version = Validator.required(JsonValueUtils.readString(jsonValue, "version"), e.g);
        this.metadata = JsonValueUtils.readStringStringMap(jsonValue, "metadata");
    }

    protected static JsonValue parseMessage(byte[] bArr) {
        try {
            return JsonParser.parse(bArr);
        } catch (JsonParseException unused) {
            return JsonValue.EMPTY_MAP;
        }
    }

    public String getType() {
        return this.type;
    }

    public String getId() {
        return this.f18723id;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public Map<String, String> getMetadata() {
        if (this.metadata == null) {
            return null;
        }
        return new HashMap(this.metadata);
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "id", this.f18723id);
        JsonUtils.addField(beginJson, "name", this.name);
        JsonUtils.addField(beginJson, "version", this.version);
        subToJson(beginJson);
        JsonUtils.addField(beginJson, "type", this.type);
        JsonUtils.addField(beginJson, "metadata", this.metadata);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String toString() {
        return JsonUtils.toKey(getClass()) + toJson();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceResponse serviceResponse = (ServiceResponse) obj;
        if (Objects.equals(this.type, serviceResponse.type) && Objects.equals(this.name, serviceResponse.name) && Objects.equals(this.f18723id, serviceResponse.f18723id) && Objects.equals(this.version, serviceResponse.version)) {
            return JsonUtils.mapEquals(this.metadata, serviceResponse.metadata);
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18723id;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.version;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }
}
