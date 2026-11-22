package io.livekit.android.room.track;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.umeng.analytics.pro.d;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.events.TrackPublicationEvent;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.track.Track;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.MutableStateFlowDelegate;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import livekit.LivekitModels;

/* compiled from: TrackPublication.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0000¢\u0006\u0002\bXJ\u000e\u0010Y\u001a\u00020U2\u0006\u0010\u0002\u001a\u00020\u0003R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001d@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\t\u001a\u0004\u0018\u00010!@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R1\u0010(\u001a\u00020'2\u0006\u0010\t\u001a\u00020'8W@PX\u0097\u008e\u0002¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00101\u001a\u00020!2\u0006\u0010\t\u001a\u00020!@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000704X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020!2\u0006\u0010\t\u001a\u00020!@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R*\u0010;\u001a\u0004\u0018\u00010'2\b\u0010\t\u001a\u0004\u0018\u00010'@@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u00020A2\u0006\u0010\t\u001a\u00020A@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010,R5\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058W@PX\u0097\u008e\u0002¢\u0006\u0018\n\u0004\bN\u00100\u0012\u0004\bI\u0010*\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010O\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006Z"}, d2 = {"Lio/livekit/android/room/track/TrackPublication;", "", ParameterNames.INFO, "Llivekit/LivekitModels$TrackInfo;", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "Lio/livekit/android/room/track/Track;", "participant", "Lio/livekit/android/room/participant/Participant;", "(Llivekit/LivekitModels$TrackInfo;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/Participant;)V", "<set-?>", "Lio/livekit/android/room/track/Track$Dimensions;", "dimensions", "getDimensions", "()Lio/livekit/android/room/track/Track$Dimensions;", "setDimensions$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track$Dimensions;)V", "encryptionType", "Llivekit/LivekitModels$Encryption$Type;", "getEncryptionType", "()Llivekit/LivekitModels$Encryption$Type;", "eventBus", "Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/TrackPublicationEvent;", "getEventBus", "()Lio/livekit/android/events/BroadcastEventBus;", d.ar, "Lio/livekit/android/events/EventListenable;", "getEvents", "()Lio/livekit/android/events/EventListenable;", "Lio/livekit/android/room/track/Track$Kind;", "kind", "getKind", "()Lio/livekit/android/room/track/Track$Kind;", "", "mimeType", "getMimeType", "()Ljava/lang/String;", "setMimeType$livekit_android_sdk_release", "(Ljava/lang/String;)V", "", "muted", "getMuted$annotations", "()V", "getMuted", "()Z", "setMuted$livekit_android_sdk_release", "(Z)V", "muted$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "name", "getName", "setName$livekit_android_sdk_release", "Ljava/lang/ref/WeakReference;", "getParticipant", "()Ljava/lang/ref/WeakReference;", "setParticipant", "(Ljava/lang/ref/WeakReference;)V", "sid", "getSid", "simulcasted", "getSimulcasted", "()Ljava/lang/Boolean;", "setSimulcasted$livekit_android_sdk_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Lio/livekit/android/room/track/Track$Source;", "source", "getSource", "()Lio/livekit/android/room/track/Track$Source;", "setSource$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track$Source;)V", "subscribed", "getSubscribed", "getTrack$annotations", "getTrack", "()Lio/livekit/android/room/track/Track;", "setTrack$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track;)V", "track$delegate", "trackInfo", "getTrackInfo$livekit_android_sdk_release", "()Llivekit/LivekitModels$TrackInfo;", "setTrackInfo$livekit_android_sdk_release", "(Llivekit/LivekitModels$TrackInfo;)V", "onTranscriptionReceived", "", "transcription", "Lio/livekit/android/events/RoomEvent$TranscriptionReceived;", "onTranscriptionReceived$livekit_android_sdk_release", "updateFromInfo", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class TrackPublication {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TrackPublication.class, ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "getTrack()Lio/livekit/android/room/track/Track;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TrackPublication.class, "muted", "getMuted()Z", 0))};
    private Track.Dimensions dimensions;
    private final BroadcastEventBus<TrackPublicationEvent> eventBus;
    private final EventListenable<TrackPublicationEvent> events;
    private Track.Kind kind;
    private String mimeType;

    /* renamed from: muted$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate muted;
    private String name;
    private WeakReference<Participant> participant;
    private String sid;
    private Boolean simulcasted;
    private Track.Source source;

    /* renamed from: track$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate track;
    private LivekitModels.TrackInfo trackInfo;

    public static /* synthetic */ void getMuted$annotations() {
    }

    public static /* synthetic */ void getTrack$annotations() {
    }

    public TrackPublication(LivekitModels.TrackInfo info, Track track, Participant participant) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.track = FlowDelegateKt.flowDelegate$default(track, null, 2, null);
        BroadcastEventBus<TrackPublicationEvent> broadcastEventBus = new BroadcastEventBus<>();
        this.eventBus = broadcastEventBus;
        this.events = broadcastEventBus.readOnly();
        this.muted = FlowDelegateKt.flowDelegate$default(false, null, 2, null);
        this.source = Track.Source.UNKNOWN;
        String sid = info.getSid();
        Intrinsics.checkNotNullExpressionValue(sid, "getSid(...)");
        this.sid = sid;
        String name = info.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        Track.Kind.Companion companion = Track.Kind.INSTANCE;
        LivekitModels.TrackType type = info.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.kind = companion.fromProto(type);
        this.participant = new WeakReference<>(participant);
        updateFromInfo(info);
    }

    public Track getTrack() {
        return (Track) this.track.getValue(this, $$delegatedProperties[0]);
    }

    public void setTrack$livekit_android_sdk_release(Track track) {
        this.track.setValue(this, $$delegatedProperties[0], track);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName$livekit_android_sdk_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Track.Kind getKind() {
        return this.kind;
    }

    public LivekitModels.Encryption.Type getEncryptionType() {
        LivekitModels.TrackInfo trackInfo = this.trackInfo;
        LivekitModels.Encryption.Type encryption = trackInfo != null ? trackInfo.getEncryption() : null;
        return encryption == null ? LivekitModels.Encryption.Type.NONE : encryption;
    }

    protected final BroadcastEventBus<TrackPublicationEvent> getEventBus() {
        return this.eventBus;
    }

    public final EventListenable<TrackPublicationEvent> getEvents() {
        return this.events;
    }

    public boolean getMuted() {
        return ((Boolean) this.muted.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public void setMuted$livekit_android_sdk_release(boolean z) {
        this.muted.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public boolean getSubscribed() {
        return getTrack() != null;
    }

    public final Boolean getSimulcasted() {
        return this.simulcasted;
    }

    public final void setSimulcasted$livekit_android_sdk_release(Boolean bool) {
        this.simulcasted = bool;
    }

    public final Track.Dimensions getDimensions() {
        return this.dimensions;
    }

    public final void setDimensions$livekit_android_sdk_release(Track.Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public final Track.Source getSource() {
        return this.source;
    }

    public final void setSource$livekit_android_sdk_release(Track.Source source) {
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        this.source = source;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final void setMimeType$livekit_android_sdk_release(String str) {
        this.mimeType = str;
    }

    /* renamed from: getTrackInfo$livekit_android_sdk_release, reason: from getter */
    public final LivekitModels.TrackInfo getTrackInfo() {
        return this.trackInfo;
    }

    public final void setTrackInfo$livekit_android_sdk_release(LivekitModels.TrackInfo trackInfo) {
        this.trackInfo = trackInfo;
    }

    public final WeakReference<Participant> getParticipant() {
        return this.participant;
    }

    public final void setParticipant(WeakReference<Participant> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.participant = weakReference;
    }

    public final void updateFromInfo(LivekitModels.TrackInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        String sid = info.getSid();
        Intrinsics.checkNotNullExpressionValue(sid, "getSid(...)");
        this.sid = sid;
        String name = info.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        Track.Kind.Companion companion = Track.Kind.INSTANCE;
        LivekitModels.TrackType type = info.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.kind = companion.fromProto(type);
        setMuted$livekit_android_sdk_release(info.getMuted());
        Track.Source.Companion companion2 = Track.Source.INSTANCE;
        LivekitModels.TrackSource source = info.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
        this.source = companion2.fromProto(source);
        if (this.kind == Track.Kind.VIDEO) {
            this.simulcasted = Boolean.valueOf(info.getSimulcast());
            this.dimensions = new Track.Dimensions(info.getWidth(), info.getHeight());
        }
        this.mimeType = info.getMimeType();
        this.trackInfo = info;
    }

    public final void onTranscriptionReceived$livekit_android_sdk_release(RoomEvent.TranscriptionReceived transcription) {
        Intrinsics.checkNotNullParameter(transcription, "transcription");
        if (Intrinsics.areEqual(transcription.getPublication(), this)) {
            this.eventBus.tryPostEvent(new TrackPublicationEvent.TranscriptionReceived(this, transcription.getTranscriptionSegments()));
        }
    }
}
