package com.duhan.itunesclient.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Collection extends AbstractResult {
    @SerializedName("collectionType")
    @Expose
    private String collectionType;
    @SerializedName("artistId")
    @Expose
    private long artistId;
    @SerializedName("collectionId")
    @Expose
    private long collectionId;
    @SerializedName("amgArtistId")
    @Expose
    private long amgArtistId;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("collectionName")
    @Expose
    private String collectionName;
    @SerializedName("collectionCensoredName")
    @Expose
    private String collectionCensoredName;
    @SerializedName("artistViewUrl")
    @Expose
    private String artistViewUrl;
    @SerializedName("collectionViewUrl")
    @Expose
    private String collectionViewUrl;
    @SerializedName("artworkUrl60")
    @Expose
    private String artworkUrl60;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;
    @SerializedName("collectionPrice")
    @Expose
    private double collectionPrice;
    @SerializedName("collectionExplicitness")
    @Expose
    private String collectionExplicitness;
    @SerializedName("trackCount")
    @Expose
    private long trackCount;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("primaryGenreName")
    @Expose
    private String primaryGenreName;

    protected Collection(android.os.Parcel in) {
        this.wrapperType = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionType = ((String) in.readValue((String.class.getClassLoader())));
        this.artistId = ((long) in.readValue((long.class.getClassLoader())));
        this.collectionId = ((long) in.readValue((long.class.getClassLoader())));
        this.amgArtistId = ((long) in.readValue((long.class.getClassLoader())));
        this.artistName = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionName = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionCensoredName = ((String) in.readValue((String.class.getClassLoader())));
        this.artistViewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionViewUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.artworkUrl60 = ((String) in.readValue((String.class.getClassLoader())));
        this.artworkUrl100 = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionPrice = ((double) in.readValue((double.class.getClassLoader())));
        this.collectionExplicitness = ((String) in.readValue((String.class.getClassLoader())));
        this.trackCount = ((long) in.readValue((long.class.getClassLoader())));
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.releaseDate = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryGenreName = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Collection() {
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public Collection withWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
        return this;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    public Collection withCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public Collection withArtistId(long artistId) {
        this.artistId = artistId;
        return this;
    }

    public long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(long collectionId) {
        this.collectionId = collectionId;
    }

    public Collection withCollectionId(long collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    public long getAmgArtistId() {
        return amgArtistId;
    }

    public void setAmgArtistId(long amgArtistId) {
        this.amgArtistId = amgArtistId;
    }

    public Collection withAmgArtistId(long amgArtistId) {
        this.amgArtistId = amgArtistId;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Collection withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public Collection withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public Collection withCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
        return this;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public Collection withArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
        return this;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public Collection withCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
        return this;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public Collection withArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
        return this;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public Collection withArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
        return this;
    }

    public double getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public Collection withCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
        return this;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public Collection withCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
        return this;
    }

    public long getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(long trackCount) {
        this.trackCount = trackCount;
    }

    public Collection withTrackCount(long trackCount) {
        this.trackCount = trackCount;
        return this;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Collection withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Collection withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Collection withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Collection withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public Collection withPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Collection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wrapperType");
        sb.append('=');
        sb.append(((this.wrapperType == null) ? "<null>" : this.wrapperType));
        sb.append(',');
        sb.append("collectionType");
        sb.append('=');
        sb.append(((this.collectionType == null) ? "<null>" : this.collectionType));
        sb.append(',');
        sb.append("artistId");
        sb.append('=');
        sb.append(this.artistId);
        sb.append(',');
        sb.append("collectionId");
        sb.append('=');
        sb.append(this.collectionId);
        sb.append(',');
        sb.append("amgArtistId");
        sb.append('=');
        sb.append(this.amgArtistId);
        sb.append(',');
        sb.append("artistName");
        sb.append('=');
        sb.append(((this.artistName == null) ? "<null>" : this.artistName));
        sb.append(',');
        sb.append("collectionName");
        sb.append('=');
        sb.append(((this.collectionName == null) ? "<null>" : this.collectionName));
        sb.append(',');
        sb.append("collectionCensoredName");
        sb.append('=');
        sb.append(((this.collectionCensoredName == null) ? "<null>" : this.collectionCensoredName));
        sb.append(',');
        sb.append("artistViewUrl");
        sb.append('=');
        sb.append(((this.artistViewUrl == null) ? "<null>" : this.artistViewUrl));
        sb.append(',');
        sb.append("collectionViewUrl");
        sb.append('=');
        sb.append(((this.collectionViewUrl == null) ? "<null>" : this.collectionViewUrl));
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
        sb.append("collectionExplicitness");
        sb.append('=');
        sb.append(((this.collectionExplicitness == null) ? "<null>" : this.collectionExplicitness));
        sb.append(',');
        sb.append("trackCount");
        sb.append('=');
        sb.append(this.trackCount);
        sb.append(',');
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null) ? "<null>" : this.copyright));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null) ? "<null>" : this.country));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null) ? "<null>" : this.releaseDate));
        sb.append(',');
        sb.append("primaryGenreName");
        sb.append('=');
        sb.append(((this.primaryGenreName == null) ? "<null>" : this.primaryGenreName));
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
        result = ((result * 31) + ((this.country == null) ? 0 : this.country.hashCode()));
        result = ((result * 31) + ((this.copyright == null) ? 0 : this.copyright.hashCode()));
        result = ((result * 31) + ((this.collectionViewUrl == null) ? 0 : this.collectionViewUrl.hashCode()));
        result = ((result * 31) + ((int) (this.amgArtistId ^ (this.amgArtistId >>> 32))));
        result = ((result * 31) + ((this.releaseDate == null) ? 0 : this.releaseDate.hashCode()));
        result = ((result * 31) + ((int) (this.artistId ^ (this.artistId >>> 32))));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.collectionPrice) ^ (Double.doubleToLongBits(this.collectionPrice) >>> 32))));
        result = ((result * 31) + ((this.primaryGenreName == null) ? 0 : this.primaryGenreName.hashCode()));
        result = ((result * 31) + ((this.collectionName == null) ? 0 : this.collectionName.hashCode()));
        result = ((result * 31) + ((this.artistViewUrl == null) ? 0 : this.artistViewUrl.hashCode()));
        result = ((result * 31) + ((this.collectionType == null) ? 0 : this.collectionType.hashCode()));
        result = ((result * 31) + ((this.collectionExplicitness == null) ? 0 : this.collectionExplicitness.hashCode()));
        result = ((result * 31) + ((int) (this.trackCount ^ (this.trackCount >>> 32))));
        result = ((result * 31) + ((this.artworkUrl60 == null) ? 0 : this.artworkUrl60.hashCode()));
        result = ((result * 31) + ((this.wrapperType == null) ? 0 : this.wrapperType.hashCode()));
        result = ((result * 31) + ((this.artistName == null) ? 0 : this.artistName.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((int) (this.collectionId ^ (this.collectionId >>> 32))));
        result = ((result * 31) + ((this.collectionCensoredName == null) ? 0 : this.collectionCensoredName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Collection)) {
            return false;
        }
        Collection rhs = ((Collection) other);
        return ((((((((((((((((((((Objects.equals(this.artworkUrl100, rhs.artworkUrl100)) && (Objects.equals(this.country, rhs.country)))
                && (Objects.equals(this.copyright, rhs.copyright))) && (Objects.equals(this.collectionViewUrl, rhs.collectionViewUrl))) && (this.amgArtistId == rhs.amgArtistId))
                && (Objects.equals(this.releaseDate, rhs.releaseDate))) && (this.artistId == rhs.artistId))
                && (Double.doubleToLongBits(this.collectionPrice) == Double.doubleToLongBits(rhs.collectionPrice)))
                && (Objects.equals(this.primaryGenreName, rhs.primaryGenreName)))
                && (Objects.equals(this.collectionName, rhs.collectionName)))
                && (Objects.equals(this.artistViewUrl, rhs.artistViewUrl)))
                && (Objects.equals(this.collectionType, rhs.collectionType)))
                && (Objects.equals(this.collectionExplicitness, rhs.collectionExplicitness)))
                && (this.trackCount == rhs.trackCount))
                && (Objects.equals(this.artworkUrl60, rhs.artworkUrl60)))
                && (Objects.equals(this.wrapperType, rhs.wrapperType)))
                && (Objects.equals(this.artistName, rhs.artistName)))
                && (Objects.equals(this.currency, rhs.currency)))
                && (this.collectionId == rhs.collectionId))
                && (Objects.equals(this.collectionCensoredName, rhs.collectionCensoredName)));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(wrapperType);
        dest.writeValue(collectionType);
        dest.writeValue(artistId);
        dest.writeValue(collectionId);
        dest.writeValue(amgArtistId);
        dest.writeValue(artistName);
        dest.writeValue(collectionName);
        dest.writeValue(collectionCensoredName);
        dest.writeValue(artistViewUrl);
        dest.writeValue(collectionViewUrl);
        dest.writeValue(artworkUrl60);
        dest.writeValue(artworkUrl100);
        dest.writeValue(collectionPrice);
        dest.writeValue(collectionExplicitness);
        dest.writeValue(trackCount);
        dest.writeValue(copyright);
        dest.writeValue(country);
        dest.writeValue(currency);
        dest.writeValue(releaseDate);
        dest.writeValue(primaryGenreName);
    }

}
