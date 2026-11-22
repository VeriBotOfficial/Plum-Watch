package com.hispark.clouddiag.callback;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* compiled from: BoardInfoCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/callback/BoardInfoCallback;", "", "onBoardInfoReceived", "", "deviceId", "", "version", "sn", "hardwareModel", "chipModel", Constants.MessagePayloadKeys.RAW_DATA, "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoardInfoCallback {
    void onBoardInfoReceived(String deviceId, String version, String sn, String hardwareModel, String chipModel, byte[] rawData);
}
