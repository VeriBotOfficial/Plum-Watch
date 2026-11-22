package com.wakeup.feature.device.dial.preview;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: WatchFaceBinParser.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0007JB\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser;", "", "<init>", "()V", "le16", "", "d", "", "i", "le32", "kindOf", "Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Kind;", "id", "parse", "Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$WatchFace;", "data", "decode", "Landroid/graphics/Bitmap;", "clt", "dat", "w", "h", "rec", "Kind", "Element", "WatchFace", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchFaceBinParser {
    public static final WatchFaceBinParser INSTANCE = new WatchFaceBinParser();

    private WatchFaceBinParser() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WatchFaceBinParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC", "HOUR", "MINUTE", "DATE", "MONTH", "WEEKDAY", "YEAR", "AMPM", "BATTERY", "STEPS", "CALORIES", "HEART", "DISTANCE", "SLEEP", "ANALOG", "UNKNOWN", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind STATIC = new Kind("STATIC", 0);
        public static final Kind HOUR = new Kind("HOUR", 1);
        public static final Kind MINUTE = new Kind("MINUTE", 2);
        public static final Kind DATE = new Kind("DATE", 3);
        public static final Kind MONTH = new Kind("MONTH", 4);
        public static final Kind WEEKDAY = new Kind("WEEKDAY", 5);
        public static final Kind YEAR = new Kind("YEAR", 6);
        public static final Kind AMPM = new Kind("AMPM", 7);
        public static final Kind BATTERY = new Kind("BATTERY", 8);
        public static final Kind STEPS = new Kind("STEPS", 9);
        public static final Kind CALORIES = new Kind("CALORIES", 10);
        public static final Kind HEART = new Kind("HEART", 11);
        public static final Kind DISTANCE = new Kind("DISTANCE", 12);
        public static final Kind SLEEP = new Kind("SLEEP", 13);
        public static final Kind ANALOG = new Kind("ANALOG", 14);
        public static final Kind UNKNOWN = new Kind("UNKNOWN", 15);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{STATIC, HOUR, MINUTE, DATE, MONTH, WEEKDAY, YEAR, AMPM, BATTERY, STEPS, CALORIES, HEART, DISTANCE, SLEEP, ANALOG, UNKNOWN};
        }

        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }

        private Kind(String str, int i) {
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* compiled from: WatchFaceBinParser.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Element;", "", "id", "", "kind", "Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Kind;", "x", "y", "w", "h", "cmp", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(ILcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Kind;IIIIILandroid/graphics/Bitmap;)V", "getId", "()I", "getKind", "()Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Kind;", "getX", "getY", "getW", "getH", "getCmp", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Element {
        private final Bitmap bitmap;
        private final int cmp;
        private final int h;
        private final int id;
        private final Kind kind;
        private final int w;
        private final int x;
        private final int y;

        public static /* synthetic */ Element copy$default(Element element, int i, Kind kind, int i2, int i3, int i4, int i5, int i6, Bitmap bitmap, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i = element.id;
            }
            if ((i7 & 2) != 0) {
                kind = element.kind;
            }
            if ((i7 & 4) != 0) {
                i2 = element.x;
            }
            if ((i7 & 8) != 0) {
                i3 = element.y;
            }
            if ((i7 & 16) != 0) {
                i4 = element.w;
            }
            if ((i7 & 32) != 0) {
                i5 = element.h;
            }
            if ((i7 & 64) != 0) {
                i6 = element.cmp;
            }
            if ((i7 & 128) != 0) {
                bitmap = element.bitmap;
            }
            int i8 = i6;
            Bitmap bitmap2 = bitmap;
            int i9 = i4;
            int i10 = i5;
            return element.copy(i, kind, i2, i3, i9, i10, i8, bitmap2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Kind getKind() {
            return this.kind;
        }

        /* renamed from: component3, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* renamed from: component4, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* renamed from: component5, reason: from getter */
        public final int getW() {
            return this.w;
        }

        /* renamed from: component6, reason: from getter */
        public final int getH() {
            return this.h;
        }

        /* renamed from: component7, reason: from getter */
        public final int getCmp() {
            return this.cmp;
        }

        /* renamed from: component8, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Element copy(int id2, Kind kind, int x, int y, int w, int h, int cmp, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            return new Element(id2, kind, x, y, w, h, cmp, bitmap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Element)) {
                return false;
            }
            Element element = (Element) other;
            return this.id == element.id && this.kind == element.kind && this.x == element.x && this.y == element.y && this.w == element.w && this.h == element.h && this.cmp == element.cmp && Intrinsics.areEqual(this.bitmap, element.bitmap);
        }

        public int hashCode() {
            int hashCode = ((((((((((((Integer.hashCode(this.id) * 31) + this.kind.hashCode()) * 31) + Integer.hashCode(this.x)) * 31) + Integer.hashCode(this.y)) * 31) + Integer.hashCode(this.w)) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.cmp)) * 31;
            Bitmap bitmap = this.bitmap;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "Element(id=" + this.id + ", kind=" + this.kind + ", x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ", cmp=" + this.cmp + ", bitmap=" + this.bitmap + Separators.RPAREN;
        }

        public Element(int i, Kind kind, int i2, int i3, int i4, int i5, int i6, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.id = i;
            this.kind = kind;
            this.x = i2;
            this.y = i3;
            this.w = i4;
            this.h = i5;
            this.cmp = i6;
            this.bitmap = bitmap;
        }

        public final int getId() {
            return this.id;
        }

        public final Kind getKind() {
            return this.kind;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public final int getH() {
            return this.h;
        }

        public final int getW() {
            return this.w;
        }

        public final int getCmp() {
            return this.cmp;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }
    }

    /* compiled from: WatchFaceBinParser.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$WatchFace;", "", "width", "", "height", "elements", "", "Lcom/wakeup/feature/device/dial/preview/WatchFaceBinParser$Element;", "hasAnalog", "", "<init>", "(IILjava/util/List;Z)V", "getWidth", "()I", "getHeight", "getElements", "()Ljava/util/List;", "getHasAnalog", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WatchFace {
        private final List<Element> elements;
        private final boolean hasAnalog;
        private final int height;
        private final int width;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WatchFace copy$default(WatchFace watchFace, int i, int i2, List list, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = watchFace.width;
            }
            if ((i3 & 2) != 0) {
                i2 = watchFace.height;
            }
            if ((i3 & 4) != 0) {
                list = watchFace.elements;
            }
            if ((i3 & 8) != 0) {
                z = watchFace.hasAnalog;
            }
            return watchFace.copy(i, i2, list, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final List<Element> component3() {
            return this.elements;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasAnalog() {
            return this.hasAnalog;
        }

        public final WatchFace copy(int width, int height, List<Element> elements, boolean hasAnalog) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new WatchFace(width, height, elements, hasAnalog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WatchFace)) {
                return false;
            }
            WatchFace watchFace = (WatchFace) other;
            return this.width == watchFace.width && this.height == watchFace.height && Intrinsics.areEqual(this.elements, watchFace.elements) && this.hasAnalog == watchFace.hasAnalog;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + this.elements.hashCode()) * 31) + Boolean.hashCode(this.hasAnalog);
        }

        public String toString() {
            return "WatchFace(width=" + this.width + ", height=" + this.height + ", elements=" + this.elements + ", hasAnalog=" + this.hasAnalog + Separators.RPAREN;
        }

        public WatchFace(int i, int i2, List<Element> elements, boolean z) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.width = i;
            this.height = i2;
            this.elements = elements;
            this.hasAnalog = z;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final List<Element> getElements() {
            return this.elements;
        }

        public final boolean getHasAnalog() {
            return this.hasAnalog;
        }
    }

    private final int le16(byte[] d, int i) {
        return ((d[i + 1] & 255) << 8) | (d[i] & 255);
    }

    private final int le32(byte[] d, int i) {
        return ((d[i + 3] & 255) << 24) | (d[i] & 255) | ((d[i + 1] & 255) << 8) | ((d[i + 2] & 255) << 16);
    }

    private final Kind kindOf(int id2) {
        if (id2 == 0) {
            return Kind.HOUR;
        }
        if (id2 == 1) {
            return Kind.MINUTE;
        }
        if (id2 == 2) {
            return Kind.DATE;
        }
        if (id2 == 3) {
            return Kind.MONTH;
        }
        if (id2 == 11) {
            return Kind.BATTERY;
        }
        if (id2 == 253) {
            return Kind.STATIC;
        }
        if (id2 == 19) {
            return Kind.SLEEP;
        }
        if (id2 == 20) {
            return Kind.DISTANCE;
        }
        if (id2 == 25) {
            return Kind.STATIC;
        }
        if (id2 != 26) {
            switch (id2) {
                case 6:
                    return Kind.WEEKDAY;
                case 7:
                    return Kind.YEAR;
                case 8:
                    return Kind.AMPM;
                case 9:
                    return Kind.STATIC;
                default:
                    switch (id2) {
                        case 13:
                            break;
                        case 14:
                            return Kind.STEPS;
                        case 15:
                            return Kind.CALORIES;
                        case 16:
                            return Kind.HEART;
                        default:
                            return Kind.UNKNOWN;
                    }
            }
        }
        return Kind.ANALOG;
    }

    public final WatchFace parse(byte[] data) {
        int le32;
        Bitmap bitmap;
        WatchFaceBinParser watchFaceBinParser = this;
        byte[] data2 = data;
        Intrinsics.checkNotNullParameter(data2, "data");
        if (data2.length < 24 || (le32 = watchFaceBinParser.le32(data2, 0)) <= 0 || le32 > 512) {
            return null;
        }
        Integer valueOf = Integer.valueOf(watchFaceBinParser.le16(data2, 12));
        int intValue = valueOf.intValue();
        if (100 > intValue || intValue >= 601) {
            valueOf = null;
        }
        int intValue2 = valueOf != null ? valueOf.intValue() : 360;
        Integer valueOf2 = Integer.valueOf(watchFaceBinParser.le16(data2, 14));
        int intValue3 = valueOf2.intValue();
        if (100 > intValue3 || intValue3 >= 601) {
            valueOf2 = null;
        }
        int intValue4 = valueOf2 != null ? valueOf2.intValue() : 360;
        ArrayList arrayList = new ArrayList(le32);
        int i = 0;
        boolean z = false;
        while (i < le32) {
            int i2 = i * 20;
            if (i2 + 24 > data2.length) {
                break;
            }
            int i3 = data2[i2 + 4] & 255;
            byte b = data2[i2 + 5];
            int i4 = (b & 128) == 128 ? b & Byte.MAX_VALUE : 1;
            int le16 = watchFaceBinParser.le16(data2, i2 + 8);
            int le162 = watchFaceBinParser.le16(data2, i2 + 10);
            int le163 = watchFaceBinParser.le16(data2, i2 + 12);
            int le164 = watchFaceBinParser.le16(data2, i2 + 14);
            int le322 = watchFaceBinParser.le32(data2, i2 + 16);
            int le323 = watchFaceBinParser.le32(data2, i2 + 20);
            Kind kindOf = watchFaceBinParser.kindOf(i3);
            if (kindOf == Kind.ANALOG) {
                arrayList.add(new Element(i3, kindOf, le16, le162, le163, le164, i4, null));
                z = true;
            } else {
                int i5 = i3;
                if (kindOf == Kind.UNKNOWN || le163 <= 0 || le164 <= 0 || i4 <= 0) {
                    arrayList.add(new Element(i5, kindOf, le16, le162, le163, le164, i4, null));
                } else {
                    try {
                        bitmap = watchFaceBinParser.decode(data2, i5, le322, le323, le163, le164, i2);
                    } catch (Throwable unused) {
                        i5 = i5;
                        le163 = le163;
                        le164 = le164;
                        bitmap = null;
                    }
                    arrayList.add(new Element(i5, kindOf, le16, le162, le163, le164, i4, bitmap));
                }
            }
            i++;
            watchFaceBinParser = this;
            data2 = data;
        }
        return new WatchFace(intValue2, intValue4, arrayList, z);
    }

    private final Bitmap decode(byte[] data, int id2, int clt, int dat, int w, int h, int rec) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = w * h;
        if (i5 <= 0 || i5 > 4000000) {
            return null;
        }
        int[] iArr = new int[i5];
        boolean z = id2 == 25;
        int i6 = z ? data[rec + 16] & 255 : 0;
        int i7 = z ? data[rec + 17] & 255 : 0;
        for (int i8 = 0; i8 < i5; i8++) {
            if (z) {
                i3 = i6;
                i4 = i7;
            } else {
                int i9 = dat + i8;
                if (i9 >= data.length || (i2 = (i = clt + ((data[i9] & 255) * 2)) + 1) >= data.length) {
                    return null;
                }
                i3 = data[i] & 255;
                i4 = data[i2] & 255;
            }
            int i10 = i4 & TelnetCommand.EL;
            int i11 = ((i4 & 7) << 5) | ((i3 & 224) >> 3);
            int i12 = (i3 & 31) << 3;
            iArr[i8] = i12 | (i11 << 8) | (i10 << 16) | (((i10 == 0 && i11 == 0 && i12 == 0) ? 0 : 255) << 24);
        }
        Bitmap createBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        createBitmap.setPixels(iArr, 0, w, 0, 0, w, h);
        return createBitmap;
    }
}
