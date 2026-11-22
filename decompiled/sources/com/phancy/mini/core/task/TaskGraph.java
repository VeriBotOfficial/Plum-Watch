package com.phancy.mini.core.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaskGraph.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B+\b\u0002\u0012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001e\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004R+\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR-\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/phancy/mini/core/task/TaskGraph;", "", "nodes", "", "Lcom/phancy/mini/core/task/Task;", "", "(Ljava/util/Map;)V", "namedNodes", "", "getNamedNodes", "()Ljava/util/Map;", "namedNodes$delegate", "Lkotlin/Lazy;", "getNodes", "checkCyclicDependencies", "", "findNodeByName", "name", "getIncomingNodes", "node", "getOutgoingNodes", "Builder", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TaskGraph {

    /* renamed from: namedNodes$delegate, reason: from kotlin metadata */
    private final Lazy namedNodes;
    private final Map<Task<?>, List<Task<?>>> nodes;

    public /* synthetic */ TaskGraph(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TaskGraph(Map<Task<?>, ? extends List<? extends Task<?>>> map) {
        this.nodes = map;
        this.namedNodes = LazyKt.lazy(new Function0<HashMap<String, Task<?>>>() { // from class: com.phancy.mini.core.task.TaskGraph$namedNodes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final HashMap<String, Task<?>> invoke() {
                HashMap<String, Task<?>> hashMap = new HashMap<>();
                for (Map.Entry<Task<?>, List<Task<?>>> entry : TaskGraph.this.getNodes().entrySet()) {
                    hashMap.put(entry.getKey().getName(), entry.getKey());
                }
                return hashMap;
            }
        });
        checkCyclicDependencies();
    }

    public final Map<Task<?>, List<Task<?>>> getNodes() {
        return this.nodes;
    }

    private final Map<String, Task<?>> getNamedNodes() {
        return (Map) this.namedNodes.getValue();
    }

    private final void checkCyclicDependencies() {
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        for (Task<?> task : this.nodes.keySet()) {
            List<Task<?>> incomingNodes = getIncomingNodes(task);
            if (incomingNodes == null || incomingNodes.isEmpty()) {
                stack.push(task);
            }
        }
        int i = 0;
        while (!stack.isEmpty()) {
            Task<?> node = (Task) stack.pop();
            Intrinsics.checkNotNullExpressionValue(node, "node");
            arrayList.add(node);
            i++;
            List<Task<?>> outgoingNodes = getOutgoingNodes(node);
            if (outgoingNodes != null) {
                for (Task<?> task2 : outgoingNodes) {
                    List<Task<?>> incomingNodes2 = getIncomingNodes(task2);
                    if (incomingNodes2 != null ? arrayList.containsAll(incomingNodes2) : true) {
                        stack.push(task2);
                    }
                }
            }
        }
        if (i < this.nodes.size()) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final List<Task<?>> getIncomingNodes(Task<?> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return this.nodes.get(node);
    }

    public final List<Task<?>> getOutgoingNodes(Task<?> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        ArrayList arrayList = null;
        for (Map.Entry<Task<?>, List<Task<?>>> entry : this.nodes.entrySet()) {
            Task<?> key = entry.getKey();
            List<Task<?>> value = entry.getValue();
            if (value != null && value.contains(node)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    public final Task<?> findNodeByName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getNamedNodes().get(name);
    }

    /* compiled from: TaskGraph.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0012\u0010\n\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0006\u0010\f\u001a\u00020\rR*\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/phancy/mini/core/task/TaskGraph$Builder;", "", "()V", "nodes", "", "Lcom/phancy/mini/core/task/Task;", "", "addEdge", "nodeU", "nodeV", "addNode", "node", "build", "Lcom/phancy/mini/core/task/TaskGraph;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final Map<Task<?>, List<Task<?>>> nodes = new LinkedHashMap();

        public final Builder addNode(Task<?> node) {
            Intrinsics.checkNotNullParameter(node, "node");
            if (!this.nodes.containsKey(node)) {
                this.nodes.put(node, null);
            }
            return this;
        }

        public final Builder addEdge(Task<?> nodeU, Task<?> nodeV) {
            Intrinsics.checkNotNullParameter(nodeU, "nodeU");
            Intrinsics.checkNotNullParameter(nodeV, "nodeV");
            addNode(nodeU);
            addNode(nodeV);
            ArrayList arrayList = this.nodes.get(nodeV);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(nodeU)) {
                arrayList.add(nodeU);
            }
            this.nodes.put(nodeV, arrayList);
            return this;
        }

        public final TaskGraph build() {
            return new TaskGraph(this.nodes, null);
        }
    }
}
