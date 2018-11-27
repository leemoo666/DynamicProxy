package com.lxm.proxy.nomal;

public class NormalGamePlayer implements INormalGamePlayer {
    @Override
    public void login(String userName, String password) {
        System.out.println("登录：" + userName + " :" + password);
    }

    @Override
    public void killBoss() {
        System.out.println("杀死怪兽");
    }

    @Override
    public void upgrade(int level) {
        System.out.println("升级：" + level);
    }
}
