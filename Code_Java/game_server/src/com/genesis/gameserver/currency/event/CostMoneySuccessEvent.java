package com.genesis.gameserver.currency.event;

import com.genesis.common.currency.CurrencyPropId;
import com.genesis.gameserver.human.Human;

/**
 * 扣钱成功事件
 * @author yaguang.xiao
 *
 */
public class CostMoneySuccessEvent {

    /** 玩家对象 */
    public final Human human;
    /** 金钱类型 */
    public final CurrencyPropId currency;
    /** 扣掉的金钱 */
    public final long costValue;

    public CostMoneySuccessEvent(Human human, CurrencyPropId currency, long costValue) {
        this.human = human;
        this.currency = currency;
        this.costValue = costValue;
    }
}
