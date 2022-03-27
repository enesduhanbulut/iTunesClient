package com.duhan.itunesclient.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class AbstractResult {
    @SerializedName("wrapperType")
    @Expose(serialize = false, deserialize = false)
    public String wrapperType;

    public AbstractResult() {
    }

    public WrapperType getWrapperType() {
        if (WrapperType.TRACK.getEntity().equals(wrapperType)) {
            return WrapperType.TRACK;
        } else if (WrapperType.ARTIST.getEntity().equals(wrapperType)) {
            return WrapperType.ARTIST;
        } else if (WrapperType.COLLECTION.getEntity().equals(wrapperType)) {
            return WrapperType.COLLECTION;
        } else if (WrapperType.SOFTWARE.getEntity().equals(wrapperType)) {
            return WrapperType.SOFTWARE;
        }
        return null;
    }
}
