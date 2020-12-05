package com.xoste.leon.service;

import com.xoste.leon.pojo.Menu;

import java.util.List;

/**
 * @author Leon
 */
public interface MenuService {
    /**
     * 显示菜单
     * @param pid int
     * @return List<Menu>
     */
    List<Menu> showMenu(int pid);
}
