package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/Contact;", "", "qrImageUrl", "", "qrImageBase64", "qrKind", "qrPayload", "waMeUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQrImageUrl", "()Ljava/lang/String;", "getQrImageBase64", "getQrKind", "getQrPayload", "getWaMeUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Contact {

    @SerializedName("qr_image_base64")
    private final String qrImageBase64;

    @SerializedName("qr_image_url")
    private final String qrImageUrl;

    @SerializedName("qr_kind")
    private final String qrKind;

    @SerializedName("qr_payload")
    private final String qrPayload;

    @SerializedName("wa_me_url")
    private final String waMeUrl;

    public Contact() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contact.qrImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = contact.qrImageBase64;
        }
        if ((i & 4) != 0) {
            str3 = contact.qrKind;
        }
        if ((i & 8) != 0) {
            str4 = contact.qrPayload;
        }
        if ((i & 16) != 0) {
            str5 = contact.waMeUrl;
        }
        String str6 = str5;
        String str7 = str3;
        return contact.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrImageUrl() {
        return this.qrImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrImageBase64() {
        return this.qrImageBase64;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrKind() {
        return this.qrKind;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQrPayload() {
        return this.qrPayload;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWaMeUrl() {
        return this.waMeUrl;
    }

    public final Contact copy(String qrImageUrl, String qrImageBase64, String qrKind, String qrPayload, String waMeUrl) {
        return new Contact(qrImageUrl, qrImageBase64, qrKind, qrPayload, waMeUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) other;
        return Intrinsics.areEqual(this.qrImageUrl, contact.qrImageUrl) && Intrinsics.areEqual(this.qrImageBase64, contact.qrImageBase64) && Intrinsics.areEqual(this.qrKind, contact.qrKind) && Intrinsics.areEqual(this.qrPayload, contact.qrPayload) && Intrinsics.areEqual(this.waMeUrl, contact.waMeUrl);
    }

    public int hashCode() {
        String str = this.qrImageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.qrImageBase64;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qrKind;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.qrPayload;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.waMeUrl;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "Contact(qrImageUrl=" + this.qrImageUrl + ", qrImageBase64=" + this.qrImageBase64 + ", qrKind=" + this.qrKind + ", qrPayload=" + this.qrPayload + ", waMeUrl=" + this.waMeUrl + Separators.RPAREN;
    }

    public Contact(String str, String str2, String str3, String str4, String str5) {
        this.qrImageUrl = str;
        this.qrImageBase64 = str2;
        this.qrKind = str3;
        this.qrPayload = str4;
        this.waMeUrl = str5;
    }

    public /* synthetic */ Contact(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getQrImageUrl() {
        return this.qrImageUrl;
    }

    public final String getQrImageBase64() {
        return this.qrImageBase64;
    }

    public final String getQrKind() {
        return this.qrKind;
    }

    public final String getQrPayload() {
        return this.qrPayload;
    }

    public final String getWaMeUrl() {
        return this.waMeUrl;
    }
}
