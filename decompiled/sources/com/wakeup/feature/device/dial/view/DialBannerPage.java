package com.wakeup.feature.device.dial.view;

import android.gov.nist.core.Separators;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialLoopBanner.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/device/dial/view/DialBannerPage;", "", "<init>", "()V", "Image", TypedValues.Custom.NAME, "Lcom/wakeup/feature/device/dial/view/DialBannerPage$Custom;", "Lcom/wakeup/feature/device/dial/view/DialBannerPage$Image;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DialBannerPage {
    public /* synthetic */ DialBannerPage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DialLoopBanner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/device/dial/view/DialBannerPage$Image;", "Lcom/wakeup/feature/device/dial/view/DialBannerPage;", "imageUrl", "", "extra", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getImageUrl", "()Ljava/lang/String;", "getExtra", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image extends DialBannerPage {
        private final Object extra;
        private final String imageUrl;

        public static /* synthetic */ Image copy$default(Image image, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = image.imageUrl;
            }
            if ((i & 2) != 0) {
                obj = image.extra;
            }
            return image.copy(str, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getExtra() {
            return this.extra;
        }

        public final Image copy(String imageUrl, Object extra) {
            return new Image(imageUrl, extra);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.areEqual(this.imageUrl, image.imageUrl) && Intrinsics.areEqual(this.extra, image.extra);
        }

        public int hashCode() {
            String str = this.imageUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Object obj = this.extra;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "Image(imageUrl=" + this.imageUrl + ", extra=" + this.extra + Separators.RPAREN;
        }

        public /* synthetic */ Image(String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : obj);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final Object getExtra() {
            return this.extra;
        }

        public Image(String str, Object obj) {
            super(null);
            this.imageUrl = str;
            this.extra = obj;
        }
    }

    private DialBannerPage() {
    }

    /* compiled from: DialLoopBanner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/device/dial/view/DialBannerPage$Custom;", "Lcom/wakeup/feature/device/dial/view/DialBannerPage;", "content", "Landroid/view/View;", "placeholderUrl", "", "extra", "", "<init>", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "getContent", "()Landroid/view/View;", "getPlaceholderUrl", "()Ljava/lang/String;", "getExtra", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Custom extends DialBannerPage {
        private final View content;
        private final Object extra;
        private final String placeholderUrl;

        public static /* synthetic */ Custom copy$default(Custom custom, View view, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                view = custom.content;
            }
            if ((i & 2) != 0) {
                str = custom.placeholderUrl;
            }
            if ((i & 4) != 0) {
                obj = custom.extra;
            }
            return custom.copy(view, str, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final View getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholderUrl() {
            return this.placeholderUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final Object getExtra() {
            return this.extra;
        }

        public final Custom copy(View content, String placeholderUrl, Object extra) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Custom(content, placeholderUrl, extra);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return Intrinsics.areEqual(this.content, custom.content) && Intrinsics.areEqual(this.placeholderUrl, custom.placeholderUrl) && Intrinsics.areEqual(this.extra, custom.extra);
        }

        public int hashCode() {
            int hashCode = this.content.hashCode() * 31;
            String str = this.placeholderUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Object obj = this.extra;
            return hashCode2 + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "Custom(content=" + this.content + ", placeholderUrl=" + this.placeholderUrl + ", extra=" + this.extra + Separators.RPAREN;
        }

        public /* synthetic */ Custom(View view, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : obj);
        }

        public final View getContent() {
            return this.content;
        }

        public final String getPlaceholderUrl() {
            return this.placeholderUrl;
        }

        public final Object getExtra() {
            return this.extra;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(View content, String str, Object obj) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.placeholderUrl = str;
            this.extra = obj;
        }
    }
}
