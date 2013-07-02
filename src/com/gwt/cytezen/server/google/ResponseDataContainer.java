package com.gwt.cytezen.server.google;

import com.google.gson.annotations.SerializedName;

public class ResponseDataContainer {

	@SerializedName("responseData")
	public ResponseData responseData;

	public ResponseData getResponseData() {
		return responseData;
	}

}