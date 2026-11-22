package livekit.org.webrtc;

/* loaded from: classes8.dex */
public interface Predicate<T> {
    boolean test(T arg);

    default Predicate<T> or(final Predicate<? super T> other) {
        return new Predicate<T>(this) { // from class: livekit.org.webrtc.Predicate.1
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // livekit.org.webrtc.Predicate
            public boolean test(T arg) {
                return this.this$0.test(arg) || other.test(arg);
            }
        };
    }

    default Predicate<T> and(final Predicate<? super T> other) {
        return new Predicate<T>(this) { // from class: livekit.org.webrtc.Predicate.2
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // livekit.org.webrtc.Predicate
            public boolean test(T arg) {
                return this.this$0.test(arg) && other.test(arg);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: livekit.org.webrtc.Predicate.3
            @Override // livekit.org.webrtc.Predicate
            public boolean test(T arg) {
                return !Predicate.this.test(arg);
            }
        };
    }
}
