package io.nats.client.api;

import com.autonavi.aps.amapapi.config.Const;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonParseException;
import io.nats.client.support.JsonParser;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.ServerVersion;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class ServerInfo {
    private final boolean authRequired;
    private final int clientId;
    private final String clientIp;
    private final String cluster;
    private final List<String> connectURLs;
    private final String go;
    private final boolean headersSupported;
    private final String host;
    private final boolean jetStream;
    private final boolean lameDuckMode;
    private final long maxPayload;
    private final byte[] nonce;
    private final int port;
    private final int protocolVersion;
    private final String serverId;
    private final String serverName;
    private final boolean tlsRequired;
    private final String version;

    public ServerInfo(String str) {
        if (str == null || str.length() < 6 || ('{' != str.charAt(0) && '{' != str.charAt(5))) {
            throw new IllegalArgumentException("Invalid Server Info");
        }
        try {
            JsonValue parse = JsonParser.parse(str, str.indexOf(Const.STR_MART_JSON_BEGIN));
            this.serverId = JsonValueUtils.readString(parse, "server_id");
            this.serverName = JsonValueUtils.readString(parse, ApiConstants.SERVER_NAME);
            this.version = JsonValueUtils.readString(parse, "version");
            this.go = JsonValueUtils.readString(parse, ApiConstants.GO);
            this.host = JsonValueUtils.readString(parse, "host");
            this.headersSupported = JsonValueUtils.readBoolean(parse, ApiConstants.HEADERS);
            this.authRequired = JsonValueUtils.readBoolean(parse, ApiConstants.AUTH_REQUIRED);
            this.nonce = JsonValueUtils.readBytes(parse, "nonce");
            this.tlsRequired = JsonValueUtils.readBoolean(parse, ApiConstants.TLS);
            this.lameDuckMode = JsonValueUtils.readBoolean(parse, ApiConstants.LAME_DUCK_MODE);
            this.jetStream = JsonValueUtils.readBoolean(parse, ApiConstants.JETSTREAM);
            this.port = JsonValueUtils.readInteger(parse, "port", 0);
            this.protocolVersion = JsonValueUtils.readInteger(parse, ApiConstants.PROTO, 0);
            this.maxPayload = JsonValueUtils.readLong(parse, ApiConstants.MAX_PAYLOAD, 0L);
            this.clientId = JsonValueUtils.readInteger(parse, "client_id", 0);
            this.clientIp = JsonValueUtils.readString(parse, ApiConstants.CLIENT_IP);
            this.cluster = JsonValueUtils.readString(parse, ApiConstants.CLUSTER);
            this.connectURLs = JsonValueUtils.readStringListIgnoreEmpty(parse, ApiConstants.CONNECT_URLS);
        } catch (JsonParseException unused) {
            throw new IllegalArgumentException("Invalid Server Info Json");
        }
    }

    public boolean isLameDuckMode() {
        return this.lameDuckMode;
    }

    public String getServerId() {
        return this.serverId;
    }

    public String getServerName() {
        return this.serverName;
    }

    public String getVersion() {
        return this.version;
    }

    public String getGoVersion() {
        return this.go;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public boolean isHeadersSupported() {
        return this.headersSupported;
    }

    public boolean isAuthRequired() {
        return this.authRequired;
    }

    public boolean isTLSRequired() {
        return this.tlsRequired;
    }

    public long getMaxPayload() {
        return this.maxPayload;
    }

    public List<String> getConnectURLs() {
        return this.connectURLs;
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public boolean isJetStreamAvailable() {
        return this.jetStream;
    }

    public int getClientId() {
        return this.clientId;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public String getCluster() {
        return this.cluster;
    }

    public boolean isNewerVersionThan(String str) {
        return ServerVersion.isNewer(this.version, str);
    }

    public boolean isSameVersion(String str) {
        return ServerVersion.isSame(this.version, str);
    }

    public boolean isOlderThanVersion(String str) {
        return ServerVersion.isOlder(this.version, str);
    }

    public boolean isSameOrOlderThanVersion(String str) {
        return ServerVersion.isSameOrOlder(this.version, str);
    }

    public boolean isSameOrNewerThanVersion(String str) {
        return ServerVersion.isSameOrNewer(this.version, str);
    }

    public String toString() {
        return "ServerInfo{serverId='" + this.serverId + "', serverName='" + this.serverName + "', version='" + this.version + "', go='" + this.go + "', host='" + this.host + "', port=" + this.port + ", headersSupported=" + this.headersSupported + ", authRequired=" + this.authRequired + ", tlsRequired=" + this.tlsRequired + ", maxPayload=" + this.maxPayload + ", connectURLs=" + this.connectURLs + ", protocolVersion=" + this.protocolVersion + ", nonce=" + Arrays.toString(this.nonce) + ", lameDuckMode=" + this.lameDuckMode + ", jetStream=" + this.jetStream + ", clientId=" + this.clientId + ", clientIp='" + this.clientIp + "', cluster='" + this.cluster + "'}";
    }
}
