package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* loaded from: classes5.dex */
public final class g01 implements Parcelable {
    private static final KSerializer<Object>[] d;
    private final String b;
    private final Map<String, String> c;
    public static final b Companion = new b(0);
    public static final Parcelable.Creator<g01> CREATOR = new c();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements GeneratedSerializer<g01> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15541a;
        private static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            f15541a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("adapter", false);
            pluginGeneratedSerialDescriptor.addElement("network_data", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, g01.d[1]};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            int i;
            String str;
            Map map;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = g01.d;
            String str2 = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                map = (Map) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                Map map2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        map2 = (Map) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], map2);
                        i2 |= 2;
                    }
                }
                i = i2;
                str = str2;
                map = map2;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new g01(i, str, map);
        }

        private a() {
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            g01 value = (g01) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            g01.a(value, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class c implements Parcelable.Creator<g01> {
        @Override // android.os.Parcelable.Creator
        public final g01 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new g01(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final g01[] newArray(int i) {
            return new g01[i];
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        d = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g01)) {
            return false;
        }
        g01 g01Var = (g01) obj;
        return Intrinsics.areEqual(this.b, g01Var.b) && Intrinsics.areEqual(this.c, g01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.b + ", networkData=" + this.c + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.b);
        Map<String, String> map = this.c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ g01(int i, @SerialName("adapter") String str, @SerialName("network_data") Map map) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, a.f15541a.getDescriptor());
        }
        this.b = str;
        this.c = map;
    }

    @JvmStatic
    public static final /* synthetic */ void a(g01 g01Var, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<Object>[] kSerializerArr = d;
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, g01Var.b);
        compositeEncoder.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], g01Var.c);
    }

    public g01(String adapter, LinkedHashMap networkData) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        this.b = adapter;
        this.c = networkData;
    }

    public static final class b {
        public final KSerializer<g01> serializer() {
            return a.f15541a;
        }

        private b() {
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public final String d() {
        return this.b;
    }

    public final Map<String, String> e() {
        return this.c;
    }
}
