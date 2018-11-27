package com.lxm.proxy.nomal;

public class NormalTest {

    public static void main(String []args){
        NormalGamePlayer gamePlayer = new NormalGamePlayer();

        NormalGamePlayerProxy gamePlayerProxy = new NormalGamePlayerProxy(gamePlayer);
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade(2);
    }

}
