package com.wakeup.howear.view.device.home;

import android.gov.nist.core.Separators;
import com.wakeup.common.storage.model.DeviceModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FunctionComponentManager.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult;", "", "<init>", "()V", "Success", "Failure", "Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult$Failure;", "Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult$Success;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DeviceListRefreshResult {
    public /* synthetic */ DeviceListRefreshResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: FunctionComponentManager.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult$Success;", "Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult;", "devices", "", "Lcom/wakeup/common/storage/model/DeviceModel;", "<init>", "(Ljava/util/List;)V", "getDevices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends DeviceListRefreshResult {
        private final List<DeviceModel> devices;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.devices;
            }
            return success.copy(list);
        }

        public final List<DeviceModel> component1() {
            return this.devices;
        }

        public final Success copy(List<? extends DeviceModel> devices) {
            Intrinsics.checkNotNullParameter(devices, "devices");
            return new Success(devices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.devices, ((Success) other).devices);
        }

        public int hashCode() {
            return this.devices.hashCode();
        }

        public String toString() {
            return "Success(devices=" + this.devices + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(List<? extends DeviceModel> devices) {
            super(null);
            Intrinsics.checkNotNullParameter(devices, "devices");
            this.devices = devices;
        }

        public final List<DeviceModel> getDevices() {
            return this.devices;
        }
    }

    private DeviceListRefreshResult() {
    }

    /* compiled from: FunctionComponentManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult$Failure;", "Lcom/wakeup/howear/view/device/home/DeviceListRefreshResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends DeviceListRefreshResult {
        private final Throwable error;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.error;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failure copy(Throwable error) {
            return new Failure(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        public int hashCode() {
            Throwable th = this.error;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + Separators.RPAREN;
        }

        public Failure(Throwable th) {
            super(null);
            this.error = th;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
