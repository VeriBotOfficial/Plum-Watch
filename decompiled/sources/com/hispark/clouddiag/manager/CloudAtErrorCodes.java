package com.hispark.clouddiag.manager;

import kotlin.Metadata;

/* compiled from: CloudAtCommand.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/manager/CloudAtErrorCodes;", "", "<init>", "()V", "CHANNEL_BUSY", "", "INVALID_REQUEST", CloudAtErrorCodes.DEVICE_DISCONNECTED, "SEND_FAILED", "RESPONSE_TIMEOUT", "COMMAND_ERROR", "RESPONSE_TOO_LARGE", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CloudAtErrorCodes {
    public static final String CHANNEL_BUSY = "AT_CHANNEL_BUSY";
    public static final String COMMAND_ERROR = "AT_COMMAND_ERROR";
    public static final String DEVICE_DISCONNECTED = "DEVICE_DISCONNECTED";
    public static final CloudAtErrorCodes INSTANCE = new CloudAtErrorCodes();
    public static final String INVALID_REQUEST = "INVALID_AT_REQUEST";
    public static final String RESPONSE_TIMEOUT = "AT_RESPONSE_TIMEOUT";
    public static final String RESPONSE_TOO_LARGE = "AT_RESPONSE_TOO_LARGE";
    public static final String SEND_FAILED = "AT_SEND_FAILED";

    private CloudAtErrorCodes() {
    }
}
