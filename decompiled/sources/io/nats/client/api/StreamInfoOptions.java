package io.nats.client.api;

import android.gov.nist.core.Separators;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.Validator;

/* loaded from: classes6.dex */
public class StreamInfoOptions implements JsonSerializable {
    private final boolean deletedDetails;
    private final String subjectsFilter;

    private StreamInfoOptions(String str, boolean z) {
        this.subjectsFilter = str;
        this.deletedDetails = z;
    }

    public String getSubjectsFilter() {
        return this.subjectsFilter;
    }

    public boolean isDeletedDetails() {
        return this.deletedDetails;
    }

    public static StreamInfoOptions filterSubjects(String str) {
        return new Builder().filterSubjects(str).build();
    }

    public static StreamInfoOptions allSubjects() {
        return new Builder().allSubjects().build();
    }

    public static StreamInfoOptions deletedDetails() {
        return new Builder().deletedDetails().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, ApiConstants.SUBJECTS_FILTER, this.subjectsFilter);
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.DELETED_DETAILS, Boolean.valueOf(this.deletedDetails));
        return JsonUtils.endJson(beginJson).toString();
    }

    public static class Builder {
        private boolean deletedDetails;
        private String subjectsFilter;

        public Builder filterSubjects(String str) {
            this.subjectsFilter = Validator.emptyAsNull(str);
            return this;
        }

        public Builder allSubjects() {
            this.subjectsFilter = Separators.GREATER_THAN;
            return this;
        }

        public Builder deletedDetails() {
            this.deletedDetails = true;
            return this;
        }

        public StreamInfoOptions build() {
            return new StreamInfoOptions(this.subjectsFilter, this.deletedDetails);
        }
    }
}
