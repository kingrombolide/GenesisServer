package com.genesis.robot.human;

import com.genesis.robot.currency.CurrencyManager;
import com.genesis.robot.robot.Robot;
import com.google.protobuf.GeneratedMessage;

import com.genesis.protobuf.ChatMessage.CGGmCmdMessage;
import com.genesis.protobuf.ChatMessage.CGGmCmdMessage.Builder;
import com.genesis.protobuf.HumanMessage.GCHumanDetailInfo;
import com.genesis.robot.item.Inventory;

public class Human {

    private final Robot robot;

    private String accountId;
    private String channel;
    private long uuid;
    private String name;

    /**金钱管理器*/
    private CurrencyManager currencyManager = new CurrencyManager(this);
    /**队伍属性（除金钱外的）*/
    private HumanPropManager humanPropManager = new HumanPropManager(this);
    /**背包*/
    private Inventory inventory = new Inventory(this);


    public Human(Robot robot) {
        this.robot = robot;
    }

    public void init(GCHumanDetailInfo msg) {
        accountId = msg.getAccountId();
        channel = msg.getChannel();
        uuid = msg.getId();
        name = msg.getName();

        currencyManager.load(msg.getCurrencyPropList());
        humanPropManager.load(msg.getLongPropList());
    }

    public void sendMessage(GeneratedMessage msg) {
        robot.sendMessage(msg);
    }

    public void sendMessage(String msg) {
        Builder builder = CGGmCmdMessage.newBuilder();
        builder.setCmd(msg);
        robot.sendMessage(builder.build());
    }

    public String getAccountId() {
        return accountId;
    }

    public String getChannel() {
        return channel;
    }

    public long getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public CurrencyManager getCurrencyManager() {
        return currencyManager;
    }

    public HumanPropManager getHumanPropManager() {
        return humanPropManager;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
