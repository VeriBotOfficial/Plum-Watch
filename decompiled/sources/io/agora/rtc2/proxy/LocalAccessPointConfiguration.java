package io.agora.rtc2.proxy;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class LocalAccessPointConfiguration {
    public ArrayList<String> ipList = null;
    public ArrayList<String> domainList = null;
    public String verifyDomainName = null;
    public int mode = 0;
    public boolean disableAut = true;
    public AdvancedConfigInfo advancedConfig = null;

    public static class AdvancedConfigInfo {
        public LogUploadServerInfo logUploadServer;

        public AdvancedConfigInfo() {
            this.logUploadServer = null;
            this.logUploadServer = new LogUploadServerInfo();
        }

        public LogUploadServerInfo getLogUploadServerInfo() {
            return this.logUploadServer;
        }
    }

    public static class LogUploadServerInfo {
        public String serverDomain;
        public boolean serverHttps;
        public String serverPath;
        public int serverPort;

        public LogUploadServerInfo() {
            this.serverDomain = null;
            this.serverPath = null;
            this.serverPort = 0;
            this.serverHttps = true;
        }

        public LogUploadServerInfo(String domain, String path, int port, boolean https) {
            this.serverDomain = domain;
            this.serverPath = path;
            this.serverPort = port;
            this.serverHttps = https;
        }

        public String getServerDomain() {
            return this.serverDomain;
        }

        public boolean getServerHttps() {
            return this.serverHttps;
        }

        public String getServerPath() {
            return this.serverPath;
        }

        public int getServerPort() {
            return this.serverPort;
        }
    }
}
