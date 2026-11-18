package com.anythink.core.api;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public interface ATGDPRConsentDismissListener {
    void onDismiss(ConsentDismissInfo consentDismissInfo);

    public static class ConsentDismissInfo {
        private int dismissType;
        private String infoMsg;

        public ConsentDismissInfo(String str, int r2) {
            this.infoMsg = str;
            this.dismissType = r2;
        }

        public String getInfoMsg() {
            return this.infoMsg;
        }

        public int getDismissType() {
            return this.dismissType;
        }

        public String toString() {
            return "ConsentDismissInfo{infoMsg='" + this.infoMsg + "', dismissType=" + this.dismissType + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
