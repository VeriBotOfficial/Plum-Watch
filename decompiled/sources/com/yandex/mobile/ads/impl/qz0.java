package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* loaded from: classes5.dex */
public final class qz0 {
    public static final b Companion = new b(0);
    private static final KSerializer<Object>[] e = {null, null, null, new ArrayListSerializer(c.a.f16714a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f16711a;
    private final String b;
    private final String c;
    private final List<c> d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements GeneratedSerializer<qz0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16712a;
        private static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            f16712a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("name", false);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("version", false);
            pluginGeneratedSerialDescriptor.addElement("adapters", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = qz0.e;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[3]};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            int i;
            String str;
            String str2;
            String str3;
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            KSerializer[] kSerializerArr = qz0.e;
            String str4 = null;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, null);
                list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], null);
                str = decodeStringElement;
                str3 = str5;
                i = 15;
                str2 = decodeStringElement2;
            } else {
                boolean z = true;
                int i2 = 0;
                String str6 = null;
                String str7 = null;
                List list2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str7 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str7);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
                        i2 |= 8;
                    }
                }
                i = i2;
                str = str4;
                str2 = str6;
                str3 = str7;
                list = list2;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new qz0(i, str, str2, str3, list);
        }

        private a() {
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            qz0 value = (qz0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            qz0.a(value, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Serializable
    public static final class c {
        public static final b Companion = new b(0);

        /* renamed from: a, reason: collision with root package name */
        private final String f16713a;
        private final String b;
        private final boolean c;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements GeneratedSerializer<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f16714a;
            private static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                a aVar = new a();
                f16714a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", aVar, 3);
                pluginGeneratedSerialDescriptor.addElement("format", false);
                pluginGeneratedSerialDescriptor.addElement("version", false);
                pluginGeneratedSerialDescriptor.addElement("isIntegrated", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final Object deserialize(Decoder decoder) {
                boolean z;
                int i;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, null);
                    z = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                    i = 7;
                } else {
                    boolean z2 = true;
                    boolean z3 = false;
                    String str3 = null;
                    String str4 = null;
                    int i2 = 0;
                    while (z2) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (decodeElementIndex == -1) {
                            z2 = false;
                        } else if (decodeElementIndex == 0) {
                            str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str4);
                            i2 |= 2;
                        } else {
                            if (decodeElementIndex != 2) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                        }
                    }
                    z = z3;
                    i = i2;
                    str = str3;
                    str2 = str4;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i, str, str2, z);
            }

            private a() {
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(Encoder encoder, Object obj) {
                c value = (c) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                c.a(value, beginStructure, pluginGeneratedSerialDescriptor);
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f16713a, cVar.f16713a) && Intrinsics.areEqual(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            int hashCode = this.f16713a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "MediationAdapterData(format=" + this.f16713a + ", version=" + this.b + ", isIntegrated=" + this.c + Separators.RPAREN;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ c(int i, String str, String str2, boolean z) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, a.f16714a.getDescriptor());
            }
            this.f16713a = str;
            this.b = str2;
            this.c = z;
        }

        public c(String format, String str, boolean z) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f16713a = format;
            this.b = str;
            this.c = z;
        }

        public static final class b {
            public final KSerializer<c> serializer() {
                return a.f16714a;
            }

            private b() {
            }

            public /* synthetic */ b(int i) {
                this();
            }
        }

        public final String a() {
            return this.f16713a;
        }

        public final String b() {
            return this.b;
        }

        @JvmStatic
        public static final /* synthetic */ void a(c cVar, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cVar.f16713a);
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, cVar.b);
            compositeEncoder.encodeBooleanElement(pluginGeneratedSerialDescriptor, 2, cVar.c);
        }

        public final boolean c() {
            return this.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz0)) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        return Intrinsics.areEqual(this.f16711a, qz0Var.f16711a) && Intrinsics.areEqual(this.b, qz0Var.b) && Intrinsics.areEqual(this.c, qz0Var.c) && Intrinsics.areEqual(this.d, qz0Var.d);
    }

    public final int hashCode() {
        int a2 = v3.a(this.b, this.f16711a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationNetworkData(name=" + this.f16711a + ", id=" + this.b + ", version=" + this.c + ", adapters=" + this.d + Separators.RPAREN;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ qz0(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, a.f16712a.getDescriptor());
        }
        this.f16711a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    @JvmStatic
    public static final /* synthetic */ void a(qz0 qz0Var, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<Object>[] kSerializerArr = e;
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, qz0Var.f16711a);
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 1, qz0Var.b);
        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, qz0Var.c);
        compositeEncoder.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], qz0Var.d);
    }

    public qz0(String name, String id2, String str, ArrayList adapters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f16711a = name;
        this.b = id2;
        this.c = str;
        this.d = adapters;
    }

    public static final class b {
        public final KSerializer<qz0> serializer() {
            return a.f16712a;
        }

        private b() {
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public final String d() {
        return this.f16711a;
    }

    public final String c() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final List<c> b() {
        return this.d;
    }
}
