package com.twilio.audioswitch;

import android.gov.nist.core.Separators;
import com.twilio.audioswitch.android.BluetoothDeviceWrapperImplKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioDevice.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/twilio/audioswitch/AudioDevice;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "BluetoothHeadset", "Earpiece", "Speakerphone", "WiredHeadset", "Lcom/twilio/audioswitch/AudioDevice$BluetoothHeadset;", "Lcom/twilio/audioswitch/AudioDevice$WiredHeadset;", "Lcom/twilio/audioswitch/AudioDevice$Earpiece;", "Lcom/twilio/audioswitch/AudioDevice$Speakerphone;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public abstract class AudioDevice {
    public abstract String getName();

    private AudioDevice() {
    }

    public /* synthetic */ AudioDevice(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AudioDevice.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/twilio/audioswitch/AudioDevice$BluetoothHeadset;", "Lcom/twilio/audioswitch/AudioDevice;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class BluetoothHeadset extends AudioDevice {
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public BluetoothHeadset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ BluetoothHeadset copy$default(BluetoothHeadset bluetoothHeadset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bluetoothHeadset.getName();
            }
            return bluetoothHeadset.copy(str);
        }

        public final String component1() {
            return getName();
        }

        public final BluetoothHeadset copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new BluetoothHeadset(name);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof BluetoothHeadset) && Intrinsics.areEqual(getName(), ((BluetoothHeadset) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "BluetoothHeadset(name=" + getName() + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BluetoothHeadset(String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public /* synthetic */ BluetoothHeadset(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BluetoothDeviceWrapperImplKt.DEFAULT_DEVICE_NAME : str);
        }

        @Override // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }
    }

    /* compiled from: AudioDevice.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/twilio/audioswitch/AudioDevice$WiredHeadset;", "Lcom/twilio/audioswitch/AudioDevice;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class WiredHeadset extends AudioDevice {
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public WiredHeadset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ WiredHeadset copy$default(WiredHeadset wiredHeadset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = wiredHeadset.getName();
            }
            return wiredHeadset.copy(str);
        }

        public final String component1() {
            return getName();
        }

        public final WiredHeadset copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new WiredHeadset(name);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof WiredHeadset) && Intrinsics.areEqual(getName(), ((WiredHeadset) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WiredHeadset(name=" + getName() + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WiredHeadset(String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public /* synthetic */ WiredHeadset(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Wired Headset" : str);
        }

        @Override // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }
    }

    /* compiled from: AudioDevice.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/twilio/audioswitch/AudioDevice$Earpiece;", "Lcom/twilio/audioswitch/AudioDevice;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Earpiece extends AudioDevice {
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Earpiece() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Earpiece copy$default(Earpiece earpiece, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = earpiece.getName();
            }
            return earpiece.copy(str);
        }

        public final String component1() {
            return getName();
        }

        public final Earpiece copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Earpiece(name);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof Earpiece) && Intrinsics.areEqual(getName(), ((Earpiece) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Earpiece(name=" + getName() + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Earpiece(String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public /* synthetic */ Earpiece(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Earpiece" : str);
        }

        @Override // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }
    }

    /* compiled from: AudioDevice.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/twilio/audioswitch/AudioDevice$Speakerphone;", "Lcom/twilio/audioswitch/AudioDevice;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Speakerphone extends AudioDevice {
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Speakerphone() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Speakerphone copy$default(Speakerphone speakerphone, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = speakerphone.getName();
            }
            return speakerphone.copy(str);
        }

        public final String component1() {
            return getName();
        }

        public final Speakerphone copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Speakerphone(name);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof Speakerphone) && Intrinsics.areEqual(getName(), ((Speakerphone) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Speakerphone(name=" + getName() + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Speakerphone(String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public /* synthetic */ Speakerphone(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Speakerphone" : str);
        }

        @Override // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }
    }
}
