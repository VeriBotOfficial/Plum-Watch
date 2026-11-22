package com.wakeup.module.device.work;

import io.nats.client.support.NatsConstants;
import kotlin.Metadata;

/* compiled from: BleConnectErrorMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/device/work/BleFailStage;", "", "<init>", "()V", "SCAN", "", NatsConstants.OP_CONNECT, "BOND", "DISCOVER_SERVICES", "WRITE", "PRECONDITION", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BleFailStage {
    public static final String BOND = "bond";
    public static final String CONNECT = "connect";
    public static final String DISCOVER_SERVICES = "discoverServices";
    public static final BleFailStage INSTANCE = new BleFailStage();
    public static final String PRECONDITION = "precondition";
    public static final String SCAN = "scan";
    public static final String WRITE = "write";

    private BleFailStage() {
    }
}
