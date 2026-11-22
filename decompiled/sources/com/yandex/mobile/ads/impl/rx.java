package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.hw;
import com.yandex.mobile.ads.impl.qx;
import com.yandex.mobile.ads.impl.uw;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* loaded from: classes5.dex */
public final class rx {
    public static final b Companion = new b(0);
    private static final KSerializer<Object>[] h = {null, null, null, null, new ArrayListSerializer(uw.a.f17091a), new ArrayListSerializer(hw.a.f15733a), new ArrayListSerializer(qx.a.f16706a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f16806a;
    private final String b;
    private final String c;
    private final String d;
    private final List<uw> e;
    private final List<hw> f;
    private final List<qx> g;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements GeneratedSerializer<rx> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16807a;
        private static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            f16807a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("page_id", true);
            pluginGeneratedSerialDescriptor.addElement("latest_sdk_version", true);
            pluginGeneratedSerialDescriptor.addElement("app_ads_txt_url", true);
            pluginGeneratedSerialDescriptor.addElement("app_status", true);
            pluginGeneratedSerialDescriptor.addElement("alerts", true);
            pluginGeneratedSerialDescriptor.addElement("ad_units", true);
            pluginGeneratedSerialDescriptor.addElement("mediation_networks", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = rx.h;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(kSerializerArr[5]), kSerializerArr[6]};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            List list;
            String str;
            int i;
            String str2;
            String str3;
            List list2;
            String str4;
            List list3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = rx.h;
            int i2 = 3;
            String str5 = null;
            if (beginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str6 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
                str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
                String str7 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
                String str8 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
                List list4 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], null);
                List list5 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], null);
                list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], null);
                str3 = str8;
                list3 = list4;
                list = list5;
                str2 = str6;
                str = str7;
                i = 127;
            } else {
                boolean z = true;
                int i3 = 0;
                List list6 = null;
                List list7 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                List list8 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 3;
                        case 0:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str5);
                            i3 |= 1;
                            i2 = 3;
                        case 1:
                            str9 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str9);
                            i3 |= 2;
                            i2 = 3;
                        case 2:
                            str10 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str10);
                            i3 |= 4;
                            i2 = 3;
                        case 3:
                            str11 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, StringSerializer.INSTANCE, str11);
                            i3 |= 8;
                        case 4:
                            list8 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list8);
                            i3 |= 16;
                        case 5:
                            list7 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list7);
                            i3 |= 32;
                        case 6:
                            list6 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list6);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                String str12 = str10;
                list = list7;
                str = str12;
                i = i3;
                str2 = str5;
                str3 = str11;
                list2 = list6;
                str4 = str9;
                list3 = list8;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new rx(i, str2, str4, str, str3, list3, list, list2);
        }

        private a() {
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            rx value = (rx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            rx.a(value, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return Intrinsics.areEqual(this.f16806a, rxVar.f16806a) && Intrinsics.areEqual(this.b, rxVar.b) && Intrinsics.areEqual(this.c, rxVar.c) && Intrinsics.areEqual(this.d, rxVar.d) && Intrinsics.areEqual(this.e, rxVar.e) && Intrinsics.areEqual(this.f, rxVar.f) && Intrinsics.areEqual(this.g, rxVar.g);
    }

    public final int hashCode() {
        String str = this.f16806a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<uw> list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<hw> list2 = this.f;
        return this.g.hashCode() + ((hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.f16806a + ", latestSdkVersion=" + this.b + ", appAdsTxtUrl=" + this.c + ", appStatus=" + this.d + ", alerts=" + this.e + ", adUnits=" + this.f + ", mediationNetworks=" + this.g + Separators.RPAREN;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ rx(int i, @SerialName("page_id") String str, @SerialName("latest_sdk_version") String str2, @SerialName("app_ads_txt_url") String str3, @SerialName("app_status") String str4, @SerialName("alerts") List list, @SerialName("ad_units") List list2, @SerialName("mediation_networks") List list3) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, a.f16807a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f16806a = null;
        } else {
            this.f16806a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        this.g = list3;
    }

    @JvmStatic
    public static final /* synthetic */ void a(rx rxVar, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<Object>[] kSerializerArr = h;
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || rxVar.f16806a != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, rxVar.f16806a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || rxVar.b != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, rxVar.b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || rxVar.c != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, rxVar.c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || rxVar.d != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, rxVar.d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || rxVar.e != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], rxVar.e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || rxVar.f != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], rxVar.f);
        }
        compositeEncoder.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], rxVar.g);
    }

    public static final class b {
        public final KSerializer<rx> serializer() {
            return a.f16807a;
        }

        private b() {
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public final String g() {
        return this.f16806a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final List<uw> c() {
        return this.e;
    }

    public final List<hw> b() {
        return this.f;
    }

    public final List<qx> f() {
        return this.g;
    }
}
