package livekit.org.webrtc;

import java.util.List;

/* loaded from: classes8.dex */
public interface NetworkChangeDetector {

    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_5G,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    void destroy();

    List<NetworkInformation> getActiveNetworkList();

    ConnectionType getCurrentConnectionType();

    boolean supportNetworkCallback();

    public static class IPAddress {
        public final byte[] address;

        public IPAddress(byte[] address) {
            this.address = address;
        }

        private byte[] getAddress() {
            return this.address;
        }
    }

    public static class NetworkInformation {
        public final long handle;
        public final IPAddress[] ipAddresses;
        public final String name;
        public final ConnectionType type;
        public final ConnectionType underlyingTypeForVpn;

        public NetworkInformation(String name, ConnectionType type, ConnectionType underlyingTypeForVpn, long handle, IPAddress[] addresses) {
            this.name = name;
            this.type = type;
            this.underlyingTypeForVpn = underlyingTypeForVpn;
            this.handle = handle;
            this.ipAddresses = addresses;
        }

        private IPAddress[] getIpAddresses() {
            return this.ipAddresses;
        }

        private ConnectionType getConnectionType() {
            return this.type;
        }

        private ConnectionType getUnderlyingConnectionTypeForVpn() {
            return this.underlyingTypeForVpn;
        }

        private long getHandle() {
            return this.handle;
        }

        private String getName() {
            return this.name;
        }
    }

    public static abstract class Observer {
        public abstract void onConnectionTypeChanged(ConnectionType newConnectionType);

        public abstract void onNetworkConnect(NetworkInformation networkInfo);

        public abstract void onNetworkDisconnect(long networkHandle);

        public abstract void onNetworkPreference(List<ConnectionType> types, int preference);

        public String getFieldTrialsString() {
            return "";
        }
    }
}
