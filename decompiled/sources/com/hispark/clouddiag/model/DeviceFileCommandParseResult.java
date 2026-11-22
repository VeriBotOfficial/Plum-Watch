package com.hispark.clouddiag.model;

import com.heytap.mcssdk.constant.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult;", "", "<init>", "()V", "NotDeviceFile", "Valid", "Invalid", "Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult$Invalid;", "Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult$NotDeviceFile;", "Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult$Valid;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DeviceFileCommandParseResult {
    public /* synthetic */ DeviceFileCommandParseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DeviceFileCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult$NotDeviceFile;", "Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult;", "<init>", "()V", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotDeviceFile extends DeviceFileCommandParseResult {
        public static final NotDeviceFile INSTANCE = new NotDeviceFile();

        private NotDeviceFile() {
            super(null);
        }
    }

    private DeviceFileCommandParseResult() {
    }

    /* compiled from: DeviceFileCommand.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult$Valid;", "Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult;", b.y, "Lcom/hispark/clouddiag/model/DeviceFileCommand;", "<init>", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;)V", "getCommand", "()Lcom/hispark/clouddiag/model/DeviceFileCommand;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Valid extends DeviceFileCommandParseResult {
        private final DeviceFileCommand command;

        public static /* synthetic */ Valid copy$default(Valid valid, DeviceFileCommand deviceFileCommand, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceFileCommand = valid.command;
            }
            return valid.copy(deviceFileCommand);
        }

        /* renamed from: component1, reason: from getter */
        public final DeviceFileCommand getCommand() {
            return this.command;
        }

        public final Valid copy(DeviceFileCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new Valid(command);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.command, ((Valid) other).command);
        }

        public int hashCode() {
            return this.command.hashCode();
        }

        public String toString() {
            return "Valid(command=" + this.command + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(DeviceFileCommand command) {
            super(null);
            Intrinsics.checkNotNullParameter(command, "command");
            this.command = command;
        }

        public final DeviceFileCommand getCommand() {
            return this.command;
        }
    }

    /* compiled from: DeviceFileCommand.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult$Invalid;", "Lcom/hispark/clouddiag/model/DeviceFileCommandParseResult;", b.y, "Lcom/hispark/clouddiag/model/DeviceFileCommand;", "errorMsg", "", "<init>", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Ljava/lang/String;)V", "getCommand", "()Lcom/hispark/clouddiag/model/DeviceFileCommand;", "getErrorMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Invalid extends DeviceFileCommandParseResult {
        private final DeviceFileCommand command;
        private final String errorMsg;

        public static /* synthetic */ Invalid copy$default(Invalid invalid, DeviceFileCommand deviceFileCommand, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceFileCommand = invalid.command;
            }
            if ((i & 2) != 0) {
                str = invalid.errorMsg;
            }
            return invalid.copy(deviceFileCommand, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DeviceFileCommand getCommand() {
            return this.command;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final Invalid copy(DeviceFileCommand command, String errorMsg) {
            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
            return new Invalid(command, errorMsg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Invalid)) {
                return false;
            }
            Invalid invalid = (Invalid) other;
            return Intrinsics.areEqual(this.command, invalid.command) && Intrinsics.areEqual(this.errorMsg, invalid.errorMsg);
        }

        public int hashCode() {
            DeviceFileCommand deviceFileCommand = this.command;
            return ((deviceFileCommand == null ? 0 : deviceFileCommand.hashCode()) * 31) + this.errorMsg.hashCode();
        }

        public String toString() {
            return "Invalid(command=" + this.command + ", errorMsg=" + this.errorMsg + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(DeviceFileCommand deviceFileCommand, String errorMsg) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
            this.command = deviceFileCommand;
            this.errorMsg = errorMsg;
        }

        public final DeviceFileCommand getCommand() {
            return this.command;
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }
    }
}
