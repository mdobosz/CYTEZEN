package com.gwt.cytezen.client;

import com.gwt.cytezen.shared.FbFriend;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("google")
public interface GoogleService extends RemoteService {
    public Long findFriendRanking(FbFriend friend);
}
