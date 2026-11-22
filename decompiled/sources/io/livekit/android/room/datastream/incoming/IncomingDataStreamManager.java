package io.livekit.android.room.datastream.incoming;

import io.livekit.android.room.participant.Participant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import livekit.LivekitModels;

/* compiled from: IncomingDataStreamManager.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J*\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH&JL\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152:\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0017j\u0002`\u001cH&JL\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152:\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0017j\u0002`\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "", "clearOpenStreams", "", "handleDataChunk", "chunk", "Llivekit/LivekitModels$DataStream$Chunk;", "encryptionType", "Llivekit/LivekitModels$Encryption$Type;", "handleStreamHeader", "header", "Llivekit/LivekitModels$DataStream$Header;", "fromIdentity", "Lio/livekit/android/room/participant/Participant$Identity;", "handleStreamHeader-qaitkU4", "(Llivekit/LivekitModels$DataStream$Header;Ljava/lang/String;Llivekit/LivekitModels$Encryption$Type;)V", "handleStreamTrailer", "trailer", "Llivekit/LivekitModels$DataStream$Trailer;", "registerByteStreamHandler", "topic", "", "handler", "Lkotlin/Function2;", "Lio/livekit/android/room/datastream/incoming/ByteStreamReceiver;", "Lkotlin/ParameterName;", "name", "reader", "Lio/livekit/android/room/datastream/incoming/ByteStreamHandler;", "registerTextStreamHandler", "Lio/livekit/android/room/datastream/incoming/TextStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/TextStreamHandler;", "unregisterByteStreamHandler", "unregisterTextStreamHandler", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IncomingDataStreamManager {
    void clearOpenStreams();

    void handleDataChunk(LivekitModels.DataStream.Chunk chunk, LivekitModels.Encryption.Type encryptionType);

    /* renamed from: handleStreamHeader-qaitkU4 */
    void mo13855handleStreamHeaderqaitkU4(LivekitModels.DataStream.Header header, String fromIdentity, LivekitModels.Encryption.Type encryptionType);

    void handleStreamTrailer(LivekitModels.DataStream.Trailer trailer, LivekitModels.Encryption.Type encryptionType);

    void registerByteStreamHandler(String topic, Function2<? super ByteStreamReceiver, ? super Participant.Identity, Unit> handler);

    void registerTextStreamHandler(String topic, Function2<? super TextStreamReceiver, ? super Participant.Identity, Unit> handler);

    void unregisterByteStreamHandler(String topic);

    void unregisterTextStreamHandler(String topic);
}
