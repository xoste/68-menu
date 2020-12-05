package com.xoste.leon.pojo;

import java.util.List;

/**
 * @author Leon
 */
public class Menu {
    private int id;
    private String name;
    private int pid;
    private List<Menu> subMenu;

    public Menu() {
    }

    public Menu(int id, String name, int pid, List<Menu> subMenu) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.subMenu = subMenu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<Menu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<Menu> subMenu) {
        this.subMenu = subMenu;
    }
}
