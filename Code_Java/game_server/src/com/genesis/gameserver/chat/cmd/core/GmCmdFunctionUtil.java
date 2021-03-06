package com.genesis.gameserver.chat.cmd.core;

import com.genesis.gameserver.core.serverinit.ServerInitFailException;
import com.genesis.core.function.FunctionUtil;
import com.genesis.core.util.PackageUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GmCmdFunctionUtil {

    public static Map<String, IGmCmdFunction> buildServerInitFunction() {
        Set<Class<?>> funcClassSet = PackageUtil
                .getSubClass("com.mokylin.bleach.gameserver.chat.cmd", IGmCmdFunction.class);

        if (funcClassSet == null || funcClassSet.isEmpty()) {
            return new HashMap<>(0);
        }

        Map<String, IGmCmdFunction> map = new HashMap<>(funcClassSet.size());
        try {
            for (Class<?> each : funcClassSet) {
                //判断是否仅为函数，没有上下文
                FunctionUtil.assertIsFunctionClass(each);
                IGmCmdFunction obj = (IGmCmdFunction) each.newInstance();
                if (map.containsKey(obj.getGmCmd())) {
                    throw new ServerInitFailException(
                            "GM Command " + obj.getGmCmd() + " Duplicated!");
                }
                map.put(obj.getGmCmd(), obj);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return map;
    }
}
