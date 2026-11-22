package io.agora.rtc2;

/* loaded from: classes6.dex */
public class ExtensionContext {
    public String extensionName;
    public boolean isValid;
    public String providerName;
    public int uid;

    public ExtensionContext() {
        this.isValid = false;
        this.uid = 0;
        this.providerName = "";
        this.extensionName = "";
    }

    public ExtensionContext(int uid, String providerName, String extensionName) {
        this.isValid = true;
        this.uid = uid;
        this.providerName = providerName;
        this.extensionName = extensionName;
    }
}
