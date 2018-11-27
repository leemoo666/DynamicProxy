package com.lxm.proxy.nomal;

public class NormalGamePlayerProxy implements INormalGamePlayer {
   private INormalGamePlayer gamePlayer;

    public NormalGamePlayerProxy(NormalGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String userName, String password) {
        gamePlayer.login(userName,password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade(int level) {
        gamePlayer.upgrade(level);
    }
}
