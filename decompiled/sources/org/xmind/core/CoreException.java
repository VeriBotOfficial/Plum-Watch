package org.xmind.core;

/* loaded from: classes7.dex */
public class CoreException extends Exception {
    private static final long serialVersionUID = -5654915714687349526L;
    private String codeInfo;
    private String localizedMessage;
    private int type;

    public CoreException(int i) {
        super(getErrorMessage(i, null));
        this.type = i;
    }

    public CoreException(int i, String str) {
        super(getErrorMessage(i, str));
        this.type = i;
        this.codeInfo = str;
    }

    public CoreException(int i, Throwable th) {
        super(getErrorMessage(i, null), th);
        this.type = i;
    }

    public CoreException(int i, String str, Throwable th) {
        super(getErrorMessage(i, str), th);
        this.type = i;
        this.codeInfo = str;
    }

    public int getType() {
        return this.type;
    }

    public void setLocalizedMessage(String str) {
        this.localizedMessage = str;
    }

    public boolean isMessageLocalized() {
        return this.localizedMessage != null;
    }

    void setCodeInfo(String str) {
        this.codeInfo = str;
    }

    public String getCodeInfo() {
        return this.codeInfo;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        if (isMessageLocalized()) {
            return this.localizedMessage;
        }
        return super.getLocalizedMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (isMessageLocalized()) {
            return this.localizedMessage;
        }
        return super.getMessage();
    }

    private static String getErrorMessage(int i, String str) {
        String str2;
        if (i == 2) {
            str2 = "Null argument";
        } else if (i == 3) {
            str2 = "Invalid argument";
        } else if (i == 10) {
            str2 = "Invalid file";
        } else if (i == 11) {
            str2 = "No such entry";
        } else if (i == 12) {
            str2 = "Failed to access XML parser";
        } else if (i == 13) {
            str2 = "Failed to parse XML";
        } else if (i == 14) {
            str2 = "No workbook content";
        } else if (i == 15) {
            str2 = "Failed to access XML transformer";
        } else if (i == 16) {
            str2 = "Failed to initialize cryptogram engine";
        } else if (i == 17) {
            str2 = "Wrong password";
        } else if (i == 100) {
            str2 = "Operation canceled";
        } else {
            str2 = "Unexpected error";
        }
        return str != null ? String.format("%s: %s", str2, str) : str2;
    }
}
