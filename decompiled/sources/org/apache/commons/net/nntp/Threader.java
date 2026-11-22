package org.apache.commons.net.nntp;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class Threader {
    private void buildContainer(Threadable threadable, HashMap<String, NntpThreadContainer> hashMap) {
        String messageThreadId = threadable.messageThreadId();
        NntpThreadContainer nntpThreadContainer = hashMap.get(messageThreadId);
        if (nntpThreadContainer != null) {
            if (nntpThreadContainer.threadable != null) {
                messageThreadId = "<Bogus-id:1" + Separators.GREATER_THAN;
                nntpThreadContainer = null;
            } else {
                nntpThreadContainer.threadable = threadable;
            }
        }
        if (nntpThreadContainer == null) {
            nntpThreadContainer = new NntpThreadContainer();
            nntpThreadContainer.threadable = threadable;
            hashMap.put(messageThreadId, nntpThreadContainer);
        }
        String[] messageThreadReferences = threadable.messageThreadReferences();
        int length = messageThreadReferences.length;
        int i = 0;
        NntpThreadContainer nntpThreadContainer2 = null;
        while (i < length) {
            String str = messageThreadReferences[i];
            NntpThreadContainer nntpThreadContainer3 = hashMap.get(str);
            if (nntpThreadContainer3 == null) {
                nntpThreadContainer3 = new NntpThreadContainer();
                hashMap.put(str, nntpThreadContainer3);
            }
            if (nntpThreadContainer2 != null && nntpThreadContainer3.parent == null && nntpThreadContainer2 != nntpThreadContainer3 && !nntpThreadContainer3.findChild(nntpThreadContainer2)) {
                nntpThreadContainer3.parent = nntpThreadContainer2;
                nntpThreadContainer3.next = nntpThreadContainer2.child;
                nntpThreadContainer2.child = nntpThreadContainer3;
            }
            i++;
            nntpThreadContainer2 = nntpThreadContainer3;
        }
        if (nntpThreadContainer2 != null && (nntpThreadContainer2 == nntpThreadContainer || nntpThreadContainer.findChild(nntpThreadContainer2))) {
            nntpThreadContainer2 = null;
        }
        if (nntpThreadContainer.parent != null) {
            NntpThreadContainer nntpThreadContainer4 = nntpThreadContainer.parent.child;
            NntpThreadContainer nntpThreadContainer5 = null;
            while (nntpThreadContainer4 != null && nntpThreadContainer4 != nntpThreadContainer) {
                nntpThreadContainer5 = nntpThreadContainer4;
                nntpThreadContainer4 = nntpThreadContainer4.next;
            }
            if (nntpThreadContainer4 == null) {
                throw new IllegalStateException("Didnt find " + nntpThreadContainer + " in parent " + nntpThreadContainer.parent);
            }
            if (nntpThreadContainer5 == null) {
                nntpThreadContainer.parent.child = nntpThreadContainer.next;
            } else {
                nntpThreadContainer5.next = nntpThreadContainer.next;
            }
            nntpThreadContainer.next = null;
            nntpThreadContainer.parent = null;
        }
        if (nntpThreadContainer2 != null) {
            nntpThreadContainer.parent = nntpThreadContainer2;
            nntpThreadContainer.next = nntpThreadContainer2.child;
            nntpThreadContainer2.child = nntpThreadContainer;
        }
    }

    private NntpThreadContainer findRootSet(HashMap<String, NntpThreadContainer> hashMap) {
        NntpThreadContainer nntpThreadContainer = new NntpThreadContainer();
        Iterator<Map.Entry<String, NntpThreadContainer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            NntpThreadContainer value = it.next().getValue();
            if (value.parent == null) {
                if (value.next != null) {
                    throw new IllegalStateException("c.next is " + value.next.toString());
                }
                value.next = nntpThreadContainer.child;
                nntpThreadContainer.child = value;
            }
        }
        return nntpThreadContainer;
    }

    private void gatherSubjects(NntpThreadContainer nntpThreadContainer) {
        NntpThreadContainer nntpThreadContainer2;
        NntpThreadContainer nntpThreadContainer3;
        int i = 0;
        int i2 = 0;
        for (NntpThreadContainer nntpThreadContainer4 = nntpThreadContainer.child; nntpThreadContainer4 != null; nntpThreadContainer4 = nntpThreadContainer4.next) {
            i2++;
        }
        HashMap hashMap = new HashMap((int) (i2 * 1.2d), 0.9f);
        for (NntpThreadContainer nntpThreadContainer5 = nntpThreadContainer.child; nntpThreadContainer5 != null; nntpThreadContainer5 = nntpThreadContainer5.next) {
            Threadable threadable = nntpThreadContainer5.threadable;
            if (threadable == null) {
                threadable = nntpThreadContainer5.child.threadable;
            }
            String simplifiedSubject = threadable.simplifiedSubject();
            if (simplifiedSubject != null && !simplifiedSubject.isEmpty() && ((nntpThreadContainer3 = (NntpThreadContainer) hashMap.get(simplifiedSubject)) == null || ((nntpThreadContainer5.threadable == null && nntpThreadContainer3.threadable != null) || (nntpThreadContainer3.threadable != null && nntpThreadContainer3.threadable.subjectIsReply() && nntpThreadContainer5.threadable != null && !nntpThreadContainer5.threadable.subjectIsReply())))) {
                hashMap.put(simplifiedSubject, nntpThreadContainer5);
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        NntpThreadContainer nntpThreadContainer6 = nntpThreadContainer.child;
        NntpThreadContainer nntpThreadContainer7 = nntpThreadContainer6.next;
        NntpThreadContainer nntpThreadContainer8 = null;
        while (nntpThreadContainer6 != null) {
            Threadable threadable2 = nntpThreadContainer6.threadable;
            if (threadable2 == null) {
                threadable2 = nntpThreadContainer6.child.threadable;
            }
            String simplifiedSubject2 = threadable2.simplifiedSubject();
            if (simplifiedSubject2 == null || simplifiedSubject2.isEmpty() || (nntpThreadContainer2 = (NntpThreadContainer) hashMap.get(simplifiedSubject2)) == nntpThreadContainer6) {
                nntpThreadContainer8 = nntpThreadContainer6;
            } else {
                if (nntpThreadContainer8 == null) {
                    nntpThreadContainer.child = nntpThreadContainer6.next;
                } else {
                    nntpThreadContainer8.next = nntpThreadContainer6.next;
                }
                nntpThreadContainer6.next = null;
                if (nntpThreadContainer2.threadable == null && nntpThreadContainer6.threadable == null) {
                    NntpThreadContainer nntpThreadContainer9 = nntpThreadContainer2.child;
                    while (nntpThreadContainer9 != null && nntpThreadContainer9.next != null) {
                        nntpThreadContainer9 = nntpThreadContainer9.next;
                    }
                    if (nntpThreadContainer9 != null) {
                        nntpThreadContainer9.next = nntpThreadContainer6.child;
                    }
                    for (NntpThreadContainer nntpThreadContainer10 = nntpThreadContainer6.child; nntpThreadContainer10 != null; nntpThreadContainer10 = nntpThreadContainer10.next) {
                        nntpThreadContainer10.parent = nntpThreadContainer2;
                    }
                    nntpThreadContainer6.child = null;
                } else if (nntpThreadContainer2.threadable == null || (nntpThreadContainer6.threadable != null && nntpThreadContainer6.threadable.subjectIsReply() && !nntpThreadContainer2.threadable.subjectIsReply())) {
                    nntpThreadContainer6.parent = nntpThreadContainer2;
                    nntpThreadContainer6.next = nntpThreadContainer2.child;
                    nntpThreadContainer2.child = nntpThreadContainer6;
                } else {
                    NntpThreadContainer nntpThreadContainer11 = new NntpThreadContainer();
                    nntpThreadContainer11.threadable = nntpThreadContainer2.threadable;
                    nntpThreadContainer11.child = nntpThreadContainer2.child;
                    for (NntpThreadContainer nntpThreadContainer12 = nntpThreadContainer11.child; nntpThreadContainer12 != null; nntpThreadContainer12 = nntpThreadContainer12.next) {
                        nntpThreadContainer12.parent = nntpThreadContainer11;
                    }
                    nntpThreadContainer2.threadable = null;
                    nntpThreadContainer2.child = null;
                    nntpThreadContainer6.parent = nntpThreadContainer2;
                    nntpThreadContainer11.parent = nntpThreadContainer2;
                    nntpThreadContainer2.child = nntpThreadContainer6;
                    nntpThreadContainer6.next = nntpThreadContainer11;
                }
            }
            NntpThreadContainer nntpThreadContainer13 = nntpThreadContainer7;
            nntpThreadContainer7 = nntpThreadContainer7 == null ? null : nntpThreadContainer7.next;
            nntpThreadContainer6 = nntpThreadContainer13;
        }
        hashMap.clear();
    }

    private void pruneEmptyContainers(NntpThreadContainer nntpThreadContainer) {
        NntpThreadContainer nntpThreadContainer2 = nntpThreadContainer.child;
        NntpThreadContainer nntpThreadContainer3 = nntpThreadContainer2.next;
        NntpThreadContainer nntpThreadContainer4 = null;
        while (nntpThreadContainer2 != null) {
            if (nntpThreadContainer2.threadable == null && nntpThreadContainer2.child == null) {
                if (nntpThreadContainer4 == null) {
                    nntpThreadContainer.child = nntpThreadContainer2.next;
                } else {
                    nntpThreadContainer4.next = nntpThreadContainer2.next;
                }
            } else if (nntpThreadContainer2.threadable == null && (nntpThreadContainer2.parent != null || nntpThreadContainer2.child.next == null)) {
                nntpThreadContainer3 = nntpThreadContainer2.child;
                if (nntpThreadContainer4 == null) {
                    nntpThreadContainer.child = nntpThreadContainer3;
                } else {
                    nntpThreadContainer4.next = nntpThreadContainer3;
                }
                NntpThreadContainer nntpThreadContainer5 = nntpThreadContainer3;
                while (nntpThreadContainer5.next != null) {
                    nntpThreadContainer5.parent = nntpThreadContainer2.parent;
                    nntpThreadContainer5 = nntpThreadContainer5.next;
                }
                nntpThreadContainer5.parent = nntpThreadContainer2.parent;
                nntpThreadContainer5.next = nntpThreadContainer2.next;
            } else {
                if (nntpThreadContainer2.child != null) {
                    pruneEmptyContainers(nntpThreadContainer2);
                }
                nntpThreadContainer4 = nntpThreadContainer2;
            }
            nntpThreadContainer2 = nntpThreadContainer3;
            nntpThreadContainer3 = nntpThreadContainer2 == null ? null : nntpThreadContainer2.next;
        }
    }

    public Threadable thread(Iterable<? extends Threadable> iterable) {
        if (iterable == null) {
            return null;
        }
        HashMap<String, NntpThreadContainer> hashMap = new HashMap<>();
        for (Threadable threadable : iterable) {
            if (!threadable.isDummy()) {
                buildContainer(threadable, hashMap);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        NntpThreadContainer findRootSet = findRootSet(hashMap);
        hashMap.clear();
        pruneEmptyContainers(findRootSet);
        findRootSet.reverseChildren();
        gatherSubjects(findRootSet);
        if (findRootSet.next != null) {
            throw new IllegalStateException("root node has a next:" + findRootSet);
        }
        for (NntpThreadContainer nntpThreadContainer = findRootSet.child; nntpThreadContainer != null; nntpThreadContainer = nntpThreadContainer.next) {
            if (nntpThreadContainer.threadable == null) {
                nntpThreadContainer.threadable = nntpThreadContainer.child.threadable.makeDummy();
            }
        }
        Threadable threadable2 = findRootSet.child != null ? findRootSet.child.threadable : null;
        findRootSet.flush();
        return threadable2;
    }

    public Threadable thread(List<? extends Threadable> list) {
        return thread((Iterable<? extends Threadable>) list);
    }

    @Deprecated
    public Threadable thread(Threadable[] threadableArr) {
        if (threadableArr == null) {
            return null;
        }
        return thread(Arrays.asList(threadableArr));
    }
}
