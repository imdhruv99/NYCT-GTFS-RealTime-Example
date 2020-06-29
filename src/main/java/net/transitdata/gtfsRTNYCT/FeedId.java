package net.transitdata.gtfsRTNYCT;

public enum FeedId {
    A_DIVISION (1),
    NQRW (16),
    BD (1),
    L (2),
    SIR (11);

    private final int value;

    FeedId(int value) {
        this.value = value;
    }

    public int getValue() {
        return  value;
    }
}
