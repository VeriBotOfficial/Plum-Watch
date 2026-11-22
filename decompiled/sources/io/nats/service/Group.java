package io.nats.service;

import io.nats.client.support.Validator;
import java.util.Objects;

/* loaded from: classes6.dex */
public class Group {
    private final String name;
    private Group next;

    public Group(String str) {
        this.name = Validator.validateSubject(str, "Group Name", true, true);
    }

    public Group appendGroup(Group group) {
        Group group2 = this;
        while (true) {
            Group group3 = group2.next;
            if (group3 == null) {
                group2.next = group;
                return this;
            }
            group2 = group3;
        }
    }

    public String getSubject() {
        return this.next == null ? this.name : this.name + "." + this.next.getSubject();
    }

    public String getName() {
        return this.name;
    }

    public Group getNext() {
        return this.next;
    }

    public String toString() {
        return "Group [" + getSubject().replace('.', '/') + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Group group = (Group) obj;
        if (Objects.equals(this.name, group.name)) {
            return Objects.equals(this.next, group.next);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Group group = this.next;
        return hashCode + (group != null ? group.hashCode() : 0);
    }
}
