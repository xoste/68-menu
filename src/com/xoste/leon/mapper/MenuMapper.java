package com.xoste.leon.mapper;

import com.xoste.leon.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Leon
 */
public interface MenuMapper {
    /**
     * 查询所有的菜单
     * @param pid int
     * @return List<Menu></>
     */
    List<Menu> selectMenuByPid(@Param("pid") int pid);
}
