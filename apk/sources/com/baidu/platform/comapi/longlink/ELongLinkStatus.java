package com.baidu.platform.comapi.longlink;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SendFormatError' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes15.dex */
public final class ELongLinkStatus {
    private static final /* synthetic */ ELongLinkStatus[] $VALUES;
    public static final ELongLinkStatus CloudRestart;
    public static final ELongLinkStatus CloudStop;
    public static final ELongLinkStatus OK;
    public static final ELongLinkStatus ResultConnectError;
    public static final ELongLinkStatus ResultSendError;
    public static final ELongLinkStatus ResultServerError;
    public static final ELongLinkStatus ResultTimeout;
    public static final ELongLinkStatus SendDataLenLimited;
    public static final ELongLinkStatus SendFormatError;
    public static final ELongLinkStatus SendInvalidReqID;
    public static final ELongLinkStatus SendLimited;
    public static final ELongLinkStatus SendUnRegistered;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8574a;
    private int b;

    static {
        ELongLinkStatus eLongLinkStatus = new ELongLinkStatus("OK", 0, 0);
        OK = eLongLinkStatus;
        ELongLinkStatus eLongLinkStatus2 = new ELongLinkStatus("SendFormatError", 1, eLongLinkStatus.getStatusCode() + 1);
        SendFormatError = eLongLinkStatus2;
        ELongLinkStatus eLongLinkStatus3 = new ELongLinkStatus("SendUnRegistered", 2, eLongLinkStatus.getStatusCode() + 2);
        SendUnRegistered = eLongLinkStatus3;
        ELongLinkStatus eLongLinkStatus4 = new ELongLinkStatus("SendLimited", 3, eLongLinkStatus.getStatusCode() + 3);
        SendLimited = eLongLinkStatus4;
        ELongLinkStatus eLongLinkStatus5 = new ELongLinkStatus("SendDataLenLimited", 4, eLongLinkStatus.getStatusCode() + 4);
        SendDataLenLimited = eLongLinkStatus5;
        ELongLinkStatus eLongLinkStatus6 = new ELongLinkStatus("SendInvalidReqID", 5, eLongLinkStatus.getStatusCode() + 5);
        SendInvalidReqID = eLongLinkStatus6;
        ELongLinkStatus eLongLinkStatus7 = new ELongLinkStatus("ResultConnectError", 6, eLongLinkStatus.getStatusCode() + 6);
        ResultConnectError = eLongLinkStatus7;
        ELongLinkStatus eLongLinkStatus8 = new ELongLinkStatus("ResultSendError", 7, eLongLinkStatus.getStatusCode() + 7);
        ResultSendError = eLongLinkStatus8;
        ELongLinkStatus eLongLinkStatus9 = new ELongLinkStatus("ResultTimeout", 8, eLongLinkStatus.getStatusCode() + 8);
        ResultTimeout = eLongLinkStatus9;
        ELongLinkStatus eLongLinkStatus10 = new ELongLinkStatus("ResultServerError", 9, eLongLinkStatus.getStatusCode() + 9);
        ResultServerError = eLongLinkStatus10;
        ELongLinkStatus eLongLinkStatus11 = new ELongLinkStatus("CloudStop", 10, eLongLinkStatus.getStatusCode() + 10);
        CloudStop = eLongLinkStatus11;
        ELongLinkStatus eLongLinkStatus12 = new ELongLinkStatus("CloudRestart", 11, eLongLinkStatus.getStatusCode() + 11);
        CloudRestart = eLongLinkStatus12;
        $VALUES = new ELongLinkStatus[]{eLongLinkStatus, eLongLinkStatus2, eLongLinkStatus3, eLongLinkStatus4, eLongLinkStatus5, eLongLinkStatus6, eLongLinkStatus7, eLongLinkStatus8, eLongLinkStatus9, eLongLinkStatus10, eLongLinkStatus11, eLongLinkStatus12};
    }

    private ELongLinkStatus(String str, int r2, int r3) {
        super(str, r2);
        this.f8574a = r3;
    }

    public static ELongLinkStatus valueOf(String str) {
        return (ELongLinkStatus) Enum.valueOf(ELongLinkStatus.class, str);
    }

    public static ELongLinkStatus[] values() {
        return (ELongLinkStatus[]) $VALUES.clone();
    }

    public int getRequestId() {
        return this.b;
    }

    public int getStatusCode() {
        return this.f8574a;
    }

    public void setRequestId(int r1) {
        this.b = r1;
    }
}
