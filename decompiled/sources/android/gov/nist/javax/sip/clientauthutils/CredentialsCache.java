package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.header.AuthorizationHeader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class CredentialsCache {
    private ConcurrentHashMap<String, List<AuthorizationHeader>> authorizationHeaders = new ConcurrentHashMap<>();
    private SipTimer timer;

    class TimeoutTask extends SIPStackTimerTask {
        String callId;
        String userName;

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        public TimeoutTask(String str, String str2) {
            this.callId = str2;
            this.userName = str;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            CredentialsCache.this.authorizationHeaders.remove(this.callId);
        }
    }

    CredentialsCache(SipTimer sipTimer) {
        this.timer = sipTimer;
    }

    void cacheAuthorizationHeader(String str, AuthorizationHeader authorizationHeader, int i) {
        String username = authorizationHeader.getUsername();
        if (str == null) {
            throw new NullPointerException("Call ID is null!");
        }
        if (authorizationHeader == null) {
            throw new NullPointerException("Null authorization domain");
        }
        List<AuthorizationHeader> list = this.authorizationHeaders.get(str);
        if (list == null) {
            list = new LinkedList<>();
            this.authorizationHeaders.put(str, list);
        } else {
            String realm = authorizationHeader.getRealm();
            ListIterator<AuthorizationHeader> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (realm.equals(listIterator.next().getRealm())) {
                    listIterator.remove();
                }
            }
        }
        list.add(authorizationHeader);
        TimeoutTask timeoutTask = new TimeoutTask(str, username);
        if (i != -1) {
            this.timer.schedule(timeoutTask, i * 1000);
        }
    }

    Collection<AuthorizationHeader> getCachedAuthorizationHeaders(String str) {
        if (str == null) {
            throw new NullPointerException("Null arg!");
        }
        return this.authorizationHeaders.get(str);
    }

    public void removeAuthenticationHeader(String str) {
        this.authorizationHeaders.remove(str);
    }
}
