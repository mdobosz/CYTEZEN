package com.gwt.cytezen.client;

import java.util.List;

import com.gwt.cytezen.shared.FbFriend;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>FacebookService</code>.
 */
public interface FacebookServiceAsync {
    public void login(String authToken, AsyncCallback<String> asyncCallback);

    public void findFriends(String authToken, AsyncCallback<List<FbFriend>> asyncCallback);
}
