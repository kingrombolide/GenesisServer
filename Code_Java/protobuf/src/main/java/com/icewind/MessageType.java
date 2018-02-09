// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageType.proto

package com.icewind;

public final class MessageType {
  private MessageType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(com.icewind.MessageType.cgMessageType);
    registry.add(com.icewind.MessageType.gcMessageType);
    registry.add(com.icewind.MessageType.mgMessageType);
    registry.add(com.icewind.MessageType.tARGET);
  }
  /**
   * Protobuf enum {@code com.icewind.MessageTarget}
   *
   * <pre>
   **
   * 这里的消息类型的定义有一些限制
   * 每种类型的服务器只能处理消息号在特定范围内的消息
   * 详情请看core.msgtarget.MessageTargetManager类
   * 以下是各类型服务器可以处理的消息号范围
   * 由GameServer处理的消息号的消息范围：1-20000
   * </pre>
   */
  public enum MessageTarget
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ERROR = 0;</code>
     */
    ERROR(0, 0),
    /**
     * <code>ISC_ACTOR = 1;</code>
     */
    ISC_ACTOR(1, 1),
    /**
     * <code>SERVER_MANAGER = 2;</code>
     */
    SERVER_MANAGER(2, 2),
    /**
     * <code>SERVER = 3;</code>
     */
    SERVER(3, 3),
    /**
     * <code>LOGIN_SERVER = 4;</code>
     */
    LOGIN_SERVER(4, 4),
    /**
     * <code>PLAYER_MANAGER = 10;</code>
     */
    PLAYER_MANAGER(5, 10),
    /**
     * <code>PLAYER = 11;</code>
     */
    PLAYER(6, 11),
    /**
     * <code>SCENE = 12;</code>
     */
    SCENE(7, 12),
    /**
     * <code>GUILD = 13;</code>
     */
    GUILD(8, 13),
    /**
     * <code>ARENA = 14;</code>
     */
    ARENA(9, 14),
    ;

    /**
     * <code>ERROR = 0;</code>
     */
    public static final int ERROR_VALUE = 0;
    /**
     * <code>ISC_ACTOR = 1;</code>
     */
    public static final int ISC_ACTOR_VALUE = 1;
    /**
     * <code>SERVER_MANAGER = 2;</code>
     */
    public static final int SERVER_MANAGER_VALUE = 2;
    /**
     * <code>SERVER = 3;</code>
     */
    public static final int SERVER_VALUE = 3;
    /**
     * <code>LOGIN_SERVER = 4;</code>
     */
    public static final int LOGIN_SERVER_VALUE = 4;
    /**
     * <code>PLAYER_MANAGER = 10;</code>
     */
    public static final int PLAYER_MANAGER_VALUE = 10;
    /**
     * <code>PLAYER = 11;</code>
     */
    public static final int PLAYER_VALUE = 11;
    /**
     * <code>SCENE = 12;</code>
     */
    public static final int SCENE_VALUE = 12;
    /**
     * <code>GUILD = 13;</code>
     */
    public static final int GUILD_VALUE = 13;
    /**
     * <code>ARENA = 14;</code>
     */
    public static final int ARENA_VALUE = 14;


    public final int getNumber() { return value; }

    public static MessageTarget valueOf(int value) {
      switch (value) {
        case 0: return ERROR;
        case 1: return ISC_ACTOR;
        case 2: return SERVER_MANAGER;
        case 3: return SERVER;
        case 4: return LOGIN_SERVER;
        case 10: return PLAYER_MANAGER;
        case 11: return PLAYER;
        case 12: return SCENE;
        case 13: return GUILD;
        case 14: return ARENA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageTarget>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<MessageTarget>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MessageTarget>() {
            public MessageTarget findValueByNumber(int number) {
              return MessageTarget.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.icewind.MessageType.getDescriptor().getEnumTypes().get(0);
    }

    private static final MessageTarget[] VALUES = values();

    public static MessageTarget valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private MessageTarget(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.icewind.MessageTarget)
  }

  /**
   * Protobuf enum {@code com.icewind.CGMessageType}
   */
  public enum CGMessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CG_GAME_SERVER_INFO = 1;</code>
     *
     * <pre>
     *网关专用消息、测试消息，1-10
     * </pre>
     */
    CG_GAME_SERVER_INFO(0, 1),
    /**
     * <code>CG_TEST_MSG = 2;</code>
     */
    CG_TEST_MSG(1, 2),
    /**
     * <code>CS_LOGIN_HANDSHAKE = 11;</code>
     *
     * <pre>
     *握手消息，11-20
     * </pre>
     */
    CS_LOGIN_HANDSHAKE(2, 11),
    /**
     * <code>CS_LOGIN_NEW = 12;</code>
     */
    CS_LOGIN_NEW(3, 12),
    /**
     * <code>CS_LOGIN = 51;</code>
     *
     * <pre>
     *登录消息，50-100
     * </pre>
     */
    CS_LOGIN(4, 51),
    /**
     * <code>CG_ITEM_USE = 101;</code>
     *
     * <pre>
     *道具消息，101-200
     * </pre>
     */
    CG_ITEM_USE(5, 101),
    /**
     * <code>CG_ITEM_SELL = 102;</code>
     */
    CG_ITEM_SELL(6, 102),
    /**
     * <code>CG_ITEM_COMPOUND = 103;</code>
     */
    CG_ITEM_COMPOUND(7, 103),
    /**
     * <code>CG_HIRE_HERO = 201;</code>
     *
     * <pre>
     *英雄消息，201-300
     * </pre>
     */
    CG_HIRE_HERO(8, 201),
    /**
     * <code>CG_HERO_STAR_UP = 202;</code>
     */
    CG_HERO_STAR_UP(9, 202),
    /**
     * <code>CG_HERO_QUALITY_UP = 203;</code>
     */
    CG_HERO_QUALITY_UP(10, 203),
    /**
     * <code>CG_HERO_SKILL_LEVEL_UP = 204;</code>
     */
    CG_HERO_SKILL_LEVEL_UP(11, 204),
    /**
     * <code>CG_HERO_WEAR_EQUIP = 205;</code>
     */
    CG_HERO_WEAR_EQUIP(12, 205),
    /**
     * <code>CG_BUY_SKILL_POINT = 206;</code>
     */
    CG_BUY_SKILL_POINT(13, 206),
    /**
     * <code>CG_GM_CMD = 301;</code>
     *
     * <pre>
     *聊天消息，301-350
     * </pre>
     */
    CG_GM_CMD(14, 301),
    /**
     * <code>CG_GET_DAILY_REWARD = 351;</code>
     *
     * <pre>
     *日常签到奖励领取，351-400
     * </pre>
     */
    CG_GET_DAILY_REWARD(15, 351),
    /**
     * <code>CG_OPEN_SHOP = 401;</code>
     *
     * <pre>
     *商店消息401-450
     * </pre>
     */
    CG_OPEN_SHOP(16, 401),
    /**
     * <code>CG_REFRESH_GOODS = 402;</code>
     *
     * <pre>
     *刷新//
     * </pre>
     */
    CG_REFRESH_GOODS(17, 402),
    /**
     * <code>CG_BUY_GOOD = 403;</code>
     *
     * <pre>
     *购买货物//
     * </pre>
     */
    CG_BUY_GOOD(18, 403),
    /**
     * <code>CG_OPEN_WINDOW = 451;</code>
     *
     * <pre>
     *窗口消息，451-500
     * </pre>
     */
    CG_OPEN_WINDOW(19, 451),
    /**
     * <code>CG_CLOSE_WINDOW = 452;</code>
     *
     * <pre>
     *关闭窗口//
     * </pre>
     */
    CG_CLOSE_WINDOW(20, 452),
    /**
     * <code>CG_HUMAN_BUY_ENERGY = 501;</code>
     *
     * <pre>
     *Human消息，501-600
     * </pre>
     */
    CG_HUMAN_BUY_ENERGY(21, 501),
    ;

    /**
     * <code>CG_GAME_SERVER_INFO = 1;</code>
     *
     * <pre>
     *网关专用消息、测试消息，1-10
     * </pre>
     */
    public static final int CG_GAME_SERVER_INFO_VALUE = 1;
    /**
     * <code>CG_TEST_MSG = 2;</code>
     */
    public static final int CG_TEST_MSG_VALUE = 2;
    /**
     * <code>CS_LOGIN_HANDSHAKE = 11;</code>
     *
     * <pre>
     *握手消息，11-20
     * </pre>
     */
    public static final int CS_LOGIN_HANDSHAKE_VALUE = 11;
    /**
     * <code>CS_LOGIN_NEW = 12;</code>
     */
    public static final int CS_LOGIN_NEW_VALUE = 12;
    /**
     * <code>CS_LOGIN = 51;</code>
     *
     * <pre>
     *登录消息，50-100
     * </pre>
     */
    public static final int CS_LOGIN_VALUE = 51;
    /**
     * <code>CG_ITEM_USE = 101;</code>
     *
     * <pre>
     *道具消息，101-200
     * </pre>
     */
    public static final int CG_ITEM_USE_VALUE = 101;
    /**
     * <code>CG_ITEM_SELL = 102;</code>
     */
    public static final int CG_ITEM_SELL_VALUE = 102;
    /**
     * <code>CG_ITEM_COMPOUND = 103;</code>
     */
    public static final int CG_ITEM_COMPOUND_VALUE = 103;
    /**
     * <code>CG_HIRE_HERO = 201;</code>
     *
     * <pre>
     *英雄消息，201-300
     * </pre>
     */
    public static final int CG_HIRE_HERO_VALUE = 201;
    /**
     * <code>CG_HERO_STAR_UP = 202;</code>
     */
    public static final int CG_HERO_STAR_UP_VALUE = 202;
    /**
     * <code>CG_HERO_QUALITY_UP = 203;</code>
     */
    public static final int CG_HERO_QUALITY_UP_VALUE = 203;
    /**
     * <code>CG_HERO_SKILL_LEVEL_UP = 204;</code>
     */
    public static final int CG_HERO_SKILL_LEVEL_UP_VALUE = 204;
    /**
     * <code>CG_HERO_WEAR_EQUIP = 205;</code>
     */
    public static final int CG_HERO_WEAR_EQUIP_VALUE = 205;
    /**
     * <code>CG_BUY_SKILL_POINT = 206;</code>
     */
    public static final int CG_BUY_SKILL_POINT_VALUE = 206;
    /**
     * <code>CG_GM_CMD = 301;</code>
     *
     * <pre>
     *聊天消息，301-350
     * </pre>
     */
    public static final int CG_GM_CMD_VALUE = 301;
    /**
     * <code>CG_GET_DAILY_REWARD = 351;</code>
     *
     * <pre>
     *日常签到奖励领取，351-400
     * </pre>
     */
    public static final int CG_GET_DAILY_REWARD_VALUE = 351;
    /**
     * <code>CG_OPEN_SHOP = 401;</code>
     *
     * <pre>
     *商店消息401-450
     * </pre>
     */
    public static final int CG_OPEN_SHOP_VALUE = 401;
    /**
     * <code>CG_REFRESH_GOODS = 402;</code>
     *
     * <pre>
     *刷新//
     * </pre>
     */
    public static final int CG_REFRESH_GOODS_VALUE = 402;
    /**
     * <code>CG_BUY_GOOD = 403;</code>
     *
     * <pre>
     *购买货物//
     * </pre>
     */
    public static final int CG_BUY_GOOD_VALUE = 403;
    /**
     * <code>CG_OPEN_WINDOW = 451;</code>
     *
     * <pre>
     *窗口消息，451-500
     * </pre>
     */
    public static final int CG_OPEN_WINDOW_VALUE = 451;
    /**
     * <code>CG_CLOSE_WINDOW = 452;</code>
     *
     * <pre>
     *关闭窗口//
     * </pre>
     */
    public static final int CG_CLOSE_WINDOW_VALUE = 452;
    /**
     * <code>CG_HUMAN_BUY_ENERGY = 501;</code>
     *
     * <pre>
     *Human消息，501-600
     * </pre>
     */
    public static final int CG_HUMAN_BUY_ENERGY_VALUE = 501;


    public final int getNumber() { return value; }

    public static CGMessageType valueOf(int value) {
      switch (value) {
        case 1: return CG_GAME_SERVER_INFO;
        case 2: return CG_TEST_MSG;
        case 11: return CS_LOGIN_HANDSHAKE;
        case 12: return CS_LOGIN_NEW;
        case 51: return CS_LOGIN;
        case 101: return CG_ITEM_USE;
        case 102: return CG_ITEM_SELL;
        case 103: return CG_ITEM_COMPOUND;
        case 201: return CG_HIRE_HERO;
        case 202: return CG_HERO_STAR_UP;
        case 203: return CG_HERO_QUALITY_UP;
        case 204: return CG_HERO_SKILL_LEVEL_UP;
        case 205: return CG_HERO_WEAR_EQUIP;
        case 206: return CG_BUY_SKILL_POINT;
        case 301: return CG_GM_CMD;
        case 351: return CG_GET_DAILY_REWARD;
        case 401: return CG_OPEN_SHOP;
        case 402: return CG_REFRESH_GOODS;
        case 403: return CG_BUY_GOOD;
        case 451: return CG_OPEN_WINDOW;
        case 452: return CG_CLOSE_WINDOW;
        case 501: return CG_HUMAN_BUY_ENERGY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CGMessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<CGMessageType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CGMessageType>() {
            public CGMessageType findValueByNumber(int number) {
              return CGMessageType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.icewind.MessageType.getDescriptor().getEnumTypes().get(1);
    }

    private static final CGMessageType[] VALUES = values();

    public static CGMessageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private CGMessageType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.icewind.CGMessageType)
  }

  /**
   * Protobuf enum {@code com.icewind.GCMessageType}
   */
  public enum GCMessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SC_LOGIN_HANDSHAKE_REPLY = 11;</code>
     *
     * <pre>
     *握手消息11-50
     * </pre>
     */
    SC_LOGIN_HANDSHAKE_REPLY(0, 11),
    /**
     * <code>SC_LOGIN_SERVER_NOT_OPEN = 12;</code>
     *
     * <pre>
     *服务器尚未开放//
     * </pre>
     */
    SC_LOGIN_SERVER_NOT_OPEN(1, 12),
    /**
     * <code>SC_LOGIN_FAIL = 51;</code>
     *
     * <pre>
     *登录消息，51-100
     * </pre>
     */
    SC_LOGIN_FAIL(2, 51),
    /**
     * <code>GC_HUMAN_DETAIL_INFO = 101;</code>
     *
     * <pre>
     *Human消息，101-200
     * </pre>
     */
    GC_HUMAN_DETAIL_INFO(3, 101),
    /**
     * <code>GC_DATA_ERROR = 102;</code>
     */
    GC_DATA_ERROR(4, 102),
    /**
     * <code>GC_HUMAN_BUY_ENERGY_ACK = 103;</code>
     *
     * <pre>
     *购买体力成功//
     * </pre>
     */
    GC_HUMAN_BUY_ENERGY_ACK(5, 103),
    /**
     * <code>GC_HUMAN_BUY_ENERGY_NEG = 104;</code>
     *
     * <pre>
     *购买体力失败//
     * </pre>
     */
    GC_HUMAN_BUY_ENERGY_NEG(6, 104),
    /**
     * <code>GC_HUMAN_ENERGY_RECOVER_INFO = 105;</code>
     *
     * <pre>
     *体力恢复信息//
     * </pre>
     */
    GC_HUMAN_ENERGY_RECOVER_INFO(7, 105),
    /**
     * <code>GC_HUMAN_COST_ENERGY_FAILED = 106;</code>
     *
     * <pre>
     *扣体力失败，体力值不够//
     * </pre>
     */
    GC_HUMAN_COST_ENERGY_FAILED(8, 106),
    /**
     * <code>GC_HUMAN_BUY_ENERGY_COUNTS_RESET = 107;</code>
     *
     * <pre>
     *重置体力购买次数//
     * </pre>
     */
    GC_HUMAN_BUY_ENERGY_COUNTS_RESET(9, 107),
    /**
     * <code>GC_VIP_LEVEL_UP = 108;</code>
     *
     * <pre>
     *VIP等级提升//
     * </pre>
     */
    GC_VIP_LEVEL_UP(10, 108),
    /**
     * <code>GC_HUMAN_LEVEL_UP = 109;</code>
     *
     * <pre>
     *玩家角色等级提升//
     * </pre>
     */
    GC_HUMAN_LEVEL_UP(11, 109),
    /**
     * <code>GC_HERO_CHANGED_PROPS = 201;</code>
     *
     * <pre>
     *英雄消息，201-300
     * </pre>
     */
    GC_HERO_CHANGED_PROPS(12, 201),
    /**
     * <code>GC_ALL_HERO_INFO = 202;</code>
     *
     * <pre>
     *所有英雄信息//
     * </pre>
     */
    GC_ALL_HERO_INFO(13, 202),
    /**
     * <code>GC_HERO_ADD = 203;</code>
     *
     * <pre>
     *添加一个英雄//
     * </pre>
     */
    GC_HERO_ADD(14, 203),
    /**
     * <code>GC_HERO_UPDATE = 204;</code>
     *
     * <pre>
     *英雄信息更新//
     * </pre>
     */
    GC_HERO_UPDATE(15, 204),
    /**
     * <code>GC_INVENTORY_INFO = 301;</code>
     *
     * <pre>
     *道具，301-400
     * </pre>
     */
    GC_INVENTORY_INFO(16, 301),
    /**
     * <code>GC_ITEM_UPDATE = 302;</code>
     *
     * <pre>
     *物品更新消息，注意该消息只能用在特定情况下，请咨询尽可能多的人//
     * </pre>
     */
    GC_ITEM_UPDATE(17, 302),
    /**
     * <code>GC_DAILY_REWARD_INFO = 401;</code>
     *
     * <pre>
     *日常奖励，401-450
     * </pre>
     */
    GC_DAILY_REWARD_INFO(18, 401),
    /**
     * <code>GC_GET_DAILY_REWARD_FAILED = 402;</code>
     *
     * <pre>
     *日常奖励领取失败，已经过了月刷新//
     * </pre>
     */
    GC_GET_DAILY_REWARD_FAILED(19, 402),
    /**
     * <code>GC_SHOP_INFO = 451;</code>
     *
     * <pre>
     *商店，451-500
     * </pre>
     */
    GC_SHOP_INFO(20, 451),
    /**
     * <code>GC_SHOP_MANUALLY_REFRESH_INFO = 452;</code>
     *
     * <pre>
     *商店刷新信息//
     * </pre>
     */
    GC_SHOP_MANUALLY_REFRESH_INFO(21, 452),
    /**
     * <code>GC_GOOD_BUY_SUCCESS = 453;</code>
     *
     * <pre>
     *商品购买成功
     * </pre>
     */
    GC_GOOD_BUY_SUCCESS(22, 453),
    /**
     * <code>GC_SHOP_MANUALLY_REFRESH_COUNT_RESET = 454;</code>
     *
     * <pre>
     *商店手动刷新次数重置消息//
     * </pre>
     */
    GC_SHOP_MANUALLY_REFRESH_COUNT_RESET(23, 454),
    /**
     * <code>GC_SHOP_AUTO_REFRESH_INFO = 455;</code>
     *
     * <pre>
     *商店自动刷新信息//
     * </pre>
     */
    GC_SHOP_AUTO_REFRESH_INFO(24, 455),
    /**
     * <code>GC_SHOP_CLOSE = 456;</code>
     *
     * <pre>
     *商店关闭信息//
     * </pre>
     */
    GC_SHOP_CLOSE(25, 456),
    /**
     * <code>GC_SHOP_PROMPT = 457;</code>
     *
     * <pre>
     *商店提示//
     * </pre>
     */
    GC_SHOP_PROMPT(26, 457),
    /**
     * <code>GC_OPENED_TEMP_SHOP = 458;</code>
     *
     * <pre>
     *已经打开的商店//
     * </pre>
     */
    GC_OPENED_TEMP_SHOP(27, 458),
    /**
     * <code>GC_OPEN_SHOP = 459;</code>
     *
     * <pre>
     *打开商店//
     * </pre>
     */
    GC_OPEN_SHOP(28, 459),
    /**
     * <code>GC_FUNCTION_OPEN_LIST = 501;</code>
     *
     * <pre>
     *功能开放，501-550
     * </pre>
     */
    GC_FUNCTION_OPEN_LIST(29, 501),
    /**
     * <code>GC_FUNCTION_OPEN = 502;</code>
     *
     * <pre>
     *功能开放//
     * </pre>
     */
    GC_FUNCTION_OPEN(30, 502),
    /**
     * <code>GC_GM_CMD = 551;</code>
     *
     * <pre>
     *GM命令，551-600
     * </pre>
     */
    GC_GM_CMD(31, 551),
    ;

    /**
     * <code>SC_LOGIN_HANDSHAKE_REPLY = 11;</code>
     *
     * <pre>
     *握手消息11-50
     * </pre>
     */
    public static final int SC_LOGIN_HANDSHAKE_REPLY_VALUE = 11;
    /**
     * <code>SC_LOGIN_SERVER_NOT_OPEN = 12;</code>
     *
     * <pre>
     *服务器尚未开放//
     * </pre>
     */
    public static final int SC_LOGIN_SERVER_NOT_OPEN_VALUE = 12;
    /**
     * <code>SC_LOGIN_FAIL = 51;</code>
     *
     * <pre>
     *登录消息，51-100
     * </pre>
     */
    public static final int SC_LOGIN_FAIL_VALUE = 51;
    /**
     * <code>GC_HUMAN_DETAIL_INFO = 101;</code>
     *
     * <pre>
     *Human消息，101-200
     * </pre>
     */
    public static final int GC_HUMAN_DETAIL_INFO_VALUE = 101;
    /**
     * <code>GC_DATA_ERROR = 102;</code>
     */
    public static final int GC_DATA_ERROR_VALUE = 102;
    /**
     * <code>GC_HUMAN_BUY_ENERGY_ACK = 103;</code>
     *
     * <pre>
     *购买体力成功//
     * </pre>
     */
    public static final int GC_HUMAN_BUY_ENERGY_ACK_VALUE = 103;
    /**
     * <code>GC_HUMAN_BUY_ENERGY_NEG = 104;</code>
     *
     * <pre>
     *购买体力失败//
     * </pre>
     */
    public static final int GC_HUMAN_BUY_ENERGY_NEG_VALUE = 104;
    /**
     * <code>GC_HUMAN_ENERGY_RECOVER_INFO = 105;</code>
     *
     * <pre>
     *体力恢复信息//
     * </pre>
     */
    public static final int GC_HUMAN_ENERGY_RECOVER_INFO_VALUE = 105;
    /**
     * <code>GC_HUMAN_COST_ENERGY_FAILED = 106;</code>
     *
     * <pre>
     *扣体力失败，体力值不够//
     * </pre>
     */
    public static final int GC_HUMAN_COST_ENERGY_FAILED_VALUE = 106;
    /**
     * <code>GC_HUMAN_BUY_ENERGY_COUNTS_RESET = 107;</code>
     *
     * <pre>
     *重置体力购买次数//
     * </pre>
     */
    public static final int GC_HUMAN_BUY_ENERGY_COUNTS_RESET_VALUE = 107;
    /**
     * <code>GC_VIP_LEVEL_UP = 108;</code>
     *
     * <pre>
     *VIP等级提升//
     * </pre>
     */
    public static final int GC_VIP_LEVEL_UP_VALUE = 108;
    /**
     * <code>GC_HUMAN_LEVEL_UP = 109;</code>
     *
     * <pre>
     *玩家角色等级提升//
     * </pre>
     */
    public static final int GC_HUMAN_LEVEL_UP_VALUE = 109;
    /**
     * <code>GC_HERO_CHANGED_PROPS = 201;</code>
     *
     * <pre>
     *英雄消息，201-300
     * </pre>
     */
    public static final int GC_HERO_CHANGED_PROPS_VALUE = 201;
    /**
     * <code>GC_ALL_HERO_INFO = 202;</code>
     *
     * <pre>
     *所有英雄信息//
     * </pre>
     */
    public static final int GC_ALL_HERO_INFO_VALUE = 202;
    /**
     * <code>GC_HERO_ADD = 203;</code>
     *
     * <pre>
     *添加一个英雄//
     * </pre>
     */
    public static final int GC_HERO_ADD_VALUE = 203;
    /**
     * <code>GC_HERO_UPDATE = 204;</code>
     *
     * <pre>
     *英雄信息更新//
     * </pre>
     */
    public static final int GC_HERO_UPDATE_VALUE = 204;
    /**
     * <code>GC_INVENTORY_INFO = 301;</code>
     *
     * <pre>
     *道具，301-400
     * </pre>
     */
    public static final int GC_INVENTORY_INFO_VALUE = 301;
    /**
     * <code>GC_ITEM_UPDATE = 302;</code>
     *
     * <pre>
     *物品更新消息，注意该消息只能用在特定情况下，请咨询尽可能多的人//
     * </pre>
     */
    public static final int GC_ITEM_UPDATE_VALUE = 302;
    /**
     * <code>GC_DAILY_REWARD_INFO = 401;</code>
     *
     * <pre>
     *日常奖励，401-450
     * </pre>
     */
    public static final int GC_DAILY_REWARD_INFO_VALUE = 401;
    /**
     * <code>GC_GET_DAILY_REWARD_FAILED = 402;</code>
     *
     * <pre>
     *日常奖励领取失败，已经过了月刷新//
     * </pre>
     */
    public static final int GC_GET_DAILY_REWARD_FAILED_VALUE = 402;
    /**
     * <code>GC_SHOP_INFO = 451;</code>
     *
     * <pre>
     *商店，451-500
     * </pre>
     */
    public static final int GC_SHOP_INFO_VALUE = 451;
    /**
     * <code>GC_SHOP_MANUALLY_REFRESH_INFO = 452;</code>
     *
     * <pre>
     *商店刷新信息//
     * </pre>
     */
    public static final int GC_SHOP_MANUALLY_REFRESH_INFO_VALUE = 452;
    /**
     * <code>GC_GOOD_BUY_SUCCESS = 453;</code>
     *
     * <pre>
     *商品购买成功
     * </pre>
     */
    public static final int GC_GOOD_BUY_SUCCESS_VALUE = 453;
    /**
     * <code>GC_SHOP_MANUALLY_REFRESH_COUNT_RESET = 454;</code>
     *
     * <pre>
     *商店手动刷新次数重置消息//
     * </pre>
     */
    public static final int GC_SHOP_MANUALLY_REFRESH_COUNT_RESET_VALUE = 454;
    /**
     * <code>GC_SHOP_AUTO_REFRESH_INFO = 455;</code>
     *
     * <pre>
     *商店自动刷新信息//
     * </pre>
     */
    public static final int GC_SHOP_AUTO_REFRESH_INFO_VALUE = 455;
    /**
     * <code>GC_SHOP_CLOSE = 456;</code>
     *
     * <pre>
     *商店关闭信息//
     * </pre>
     */
    public static final int GC_SHOP_CLOSE_VALUE = 456;
    /**
     * <code>GC_SHOP_PROMPT = 457;</code>
     *
     * <pre>
     *商店提示//
     * </pre>
     */
    public static final int GC_SHOP_PROMPT_VALUE = 457;
    /**
     * <code>GC_OPENED_TEMP_SHOP = 458;</code>
     *
     * <pre>
     *已经打开的商店//
     * </pre>
     */
    public static final int GC_OPENED_TEMP_SHOP_VALUE = 458;
    /**
     * <code>GC_OPEN_SHOP = 459;</code>
     *
     * <pre>
     *打开商店//
     * </pre>
     */
    public static final int GC_OPEN_SHOP_VALUE = 459;
    /**
     * <code>GC_FUNCTION_OPEN_LIST = 501;</code>
     *
     * <pre>
     *功能开放，501-550
     * </pre>
     */
    public static final int GC_FUNCTION_OPEN_LIST_VALUE = 501;
    /**
     * <code>GC_FUNCTION_OPEN = 502;</code>
     *
     * <pre>
     *功能开放//
     * </pre>
     */
    public static final int GC_FUNCTION_OPEN_VALUE = 502;
    /**
     * <code>GC_GM_CMD = 551;</code>
     *
     * <pre>
     *GM命令，551-600
     * </pre>
     */
    public static final int GC_GM_CMD_VALUE = 551;


    public final int getNumber() { return value; }

    public static GCMessageType valueOf(int value) {
      switch (value) {
        case 11: return SC_LOGIN_HANDSHAKE_REPLY;
        case 12: return SC_LOGIN_SERVER_NOT_OPEN;
        case 51: return SC_LOGIN_FAIL;
        case 101: return GC_HUMAN_DETAIL_INFO;
        case 102: return GC_DATA_ERROR;
        case 103: return GC_HUMAN_BUY_ENERGY_ACK;
        case 104: return GC_HUMAN_BUY_ENERGY_NEG;
        case 105: return GC_HUMAN_ENERGY_RECOVER_INFO;
        case 106: return GC_HUMAN_COST_ENERGY_FAILED;
        case 107: return GC_HUMAN_BUY_ENERGY_COUNTS_RESET;
        case 108: return GC_VIP_LEVEL_UP;
        case 109: return GC_HUMAN_LEVEL_UP;
        case 201: return GC_HERO_CHANGED_PROPS;
        case 202: return GC_ALL_HERO_INFO;
        case 203: return GC_HERO_ADD;
        case 204: return GC_HERO_UPDATE;
        case 301: return GC_INVENTORY_INFO;
        case 302: return GC_ITEM_UPDATE;
        case 401: return GC_DAILY_REWARD_INFO;
        case 402: return GC_GET_DAILY_REWARD_FAILED;
        case 451: return GC_SHOP_INFO;
        case 452: return GC_SHOP_MANUALLY_REFRESH_INFO;
        case 453: return GC_GOOD_BUY_SUCCESS;
        case 454: return GC_SHOP_MANUALLY_REFRESH_COUNT_RESET;
        case 455: return GC_SHOP_AUTO_REFRESH_INFO;
        case 456: return GC_SHOP_CLOSE;
        case 457: return GC_SHOP_PROMPT;
        case 458: return GC_OPENED_TEMP_SHOP;
        case 459: return GC_OPEN_SHOP;
        case 501: return GC_FUNCTION_OPEN_LIST;
        case 502: return GC_FUNCTION_OPEN;
        case 551: return GC_GM_CMD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCMessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<GCMessageType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCMessageType>() {
            public GCMessageType findValueByNumber(int number) {
              return GCMessageType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.icewind.MessageType.getDescriptor().getEnumTypes().get(2);
    }

    private static final GCMessageType[] VALUES = values();

    public static GCMessageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private GCMessageType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.icewind.GCMessageType)
  }

  /**
   * Protobuf enum {@code com.icewind.MGMessageType}
   *
   * <pre>
   **MapServer发给Gate的消息号定义 
   * </pre>
   */
  public enum MGMessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MG_BROAD_CAST = 1;</code>
     *
     * <pre>
     *广播
     * </pre>
     */
    MG_BROAD_CAST(0, 1),
    ;

    /**
     * <code>MG_BROAD_CAST = 1;</code>
     *
     * <pre>
     *广播
     * </pre>
     */
    public static final int MG_BROAD_CAST_VALUE = 1;


    public final int getNumber() { return value; }

    public static MGMessageType valueOf(int value) {
      switch (value) {
        case 1: return MG_BROAD_CAST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MGMessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<MGMessageType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MGMessageType>() {
            public MGMessageType findValueByNumber(int number) {
              return MGMessageType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.icewind.MessageType.getDescriptor().getEnumTypes().get(3);
    }

    private static final MGMessageType[] VALUES = values();

    public static MGMessageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private MGMessageType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.icewind.MGMessageType)
  }

  public static final int CG_MESSAGE_TYPE_FIELD_NUMBER = 50001;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      com.icewind.MessageType.CGMessageType> cgMessageType = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.icewind.MessageType.CGMessageType.class,
        null);
  public static final int GC_MESSAGE_TYPE_FIELD_NUMBER = 50002;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      com.icewind.MessageType.GCMessageType> gcMessageType = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.icewind.MessageType.GCMessageType.class,
        null);
  public static final int MG_MESSAGE_TYPE_FIELD_NUMBER = 50003;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      com.icewind.MessageType.MGMessageType> mgMessageType = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.icewind.MessageType.MGMessageType.class,
        null);
  public static final int TARGET_FIELD_NUMBER = 50001;
  /**
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      com.icewind.MessageType.MessageTarget> tARGET = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.icewind.MessageType.MessageTarget.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MessageType.proto\022\013com.icewind\032 google" +
      "/protobuf/descriptor.proto*\234\001\n\rMessageTa" +
      "rget\022\t\n\005ERROR\020\000\022\r\n\tISC_ACTOR\020\001\022\022\n\016SERVER" +
      "_MANAGER\020\002\022\n\n\006SERVER\020\003\022\020\n\014LOGIN_SERVER\020\004" +
      "\022\022\n\016PLAYER_MANAGER\020\n\022\n\n\006PLAYER\020\013\022\t\n\005SCEN" +
      "E\020\014\022\t\n\005GUILD\020\r\022\t\n\005ARENA\020\016*\336\004\n\rCGMessageT" +
      "ype\022\027\n\023CG_GAME_SERVER_INFO\020\001\022\017\n\013CG_TEST_" +
      "MSG\020\002\022\034\n\022CS_LOGIN_HANDSHAKE\020\013\032\004\210\265\030\004\022\026\n\014C" +
      "S_LOGIN_NEW\020\014\032\004\210\265\030\004\022\022\n\010CS_LOGIN\0203\032\004\210\265\030\n\022" +
      "\025\n\013CG_ITEM_USE\020e\032\004\210\265\030\013\022\026\n\014CG_ITEM_SELL\020f",
      "\032\004\210\265\030\013\022\032\n\020CG_ITEM_COMPOUND\020g\032\004\210\265\030\013\022\027\n\014CG" +
      "_HIRE_HERO\020\311\001\032\004\210\265\030\013\022\032\n\017CG_HERO_STAR_UP\020\312" +
      "\001\032\004\210\265\030\013\022\035\n\022CG_HERO_QUALITY_UP\020\313\001\032\004\210\265\030\013\022!" +
      "\n\026CG_HERO_SKILL_LEVEL_UP\020\314\001\032\004\210\265\030\013\022\035\n\022CG_" +
      "HERO_WEAR_EQUIP\020\315\001\032\004\210\265\030\013\022\035\n\022CG_BUY_SKILL" +
      "_POINT\020\316\001\032\004\210\265\030\013\022\024\n\tCG_GM_CMD\020\255\002\032\004\210\265\030\013\022\036\n" +
      "\023CG_GET_DAILY_REWARD\020\337\002\032\004\210\265\030\013\022\027\n\014CG_OPEN" +
      "_SHOP\020\221\003\032\004\210\265\030\013\022\033\n\020CG_REFRESH_GOODS\020\222\003\032\004\210" +
      "\265\030\013\022\026\n\013CG_BUY_GOOD\020\223\003\032\004\210\265\030\013\022\031\n\016CG_OPEN_W" +
      "INDOW\020\303\003\032\004\210\265\030\013\022\032\n\017CG_CLOSE_WINDOW\020\304\003\032\004\210\265",
      "\030\013\022\036\n\023CG_HUMAN_BUY_ENERGY\020\365\003\032\004\210\265\030\013*\322\006\n\rG" +
      "CMessageType\022\034\n\030SC_LOGIN_HANDSHAKE_REPLY" +
      "\020\013\022\034\n\030SC_LOGIN_SERVER_NOT_OPEN\020\014\022\021\n\rSC_L" +
      "OGIN_FAIL\0203\022\030\n\024GC_HUMAN_DETAIL_INFO\020e\022\021\n" +
      "\rGC_DATA_ERROR\020f\022\033\n\027GC_HUMAN_BUY_ENERGY_" +
      "ACK\020g\022\033\n\027GC_HUMAN_BUY_ENERGY_NEG\020h\022 \n\034GC" +
      "_HUMAN_ENERGY_RECOVER_INFO\020i\022\037\n\033GC_HUMAN" +
      "_COST_ENERGY_FAILED\020j\022$\n GC_HUMAN_BUY_EN" +
      "ERGY_COUNTS_RESET\020k\022\023\n\017GC_VIP_LEVEL_UP\020l" +
      "\022\025\n\021GC_HUMAN_LEVEL_UP\020m\022\032\n\025GC_HERO_CHANG",
      "ED_PROPS\020\311\001\022\025\n\020GC_ALL_HERO_INFO\020\312\001\022\020\n\013GC" +
      "_HERO_ADD\020\313\001\022\023\n\016GC_HERO_UPDATE\020\314\001\022\026\n\021GC_" +
      "INVENTORY_INFO\020\255\002\022\023\n\016GC_ITEM_UPDATE\020\256\002\022\031" +
      "\n\024GC_DAILY_REWARD_INFO\020\221\003\022\037\n\032GC_GET_DAIL" +
      "Y_REWARD_FAILED\020\222\003\022\021\n\014GC_SHOP_INFO\020\303\003\022\"\n" +
      "\035GC_SHOP_MANUALLY_REFRESH_INFO\020\304\003\022\030\n\023GC_" +
      "GOOD_BUY_SUCCESS\020\305\003\022)\n$GC_SHOP_MANUALLY_" +
      "REFRESH_COUNT_RESET\020\306\003\022\036\n\031GC_SHOP_AUTO_R" +
      "EFRESH_INFO\020\307\003\022\022\n\rGC_SHOP_CLOSE\020\310\003\022\023\n\016GC" +
      "_SHOP_PROMPT\020\311\003\022\030\n\023GC_OPENED_TEMP_SHOP\020\312",
      "\003\022\021\n\014GC_OPEN_SHOP\020\313\003\022\032\n\025GC_FUNCTION_OPEN" +
      "_LIST\020\365\003\022\025\n\020GC_FUNCTION_OPEN\020\366\003\022\016\n\tGC_GM" +
      "_CMD\020\247\004*\"\n\rMGMessageType\022\021\n\rMG_BROAD_CAS" +
      "T\020\001:V\n\017cg_message_type\022\037.google.protobuf" +
      ".MessageOptions\030\321\206\003 \001(\0162\032.com.icewind.CG" +
      "MessageType:V\n\017gc_message_type\022\037.google." +
      "protobuf.MessageOptions\030\322\206\003 \001(\0162\032.com.ic" +
      "ewind.GCMessageType:V\n\017mg_message_type\022\037" +
      ".google.protobuf.MessageOptions\030\323\206\003 \001(\0162" +
      "\032.com.icewind.MGMessageType:V\n\006TARGET\022!.",
      "google.protobuf.EnumValueOptions\030\321\206\003 \001(\016" +
      "2\032.com.icewind.MessageTarget:\005ERRORB\rB\013M" +
      "essageType"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    cgMessageType.internalInit(descriptor.getExtensions().get(0));
    gcMessageType.internalInit(descriptor.getExtensions().get(1));
    mgMessageType.internalInit(descriptor.getExtensions().get(2));
    tARGET.internalInit(descriptor.getExtensions().get(3));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    registry.add(com.icewind.MessageType.tARGET);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
