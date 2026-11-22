package io.nats.client.impl;

import io.nats.client.Statistics;
import java.text.NumberFormat;
import java.util.LongSummaryStatistics;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
class NatsStatistics implements Statistics {
    private final boolean trackAdvanced;
    private LongSummaryStatistics readStats = new LongSummaryStatistics();
    private LongSummaryStatistics writeStats = new LongSummaryStatistics();
    private ReentrantLock lock = new ReentrantLock();
    private AtomicLong flushCounter = new AtomicLong();
    private AtomicLong outstandingRequests = new AtomicLong();
    private AtomicLong requestsSent = new AtomicLong();
    private AtomicLong repliesReceived = new AtomicLong();
    private AtomicLong duplicateRepliesReceived = new AtomicLong();
    private AtomicLong orphanRepliesReceived = new AtomicLong();
    private AtomicLong reconnects = new AtomicLong();
    private AtomicLong inMsgs = new AtomicLong();
    private AtomicLong outMsgs = new AtomicLong();
    private AtomicLong inBytes = new AtomicLong();
    private AtomicLong outBytes = new AtomicLong();
    private AtomicLong pingCount = new AtomicLong();
    private AtomicLong okCount = new AtomicLong();
    private AtomicLong errCount = new AtomicLong();
    private AtomicLong exceptionCount = new AtomicLong();
    private AtomicLong droppedCount = new AtomicLong();

    public NatsStatistics(boolean z) {
        this.trackAdvanced = z;
    }

    void incrementPingCount() {
        this.pingCount.incrementAndGet();
    }

    void incrementDroppedCount() {
        this.droppedCount.incrementAndGet();
    }

    void incrementOkCount() {
        this.okCount.incrementAndGet();
    }

    void incrementErrCount() {
        this.errCount.incrementAndGet();
    }

    void incrementExceptionCount() {
        this.exceptionCount.incrementAndGet();
    }

    void incrementRequestsSent() {
        this.requestsSent.incrementAndGet();
    }

    void incrementRepliesReceived() {
        this.repliesReceived.incrementAndGet();
    }

    void incrementDuplicateRepliesReceived() {
        this.duplicateRepliesReceived.incrementAndGet();
    }

    void incrementOrphanRepliesReceived() {
        this.orphanRepliesReceived.incrementAndGet();
    }

    void incrementReconnects() {
        this.reconnects.incrementAndGet();
    }

    void incrementInMsgs() {
        this.inMsgs.incrementAndGet();
    }

    void incrementOutMsgs() {
        this.outMsgs.incrementAndGet();
    }

    void incrementInBytes(long j) {
        this.inBytes.addAndGet(j);
    }

    void incrementOutMsgsAndBytes(long j) {
        incrementOutMsgs();
        incrementOutBytes(j);
    }

    void incrementOutBytes(long j) {
        this.outBytes.addAndGet(j);
    }

    void incrementFlushCounter() {
        this.flushCounter.incrementAndGet();
    }

    void incrementOutstandingRequests() {
        this.outstandingRequests.incrementAndGet();
    }

    void decrementOutstandingRequests() {
        this.outstandingRequests.decrementAndGet();
    }

    void registerSummaryStat(LongSummaryStatistics longSummaryStatistics, long j) {
        if (this.trackAdvanced) {
            this.lock.lock();
            try {
                longSummaryStatistics.accept(j);
            } finally {
                this.lock.unlock();
            }
        }
    }

    void registerRead(long j) {
        registerSummaryStat(this.readStats, j);
    }

    void registerWrite(long j) {
        registerSummaryStat(this.writeStats, j);
    }

    public long getPings() {
        return this.pingCount.get();
    }

    @Override // io.nats.client.Statistics
    public long getDroppedCount() {
        return this.droppedCount.get();
    }

    public long getOKs() {
        return this.okCount.get();
    }

    public long getErrs() {
        return this.errCount.get();
    }

    public long getExceptions() {
        return this.exceptionCount.get();
    }

