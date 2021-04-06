package com.mf.demo02;

/**
 * @author mf
 * @create 2021-04-05-19:18
 */
//代理：给每个方法增加日志这个功能
public class UserServiceProxy implements UserService{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserServiceProxy() {
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
    //加一个日志方法
    public void log(String msg){
        System.out.println("[DEBUG]使用了"+msg+"方法");
    }
}
