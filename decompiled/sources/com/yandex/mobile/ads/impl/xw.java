package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Serializable
/* loaded from: classes5.dex */
public final class xw {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f17374a;
    private final String b;
    private final String c;
    private final String d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements GeneratedSerializer<xw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17375a;
        private static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            f17375a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("app_id", false);
            pluginGeneratedSerialDescriptor.addElement("app_version", false);
            pluginGeneratedSerialDescriptor.addElement("system", false);
            pluginGeneratedSerialDescriptor.addElement(com.umeng.analytics.pro.ak.aj, false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final Object deserialize(Decoder decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                str3 = decodeStringElement2;
                str4 = decodeStringElement;
                i = 15;
            } else {
                str = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                        i2 |= 8;
                    }
                }
                str2 = str5;
                str3 = str6;
                str4 = str7;
                i = i2;
            }
            String str8 = str;
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new xw(i, str8, str4, str3, str2);
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer};
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(Encoder encoder, Object obj) {
            xw value = (xw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            xw.a(value, beginStructure, pluginGeneratedSerialDescriptor);
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
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return Intrinsics.areEqual(this.f17374a, xwVar.f17374a) && Intrinsics.areEqual(this.b, xwVar.b) && Intrinsics.areEqual(this.c, xwVar.c) && Intrinsics.areEqual(this.d, xwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v3.a(this.c, v3.a(this.b, this.f17374a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAppData(appId=" + this.f17374a + ", appVersion=" + this.b + ", system=" + this.c + ", androidApiLevel=" + this.d + Separators.RPAREN;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ xw(int i, @SerialName("app_id") String str, @SerialName("app_version") String str2, @SerialName("system") String str3, @SerialName("api_level") String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, a.f17375a.getDescriptor());
        }
        this.f17374a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public xw(String appId, String appVersion, String system, String androidApiLevel) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        this.f17374a = appId;
        this.b = appVersion;
        this.c = system;
        this.d = androidApiLevel;
    }

    public static final class b {
        public final KSerializer<xw> serializer() {
            return a.f17375a;
        }

        private b() {
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public final String b() {
        return this.f17374a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }

    @JvmStatic
    public static final /* synthetic */ void a(xw xwVar, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, xwVar.f17374a);
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 1, xwVar.b);
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 2, xwVar.c);
        compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 3, xwVar.d);
    }
}