    @Override // io.nats.client.Statistics
    public long getReconnects() {
        return this.reconnects.get();
    }

    @Override // io.nats.client.Statistics
    public long getInMsgs() {
        return this.inMsgs.get();
    }

    @Override // io.nats.client.Statistics
    public long getOutMsgs() {
        return this.outMsgs.get();
    }

    @Override // io.nats.client.Statistics
    public long getInBytes() {
        return this.inBytes.get();
    }

    @Override // io.nats.client.Statistics
    public long getOutBytes() {
        return this.outBytes.get();
    }

    long getFlushCounter() {
        return this.flushCounter.get();
    }

    long getOutstandingRequests() {
        return this.outstandingRequests.get();
    }

    public long getRepliesReceived() {
        return this.repliesReceived.get();
    }

    public long getDuplicateRepliesReceived() {
        return this.duplicateRepliesReceived.get();
    }

    public long getOrphanRepliesReceived() {
        return this.orphanRepliesReceived.get();
    }

    void appendNumberStat(StringBuilder sb, String str, long j) {
        sb.append(str);
        sb.append(NumberFormat.getNumberInstance().format(j));
        sb.append("\n");
    }

    void appendNumberStat(StringBuilder sb, String str, double d) {
        sb.append(str);
        sb.append(NumberFormat.getNumberInstance().format(d));
        sb.append("\n");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.lock.lock();
        try {
            sb.append("### Connection ###\n");
            appendNumberStat(sb, "Reconnects:                      ", this.reconnects.get());
            if (this.trackAdvanced) {
                appendNumberStat(sb, "Requests Sent:                   ", this.requestsSent.get());
                appendNumberStat(sb, "Replies Received:                ", this.repliesReceived.get());
                appendNumberStat(sb, "Duplicate Replies Received:      ", this.duplicateRepliesReceived.get());
                appendNumberStat(sb, "Orphan Replies Received:         ", this.orphanRepliesReceived.get());
                appendNumberStat(sb, "Pings Sent:                      ", this.pingCount.get());
                appendNumberStat(sb, "+OKs Received:                   ", this.okCount.get());
                appendNumberStat(sb, "-Errs Received:                  ", this.errCount.get());
                appendNumberStat(sb, "Handled Exceptions:              ", this.exceptionCount.get());
                appendNumberStat(sb, "Successful Flush Calls:          ", this.flushCounter.get());
                appendNumberStat(sb, "Outstanding Request Futures:     ", this.outstandingRequests.get());
                appendNumberStat(sb, "Dropped Messages:                ", this.droppedCount.get());
            }
            sb.append("\n");
            sb.append("### Reader ###\n");
            appendNumberStat(sb, "Messages in:                     ", this.inMsgs.get());
            appendNumberStat(sb, "Bytes in:                        ", this.inBytes.get());
            sb.append("\n");
            if (this.trackAdvanced) {
                appendNumberStat(sb, "Socket Reads:                    ", this.readStats.getCount());
                appendNumberStat(sb, "Average Bytes Per Read:          ", this.readStats.getAverage());
                appendNumberStat(sb, "Min Bytes Per Read:              ", this.readStats.getMin());
                appendNumberStat(sb, "Max Bytes Per Read:              ", this.readStats.getMax());
            }
            sb.append("\n");
            sb.append("### Writer ###\n");
            appendNumberStat(sb, "Messages out:                    ", this.outMsgs.get());
            appendNumberStat(sb, "Bytes out:                       ", this.outBytes.get());
            sb.append("\n");
            if (this.trackAdvanced) {
                appendNumberStat(sb, "Socket Writes:                   ", this.writeStats.getCount());
                appendNumberStat(sb, "Average Bytes Per Write:         ", this.writeStats.getAverage());
                appendNumberStat(sb, "Min Bytes Per Write:             ", this.writeStats.getMin());
                appendNumberStat(sb, "Max Bytes Per Write:             ", this.writeStats.getMax());
            }
            this.lock.unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }
}
