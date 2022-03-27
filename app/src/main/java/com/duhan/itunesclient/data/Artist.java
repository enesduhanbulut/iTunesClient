package com.duhan.itunesclient.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Artist extends AbstractResult {
    @SerializedName("artistType")
    @Expose
    private String artistType;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("artistLinkUrl")
    @Expose
    private String artistLinkUrl;
    @SerializedName("artistId")
    @Expose
    private long artistId;
    @SerializedName("amgArtistId")
    @Expose
    private long amgArtistId;
    @SerializedName("primaryGenreName")
    @Expose
    private String primaryGenreName;
    @SerializedName("primaryGenreId")
    @Expose
    private long primaryGenreId;

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public Artist withWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
        return this;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public Artist withArtistType(String artistType) {
        this.artistType = artistType;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Artist withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public String getArtistLinkUrl() {
        return artistLinkUrl;
    }

    public void setArtistLinkUrl(String artistLinkUrl) {
        this.artistLinkUrl = artistLinkUrl;
    }

    public Artist withArtistLinkUrl(String artistLinkUrl) {
        this.artistLinkUrl = artistLinkUrl;
        return this;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public Artist withArtistId(long artistId) {
        this.artistId = artistId;
        return this;
    }

    public long getAmgArtistId() {
        return amgArtistId;
    }

    public void setAmgArtistId(long amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    public Artist withAmgArtistId(long amgArtistId) {
        this.amgArtistId = amgArtistId;
        return this;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public Artist withPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
        return this;
    }

    public long getPrimaryGenreId() {
        return primaryGenreId;
    }

    public void setPrimaryGenreId(long primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
    }

    public Artist withPrimaryGenreId(long primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Artist.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wrapperType");
        sb.append('=');
        sb.append(((this.wrapperType == null) ? "<null>" : this.wrapperType));
        sb.append(',');
        sb.append("artistType");
        sb.append('=');
        sb.append(((this.artistType == null) ? "<null>" : this.artistType));
        sb.append(',');
        sb.append("artistName");
        sb.append('=');
        sb.append(((this.artistName == null) ? "<null>" : this.artistName));
        sb.append(',');
        sb.append("artistLinkUrl");
        sb.append('=');
        sb.append(((this.artistLinkUrl == null) ? "<null>" : this.artistLinkUrl));
        sb.append(',');
        sb.append("artistId");
        sb.append('=');
        sb.append(this.artistId);
        sb.append(',');
        sb.append("amgArtistId");
        sb.append('=');
        sb.append(this.amgArtistId);
        sb.append(',');
        sb.append("primaryGenreName");
        sb.append('=');
        sb.append(((this.primaryGenreName == null) ? "<null>" : this.primaryGenreName));
        sb.append(',');
        sb.append("primaryGenreId");
        sb.append('=');
        sb.append(this.primaryGenreId);
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.artistLinkUrl == null) ? 0 : this.artistLinkUrl.hashCode()));
        result = ((result * 31) + ((int) (this.amgArtistId ^ (this.amgArtistId >>> 32))));
        result = ((result * 31) + ((this.wrapperType == null) ? 0 : this.wrapperType.hashCode()));
        result = ((result * 31) + ((this.artistType == null) ? 0 : this.artistType.hashCode()));
        result = ((result * 31) + ((this.artistName == null) ? 0 : this.artistName.hashCode()));
        result = ((result * 31) + ((int) (this.artistId ^ (this.artistId >>> 32))));
        result = ((result * 31) + ((int) (this.primaryGenreId ^ (this.primaryGenreId >>> 32))));
        result = ((result * 31) + ((this.primaryGenreName == null) ? 0 : this.primaryGenreName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Artist)) {
            return false;
        }
        Artist rhs = ((Artist) other);
        return ((((((((Objects.equals(this.artistLinkUrl, rhs.artistLinkUrl))
                && (this.amgArtistId == rhs.amgArtistId)) && (Objects.equals(this.wrapperType, rhs.wrapperType)))
                && (Objects.equals(this.artistType, rhs.artistType))) && (Objects.equals(this.artistName, rhs.artistName)))
                && (this.artistId == rhs.artistId)) && (this.primaryGenreId == rhs.primaryGenreId))
                && (Objects.equals(this.primaryGenreName, rhs.primaryGenreName)));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(wrapperType);
        dest.writeValue(artistType);
        dest.writeValue(artistName);
        dest.writeValue(artistLinkUrl);
        dest.writeValue(artistId);
        dest.writeValue(amgArtistId);
        dest.writeValue(primaryGenreName);
        dest.writeValue(primaryGenreId);
    }
}
