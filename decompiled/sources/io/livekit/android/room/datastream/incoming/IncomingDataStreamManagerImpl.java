package io.livekit.android.room.datastream.incoming;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.SystemClock;
import com.autonavi.aps.amapapi.config.Const;
import com.google.protobuf.ByteString;
import io.livekit.android.room.datastream.ByteStreamInfo;
import io.livekit.android.room.datastream.StreamException;
import io.livekit.android.room.datastream.StreamInfo;
import io.livekit.android.room.datastream.TextStreamInfo;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import livekit.LivekitModels;

/* compiled from: IncomingDataStreamManager.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 62\u00020\u0001:\u000267B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J,\u0010\u0019\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0007j\u0002`\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J*\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+2\u0006\u0010\"\u001a\u00020#H\u0016J\"\u0010,\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.JL\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00052:\u00101\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007j\u0002`\u000fH\u0016JL\u00102\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00052:\u00101\u001a6\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007j\u0002`\u0015H\u0016J\u001a\u00103\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00104\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0005H\u0016R¤\u0002\u0010\u0003\u001a\u0097\u0002\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012v\u0012t\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e \u0006*:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007j\u0004\u0018\u0001`\u000f0\u0007j\u0002`\u000f \u0006*\u008a\u0001\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012v\u0012t\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e \u0006*:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007j\u0004\u0018\u0001`\u000f0\u0007j\u0002`\u000f\u0018\u00010\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\u0011\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R¤\u0002\u0010\u0013\u001a\u0097\u0002\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012v\u0012t\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e \u0006*:\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007j\u0004\u0018\u0001`\u00150\u0007j\u0002`\u0015 \u0006*\u008a\u0001\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012v\u0012t\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e \u0006*:\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007j\u0004\u0018\u0001`\u00150\u0007j\u0002`\u0015\u0018\u00010\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl;", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "()V", "byteStreamHandlers", "", "", "kotlin.jvm.PlatformType", "Lkotlin/Function2;", "Lio/livekit/android/room/datastream/incoming/ByteStreamReceiver;", "Lkotlin/ParameterName;", "name", "reader", "Lio/livekit/android/room/participant/Participant$Identity;", "fromIdentity", "", "Lio/livekit/android/room/datastream/incoming/ByteStreamHandler;", "", "openStreams", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Descriptor;", "textStreamHandlers", "Lio/livekit/android/room/datastream/incoming/TextStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/TextStreamHandler;", "clearOpenStreams", "closeStream", "id", "getHandlerForInfo", "Lkotlinx/coroutines/channels/Channel;", "", "Lio/livekit/android/room/datastream/incoming/AnyStreamHandler;", ParameterNames.INFO, "Lio/livekit/android/room/datastream/StreamInfo;", "handleDataChunk", "chunk", "Llivekit/LivekitModels$DataStream$Chunk;", "encryptionType", "Llivekit/LivekitModels$Encryption$Type;", "handleStreamHeader", "header", "Llivekit/LivekitModels$DataStream$Header;", "handleStreamHeader-qaitkU4", "(Llivekit/LivekitModels$DataStream$Header;Ljava/lang/String;Llivekit/LivekitModels$Encryption$Type;)V", "handleStreamTrailer", "trailer", "Llivekit/LivekitModels$DataStream$Trailer;", "openStream", "openStream-Fe0n8cs", "(Lio/livekit/android/room/datastream/StreamInfo;Ljava/lang/String;)V", "registerByteStreamHandler", "topic", "handler", "registerTextStreamHandler", "streamInfoFromHeader", "unregisterByteStreamHandler", "unregisterTextStreamHandler", "Companion", "Descriptor", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IncomingDataStreamManagerImpl implements IncomingDataStreamManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Descriptor> openStreams = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, Function2<TextStreamReceiver, Participant.Identity, Unit>> textStreamHandlers = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, Function2<ByteStreamReceiver, Participant.Identity, Unit>> byteStreamHandlers = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: IncomingDataStreamManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivekitModels.DataStream.Header.ContentHeaderCase.values().length];
            try {
                iArr[LivekitModels.DataStream.Header.ContentHeaderCase.TEXT_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivekitModels.DataStream.Header.ContentHeaderCase.BYTE_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LivekitModels.DataStream.Header.ContentHeaderCase.CONTENTHEADER_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public IncomingDataStreamManagerImpl() {
    }

    /* compiled from: IncomingDataStreamManager.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Descriptor;", "", "streamInfo", "Lio/livekit/android/room/datastream/StreamInfo;", "openTime", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "", "readLength", "(Lio/livekit/android/room/datastream/StreamInfo;JLkotlinx/coroutines/channels/Channel;J)V", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "getOpenTime", "()J", "getReadLength", "setReadLength", "(J)V", "getStreamInfo", "()Lio/livekit/android/room/datastream/StreamInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class Descriptor {
        private final Channel<byte[]> channel;
        private final long openTime;
        private long readLength;
        private final StreamInfo streamInfo;

        public static /* synthetic */ Descriptor copy$default(Descriptor descriptor, StreamInfo streamInfo, long j, Channel channel, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                streamInfo = descriptor.streamInfo;
            }
            if ((i & 2) != 0) {
                j = descriptor.openTime;
            }
            if ((i & 4) != 0) {
                channel = descriptor.channel;
            }
            if ((i & 8) != 0) {
                j2 = descriptor.readLength;
            }
            Channel channel2 = channel;
            return descriptor.copy(streamInfo, j, channel2, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final StreamInfo getStreamInfo() {
            return this.streamInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final long getOpenTime() {
            return this.openTime;
        }

        public final Channel<byte[]> component3() {
            return this.channel;
        }

        /* renamed from: component4, reason: from getter */
        public final long getReadLength() {
            return this.readLength;
        }

        public final Descriptor copy(StreamInfo streamInfo, long openTime, Channel<byte[]> channel, long readLength) {
            Intrinsics.checkNotNullParameter(streamInfo, "streamInfo");
            Intrinsics.checkNotNullParameter(channel, "channel");
            return new Descriptor(streamInfo, openTime, channel, readLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Descriptor)) {
                return false;
            }
            Descriptor descriptor = (Descriptor) other;
            return Intrinsics.areEqual(this.streamInfo, descriptor.streamInfo) && this.openTime == descriptor.openTime && Intrinsics.areEqual(this.channel, descriptor.channel) && this.readLength == descriptor.readLength;
        }

        public int hashCode() {
            return (((((this.streamInfo.hashCode() * 31) + Long.hashCode(this.openTime)) * 31) + this.channel.hashCode()) * 31) + Long.hashCode(this.readLength);
        }

        public String toString() {
            return "Descriptor(streamInfo=" + this.streamInfo + ", openTime=" + this.openTime + ", channel=" + this.channel + ", readLength=" + this.readLength + ')';
        }

        public Descriptor(StreamInfo streamInfo, long j, Channel<byte[]> channel, long j2) {
            Intrinsics.checkNotNullParameter(streamInfo, "streamInfo");
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.streamInfo = streamInfo;
            this.openTime = j;
            this.channel = channel;
            this.readLength = j2;
        }

        public /* synthetic */ Descriptor(StreamInfo streamInfo, long j, Channel channel, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(streamInfo, j, channel, (i & 8) != 0 ? 0L : j2);
        }

        public final StreamInfo getStreamInfo() {
            return this.streamInfo;
        }

        public final long getOpenTime() {
            return this.openTime;
        }

        public final Channel<byte[]> getChannel() {
            return this.channel;
        }

        public final long getReadLength() {
            return this.readLength;
        }

        public final void setReadLength(long j) {
            this.readLength = j;
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void registerTextStreamHandler(String topic, Function2<? super TextStreamReceiver, ? super Participant.Identity, Unit> handler) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Map<String, Function2<TextStreamReceiver, Participant.Identity, Unit>> textStreamHandlers = this.textStreamHandlers;
        Intrinsics.checkNotNullExpressionValue(textStreamHandlers, "textStreamHandlers");
        synchronized (textStreamHandlers) {
            if (this.textStreamHandlers.containsKey(topic)) {
                throw new IllegalArgumentException("A text stream handler for topic " + topic + " has already been set.");
            }
            Map<String, Function2<TextStreamReceiver, Participant.Identity, Unit>> textStreamHandlers2 = this.textStreamHandlers;
            Intrinsics.checkNotNullExpressionValue(textStreamHandlers2, "textStreamHandlers");
            textStreamHandlers2.put(topic, handler);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void unregisterTextStreamHandler(String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Map<String, Function2<TextStreamReceiver, Participant.Identity, Unit>> textStreamHandlers = this.textStreamHandlers;
        Intrinsics.checkNotNullExpressionValue(textStreamHandlers, "textStreamHandlers");
        synchronized (textStreamHandlers) {
            this.textStreamHandlers.remove(topic);
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void registerByteStreamHandler(String topic, Function2<? super ByteStreamReceiver, ? super Participant.Identity, Unit> handler) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Map<String, Function2<ByteStreamReceiver, Participant.Identity, Unit>> byteStreamHandlers = this.byteStreamHandlers;
        Intrinsics.checkNotNullExpressionValue(byteStreamHandlers, "byteStreamHandlers");
        synchronized (byteStreamHandlers) {
            if (this.byteStreamHandlers.containsKey(topic)) {
                throw new IllegalArgumentException("A byte stream handler for topic " + topic + " has already been set.");
            }
            Map<String, Function2<ByteStreamReceiver, Participant.Identity, Unit>> byteStreamHandlers2 = this.byteStreamHandlers;
            Intrinsics.checkNotNullExpressionValue(byteStreamHandlers2, "byteStreamHandlers");
            byteStreamHandlers2.put(topic, handler);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void unregisterByteStreamHandler(String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Map<String, Function2<ByteStreamReceiver, Participant.Identity, Unit>> byteStreamHandlers = this.byteStreamHandlers;
        Intrinsics.checkNotNullExpressionValue(byteStreamHandlers, "byteStreamHandlers");
        synchronized (byteStreamHandlers) {
            this.byteStreamHandlers.remove(topic);
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    /* renamed from: handleStreamHeader-qaitkU4 */
    public void mo13855handleStreamHeaderqaitkU4(LivekitModels.DataStream.Header header, String fromIdentity, LivekitModels.Encryption.Type encryptionType) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(fromIdentity, "fromIdentity");
        Intrinsics.checkNotNullParameter(encryptionType, "encryptionType");
        StreamInfo streamInfoFromHeader = streamInfoFromHeader(header, encryptionType);
        if (streamInfoFromHeader == null) {
            return;
        }
        m13866openStreamFe0n8cs(streamInfoFromHeader, fromIdentity);
    }

    /* renamed from: openStream-Fe0n8cs, reason: not valid java name */
    private final void m13866openStreamFe0n8cs(final StreamInfo info, String fromIdentity) {
        LKLog.Logger logger;
        LKLog.Logger logger2;
        LKLog.Logger logger3;
        if (this.openStreams.containsKey(info.getId())) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.WARN;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger3 = companion.getLogger()) == null) {
                return;
            }
            logger3.log(loggingLevel, null, "Stream already open for id " + info.getId());
            return;
        }
        Function2<Channel<byte[]>, Participant.Identity, Unit> handlerForInfo = getHandlerForInfo(info);
        Channel<byte[]> createChannelForStreamReceiver = INSTANCE.createChannelForStreamReceiver();
        Descriptor descriptor = new Descriptor(info, SystemClock.elapsedRealtime(), createChannelForStreamReceiver, 0L, 8, null);
        Map<String, Descriptor> openStreams = this.openStreams;
        Intrinsics.checkNotNullExpressionValue(openStreams, "openStreams");
        openStreams.put(info.getId(), descriptor);
        createChannelForStreamReceiver.invokeOnClose(new Function1<Throwable, Unit>() { // from class: io.livekit.android.room.datastream.incoming.IncomingDataStreamManagerImpl$openStream$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                IncomingDataStreamManagerImpl.this.closeStream(info.getId());
            }
        });
        LKLog.Companion companion2 = LKLog.INSTANCE;
        LoggingLevel loggingLevel2 = LoggingLevel.DEBUG;
        if (loggingLevel2.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger2 = companion2.getLogger()) != null) {
            logger2.log(loggingLevel2, null, "Opened stream " + info.getId());
        }
        try {
            handlerForInfo.invoke(createChannelForStreamReceiver, Participant.Identity.m13924boximpl(fromIdentity));
        } catch (Exception e) {
            LKLog.Companion companion3 = LKLog.INSTANCE;
            LoggingLevel loggingLevel3 = LoggingLevel.ERROR;
            if (loggingLevel3.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion3.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel3, e, "Unhandled exception when invoking stream handler!");
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void handleDataChunk(LivekitModels.DataStream.Chunk chunk, LivekitModels.Encryption.Type encryptionType) {
        Descriptor descriptor;
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        Intrinsics.checkNotNullParameter(encryptionType, "encryptionType");
        ByteString content = chunk.getContent();
        if (content == null || (descriptor = this.openStreams.get(chunk.getStreamId())) == null) {
            return;
        }
        if (encryptionType != descriptor.getStreamInfo().getEncryptionType()) {
            descriptor.getChannel().close(new StreamException.EncryptionTypeMismatch("Encryption type mismatch for stream " + chunk.getStreamId() + ". Expected " + descriptor.getStreamInfo().getEncryptionType() + ", got " + encryptionType));
        }
        long readLength = descriptor.getReadLength() + content.size();
        Long totalSize = descriptor.getStreamInfo().getTotalSize();
        if (totalSize != null && readLength > totalSize.longValue()) {
            descriptor.getChannel().close(new StreamException.LengthExceededException());
            return;
        }
        descriptor.setReadLength(readLength);
        Channel<byte[]> channel = descriptor.getChannel();
        byte[] byteArray = content.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        channel.mo6833trySendJP2dKIU(byteArray);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void handleStreamTrailer(LivekitModels.DataStream.Trailer trailer, LivekitModels.Encryption.Type encryptionType) {
        LKLog.Logger logger;
        Intrinsics.checkNotNullParameter(trailer, "trailer");
        Intrinsics.checkNotNullParameter(encryptionType, "encryptionType");
        Descriptor descriptor = this.openStreams.get(trailer.getStreamId());
        if (descriptor == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.WARN;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, null, "Received trailer for unknown stream: " + trailer.getStreamId());
            return;
        }
        if (encryptionType != descriptor.getStreamInfo().getEncryptionType()) {
            descriptor.getChannel().close(new StreamException.EncryptionTypeMismatch("Encryption type mismatch for stream " + trailer.getStreamId() + ". Expected " + descriptor.getStreamInfo().getEncryptionType() + ", got " + encryptionType));
        }
        Long totalSize = descriptor.getStreamInfo().getTotalSize();
        if (totalSize != null && descriptor.getReadLength() != totalSize.longValue()) {
            descriptor.getChannel().close(new StreamException.IncompleteException());
            return;
        }
        String reason = trailer.getReason();
        String str = reason;
        if (str != null && str.length() != 0) {
            descriptor.getChannel().close(new StreamException.AbnormalEndException(reason));
        } else {
            SendChannel.DefaultImpls.close$default(descriptor.getChannel(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeStream(String id2) {
        LKLog.Logger logger;
        LKLog.Logger logger2;
        Map<String, Descriptor> openStreams = this.openStreams;
        Intrinsics.checkNotNullExpressionValue(openStreams, "openStreams");
        synchronized (openStreams) {
            Descriptor descriptor = this.openStreams.get(id2);
            if (descriptor == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                LoggingLevel loggingLevel = LoggingLevel.DEBUG;
                if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger2 = companion.getLogger()) != null) {
                    logger2.log(loggingLevel, null, "Attempted to close stream " + id2 + ", but no descriptor was found.");
                }
                return;
            }
            SendChannel.DefaultImpls.close$default(descriptor.getChannel(), null, 1, null);
            long elapsedRealtime = SystemClock.elapsedRealtime() - descriptor.getOpenTime();
            LKLog.Companion companion2 = LKLog.INSTANCE;
            LoggingLevel loggingLevel2 = LoggingLevel.DEBUG;
            if (loggingLevel2.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion2.getLogger()) != null) {
                logger.log(loggingLevel2, null, "Closed stream " + id2 + ", (open for " + elapsedRealtime + Const.SP_KEY_GSM_UPLOAD_MXSIZE);
            }
            this.openStreams.remove(id2);
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void clearOpenStreams() {
        Map<String, Descriptor> openStreams = this.openStreams;
        Intrinsics.checkNotNullExpressionValue(openStreams, "openStreams");
        synchronized (openStreams) {
            Iterator it = CollectionsKt.toList(this.openStreams.values()).iterator();
            while (it.hasNext()) {
                ((Descriptor) it.next()).getChannel().close(new StreamException.TerminatedException(null, 1, null));
            }
            this.openStreams.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final Function2<Channel<byte[]>, Participant.Identity, Unit> getHandlerForInfo(final StreamInfo info) {
        if (info instanceof ByteStreamInfo) {
            final Function2<ByteStreamReceiver, Participant.Identity, Unit> function2 = this.byteStreamHandlers.get(info.getTopic());
            return new Function2<Channel<byte[]>, Participant.Identity, Unit>() { // from class: io.livekit.android.room.datastream.incoming.IncomingDataStreamManagerImpl$getHandlerForInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Channel<byte[]> channel, Participant.Identity identity) {
                    m13867invokeFe0n8cs(channel, identity.m13930unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Fe0n8cs, reason: not valid java name */
                public final void m13867invokeFe0n8cs(Channel<byte[]> channel, String identity) {
                    LKLog.Logger logger;
                    Intrinsics.checkNotNullParameter(channel, "channel");
                    Intrinsics.checkNotNullParameter(identity, "identity");
                    Function2<ByteStreamReceiver, Participant.Identity, Unit> function22 = function2;
                    if (function22 == null) {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        StreamInfo streamInfo = info;
                        LoggingLevel loggingLevel = LoggingLevel.WARN;
                        if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                            return;
                        }
                        logger.log(loggingLevel, null, "Received byte stream for topic \"" + streamInfo.getTopic() + "\", but no handler was found. Ignoring.");
                        return;
                    }
                    function22.invoke(new ByteStreamReceiver((ByteStreamInfo) info, channel), Participant.Identity.m13924boximpl(identity));
                }
            };
        }
        if (!(info instanceof TextStreamInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        final Function2<TextStreamReceiver, Participant.Identity, Unit> function22 = this.textStreamHandlers.get(info.getTopic());
        return new Function2<Channel<byte[]>, Participant.Identity, Unit>() { // from class: io.livekit.android.room.datastream.incoming.IncomingDataStreamManagerImpl$getHandlerForInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Channel<byte[]> channel, Participant.Identity identity) {
                m13868invokeFe0n8cs(channel, identity.m13930unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Fe0n8cs, reason: not valid java name */
            public final void m13868invokeFe0n8cs(Channel<byte[]> channel, String identity) {
                LKLog.Logger logger;
                Intrinsics.checkNotNullParameter(channel, "channel");
                Intrinsics.checkNotNullParameter(identity, "identity");
                Function2<TextStreamReceiver, Participant.Identity, Unit> function23 = function22;
                if (function23 == null) {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    StreamInfo streamInfo = info;
                    LoggingLevel loggingLevel = LoggingLevel.WARN;
                    if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                        return;
                    }
                    logger.log(loggingLevel, null, "Received text stream for topic \"" + streamInfo.getTopic() + "\", but no handler was found. Ignoring.");
                    return;
                }
                function23.invoke(new TextStreamReceiver((TextStreamInfo) info, channel), Participant.Identity.m13924boximpl(identity));
            }
        };
    }

    private final StreamInfo streamInfoFromHeader(LivekitModels.DataStream.Header header, LivekitModels.Encryption.Type encryptionType) {
        LKLog.Logger logger;
        LKLog.Logger logger2;
        try {
            LivekitModels.DataStream.Header.ContentHeaderCase contentHeaderCase = header.getContentHeaderCase();
            int i = contentHeaderCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentHeaderCase.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    LivekitModels.DataStream.TextHeader textHeader = header.getTextHeader();
                    Intrinsics.checkNotNullExpressionValue(textHeader, "getTextHeader(...)");
                    return new TextStreamInfo(header, textHeader, encryptionType);
                }
                if (i == 2) {
                    LivekitModels.DataStream.ByteHeader byteHeader = header.getByteHeader();
                    Intrinsics.checkNotNullExpressionValue(byteHeader, "getByteHeader(...)");
                    return new ByteStreamInfo(header, byteHeader, encryptionType);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.INFO;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger2 = companion.getLogger()) != null) {
                logger2.log(loggingLevel, null, "received header with non-set content header. streamId: " + header.getStreamId() + ", topic: " + header.getTopic());
            }
            return null;
        } catch (Exception e) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            LoggingLevel loggingLevel2 = LoggingLevel.ERROR;
            if (loggingLevel2.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion2.getLogger()) != null) {
                logger.log(loggingLevel2, e, "Exception when processing new stream header.");
            }
            return null;
        }
    }

    /* compiled from: IncomingDataStreamManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Companion;", "", "()V", "createChannelForStreamReceiver", "Lkotlinx/coroutines/channels/Channel;", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Channel<byte[]> createChannelForStreamReceiver() {
            return ChannelKt.Channel$default(Integer.MAX_VALUE, BufferOverflow.SUSPEND, null, 4, null);
        }
    }
}
