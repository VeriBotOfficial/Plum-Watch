package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Bn;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f18704a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f18705a;

        /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends Bn> userProfileUpdate) {
            this.f18705a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f18705a, 0);
        }

        private Builder() {
            this.f18705a = new LinkedList();
        }
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends Bn>> getUserProfileUpdates() {
        return this.f18704a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f18704a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
