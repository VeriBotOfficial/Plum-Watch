package io.livekit.android.dagger;

import android.content.Context;
import com.wakeup.common.burypoint.BuryPointPageId;
import dagger.BindsInstance;
import dagger.Component;
import io.livekit.android.room.Room;
import javax.inject.Singleton;
import kotlin.Metadata;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;

/* compiled from: LiveKitComponent.kt */
@Component(modules = {CoroutinesModule.class, RTCModule.class, WebModule.class, JsonFormatModule.class, OverridesModule.class, AudioHandlerModule.class, MemoryModule.class, InternalBindsModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lio/livekit/android/dagger/LiveKitComponent;", "", "eglBase", "Llivekit/org/webrtc/EglBase;", "peerConnectionFactory", "Llivekit/org/webrtc/PeerConnectionFactory;", "roomFactory", "Lio/livekit/android/room/Room$Factory;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LiveKitComponent {

    /* compiled from: LiveKitComponent.kt */
    @Component.Factory
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lio/livekit/android/dagger/LiveKitComponent$Factory;", "", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lio/livekit/android/dagger/LiveKitComponent;", "appContext", "Landroid/content/Context;", "overridesModule", "Lio/livekit/android/dagger/OverridesModule;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        LiveKitComponent create(@BindsInstance Context appContext, OverridesModule overridesModule);
    }

    EglBase eglBase();

    PeerConnectionFactory peerConnectionFactory();

    Room.Factory roomFactory();
}
