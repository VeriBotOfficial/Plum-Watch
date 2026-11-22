package com.wakeup.howear.push.receiver;

import com.hihonor.push.sdk.HonorMessageService;
import com.hihonor.push.sdk.HonorPushDataMsg;
import kotlin.Metadata;

/* compiled from: HonorMessageReceiver.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/wakeup/howear/push/receiver/HonorMessageReceiver;", "Lcom/hihonor/push/sdk/HonorMessageService;", "<init>", "()V", "onNewToken", "", "pushToken", "", "onMessageReceived", "msg", "Lcom/hihonor/push/sdk/HonorPushDataMsg;", "module-push_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HonorMessageReceiver extends HonorMessageService {
    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onMessageReceived(HonorPushDataMsg msg) {
    }

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onNewToken(String pushToken) {
    }
}
