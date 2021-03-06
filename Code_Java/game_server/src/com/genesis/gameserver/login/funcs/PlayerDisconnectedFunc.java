package com.genesis.gameserver.login.funcs;

import com.genesis.gameserver.core.global.ServerGlobals;
import com.genesis.gameserver.login.log.LoginLogger;
import com.genesis.gameserver.player.LoginStatus;
import com.google.common.base.Optional;

import com.genesis.servermsg.core.isc.remote.IRemote;
import com.genesis.servermsg.core.msgfunc.IServerMsgFunc;
import com.genesis.gameserver.player.Player;
import com.genesis.gameserver.player.PlayerManagerArgs;
import com.genesis.protobuf.MessageType.MessageTarget;
import com.genesis.servermsg.gameserver.PlayerDisconnected;

/**
 *
 * 处理AgentServer发来的PlayerDisconnected消息的函数对象。该消息在玩家下线的时候触发。<p>
 *
 * 该函数对象在PlayerManagerActor中执行。
 *
 * @author pangchong
 *
 */

public class PlayerDisconnectedFunc
        implements IServerMsgFunc<PlayerDisconnected, ServerGlobals, PlayerManagerArgs> {

    @Override
    public void handle(IRemote remote, PlayerDisconnected msg, ServerGlobals sGlobals,
            PlayerManagerArgs playerManager) {
        final long sessionId = msg.agentSessionId;
        Optional<Player> option = sGlobals.removeSession(sessionId);
        if (option.isPresent()) {
            Player player = option.get();
            if (player.getStatus() == LoginStatus.Gaming) {
                player.getStatus().logoutInPlayerManagerActor(player, playerManager);
                sGlobals.getActorGlobals().letPlayerStop(player.getUuid());
            } else {
                player.getStatus().logoutInPlayerManagerActor(player, playerManager);
            }
        } else {
            LoginLogger.log.warn("The Session of Agent Session Id: {} does not exist.", sessionId);
        }
    }

    @Override
    public MessageTarget getTarget() {
        return MessageTarget.PLAYER_MANAGER;
    }
}
