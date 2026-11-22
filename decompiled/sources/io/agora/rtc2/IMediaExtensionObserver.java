package io.agora.rtc2;

/* loaded from: classes6.dex */
public interface IMediaExtensionObserver {
    default void onErrorWithContext(ExtensionContext extContext, int error, String message) {
    }

    default void onEventWithContext(ExtensionContext extContext, String key, String value) {
    }

    default void onStartedWithContext(ExtensionContext extContext) {
    }

    default void onStoppedWithContext(ExtensionContext extContext) {
    }
}
