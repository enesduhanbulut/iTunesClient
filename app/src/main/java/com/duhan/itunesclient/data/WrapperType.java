package com.duhan.itunesclient.data;

public enum WrapperType {
    SOFTWARE("software", ""),
    TRACK("track", "allTrack"),
    COLLECTION("collection", ""),
    ARTIST("artist", "allArtist"),
    ;

    private final String type;
    private final String entity;

    WrapperType(String type, String entity) {
        this.type = type;
        this.entity = entity;
    }

    public String getEntity() {
        return entity;
    }
}
