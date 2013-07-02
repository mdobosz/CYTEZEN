package com.gwt.cytezen.server;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gwt.cytezen.client.FacebookService;
import com.gwt.cytezen.shared.FacebookUtil;
import com.gwt.cytezen.shared.FbFriend;

import com.google.gson.Gson;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
public class FacebookServiceImpl extends RemoteServiceServlet implements FacebookService {
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(FacebookServiceImpl.class);

    public String login(final String authToken) {
        final String url = FacebookUtil.getAccessTokenUrl(Util.encode(authToken));
        return Util.fetchURL(url);
    }

    public List<FbFriend> findFriends(final String authToken) {
        final String friendsUrl = FacebookUtil.getFriendsUrl(encodeUrl(authToken));
        final String json = Util.fetchURL(friendsUrl);
        final FBFriends fbFriends = new Gson().fromJson(json, FBFriends.class);
        return fbFriends.getData();
    }

    private static String encodeUrl(final String unencodedToken) {
        final String[] parts = unencodedToken.split("=");

        if (parts.length < 2) {
            return "";
        }

        return "access_token=" + Util.encode(parts[1]);
    }
}
