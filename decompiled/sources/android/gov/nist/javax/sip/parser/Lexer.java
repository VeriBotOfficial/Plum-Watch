package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.LexerCore;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.javax.sip.header.ReferToHeader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class Lexer extends LexerCore {
    public static String getHeaderName(String str) {
        if (str == null) {
            return null;
        }
        try {
            int indexOf = str.indexOf(":");
            if (indexOf >= 1) {
                return str.substring(0, indexOf).trim();
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return null;
    }

    public Lexer(String str, String str2) {
        super(str, str2);
        selectLexer(str);
    }

    public static String getHeaderValue(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(str.indexOf(":") + 1);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // android.gov.nist.core.LexerCore
    public void selectLexer(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = lexerTables.get(str);
        this.currentLexerName = str;
        if (concurrentHashMap == null) {
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = new ConcurrentHashMap<>();
            this.currentLexer = concurrentHashMap2;
            if (str.equals("method_keywordLexer")) {
                addKeyword("REGISTER", 2052);
                addKeyword("ACK", 2054);
                addKeyword("OPTIONS", 2056);
                addKeyword("BYE", 2055);
                addKeyword("INVITE", 2053);
                addKeyword("sip", 2051);
                addKeyword("sips", TokenTypes.SIPS);
                addKeyword("SUBSCRIBE", 2101);
                addKeyword("NOTIFY", 2102);
                addKeyword("MESSAGE", TokenTypes.MESSAGE);
                addKeyword("PUBLISH", TokenTypes.PUBLISH);
            } else if (str.equals("command_keywordLexer")) {
                addKeyword("Error-Info", TokenTypes.ERROR_INFO);
                addKeyword("Allow-Events", TokenTypes.ALLOW_EVENTS);
                addKeyword("Authentication-Info", TokenTypes.AUTHENTICATION_INFO);
                addKeyword("Event", 2111);
                addKeyword("Min-Expires", TokenTypes.MIN_EXPIRES);
                addKeyword("RSeq", TokenTypes.RSEQ);
                addKeyword("RAck", TokenTypes.RACK);
                addKeyword("Reason", TokenTypes.REASON);
                addKeyword("Reply-To", 2106);
                addKeyword("Subscription-State", 2104);
                addKeyword("Timestamp", 2103);
                addKeyword("In-Reply-To", TokenTypes.IN_REPLY_TO);
                addKeyword("MIME-Version", TokenTypes.MIME_VERSION);
                addKeyword("Alert-Info", 2061);
                addKeyword("From", 2062);
                addKeyword("To", 2063);
                addKeyword(ReferToHeader.NAME, TokenTypes.REFER_TO);
                addKeyword("Via", TokenTypes.VIA);
                addKeyword("User-Agent", TokenTypes.USER_AGENT);
                addKeyword("Server", TokenTypes.SERVER);
                addKeyword("Accept-Encoding", TokenTypes.ACCEPT_ENCODING);
                addKeyword("Accept", 2068);
                addKeyword("Allow", TokenTypes.ALLOW);
                addKeyword("Route", TokenTypes.ROUTE);
                addKeyword("Authorization", TokenTypes.AUTHORIZATION);
                addKeyword("Proxy-Authorization", TokenTypes.PROXY_AUTHORIZATION);
                addKeyword("Retry-After", TokenTypes.RETRY_AFTER);
                addKeyword("Proxy-Require", TokenTypes.PROXY_REQUIRE);
                addKeyword("Content-Language", TokenTypes.CONTENT_LANGUAGE);
                addKeyword("Unsupported", TokenTypes.UNSUPPORTED);
                addKeyword("Supported", 2068);
                addKeyword("Warning", TokenTypes.WARNING);
                addKeyword("Max-Forwards", TokenTypes.MAX_FORWARDS);
                addKeyword("Date", TokenTypes.DATE);
                addKeyword("Priority", 2081);
                addKeyword("Proxy-Authenticate", 2082);
                addKeyword("Content-Encoding", TokenTypes.CONTENT_ENCODING);
                addKeyword("Content-Length", 2084);
                addKeyword("Subject", TokenTypes.SUBJECT);
                addKeyword("Content-Type", TokenTypes.CONTENT_TYPE);
                addKeyword("Contact", TokenTypes.CONTACT);
                addKeyword("Call-ID", TokenTypes.CALL_ID);
                addKeyword("Require", TokenTypes.REQUIRE);
                addKeyword("Expires", TokenTypes.EXPIRES);
                addKeyword("Record-Route", TokenTypes.RECORD_ROUTE);
                addKeyword("Organization", TokenTypes.ORGANIZATION);
                addKeyword("CSeq", TokenTypes.CSEQ);
                addKeyword("Accept-Language", TokenTypes.ACCEPT_LANGUAGE);
                addKeyword("WWW-Authenticate", TokenTypes.WWW_AUTHENTICATE);
                addKeyword("Call-Info", 2099);
                addKeyword("Content-Disposition", 2100);
                addKeyword("K", 2068);
                addKeyword(TokenNames.C, TokenTypes.CONTENT_TYPE);
                addKeyword("E", TokenTypes.CONTENT_ENCODING);
                addKeyword(TokenNames.F, 2062);
                addKeyword(TokenNames.I, TokenTypes.CALL_ID);
                addKeyword("M", TokenTypes.CONTACT);
                addKeyword(TokenNames.L, 2084);
                addKeyword("S", TokenTypes.SUBJECT);
                addKeyword("T", 2063);
                addKeyword(TokenNames.U, TokenTypes.ALLOW_EVENTS);
                addKeyword("V", TokenTypes.VIA);
                addKeyword(TokenNames.R, TokenTypes.REFER_TO);
                addKeyword("O", 2111);
                addKeyword(TokenNames.X, 2133);
                addKeyword("SIP-ETag", TokenTypes.SIP_ETAG);
                addKeyword("SIP-If-Match", TokenTypes.SIP_IF_MATCH);
                addKeyword("Session-Expires", 2133);
                addKeyword("Min-SE", TokenTypes.MINSE_TO);
                addKeyword("Referred-By", 2132);
                addKeyword("Replaces", TokenTypes.REPLACES_TO);
                addKeyword("Join", TokenTypes.JOIN_TO);
                addKeyword("Path", TokenTypes.PATH);
                addKeyword("Service-Route", TokenTypes.SERVICE_ROUTE);
                addKeyword("P-Asserted-Identity", 2121);
                addKeyword("P-Preferred-Identity", TokenTypes.P_PREFERRED_IDENTITY);
                addKeyword("Privacy", TokenTypes.PRIVACY);
                addKeyword("P-Called-Party-ID", TokenTypes.P_CALLED_PARTY_ID);
                addKeyword("P-Associated-URI", TokenTypes.P_ASSOCIATED_URI);
                addKeyword("P-Visited-Network-ID", TokenTypes.P_VISITED_NETWORK_ID);
                addKeyword("P-Charging-Function-Addresses", TokenTypes.P_CHARGING_FUNCTION_ADDRESSES);
                addKeyword("P-Charging-Vector", TokenTypes.P_VECTOR_CHARGING);
                addKeyword("P-Access-Network-Info", TokenTypes.P_ACCESS_NETWORK_INFO);
                addKeyword("P-Media-Authorization", TokenTypes.P_MEDIA_AUTHORIZATION);
                addKeyword("Security-Server", TokenTypes.SECURITY_SERVER);
                addKeyword("Security-Verify", TokenTypes.SECURITY_VERIFY);
                addKeyword("Security-Client", TokenTypes.SECURITY_CLIENT);
                addKeyword("P-User-Database", 2141);
                addKeyword("P-Profile-Key", TokenTypes.P_PROFILE_KEY);
                addKeyword("P-Served-User", TokenTypes.P_SERVED_USER);
                addKeyword("P-Preferred-Service", TokenTypes.P_PREFERRED_SERVICE);
                addKeyword("P-Asserted-Service", TokenTypes.P_ASSERTED_SERVICE);
                addKeyword(ReferencesHeader.NAME, TokenTypes.REFERENCES);
            } else if (str.equals("status_lineLexer")) {
                addKeyword("sip", 2051);
            } else if (str.equals("request_lineLexer")) {
                addKeyword("sip", 2051);
            } else if (str.equals("sip_urlLexer")) {
                addKeyword("tel", 2105);
                addKeyword("sip", 2051);
                addKeyword("sips", TokenTypes.SIPS);
            }
            ConcurrentHashMap<String, Integer> putIfAbsent = lexerTables.putIfAbsent(str, concurrentHashMap2);
            if (putIfAbsent != null) {
                concurrentHashMap2 = putIfAbsent;
            }
            this.currentLexer = concurrentHashMap2;
            return;
        }
        this.currentLexer = concurrentHashMap;
    }
}
