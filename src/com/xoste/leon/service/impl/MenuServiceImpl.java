package com.xoste.leon.service.impl;

import com.xoste.leon.mapper.MenuMapper;
import com.xoste.leon.pojo.Menu;
import com.xoste.leon.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Leon
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> showMenu(int pid) {
        return menuMapper.selectMenuByPid(pid);
    }
}
