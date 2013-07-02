package com.gwt.cytezen.server;

import java.util.LinkedList;
import java.util.List;

import com.gwt.cytezen.shared.FbFriend;

import com.google.gwt.user.client.rpc.IsSerializable;

public class FBFriends implements IsSerializable {

    private List<FbFriend> data = new LinkedList<FbFriend>();

    public List<FbFriend> getData() {
        return data;
    }

    public void setData(final List<FbFriend> data) {
        this.data = data;
    }

}
