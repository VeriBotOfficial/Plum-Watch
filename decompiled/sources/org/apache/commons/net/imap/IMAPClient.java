package org.apache.commons.net.imap;

import android.gov.nist.core.Separators;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.imap.IMAP;

/* loaded from: classes8.dex */
public class IMAPClient extends IMAP {
    private static final char DQUOTE = '\"';
    private static final String DQUOTE_S = "\"";

    public enum FETCH_ITEM_NAMES {
        ALL,
        FAST,
        FULL,
        BODY,
        BODYSTRUCTURE,
        ENVELOPE,
        FLAGS,
        INTERNALDATE,
        RFC822,
        UID
    }

    public enum SEARCH_CRITERIA {
        ALL,
        ANSWERED,
        BCC,
        BEFORE,
        BODY,
        CC,
        DELETED,
        DRAFT,
        FLAGGED,
        FROM,
        HEADER,
        KEYWORD,
        LARGER,
        NEW,
        NOT,
        OLD,
        ON,
        OR,
        RECENT,
        SEEN,
        SENTBEFORE,
        SENTON,
        SENTSINCE,
        SINCE,
        SMALLER,
        SUBJECT,
        TEXT,
        TO,
        UID,
        UNANSWERED,
        UNDELETED,
        UNDRAFT,
        UNFLAGGED,
        UNKEYWORD,
        UNSEEN
    }

    public enum STATUS_DATA_ITEMS {
        MESSAGES,
        RECENT,
        UIDNEXT,
        UIDVALIDITY,
        UNSEEN
    }

    @Deprecated
    public boolean append(String str) throws IOException {
        return append(str, null, null);
    }

    @Deprecated
    public boolean append(String str, String str2, String str3) throws IOException {
        StringBuilder append = new StringBuilder().append(str);
        if (str2 != null) {
            append.append(" ").append(str2);
        }
        if (str3 != null) {
            if (str3.charAt(0) == '{') {
                append.append(" ").append(str3);
            } else {
                append.append(" {").append(str3).append("}");
            }
        }
        return doCommand(IMAPCommand.APPEND, append.toString());
    }

    public boolean append(String str, String str2, String str3, String str4) throws IOException {
        StringBuilder sb = new StringBuilder(quoteMailboxName(str));
        if (str2 != null) {
            sb.append(" ").append(str2);
        }
        if (str3 != null) {
            sb.append(" ");
            if (str3.charAt(0) == '\"') {
                sb.append(str3);
            } else {
                sb.append('\"').append(str3).append('\"');
            }
        }
        sb.append(" ");
        if (str4.startsWith("\"") && str4.endsWith("\"")) {
            sb.append(str4);
            return doCommand(IMAPCommand.APPEND, sb.toString());
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ).append(str4.getBytes(IMAP.__DEFAULT_ENCODING).length).append(AbstractJsonLexerKt.END_OBJ);
        return IMAPReply.isContinuation(sendCommand(IMAPCommand.APPEND, sb.toString())) && IMAPReply.isSuccess(sendData(str4));
    }

    public boolean capability() throws IOException {
        return doCommand(IMAPCommand.CAPABILITY);
    }

    public boolean check() throws IOException {
        return doCommand(IMAPCommand.CHECK);
    }

    public boolean close() throws IOException {
        return doCommand(IMAPCommand.CLOSE);
    }

    public boolean copy(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.COPY, str + " " + quoteMailboxName(str2));
    }

    public boolean create(String str) throws IOException {
        return doCommand(IMAPCommand.CREATE, quoteMailboxName(str));
    }

    public boolean delete(String str) throws IOException {
        return doCommand(IMAPCommand.DELETE, quoteMailboxName(str));
    }

    public boolean examine(String str) throws IOException {
        return doCommand(IMAPCommand.EXAMINE, quoteMailboxName(str));
    }

    public boolean expunge() throws IOException {
        return doCommand(IMAPCommand.EXPUNGE);
    }

    public boolean fetch(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.FETCH, str + " " + str2);
    }

    public boolean list(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.LIST, quoteMailboxName(str) + " " + quoteMailboxName(str2));
    }

    public boolean login(String str, String str2) throws IOException {
        if (getState() != IMAP.IMAPState.NOT_AUTH_STATE || !doCommand(IMAPCommand.LOGIN, str + " " + str2)) {
            return false;
        }
        setState(IMAP.IMAPState.AUTH_STATE);
        return true;
    }

    public boolean logout() throws IOException {
        return doCommand(IMAPCommand.LOGOUT);
    }

    public boolean lsub(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.LSUB, quoteMailboxName(str) + " " + quoteMailboxName(str2));
    }

    public boolean noop() throws IOException {
        return doCommand(IMAPCommand.NOOP);
    }

    public boolean rename(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.RENAME, quoteMailboxName(str) + " " + quoteMailboxName(str2));
    }

    public boolean search(String str) throws IOException {
        return search(null, str);
    }

    public boolean search(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("CHARSET ").append(str);
        }
        sb.append(str2);
        return doCommand(IMAPCommand.SEARCH, sb.toString());
    }

    public boolean select(String str) throws IOException {
        return doCommand(IMAPCommand.SELECT, quoteMailboxName(str));
    }

    public boolean status(String str, String[] strArr) throws IOException {
        if (strArr == null || strArr.length < 1) {
            throw new IllegalArgumentException("STATUS command requires at least one data item name");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(quoteMailboxName(str));
        sb.append(" (");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(strArr[i]);
        }
        sb.append(Separators.RPAREN);
        return doCommand(IMAPCommand.STATUS, sb.toString());
    }

    public boolean store(String str, String str2, String str3) throws IOException {
        return doCommand(IMAPCommand.STORE, str + " " + str2 + " " + str3);
    }

    public boolean subscribe(String str) throws IOException {
        return doCommand(IMAPCommand.SUBSCRIBE, quoteMailboxName(str));
    }

    public boolean uid(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.UID, str + " " + str2);
    }

    public boolean unsubscribe(String str) throws IOException {
        return doCommand(IMAPCommand.UNSUBSCRIBE, quoteMailboxName(str));
    }
}
