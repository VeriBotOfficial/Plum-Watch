package io.nats.service;

import io.nats.client.Dispatcher;
import io.nats.client.support.JsonValue;
import io.nats.client.support.Validator;
import io.nats.service.Endpoint;
import java.util.Map;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public class ServiceEndpoint {
    private final Dispatcher dispatcher;
    private final Endpoint endpoint;
    private final Group group;
    private final ServiceMessageHandler handler;
    private final Supplier<JsonValue> statsDataSupplier;

    private ServiceEndpoint(Builder builder, Endpoint endpoint) {
        this.group = builder.group;
        this.endpoint = endpoint;
        this.handler = builder.handler;
        this.dispatcher = builder.dispatcher;
        this.statsDataSupplier = builder.statsDataSupplier;
    }

    ServiceEndpoint(Endpoint endpoint, ServiceMessageHandler serviceMessageHandler, Dispatcher dispatcher) {
        this.group = null;
        this.endpoint = endpoint;
        this.handler = serviceMessageHandler;
        this.dispatcher = dispatcher;
        this.statsDataSupplier = null;
    }

    public String getName() {
        return this.endpoint.getName();
    }

    public String getSubject() {
        return this.group == null ? this.endpoint.getSubject() : this.group.getSubject() + "." + this.endpoint.getSubject();
    }

    public String getGroupName() {
        Group group = this.group;
        if (group == null) {
            return null;
        }
        return group.getName();
    }

    public Map<String, String> getMetadata() {
        return this.endpoint.getMetadata();
    }

    protected Group getGroup() {
        return this.group;
    }

    protected Endpoint getEndpoint() {
        return this.endpoint;
    }

    protected ServiceMessageHandler getHandler() {
        return this.handler;
    }

    protected Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    protected Supplier<JsonValue> getStatsDataSupplier() {
        return this.statsDataSupplier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Dispatcher dispatcher;
        private Endpoint.Builder endpointBuilder = Endpoint.builder();
        private Group group;
        private ServiceMessageHandler handler;
        private Supplier<JsonValue> statsDataSupplier;

        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        public Builder endpoint(Endpoint endpoint) {
            this.endpointBuilder = Endpoint.builder().endpoint(endpoint);
            return this;
        }

        public Builder endpointName(String str) {
            this.endpointBuilder.name(str);
            return this;
        }

        public Builder endpointSubject(String str) {
            this.endpointBuilder.subject(str);
            return this;
        }

        public Builder endpointMetadata(Map<String, String> map) {
            this.endpointBuilder.metadata(map);
            return this;
        }

        public Builder handler(ServiceMessageHandler serviceMessageHandler) {
            this.handler = serviceMessageHandler;
            return this;
        }

        public Builder dispatcher(Dispatcher dispatcher) {
            this.dispatcher = dispatcher;
            return this;
        }

        public Builder statsDataSupplier(Supplier<JsonValue> supplier) {
            this.statsDataSupplier = supplier;
            return this;
        }

        public ServiceEndpoint build() {
            Endpoint build = this.endpointBuilder.build();
            Validator.required(this.handler, "Message Handler");
            return new ServiceEndpoint(this, build);
        }
    }
}
