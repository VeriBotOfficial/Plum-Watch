package com.wakeup.common.location;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: ILocation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/wakeup/common/location/ILocation;", "", "initLocation", "", "context", "Landroid/content/Context;", "startLocation", "startLocationOnce", "stopLocation", "getLastLocation", "isLocationOnce", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ILocation {
    void getLastLocation();

    void initLocation(Context context);

    boolean isLocationOnce();

    void startLocation();

    void startLocationOnce();

    void stopLocation();
}
