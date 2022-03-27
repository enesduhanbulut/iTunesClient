package com.duhan.itunesclient.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Software extends AbstractResult {

    @SerializedName("screenshotUrls")
    @Expose
    private List<String> screenshotUrls = null;
    @SerializedName("ipadScreenshotUrls")
    @Expose
    private List<String> ipadScreenshotUrls = null;
    @SerializedName("appletvScreenshotUrls")
    @Expose
    private List<Object> appletvScreenshotUrls = null;
    @SerializedName("artworkUrl60")
    @Expose
    private String artworkUrl60;
    @SerializedName("artworkUrl512")
    @Expose
    private String artworkUrl512;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;
    @SerializedName("artistViewUrl")
    @Expose
    private String artistViewUrl;
    @SerializedName("supportedDevices")
    @Expose
    private List<String> supportedDevices = null;
    @SerializedName("features")
    @Expose
    private List<String> features = null;
    @SerializedName("advisories")
    @Expose
    private List<String> advisories = null;
    @SerializedName("isGameCenterEnabled")
    @Expose
    private boolean isGameCenterEnabled;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("minimumOsVersion")
    @Expose
    private String minimumOsVersion;
    @SerializedName("trackCensoredName")
    @Expose
    private String trackCensoredName;
    @SerializedName("languageCodesISO2A")
    @Expose
    private List<String> languageCodesISO2A = null;
    @SerializedName("fileSizeBytes")
    @Expose
    private String fileSizeBytes;
    @SerializedName("sellerUrl")
    @Expose
    private String sellerUrl;
    @SerializedName("formattedPrice")
    @Expose
    private String formattedPrice;
    @SerializedName("contentAdvisoryRating")
    @Expose
    private String contentAdvisoryRating;
    @SerializedName("averageUserRatingForCurrentVersion")
    @Expose
    private double averageUserRatingForCurrentVersion;
    @SerializedName("userRatingCountForCurrentVersion")
    @Expose
    private long userRatingCountForCurrentVersion;
    @SerializedName("averageUserRating")
    @Expose
    private double averageUserRating;
    @SerializedName("trackViewUrl")
    @Expose
    private String trackViewUrl;
    @SerializedName("trackContentRating")
    @Expose
    private String trackContentRating;
    @SerializedName("trackId")
    @Expose
    private long trackId;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("bundleId")
    @Expose
    private String bundleId;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("primaryGenreName")
    @Expose
    private String primaryGenreName;
    @SerializedName("genreIds")
    @Expose
    private List<String> genreIds = null;
    @SerializedName("isVppDeviceBasedLicensingEnabled")
    @Expose
    private boolean isVppDeviceBasedLicensingEnabled;
    @SerializedName("sellerName")
    @Expose
    private String sellerName;
    @SerializedName("currentVersionReleaseDate")
    @Expose
    private String currentVersionReleaseDate;
    @SerializedName("releaseNotes")
    @Expose
    private String releaseNotes;
    @SerializedName("primaryGenreId")
    @Expose
    private long primaryGenreId;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("artistId")
    @Expose
    private long artistId;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("userRatingCount")
    @Expose
    private long userRatingCount;

    public List<String> getScreenshotUrls() {
        return screenshotUrls;
    }

    public void setScreenshotUrls(List<String> screenshotUrls) {
        this.screenshotUrls = screenshotUrls;
    }

    public Software withScreenshotUrls(List<String> screenshotUrls) {
        this.screenshotUrls = screenshotUrls;
        return this;
    }

    public List<String> getIpadScreenshotUrls() {
        return ipadScreenshotUrls;
    }

    public void setIpadScreenshotUrls(List<String> ipadScreenshotUrls) {
        this.ipadScreenshotUrls = ipadScreenshotUrls;
    }

    public Software withIpadScreenshotUrls(List<String> ipadScreenshotUrls) {
        this.ipadScreenshotUrls = ipadScreenshotUrls;
        return this;
    }

    public List<Object> getAppletvScreenshotUrls() {
        return appletvScreenshotUrls;
    }

    public void setAppletvScreenshotUrls(List<Object> appletvScreenshotUrls) {
        this.appletvScreenshotUrls = appletvScreenshotUrls;
    }

    public Software withAppletvScreenshotUrls(List<Object> appletvScreenshotUrls) {
        this.appletvScreenshotUrls = appletvScreenshotUrls;
        return this;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public Software withArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
        return this;
    }

    public String getArtworkUrl512() {
        return artworkUrl512;
    }

    public void setArtworkUrl512(String artworkUrl512) {
        this.artworkUrl512 = artworkUrl512;
    }

    public Software withArtworkUrl512(String artworkUrl512) {
        this.artworkUrl512 = artworkUrl512;
        return this;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public Software withArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
        return this;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public Software withArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
        return this;
    }

    public List<String> getSupportedDevices() {
        return supportedDevices;
    }

    public void setSupportedDevices(List<String> supportedDevices) {
        this.supportedDevices = supportedDevices;
    }

    public Software withSupportedDevices(List<String> supportedDevices) {
        this.supportedDevices = supportedDevices;
        return this;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Software withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    public List<String> getAdvisories() {
        return advisories;
    }

    public void setAdvisories(List<String> advisories) {
        this.advisories = advisories;
    }

    public Software withAdvisories(List<String> advisories) {
        this.advisories = advisories;
        return this;
    }

    public boolean isIsGameCenterEnabled() {
        return isGameCenterEnabled;
    }

    public void setIsGameCenterEnabled(boolean isGameCenterEnabled) {
        this.isGameCenterEnabled = isGameCenterEnabled;
    }

    public Software withIsGameCenterEnabled(boolean isGameCenterEnabled) {
        this.isGameCenterEnabled = isGameCenterEnabled;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Software withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getMinimumOsVersion() {
        return minimumOsVersion;
    }

    public void setMinimumOsVersion(String minimumOsVersion) {
        this.minimumOsVersion = minimumOsVersion;
    }

    public Software withMinimumOsVersion(String minimumOsVersion) {
        this.minimumOsVersion = minimumOsVersion;
        return this;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public Software withTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
        return this;
    }

    public List<String> getLanguageCodesISO2A() {
        return languageCodesISO2A;
    }

    public void setLanguageCodesISO2A(List<String> languageCodesISO2A) {
        this.languageCodesISO2A = languageCodesISO2A;
    }

    public Software withLanguageCodesISO2A(List<String> languageCodesISO2A) {
        this.languageCodesISO2A = languageCodesISO2A;
        return this;
    }

    public String getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(String fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public Software withFileSizeBytes(String fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
        return this;
    }

    public String getSellerUrl() {
        return sellerUrl;
    }

    public void setSellerUrl(String sellerUrl) {
        this.sellerUrl = sellerUrl;
    }

    public Software withSellerUrl(String sellerUrl) {
        this.sellerUrl = sellerUrl;
        return this;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public Software withFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
        return this;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public Software withContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
        return this;
    }

    public double getAverageUserRatingForCurrentVersion() {
        return averageUserRatingForCurrentVersion;
    }

    public void setAverageUserRatingForCurrentVersion(double averageUserRatingForCurrentVersion) {
        this.averageUserRatingForCurrentVersion = averageUserRatingForCurrentVersion;
    }

    public Software withAverageUserRatingForCurrentVersion(double averageUserRatingForCurrentVersion) {
        this.averageUserRatingForCurrentVersion = averageUserRatingForCurrentVersion;
        return this;
    }

    public long getUserRatingCountForCurrentVersion() {
        return userRatingCountForCurrentVersion;
    }

    public void setUserRatingCountForCurrentVersion(long userRatingCountForCurrentVersion) {
        this.userRatingCountForCurrentVersion = userRatingCountForCurrentVersion;
    }

    public Software withUserRatingCountForCurrentVersion(long userRatingCountForCurrentVersion) {
        this.userRatingCountForCurrentVersion = userRatingCountForCurrentVersion;
        return this;
    }

    public double getAverageUserRating() {
        return averageUserRating;
    }

    public void setAverageUserRating(double averageUserRating) {
        this.averageUserRating = averageUserRating;
    }

    public Software withAverageUserRating(double averageUserRating) {
        this.averageUserRating = averageUserRating;
        return this;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public Software withTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
        return this;
    }

    public String getTrackContentRating() {
        return trackContentRating;
    }

    public void setTrackContentRating(String trackContentRating) {
        this.trackContentRating = trackContentRating;
    }

    public Software withTrackContentRating(String trackContentRating) {
        this.trackContentRating = trackContentRating;
        return this;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public Software withTrackId(long trackId) {
        this.trackId = trackId;
        return this;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Software withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public Software withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Software withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public Software withPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
        return this;
    }

    public List<String> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<String> genreIds) {
        this.genreIds = genreIds;
    }

    public Software withGenreIds(List<String> genreIds) {
        this.genreIds = genreIds;
        return this;
    }

    public boolean isIsVppDeviceBasedLicensingEnabled() {
        return isVppDeviceBasedLicensingEnabled;
    }

    public void setIsVppDeviceBasedLicensingEnabled(boolean isVppDeviceBasedLicensingEnabled) {
        this.isVppDeviceBasedLicensingEnabled = isVppDeviceBasedLicensingEnabled;
    }

    public Software withIsVppDeviceBasedLicensingEnabled(boolean isVppDeviceBasedLicensingEnabled) {
        this.isVppDeviceBasedLicensingEnabled = isVppDeviceBasedLicensingEnabled;
        return this;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Software withSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public String getCurrentVersionReleaseDate() {
        return currentVersionReleaseDate;
    }

    public void setCurrentVersionReleaseDate(String currentVersionReleaseDate) {
        this.currentVersionReleaseDate = currentVersionReleaseDate;
    }

    public Software withCurrentVersionReleaseDate(String currentVersionReleaseDate) {
        this.currentVersionReleaseDate = currentVersionReleaseDate;
        return this;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public Software withReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }

    public long getPrimaryGenreId() {
        return primaryGenreId;
    }

    public void setPrimaryGenreId(long primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
    }

    public Software withPrimaryGenreId(long primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Software withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Software withVersion(String version) {
        this.version = version;
        return this;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public Software withWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Software withDescription(String description) {
        this.description = description;
        return this;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public Software withArtistId(long artistId) {
        this.artistId = artistId;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Software withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Software withGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Software withPrice(double price) {
        this.price = price;
        return this;
    }

    public long getUserRatingCount() {
        return userRatingCount;
    }

    public void setUserRatingCount(long userRatingCount) {
        this.userRatingCount = userRatingCount;
    }

    public Software withUserRatingCount(long userRatingCount) {
        this.userRatingCount = userRatingCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Software.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("screenshotUrls");
        sb.append('=');
        sb.append(((this.screenshotUrls == null) ? "<null>" : this.screenshotUrls));
        sb.append(',');
        sb.append("ipadScreenshotUrls");
        sb.append('=');
        sb.append(((this.ipadScreenshotUrls == null) ? "<null>" : this.ipadScreenshotUrls));
        sb.append(',');
        sb.append("appletvScreenshotUrls");
        sb.append('=');
        sb.append(((this.appletvScreenshotUrls == null) ? "<null>" : this.appletvScreenshotUrls));
        sb.append(',');
        sb.append("artworkUrl60");
        sb.append('=');
        sb.append(((this.artworkUrl60 == null) ? "<null>" : this.artworkUrl60));
        sb.append(',');
        sb.append("artworkUrl512");
        sb.append('=');
        sb.append(((this.artworkUrl512 == null) ? "<null>" : this.artworkUrl512));
        sb.append(',');
        sb.append("artworkUrl100");
        sb.append('=');
        sb.append(((this.artworkUrl100 == null) ? "<null>" : this.artworkUrl100));
        sb.append(',');
        sb.append("artistViewUrl");
        sb.append('=');
        sb.append(((this.artistViewUrl == null) ? "<null>" : this.artistViewUrl));
        sb.append(',');
        sb.append("supportedDevices");
        sb.append('=');
        sb.append(((this.supportedDevices == null) ? "<null>" : this.supportedDevices));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null) ? "<null>" : this.features));
        sb.append(',');
        sb.append("advisories");
        sb.append('=');
        sb.append(((this.advisories == null) ? "<null>" : this.advisories));
        sb.append(',');
        sb.append("isGameCenterEnabled");
        sb.append('=');
        sb.append(this.isGameCenterEnabled);
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null) ? "<null>" : this.kind));
        sb.append(',');
        sb.append("minimumOsVersion");
        sb.append('=');
        sb.append(((this.minimumOsVersion == null) ? "<null>" : this.minimumOsVersion));
        sb.append(',');
        sb.append("trackCensoredName");
        sb.append('=');
        sb.append(((this.trackCensoredName == null) ? "<null>" : this.trackCensoredName));
        sb.append(',');
        sb.append("languageCodesISO2A");
        sb.append('=');
        sb.append(((this.languageCodesISO2A == null) ? "<null>" : this.languageCodesISO2A));
        sb.append(',');
        sb.append("fileSizeBytes");
        sb.append('=');
        sb.append(((this.fileSizeBytes == null) ? "<null>" : this.fileSizeBytes));
        sb.append(',');
        sb.append("sellerUrl");
        sb.append('=');
        sb.append(((this.sellerUrl == null) ? "<null>" : this.sellerUrl));
        sb.append(',');
        sb.append("formattedPrice");
        sb.append('=');
        sb.append(((this.formattedPrice == null) ? "<null>" : this.formattedPrice));
        sb.append(',');
        sb.append("contentAdvisoryRating");
        sb.append('=');
        sb.append(((this.contentAdvisoryRating == null) ? "<null>" : this.contentAdvisoryRating));
        sb.append(',');
        sb.append("averageUserRatingForCurrentVersion");
        sb.append('=');
        sb.append(this.averageUserRatingForCurrentVersion);
        sb.append(',');
        sb.append("userRatingCountForCurrentVersion");
        sb.append('=');
        sb.append(this.userRatingCountForCurrentVersion);
        sb.append(',');
        sb.append("averageUserRating");
        sb.append('=');
        sb.append(this.averageUserRating);
        sb.append(',');
        sb.append("trackViewUrl");
        sb.append('=');
        sb.append(((this.trackViewUrl == null) ? "<null>" : this.trackViewUrl));
        sb.append(',');
        sb.append("trackContentRating");
        sb.append('=');
        sb.append(((this.trackContentRating == null) ? "<null>" : this.trackContentRating));
        sb.append(',');
        sb.append("trackId");
        sb.append('=');
        sb.append(this.trackId);
        sb.append(',');
        sb.append("trackName");
        sb.append('=');
        sb.append(((this.trackName == null) ? "<null>" : this.trackName));
        sb.append(',');
        sb.append("bundleId");
        sb.append('=');
        sb.append(((this.bundleId == null) ? "<null>" : this.bundleId));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null) ? "<null>" : this.releaseDate));
        sb.append(',');
        sb.append("primaryGenreName");
        sb.append('=');
        sb.append(((this.primaryGenreName == null) ? "<null>" : this.primaryGenreName));
        sb.append(',');
        sb.append("genreIds");
        sb.append('=');
        sb.append(((this.genreIds == null) ? "<null>" : this.genreIds));
        sb.append(',');
        sb.append("isVppDeviceBasedLicensingEnabled");
        sb.append('=');
        sb.append(this.isVppDeviceBasedLicensingEnabled);
        sb.append(',');
        sb.append("sellerName");
        sb.append('=');
        sb.append(((this.sellerName == null) ? "<null>" : this.sellerName));
        sb.append(',');
        sb.append("currentVersionReleaseDate");
        sb.append('=');
        sb.append(((this.currentVersionReleaseDate == null) ? "<null>" : this.currentVersionReleaseDate));
        sb.append(',');
        sb.append("releaseNotes");
        sb.append('=');
        sb.append(((this.releaseNotes == null) ? "<null>" : this.releaseNotes));
        sb.append(',');
        sb.append("primaryGenreId");
        sb.append('=');
        sb.append(this.primaryGenreId);
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null) ? "<null>" : this.version));
        sb.append(',');
        sb.append(((this.wrapperType == null) ? "<null>" : this.wrapperType));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("artistId");
        sb.append('=');
        sb.append(this.artistId);
        sb.append(',');
        sb.append("artistName");
        sb.append('=');
        sb.append(((this.artistName == null) ? "<null>" : this.artistName));
        sb.append(',');
        sb.append("genres");
        sb.append('=');
        sb.append(((this.genres == null) ? "<null>" : this.genres));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(this.price);
        sb.append(',');
        sb.append("userRatingCount");
        sb.append('=');
        sb.append(this.userRatingCount);
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
        result = ((result * 31) + ((this.advisories == null) ? 0 : this.advisories.hashCode()));
        result = ((result * 31) + ((int) (this.userRatingCountForCurrentVersion ^ (this.userRatingCountForCurrentVersion >>> 32))));
        result = ((result * 31) + ((this.screenshotUrls == null) ? 0 : this.screenshotUrls.hashCode()));
        result = ((result * 31) + ((this.ipadScreenshotUrls == null) ? 0 : this.ipadScreenshotUrls.hashCode()));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.averageUserRatingForCurrentVersion) ^ (Double.doubleToLongBits(this.averageUserRatingForCurrentVersion) >>> 32))));
        result = ((result * 31) + ((this.sellerName == null) ? 0 : this.sellerName.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((int) (this.artistId ^ (this.artistId >>> 32))));
        result = ((result * 31) + ((this.trackName == null) ? 0 : this.trackName.hashCode()));
        result = ((result * 31) + ((int) (this.primaryGenreId ^ (this.primaryGenreId >>> 32))));
        result = ((result * 31) + ((this.artistViewUrl == null) ? 0 : this.artistViewUrl.hashCode()));
        result = ((result * 31) + ((this.features == null) ? 0 : this.features.hashCode()));
        result = ((result * 31) + ((this.releaseNotes == null) ? 0 : this.releaseNotes.hashCode()));
        result = ((result * 31) + ((this.trackContentRating == null) ? 0 : this.trackContentRating.hashCode()));
        result = ((result * 31) + ((this.genres == null) ? 0 : this.genres.hashCode()));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32))));
        result = ((result * 31) + ((this.currentVersionReleaseDate == null) ? 0 : this.currentVersionReleaseDate.hashCode()));
        result = ((result * 31) + ((int) (this.userRatingCount ^ (this.userRatingCount >>> 32))));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((this.wrapperType == null) ? 0 : this.wrapperType.hashCode()));
        result = ((result * 31) + (this.isVppDeviceBasedLicensingEnabled ? 1 : 0));
        result = ((result * 31) + ((this.minimumOsVersion == null) ? 0 : this.minimumOsVersion.hashCode()));
        result = ((result * 31) + ((this.contentAdvisoryRating == null) ? 0 : this.contentAdvisoryRating.hashCode()));
        result = ((result * 31) + (this.isGameCenterEnabled ? 1 : 0));
        result = ((result * 31) + ((this.releaseDate == null) ? 0 : this.releaseDate.hashCode()));
        result = ((result * 31) + ((this.kind == null) ? 0 : this.kind.hashCode()));
        result = ((result * 31) + ((int) (this.trackId ^ (this.trackId >>> 32))));
        result = ((result * 31) + ((this.bundleId == null) ? 0 : this.bundleId.hashCode()));
        result = ((result * 31) + ((this.languageCodesISO2A == null) ? 0 : this.languageCodesISO2A.hashCode()));
        result = ((result * 31) + ((this.genreIds == null) ? 0 : this.genreIds.hashCode()));
        result = ((result * 31) + ((this.artworkUrl512 == null) ? 0 : this.artworkUrl512.hashCode()));
        result = ((result * 31) + ((this.primaryGenreName == null) ? 0 : this.primaryGenreName.hashCode()));
        result = ((result * 31) + ((this.version == null) ? 0 : this.version.hashCode()));
        result = ((result * 31) + ((this.appletvScreenshotUrls == null) ? 0 : this.appletvScreenshotUrls.hashCode()));
        result = ((result * 31) + ((this.fileSizeBytes == null) ? 0 : this.fileSizeBytes.hashCode()));
        result = ((result * 31) + ((this.formattedPrice == null) ? 0 : this.formattedPrice.hashCode()));
        result = ((result * 31) + ((this.artworkUrl60 == null) ? 0 : this.artworkUrl60.hashCode()));
        result = ((result * 31) + ((this.sellerUrl == null) ? 0 : this.sellerUrl.hashCode()));
        result = ((result * 31) + ((this.trackViewUrl == null) ? 0 : this.trackViewUrl.hashCode()));
        result = ((result * 31) + ((this.trackCensoredName == null) ? 0 : this.trackCensoredName.hashCode()));
        result = ((result * 31) + ((this.supportedDevices == null) ? 0 : this.supportedDevices.hashCode()));
        result = ((result * 31) + ((int) (Double.doubleToLongBits(this.averageUserRating) ^ (Double.doubleToLongBits(this.averageUserRating) >>> 32))));
        result = ((result * 31) + ((this.artistName == null) ? 0 : this.artistName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Software)) {
            return false;
        }
        Software rhs = ((Software) other);
        return ((((((((((((((((((((((((((((((((((((((((((((Objects.equals(this.artworkUrl100, rhs.artworkUrl100))
                && (Objects.equals(this.advisories, rhs.advisories))) && (this.userRatingCountForCurrentVersion == rhs.userRatingCountForCurrentVersion))
                && (Objects.equals(this.screenshotUrls, rhs.screenshotUrls)))
                && (Objects.equals(this.ipadScreenshotUrls, rhs.ipadScreenshotUrls)))
                && (Double.doubleToLongBits(this.averageUserRatingForCurrentVersion) == Double.doubleToLongBits(rhs.averageUserRatingForCurrentVersion)))
                && (Objects.equals(this.sellerName, rhs.sellerName)))
                && (Objects.equals(this.description, rhs.description)))
                && (this.artistId == rhs.artistId))
                && (this.primaryGenreId == rhs.primaryGenreId))
                && (Objects.equals(this.trackName, rhs.trackName)))
                && (Objects.equals(this.artistViewUrl, rhs.artistViewUrl)))
                && (Objects.equals(this.features, rhs.features)))
                && (Objects.equals(this.releaseNotes, rhs.releaseNotes)))
                && (Objects.equals(this.trackContentRating, rhs.trackContentRating)))
                && (Objects.equals(this.genres, rhs.genres))) && (Double.doubleToLongBits(this.price) == Double.doubleToLongBits(rhs.price)))
                && (Objects.equals(this.currentVersionReleaseDate, rhs.currentVersionReleaseDate))) && (this.userRatingCount == rhs.userRatingCount))
                && (Objects.equals(this.currency, rhs.currency)))
                && (Objects.equals(this.wrapperType, rhs.wrapperType)))
                && (this.isVppDeviceBasedLicensingEnabled == rhs.isVppDeviceBasedLicensingEnabled))
                && (Objects.equals(this.minimumOsVersion, rhs.minimumOsVersion)))
                && (Objects.equals(this.contentAdvisoryRating, rhs.contentAdvisoryRating)))
                && (this.isGameCenterEnabled == rhs.isGameCenterEnabled))
                && (Objects.equals(this.releaseDate, rhs.releaseDate)))
                && (Objects.equals(this.kind, rhs.kind)))
                && (this.trackId == rhs.trackId))
                && (Objects.equals(this.bundleId, rhs.bundleId)))
                && (Objects.equals(this.languageCodesISO2A, rhs.languageCodesISO2A)))
                && (Objects.equals(this.genreIds, rhs.genreIds)))
                && (Objects.equals(this.artworkUrl512, rhs.artworkUrl512)))
                && (Objects.equals(this.primaryGenreName, rhs.primaryGenreName)))
                && (Objects.equals(this.version, rhs.version)))
                && (Objects.equals(this.appletvScreenshotUrls, rhs.appletvScreenshotUrls)))
                && (Objects.equals(this.fileSizeBytes, rhs.fileSizeBytes)))
                && (Objects.equals(this.formattedPrice, rhs.formattedPrice)))
                && (Objects.equals(this.artworkUrl60, rhs.artworkUrl60)))
                && (Objects.equals(this.sellerUrl, rhs.sellerUrl)))
                && (Objects.equals(this.trackViewUrl, rhs.trackViewUrl)))
                && (Objects.equals(this.trackCensoredName, rhs.trackCensoredName)))
                && (Objects.equals(this.supportedDevices, rhs.supportedDevices)))
                && (Double.doubleToLongBits(this.averageUserRating) == Double.doubleToLongBits(rhs.averageUserRating)))
                && (Objects.equals(this.artistName, rhs.artistName)));
    }
}
