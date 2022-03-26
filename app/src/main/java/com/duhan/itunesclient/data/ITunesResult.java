package com.duhan.itunesclient.data;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ITunesResult implements Parcelable {

    public static final Creator<ITunesResult> CREATOR = new Creator<ITunesResult>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ITunesResult createFromParcel(android.os.Parcel in) {
            return new ITunesResult(in);
        }

        public ITunesResult[] newArray(int size) {
            return (new ITunesResult[size]);
        }

    };
    @SerializedName("resultCount")
    @Expose
    private long resultCount;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    protected ITunesResult(android.os.Parcel in) {
        this.resultCount = ((long) in.readValue((long.class.getClassLoader())));
        in.readList(this.results, (Result.class.getClassLoader()));
    }

    public ITunesResult() {
    }

    public long getResultCount() {
        return resultCount;
    }

    public void setResultCount(long resultCount) {
        this.resultCount = resultCount;
    }

    public ITunesResult withResultCount(long resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public ITunesResult withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ITunesResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resultCount");
        sb.append('=');
        sb.append(this.resultCount);
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null) ? "<null>" : this.results));
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
        result = ((result * 31) + ((this.results == null) ? 0 : this.results.hashCode()));
        result = ((result * 31) + ((int) (this.resultCount ^ (this.resultCount >>> 32))));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ITunesResult)) {
            return false;
        }
        ITunesResult rhs = ((ITunesResult) other);
        return ((Objects.equals(this.results, rhs.results)) && (this.resultCount == rhs.resultCount));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(resultCount);
        dest.writeList(results);
    }

    public int describeContents() {
        return 0;
    }

}
