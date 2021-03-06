package com.genesis.servermsg.gameserver;

import com.genesis.servermsg.core.msg.IMessage;
import com.genesis.gamedb.human.HumanData;
import com.genesis.protobuf.MessageType.MessageTarget;

public class HumanDataMsg implements IMessage {

    /** 超时ID */
    public final long timeoutId;
    /**玩家数据*/
    public final HumanData humanData;
    /**账号ID*/
    public final String accountId;
    /**渠道*/
    public final String channel;

    public HumanDataMsg(long timeoutId, HumanData humanData, String accountId, String channel) {
        this.timeoutId = timeoutId;
        this.humanData = humanData;
        this.accountId = accountId;
        this.channel = channel;
    }

    @Override
    public MessageTarget getTarget() {
        return MessageTarget.PLAYER_MANAGER;
    }
}
