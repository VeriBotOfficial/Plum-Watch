package com.wakeup.common.storage.model.settings.model;

import android.gov.nist.core.Separators;
import com.blankj.utilcode.util.CollectionUtils;
import com.vivo.push.PushClientConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotifySettings.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0005R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0005¨\u0006$"}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/NotifySettings;", "", "switch", "", "<init>", "(Z)V", "getSwitch", "()Z", "setSwitch", "list", "", "Lcom/wakeup/common/storage/model/settings/model/AppMessageModel;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "redPointSwitch", "getRedPointSwitch", "setRedPointSwitch", "tipSwitch", "getTipSwitch", "setTipSwitch", "hideContentSwitch", "getHideContentSwitch", "setHideContentSwitch", "isOpen", PushClientConstants.TAG_PKG_NAME, "", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NotifySettings {
    public static final String APP_NOTICE_CALL = "Call";
    public static final String APP_NOTICE_CHAT_GPT = "ChatGpt";
    public static final String APP_NOTICE_OTHER = "Other";
    public static final String APP_NOTICE_SMS = "Messages";
    private boolean hideContentSwitch;
    private List<AppMessageModel> list;
    private boolean redPointSwitch;
    private boolean switch;
    private boolean tipSwitch;

    public NotifySettings() {
        this(false, 1, null);
    }

    public static /* synthetic */ NotifySettings copy$default(NotifySettings notifySettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = notifySettings.switch;
        }
        return notifySettings.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSwitch() {
        return this.switch;
    }

    public final NotifySettings copy(boolean r2) {
        return new NotifySettings(r2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotifySettings) && this.switch == ((NotifySettings) other).switch;
    }

    public int hashCode() {
        return Boolean.hashCode(this.switch);
    }

    public String toString() {
        return "NotifySettings(switch=" + this.switch + Separators.RPAREN;
    }

    public NotifySettings(boolean z) {
        this.switch = z;
        this.list = new ArrayList();
        this.redPointSwitch = true;
    }

    public /* synthetic */ NotifySettings(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean getSwitch() {
        return this.switch;
    }

    public final void setSwitch(boolean z) {
        this.switch = z;
    }

    public final List<AppMessageModel> getList() {
        return this.list;
    }

    public final void setList(List<AppMessageModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final boolean getRedPointSwitch() {
        return this.redPointSwitch;
    }

    public final void setRedPointSwitch(boolean z) {
        this.redPointSwitch = z;
    }

    public final boolean getTipSwitch() {
        return this.tipSwitch;
    }

    public final void setTipSwitch(boolean z) {
        this.tipSwitch = z;
    }

    public final boolean getHideContentSwitch() {
        return this.hideContentSwitch;
    }

    public final void setHideContentSwitch(boolean z) {
        this.hideContentSwitch = z;
    }

    public final boolean isOpen(String pkgName) {
        Object obj;
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        if (CollectionUtils.isEmpty(this.list)) {
            return false;
        }
        Iterator<T> it = this.list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((AppMessageModel) obj).getPackageName(), pkgName)) {
                break;
            }
        }
        AppMessageModel appMessageModel = (AppMessageModel) obj;
        if (appMessageModel == null) {
            return false;
        }
        return appMessageModel.isOpen();
    }
}
