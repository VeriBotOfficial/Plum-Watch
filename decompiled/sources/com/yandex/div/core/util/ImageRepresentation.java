package com.yandex.div.core.util;

import com.bumptech.glide.Registry;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageRepresentation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/util/ImageRepresentation;", "", Registry.BUCKET_BITMAP, "PictureDrawable", "Lcom/yandex/div/core/util/ImageRepresentation$Bitmap;", "Lcom/yandex/div/core/util/ImageRepresentation$PictureDrawable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ImageRepresentation {

    /* compiled from: ImageRepresentation.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/util/ImageRepresentation$Bitmap;", "Lcom/yandex/div/core/util/ImageRepresentation;", "value", "Landroid/graphics/Bitmap;", "constructor-impl", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "getValue", "()Landroid/graphics/Bitmap;", "equals", "", "other", "", "equals-impl", "(Landroid/graphics/Bitmap;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/graphics/Bitmap;)I", "toString", "", "toString-impl", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class Bitmap implements ImageRepresentation {
        private final android.graphics.Bitmap value;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m12573boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m12574constructorimpl(android.graphics.Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m12575equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && Intrinsics.areEqual(bitmap, ((Bitmap) obj).m12579unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m12576equalsimpl0(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
            return Intrinsics.areEqual(bitmap, bitmap2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m12577hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m12578toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m12575equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m12577hashCodeimpl(this.value);
        }

        public String toString() {
            return m12578toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.Bitmap m12579unboximpl() {
            return this.value;
        }

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }

        public final android.graphics.Bitmap getValue() {
            return this.value;
        }
    }

    /* compiled from: ImageRepresentation.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/util/ImageRepresentation$PictureDrawable;", "Lcom/yandex/div/core/util/ImageRepresentation;", "value", "Landroid/graphics/drawable/PictureDrawable;", "constructor-impl", "(Landroid/graphics/drawable/PictureDrawable;)Landroid/graphics/drawable/PictureDrawable;", "getValue", "()Landroid/graphics/drawable/PictureDrawable;", "equals", "", "other", "", "equals-impl", "(Landroid/graphics/drawable/PictureDrawable;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/graphics/drawable/PictureDrawable;)I", "toString", "", "toString-impl", "(Landroid/graphics/drawable/PictureDrawable;)Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class PictureDrawable implements ImageRepresentation {
        private final android.graphics.drawable.PictureDrawable value;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m12580boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m12581constructorimpl(android.graphics.drawable.PictureDrawable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m12582equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && Intrinsics.areEqual(pictureDrawable, ((PictureDrawable) obj).m12586unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m12583equalsimpl0(android.graphics.drawable.PictureDrawable pictureDrawable, android.graphics.drawable.PictureDrawable pictureDrawable2) {
            return Intrinsics.areEqual(pictureDrawable, pictureDrawable2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m12584hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m12585toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m12582equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m12584hashCodeimpl(this.value);
        }

        public String toString() {
            return m12585toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable m12586unboximpl() {
            return this.value;
        }

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }

        public final android.graphics.drawable.PictureDrawable getValue() {
            return this.value;
        }
    }
}
