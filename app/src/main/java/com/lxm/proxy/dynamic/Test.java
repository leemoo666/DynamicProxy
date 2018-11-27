package com.lxm.proxy.dynamic;

public class Test {

    public static void main(String[] args) {
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy<IGamePlayer>();
        IGamePlayer gamePlayer = (IGamePlayer) gamePlayerProxy.setAgent(new GamePlayer());

        gamePlayer.login("大明", "123456");

    }
}
