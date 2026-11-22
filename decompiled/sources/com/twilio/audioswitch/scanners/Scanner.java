package com.twilio.audioswitch.scanners;

import com.twilio.audioswitch.AudioDevice;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scanner.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016JN\u0010\u0007\u001a\u00020\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\f0\t2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\f0\tH\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lcom/twilio/audioswitch/scanners/Scanner;", "", "isDeviceActive", "", "audioDevice", "Lcom/twilio/audioswitch/AudioDevice;", "isDeviceInactive", "start", "onDeviceConnected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onDeviceDisconnected", "listener", "Lcom/twilio/audioswitch/scanners/Scanner$Listener;", TimerController.STOP_COMMAND, "Listener", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public interface Scanner {

    /* compiled from: Scanner.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/twilio/audioswitch/scanners/Scanner$Listener;", "", "onDeviceConnected", "", "audioDevice", "Lcom/twilio/audioswitch/AudioDevice;", "onDeviceDisconnected", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public interface Listener {
        void onDeviceConnected(AudioDevice audioDevice);

        void onDeviceDisconnected(AudioDevice audioDevice);
    }

    boolean isDeviceActive(AudioDevice audioDevice);

    boolean isDeviceInactive(AudioDevice audioDevice);

    boolean start(Listener listener);

    boolean start(Function1<? super AudioDevice, Unit> onDeviceConnected, Function1<? super AudioDevice, Unit> onDeviceDisconnected);

    boolean stop();

    /* compiled from: Scanner.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static boolean isDeviceInactive(Scanner scanner, AudioDevice audioDevice) {
            Intrinsics.checkNotNullParameter(audioDevice, "audioDevice");
            return !scanner.isDeviceActive(audioDevice);
        }

        public static boolean start(Scanner scanner, final Function1<? super AudioDevice, Unit> onDeviceConnected, final Function1<? super AudioDevice, Unit> onDeviceDisconnected) {
            Intrinsics.checkNotNullParameter(onDeviceConnected, "onDeviceConnected");
            Intrinsics.checkNotNullParameter(onDeviceDisconnected, "onDeviceDisconnected");
            return scanner.start(new Listener() { // from class: com.twilio.audioswitch.scanners.Scanner$start$1
                @Override // com.twilio.audioswitch.scanners.Scanner.Listener
                public void onDeviceConnected(AudioDevice audioDevice) {
                    Intrinsics.checkNotNullParameter(audioDevice, "audioDevice");
                    Function1.this.invoke(audioDevice);
                }

                @Override // com.twilio.audioswitch.scanners.Scanner.Listener
                public void onDeviceDisconnected(AudioDevice audioDevice) {
                    Intrinsics.checkNotNullParameter(audioDevice, "audioDevice");
                    onDeviceDisconnected.invoke(audioDevice);
                }
            });
        }
    }
}
