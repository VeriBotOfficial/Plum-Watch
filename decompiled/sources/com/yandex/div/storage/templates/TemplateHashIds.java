package com.yandex.div.storage.templates;

import com.autonavi.aps.amapapi.utils.CoreUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TemplatesContainer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/templates/TemplateHashIds;", "", CoreUtil.STR_DEX_COLLECTION_NAME, "Single", "Lcom/yandex/div/storage/templates/TemplateHashIds$Collection;", "Lcom/yandex/div/storage/templates/TemplateHashIds$Single;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
interface TemplateHashIds {

    /* compiled from: TemplatesContainer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/storage/templates/TemplateHashIds$Single;", "Lcom/yandex/div/storage/templates/TemplateHashIds;", "id", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class Single implements TemplateHashIds {
        private final String id;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Single m12709boximpl(String str) {
            return new Single(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m12710constructorimpl(String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return id2;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m12711equalsimpl(String str, Object obj) {
            return (obj instanceof Single) && Intrinsics.areEqual(str, ((Single) obj).m12715unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m12712equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m12713hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m12714toStringimpl(String str) {
            return "Single(id=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m12711equalsimpl(this.id, obj);
        }

        public int hashCode() {
            return m12713hashCodeimpl(this.id);
        }

        public String toString() {
            return m12714toStringimpl(this.id);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m12715unboximpl() {
            return this.id;
        }

        private /* synthetic */ Single(String str) {
            this.id = str;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: TemplatesContainer.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u0018\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/templates/TemplateHashIds$Collection;", "Lcom/yandex/div/storage/templates/TemplateHashIds;", "ids", "", "", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getIds", "()Ljava/util/List;", "equals", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class Collection implements TemplateHashIds {
        private final List<String> ids;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Collection m12702boximpl(List list) {
            return new Collection(list);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static List<String> m12703constructorimpl(List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return ids;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m12704equalsimpl(List<String> list, Object obj) {
            return (obj instanceof Collection) && Intrinsics.areEqual(list, ((Collection) obj).getIds());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m12705equalsimpl0(List<String> list, List<String> list2) {
            return Intrinsics.areEqual(list, list2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m12706hashCodeimpl(List<String> list) {
            return list.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m12707toStringimpl(List<String> list) {
            return "Collection(ids=" + list + ')';
        }

        public boolean equals(Object obj) {
            return m12704equalsimpl(this.ids, obj);
        }

        public int hashCode() {
            return m12706hashCodeimpl(this.ids);
        }

        public String toString() {
            return m12707toStringimpl(this.ids);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ List getIds() {
            return this.ids;
        }

        private /* synthetic */ Collection(List list) {
            this.ids = list;
        }

        public final List<String> getIds() {
            return this.ids;
        }
    }
}
