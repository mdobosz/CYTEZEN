package com.gwt.cytezen.server.google;

import com.google.gson.annotations.SerializedName;

public class Cursor {
    @SerializedName("estimatedResultCount")
    private long estimatedResultCount;

    public long getEstimatedResultCount() {
        return estimatedResultCount;
    }
}
