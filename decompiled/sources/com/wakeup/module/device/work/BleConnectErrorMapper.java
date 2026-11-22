package com.wakeup.module.device.work;

import android.gov.nist.core.Separators;
import com.wakeup.module.device.lib.exception.BleException;
import com.wakeup.module.device.lib.exception.ConnectException;
import com.wakeup.module.device.lib.exception.GattException;
import com.wakeup.module.device.lib.exception.NotifyException;
import com.wakeup.module.device.lib.exception.OtherException;
import com.wakeup.module.device.lib.exception.TimeoutException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import org.xmind.core.style.IStyle;

/* compiled from: BleConnectErrorMapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eJ\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007J\u0006\u0010\u0015\u001a\u00020\u0012J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R&\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/wakeup/module/device/work/BleConnectErrorMapper;", "", "<init>", "()V", "CODE_APP_TIMEOUT", "", "CODE_DISCOVER_SERVICES", "CODE_NOTIFY_TIMEOUT", "CODE_NOTIFY", "CODE_OTHER", "CODE_USER_REJECTED_PAIRING", "REASON_USER_REJECTED_PAIRING", "GATT_STATUS_REASON", "", "", "gattReason", "status", IStyle.MAP, "Lcom/wakeup/module/device/work/BleConnectError;", "exception", "Lcom/wakeup/module/device/lib/exception/BleException;", "userRejectedPairing", "", "EXTRA_BOND_REASON", "BOND_REASON_AUTH_FAILED", "BOND_REASON_AUTH_REJECTED", "BOND_REASON_AUTH_CANCELED", "BOND_REASON_REMOTE_DEVICE_DOWN", "BOND_REASON_DISCOVERY_IN_PROGRESS", "BOND_REASON_AUTH_TIMEOUT", "BOND_REASON_REPEATED_ATTEMPTS", "BOND_REASON_REMOTE_AUTH_CANCELED", "BOND_REASON_REMOVED", "BOND_REASON", "Lkotlin/Pair;", "mapBondFailure", "reason", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BleConnectErrorMapper {
    public static final int BOND_REASON_AUTH_CANCELED = 3;
    public static final int BOND_REASON_AUTH_FAILED = 1;
    public static final int BOND_REASON_AUTH_REJECTED = 2;
    public static final int BOND_REASON_AUTH_TIMEOUT = 6;
    public static final int BOND_REASON_DISCOVERY_IN_PROGRESS = 5;
    public static final int BOND_REASON_REMOTE_AUTH_CANCELED = 8;
    public static final int BOND_REASON_REMOTE_DEVICE_DOWN = 4;
    public static final int BOND_REASON_REMOVED = 9;
    public static final int BOND_REASON_REPEATED_ATTEMPTS = 7;
    public static final String CODE_APP_TIMEOUT = "app_timeout";
    public static final String CODE_DISCOVER_SERVICES = "discover_services";
    public static final String CODE_NOTIFY = "notify";
    public static final String CODE_NOTIFY_TIMEOUT = "notify_timeout";
    public static final String CODE_OTHER = "other";
    public static final String CODE_USER_REJECTED_PAIRING = "user_rejected_pairing";
    public static final String EXTRA_BOND_REASON = "android.bluetooth.device.extra.REASON";
    public static final BleConnectErrorMapper INSTANCE = new BleConnectErrorMapper();
    private static final Map<Integer, String> GATT_STATUS_REASON = MapsKt.mapOf(TuplesKt.to(8, "GATT connection timeout"), TuplesKt.to(19, "Peer terminated connection"), TuplesKt.to(22, "Local host terminated connection"), TuplesKt.to(34, "LMP response timeout"), TuplesKt.to(62, "Connection failed to establish"), TuplesKt.to(133, "Generic GATT error (133)"), TuplesKt.to(147, "Adapter/resource error"), TuplesKt.to(257, "GATT failure"));
    public static final String REASON_USER_REJECTED_PAIRING = "User rejected pairing";
    private static final Map<Integer, Pair<String, String>> BOND_REASON = MapsKt.mapOf(TuplesKt.to(1, TuplesKt.to("bond_auth_failed", "Pairing auth failed")), TuplesKt.to(2, TuplesKt.to("bond_auth_rejected", REASON_USER_REJECTED_PAIRING)), TuplesKt.to(3, TuplesKt.to("bond_auth_canceled", "Pairing canceled")), TuplesKt.to(4, TuplesKt.to("bond_remote_down", "Remote device down")), TuplesKt.to(5, TuplesKt.to("bond_discovery_in_progress", "Discovery in progress")), TuplesKt.to(6, TuplesKt.to("bond_auth_timeout", "Pairing auth timeout")), TuplesKt.to(7, TuplesKt.to("bond_repeated_attempts", "Repeated pairing attempts")), TuplesKt.to(8, TuplesKt.to("bond_remote_auth_canceled", "Remote canceled pairing")), TuplesKt.to(9, TuplesKt.to("bond_removed", "Bond removed")));

    public final BleConnectError map(BleException bleException) {
        return map$default(this, bleException, false, 2, null);
    }

    private BleConnectErrorMapper() {
    }

    public final String gattReason(int status) {
        String str = GATT_STATUS_REASON.get(Integer.valueOf(status));
        return str == null ? "GATT error (" + status + Separators.RPAREN : str;
    }

    public static /* synthetic */ BleConnectError map$default(BleConnectErrorMapper bleConnectErrorMapper, BleException bleException, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bleConnectErrorMapper.map(bleException, z);
    }

    public final BleConnectError map(BleException exception, boolean userRejectedPairing) {
        if (userRejectedPairing) {
            return userRejectedPairing();
        }
        if (exception instanceof ConnectException) {
            int gattStatus = ((ConnectException) exception).getGattStatus();
            return new BleConnectError(String.valueOf(gattStatus), gattReason(gattStatus), BleFailStage.CONNECT);
        }
        if (exception instanceof GattException) {
            int gattStatus2 = ((GattException) exception).getGattStatus();
            return new BleConnectError(String.valueOf(gattStatus2), gattReason(gattStatus2), BleFailStage.DISCOVER_SERVICES);
        }
        if (exception instanceof TimeoutException) {
            return new BleConnectError(CODE_APP_TIMEOUT, "App connect timeout", BleFailStage.CONNECT);
        }
        if (exception instanceof NotifyException) {
            String description = ((NotifyException) exception).getDescription();
            if (description == null) {
                description = "Notify failed";
            }
            return new BleConnectError(CODE_NOTIFY, description, BleFailStage.WRITE);
        }
        if (exception instanceof OtherException) {
            String description2 = ((OtherException) exception).getDescription();
            if (description2 == null) {
                description2 = "Other error";
            }
            return new BleConnectError("other", description2, BleFailStage.CONNECT);
        }
        if (exception == null) {
            return new BleConnectError("", "", BleFailStage.CONNECT);
        }
        String valueOf = String.valueOf(exception.getCode());
        String description3 = exception.getDescription();
        return new BleConnectError(valueOf, description3 != null ? description3 : "", BleFailStage.CONNECT);
    }

    public final BleConnectError userRejectedPairing() {
        return new BleConnectError(CODE_USER_REJECTED_PAIRING, REASON_USER_REJECTED_PAIRING, BleFailStage.BOND);
    }

    @JvmStatic
    public static final BleConnectError mapBondFailure(int reason) {
        Pair<String, String> pair = BOND_REASON.get(Integer.valueOf(reason));
        if (pair == null) {
            pair = TuplesKt.to("bond_fail_" + reason, "Pairing failed (" + reason + Separators.RPAREN);
        }
        return new BleConnectError(pair.getFirst(), pair.getSecond(), BleFailStage.BOND);
    }
}
