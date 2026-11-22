package no.nordicsemi.android.ble;

import no.nordicsemi.android.ble.BleManagerHandler;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class BleManagerHandler$$ExternalSyntheticLambda73 implements BleManagerHandler.Loggable {
    public final /* synthetic */ SecurityException f$0;

    public /* synthetic */ BleManagerHandler$$ExternalSyntheticLambda73(SecurityException securityException) {
        this.f$0 = securityException;
    }

    @Override // no.nordicsemi.android.ble.BleManagerHandler.Loggable
    public final String log() {
        String localizedMessage;
        localizedMessage = this.f$0.getLocalizedMessage();
        return localizedMessage;
    }
}
