package com.duhan.itunesclient.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Track extends AbstractResult {

    @SerializedName("wrapperType")
    @Expose
    private String wrapperType;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("collectionId")
    @Expose
    private long collectionId;
    @SerializedName("trackId")
    @Expose
    private long trackId;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("collectionName")
    @Expose
    private String collectionName;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("collectionCensoredName")
    @Expose
    private String collectionCensoredName;
    @SerializedName("trackCensoredName")
    @Expose
    private String trackCensoredName;
    @SerializedName("collectionArtistId")
    @Expose
    private long collectionArtistId;
    @SerializedName("collectionArtistViewUrl")
    @Expose
    private String collectionArtistViewUrl;
    @SerializedName("collectionViewUrl")
    @Expose
    private String collectionViewUrl;
    @SerializedName("trackViewUrl")
    @Expose
    private String trackViewUrl;
    @SerializedName("previewUrl")
    @Expose
    private String previewUrl;
    @SerializedName("artworkUrl30")
    @Expose
    private String artworkUrl30;
    @SerializedName("artworkUrl60")
    @Expose
    private String artworkUrl60;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;
    @SerializedName("collectionPrice")
    @Expose
    private double collectionPrice;
    @SerializedName("trackPrice")
    @Expose
    private double trackPrice;
    @SerializedName("trackRentalPrice")
    @Expose
    private double trackRentalPrice;
    @SerializedName("collectionHdPrice")
    @Expose
    private double collectionHdPrice;
    @SerializedName("trackHdPrice")
    @Expose
    private double trackHdPrice;
    @SerializedName("trackHdRentalPrice")
    @Expose
    private double trackHdRentalPrice;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("collectionExplicitness")
    @Expose
    private String collectionExplicitness;
    @SerializedName("trackExplicitness")
    @Expose
    private String trackExplicitness;
    @SerializedName("discCount")
    @Expose
    private long discCount;
    @SerializedName("discNumber")
    @Expose
    private long discNumber;
    @SerializedName("trackCount")
    @Expose
    private long trackCount;
    @SerializedName("trackNumber")
    @Expose
    private long trackNumber;
    @SerializedName("trackTimeMillis")
    @Expose
    private long trackTimeMillis;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("primaryGenreName")
    @Expose
    private String primaryGenreName;
    @SerializedName("contentAdvisoryRating")
    @Expose
    private String contentAdvisoryRating;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("longDescription")
    @Expose
    private String longDescription;
    @SerializedName("hasITunesExtras")
    @Expose
    private boolean hasITunesExtras;

    public Track() {
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public Track withWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Track withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(long collectionId) {
        this.collectionId = collectionId;
    }

    public Track withCollectionId(long collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public Track withTrackId(long trackId) {
        this.trackId = trackId;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Track withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public Track withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Track withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public Track withCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
        return this;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public Track withTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
        return this;
    }

    public long getCollectionArtistId() {
        return collectionArtistId;
    }

    public void setCollectionArtistId(long collectionArtistId) {
        this.collectionArtistId = collectionArtistId;
    }

    public Track withCollectionArtistId(long collectionArtistId) {
        this.collectionArtistId = collectionArtistId;
        return this;
    }

    public String getCollectionArtistViewUrl() {
        return collectionArtistViewUrl;
    }

    public void setCollectionArtistViewUrl(String collectionArtistViewUrl) {
        this.collectionArtistViewUrl = collectionArtistViewUrl;
    }

    public Track withCollectionArtistViewUrl(String collectionArtistViewUrl) {
        this.collectionArtistViewUrl = collectionArtistViewUrl;
        return this;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public Track withCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
        return this;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public Track withTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
        return this;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Track withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    public Track withArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
        return this;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public Track withArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
        return this;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public Track withArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
        return this;
    }

    public double getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public Track withCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
        return this;
    }

    public double getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
    }

    public Track withTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
        return this;
    }

    public double getTrackRentalPrice() {
        return trackRentalPrice;
    }

    public void setTrackRentalPrice(double trackRentalPrice) {
        this.trackRentalPrice = trackRentalPrice;
    }

    public Track withTrackRentalPrice(double trackRentalPrice) {
        this.trackRentalPrice = trackRentalPrice;
        return this;
    }

    public double getCollectionHdPrice() {
        return collectionHdPrice;
    }

    public void setCollectionHdPrice(double collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
    }

    public Track withCollectionHdPrice(double collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
        return this;
    }

    public double getTrackHdPrice() {
        return trackHdPrice;
    }

    public void setTrackHdPrice(double trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
    }

    public Track withTrackHdPrice(double trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
        return this;
    }

    public double getTrackHdRentalPrice() {
        return trackHdRentalPrice;
    }

    public void setTrackHdRentalPrice(double trackHdRentalPrice) {
        this.trackHdRentalPrice = trackHdRentalPrice;
    }

    public Track withTrackHdRentalPrice(double trackHdRentalPrice) {
        this.trackHdRentalPrice = trackHdRentalPrice;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Track withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public Track withCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
        return this;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    public Track withTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
        return this;
    }

    public long getDiscCount() {
        return discCount;
    }

    public void setDiscCount(long discCount) {
        this.discCount = discCount;
    }

    public Track withDiscCount(long discCount) {
        this.discCount = discCount;
        return this;
    }

    public long getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(long discNumber) {
        this.discNumber = discNumber;
    }

    public Track withDiscNumber(long discNumber) {
        this.discNumber = discNumber;
        return this;
    }

    public long getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(long trackCount) {
        this.trackCount = trackCount;
    }

    public Track withTrackCount(long trackCount) {
        this.trackCount = trackCount;
        return this;
    }

    public long getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(long trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Track withTrackNumber(long trackNumber) {
        this.trackNumber = trackNumber;
        return this;
    }

    public long getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public void setTrackTimeMillis(long trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    public Track withTrackTimeMillis(long trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Track withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Track withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public Track withPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
        return this;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public Track withContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Track withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Track withLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public boolean isHasITunesExtras() {
        return hasITunesExtras;
    }

    public void setHasITunesExtras(boolean hasITunesExtras) {
        this.hasITunesExtras = hasITunesExtras;
    }

    public Track withHasITunesExtras(boolean hasITunesExtras) {
        this.hasITunesExtras = hasITunesExtras;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Track.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wrapperType");
        sb.append('=');
        sb.append(((this.wrapperType == null) ? "<null>" : this.wrapperType));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null) ? "<null>" : this.kind));
        sb.append(',');
        sb.append("collectionId");
        sb.append('=');
        sb.append(this.collectionId);
        sb.append(',');
        sb.append("trackId");
        sb.append('=');
        sb.append(this.trackId);
        sb.append(',');
        sb.append("artistName");
        sb.append('=');
        sb.append(((this.artistName == null) ? "<null>" : this.artistName));
        sb.append(',');
        sb.append("collectionName");
        sb.append('=');
        sb.append(((this.collectionName == null) ? "<null>" : this.collectionName));
        sb.append(',');
        sb.append("trackName");
        sb.append('=');
        sb.append(((this.trackName == null) ? "<null>" : this.trackName));
        sb.append(',');
        sb.append("collectionCensoredName");
        sb.append('=');
        sb.append(((this.collectionCensoredName == null) ? "<null>" : this.collectionCensoredName));
        sb.append(',');
        sb.append("trackCensoredName");
        sb.append('=');
        sb.append(((this.trackCensoredName == null) ? "<null>" : this.trackCensoredName));
        sb.append(',');
        sb.append("collectionArtistId");
        sb.append('=');
        sb.append(this.collectionArtistId);
        sb.append(',');
        sb.append("collectionArtistViewUrl");
        sb.append('=');
        sb.append(((this.collectionArtistViewUrl == null) ? "<null>" : this.collectionArtistViewUrl));
        sb.append(',');
        sb.append("collectionViewUrl");
        sb.append('=');
        sb.append(((this.collectionViewUrl == null) ? "<null>" : this.collectionViewUrl));
        sb.append(',');
        sb.append("trackViewUrl");
        sb.append('=');
        sb.append(((this.trackViewUrl == null) ? "<null>" : this.trackViewUrl));
        sb.append(',');
        sb.append("previewUrl");
        sb.append('=');
        sb.append(((this.previewUrl == null) ? "<null>" : this.previewUrl));
        sb.append(',');
        sb.append("artworkUrl30");
        sb.append('=');
        sb.append(((this.artworkUrl30 == null) ? "<null>" : this.artworkUrl30));
        sb.append(',');
        sb.append("artworkUrl60");
        sb.append('=');
        sb.append(((this.artworkUrl60 == null) ? "<null>" : this.artworkUrl60));
        sb.append(',');
        sb.append("artworkUrl100");
        sb.append('=');
        sb.append(((this.artworkUrl100 == null) ? "<null>" : this.artworkUrl100));
        sb.append(',');
        sb.append("collectionPrice");
        sb.append('=');
        sb.append(this.collectionPrice);
        sb.append(',');
        sb.append("trackPrice");
        sb.append('=');
        sb.append(this.trackPrice);
        sb.append(',');
        sb.append("trackRentalPrice");
        sb.append('=');
        sb.append(this.trackRentalPrice);
        sb.append(',');
        sb.append("collectionHdPrice");
        sb.append('=');
        sb.append(this.collectionHdPrice);
        sb.append(',');
        sb.append("trackHdPrice");
        sb.append('=');
        sb.append(this.trackHdPrice);
        sb.append(',');
        sb.append("trackHdRentalPrice");
        sb.append('=');
        sb.append(this.trackHdRentalPrice);
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null) ? "<null>" : this.releaseDate));
        sb.append(',');
        sb.append("collectionExplicitness");
        sb.append('=');
        sb.append(((this.collectionExplicitness == null) ? "<null>" : this.collectionExplicitness));
        sb.append(',');
        sb.append("trackExplicitness");
        sb.append('=');
        sb.append(((this.trackExplicitness == null) ? "<null>" : this.trackExplicitness));
        sb.append(',');
        sb.append("discCount");
        sb.append('=');
        sb.append(this.discCount);
        sb.append(',');
        sb.append("discNumber");
        sb.append('=');
        sb.append(this.discNumber);
        sb.append(',');
        sb.append("trackCount");
        sb.append('=');
        sb.append(this.trackCount);
        sb.append(',');
        sb.append("trackNumber");
        sb.append('=');
        sb.append(this.trackNumber);
        sb.append(',');
        sb.append("trackTimeMillis");
        sb.append('=');
        sb.append(this.trackTimeMillis);
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null) ? "<null>" : this.country));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("primaryGenreName");
        sb.append('=');
        sb.append(((this.primaryGenreName == null) ? "<null>" : this.primaryGenreName));
        sb.append(',');
        sb.append("contentAdvisoryRating");
        sb.append('=');
        sb.append(((this.contentAdvisoryRating == null) ? "<null>" : this.contentAdvisoryRating));
        sb.append(',');
        sb.append("shortDescription");
        sb.append('=');
        sb.append(((this.shortDescription == null) ? "<null>" : this.shortDescription));
        sb.append(',');
        sb.append("longDescription");
        sb.append('=');
        sb.append(((this.longDescription == null) ? "<null>" : this.longDescription));
        sb.append(',');
        sb.append("hasITunesExtras");
        sb.append('=');
        sb.append(this.hasITunesExtras);
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
        result = ((result * 31) + ((this.artworkUrl100 == null) ? 0 : this.artworkUrl100.hashCode()));
        result = ((result * 31) + ((int) (this.trackTimeMillis ^ (this.trackTimeMillis >>> 32))));
        result = ((result * 31) + ((this.longDescription == null) ? 0 : this.longDescription.hashCode()));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.trackHdRentalPrice) ^ (Double.doubleToLongBits(this.trackHdRentalPrice) >>> 32))));
        result = ((result * 31) + ((this.country == null) ? 0 : this.country.hashCode()));
        result = ((result * 31) + ((this.previewUrl == null) ? 0 : this.previewUrl.hashCode()));
        result = ((result * 31) + ((int) (this.collectionArtistId ^ (this.collectionArtistId >>> 32))));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.collectionHdPrice) ^ (Double.doubleToLongBits(this.collectionHdPrice) >>> 32))));
        result = ((result * 31) + (this.hasITunesExtras ? 1 : 0));
        result = ((result * 31) + ((this.trackName == null) ? 0 : this.trackName.hashCode()));
        result = ((result * 31) + ((this.collectionArtistViewUrl == null) ? 0 : this.collectionArtistViewUrl.hashCode()));
        result = ((result * 31) + ((this.collectionName == null) ? 0 : this.collectionName.hashCode()));
        result = ((result * 31) + ((int) (this.discNumber ^ (this.discNumber >>> 32))));
        result = ((result * 31) + ((int) (this.trackCount ^ (this.trackCount >>> 32))));
        result = ((result * 31) + ((this.artworkUrl30 == null) ? 0 : this.artworkUrl30.hashCode()));
        result = ((result * 31) + ((this.wrapperType == null) ? 0 : this.wrapperType.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((int) (this.collectionId ^ (this.collectionId >>> 32))));
        result = ((result * 31) + ((this.trackExplicitness == null) ? 0 : this.trackExplicitness.hashCode()));
        result = ((result * 31) + ((this.collectionViewUrl == null) ? 0 : this.collectionViewUrl.hashCode()));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.trackHdPrice) ^ (Double.doubleToLongBits(this.trackHdPrice) >>> 32))));
        result = ((result * 31) + ((this.contentAdvisoryRating == null) ? 0 : this.contentAdvisoryRating.hashCode()));
        result = ((result * 31) + ((int) (this.trackNumber ^ (this.trackNumber >>> 32))));
        result = ((result * 31) + ((this.releaseDate == null) ? 0 : this.releaseDate.hashCode()));
        result = ((result * 31) + ((this.kind == null) ? 0 : this.kind.hashCode()));
        result = ((result * 31) + ((int) (this.trackId ^ (this.trackId >>> 32))));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.trackRentalPrice) ^ (Double.doubleToLongBits(this.trackRentalPrice) >>> 32))));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.collectionPrice) ^ (Double.doubleToLongBits(this.collectionPrice) >>> 32))));
        result = ((result * 31) + ((this.shortDescription == null) ? 0 : this.shortDescription.hashCode()));
        result = ((result * 31) + ((int) (this.discCount ^ (this.discCount >>> 32))));
        result = ((result * 31) + ((this.primaryGenreName == null) ? 0 : this.primaryGenreName.hashCode()));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.trackPrice) ^ (Double.doubleToLongBits(this.trackPrice) >>> 32))));
        result = ((result * 31) + ((this.collectionExplicitness == null) ? 0 : this.collectionExplicitness.hashCode()));
        result = ((result * 31) + ((this.trackViewUrl == null) ? 0 : this.trackViewUrl.hashCode()));
        result = ((result * 31) + ((this.artworkUrl60 == null) ? 0 : this.artworkUrl60.hashCode()));
        result = ((result * 31) + ((this.trackCensoredName == null) ? 0 : this.trackCensoredName.hashCode()));
        result = ((result * 31) + ((this.artistName == null) ? 0 : this.artistName.hashCode()));
        result = ((result * 31) + ((this.collectionCensoredName == null) ? 0 : this.collectionCensoredName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Track)) {
            return false;
        }
        Track rhs = ((Track) other);
        return Objects.equals(this.artworkUrl100, rhs.artworkUrl100)
                && this.trackTimeMillis == rhs.trackTimeMillis
                && this.longDescription.equals(rhs.longDescription)
                && Double.doubleToLongBits(this.trackHdRentalPrice) == Double.doubleToLongBits(rhs.trackHdRentalPrice)
                && (Objects.equals(this.country, rhs.country))
                && (Objects.equals(this.previewUrl, rhs.previewUrl))
                && this.collectionArtistId == rhs.collectionArtistId
                && Double.doubleToLongBits(this.collectionHdPrice) == Double.doubleToLongBits(rhs.collectionHdPrice)
                && this.hasITunesExtras == rhs.hasITunesExtras
                && (Objects.equals(this.trackName, rhs.trackName))
                && (Objects.equals(this.collectionArtistViewUrl, rhs.collectionArtistViewUrl))
                && (Objects.equals(this.collectionName, rhs.collectionName))
                && this.discNumber == rhs.discNumber
                && this.trackCount == rhs.trackCount
                && (Objects.equals(this.artworkUrl30, rhs.artworkUrl30))
                && (Objects.equals(this.wrapperType, rhs.wrapperType))
                && (Objects.equals(this.currency, rhs.currency))
                && this.collectionId == rhs.collectionId
                && (Objects.equals(this.trackExplicitness, rhs.trackExplicitness))
                && (Objects.equals(this.collectionViewUrl, rhs.collectionViewUrl))
                && Double.doubleToLongBits(this.trackHdPrice) == Double.doubleToLongBits(rhs.trackHdPrice)
                && (Objects.equals(this.contentAdvisoryRating, rhs.contentAdvisoryRating))
                && this.trackNumber == rhs.trackNumber
                && (Objects.equals(this.releaseDate, rhs.releaseDate))
                && (Objects.equals(this.kind, rhs.kind))
                && this.trackId == rhs.trackId && Double.doubleToLongBits(this.trackRentalPrice) == Double.doubleToLongBits(rhs.trackRentalPrice)
                && Double.doubleToLongBits(this.collectionPrice) == Double.doubleToLongBits(rhs.collectionPrice)
                && (Objects.equals(this.shortDescription, rhs.shortDescription))
                && this.discCount == rhs.discCount
                && (Objects.equals(this.primaryGenreName, rhs.primaryGenreName))
                && Double.doubleToLongBits(this.trackPrice) == Double.doubleToLongBits(rhs.trackPrice)
                && (Objects.equals(this.collectionExplicitness, rhs.collectionExplicitness))
                && (Objects.equals(this.trackViewUrl, rhs.trackViewUrl))
                && (Objects.equals(this.artworkUrl60, rhs.artworkUrl60))
                && (Objects.equals(this.trackCensoredName, rhs.trackCensoredName)) && (Objects.equals(this.artistName, rhs.artistName))
                && (Objects.equals(this.collectionCensoredName, rhs.collectionCensoredName));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(wrapperType);
        dest.writeValue(kind);
        dest.writeValue(collectionId);
        dest.writeValue(trackId);
        dest.writeValue(artistName);
        dest.writeValue(collectionName);
        dest.writeValue(trackName);
        dest.writeValue(collectionCensoredName);
        dest.writeValue(trackCensoredName);
        dest.writeValue(collectionArtistId);
        dest.writeValue(collectionArtistViewUrl);
        dest.writeValue(collectionViewUrl);
        dest.writeValue(trackViewUrl);
        dest.writeValue(previewUrl);
        dest.writeValue(artworkUrl30);
        dest.writeValue(artworkUrl60);
        dest.writeValue(artworkUrl100);
        dest.writeValue(collectionPrice);
        dest.writeValue(trackPrice);
        dest.writeValue(trackRentalPrice);
        dest.writeValue(collectionHdPrice);
        dest.writeValue(trackHdPrice);
        dest.writeValue(trackHdRentalPrice);
        dest.writeValue(releaseDate);
        dest.writeValue(collectionExplicitness);
        dest.writeValue(trackExplicitness);
        dest.writeValue(discCount);
        dest.writeValue(discNumber);
        dest.writeValue(trackCount);
        dest.writeValue(trackNumber);
        dest.writeValue(trackTimeMillis);
        dest.writeValue(country);
        dest.writeValue(currency);
        dest.writeValue(primaryGenreName);
        dest.writeValue(contentAdvisoryRating);
        dest.writeValue(shortDescription);
        dest.writeValue(longDescription);
        dest.writeValue(hasITunesExtras);
    }

    public int describeContents() {
        return 0;
    }

}
