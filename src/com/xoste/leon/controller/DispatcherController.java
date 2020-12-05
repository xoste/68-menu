package com.xoste.leon.controller;

import com.xoste.leon.pojo.Menu;
import com.xoste.leon.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Leon
 */
@Controller
public class DispatcherController {
    /**
    * 子容器springMVC调用父容器spring
    * */
    @Resource
    private MenuService menuServiceImpl;

    @RequestMapping("/show")
    @ResponseBody
    public List<Menu> show() {
        return menuServiceImpl.showMenu(0);
    }
}
