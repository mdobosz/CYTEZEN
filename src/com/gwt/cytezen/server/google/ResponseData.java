package com.gwt.cytezen.server.google;

import com.google.gson.annotations.SerializedName;

public class ResponseData {

	@SerializedName("cursor")
	public Cursor cursor;
	
	public Cursor getCursor() {
		return cursor;
	}
}