package com.atxiaoming.controller;


import com.atxiaoming.entity.TbMenu;
import com.atxiaoming.mapper.TbMenuMapper;
import com.atxiaoming.mapper.TbUserMapper;
import com.atxiaoming.service.impl.TbMenuServiceImpl;
import com.atxiaoming.service.impl.TbUserServiceImpl;
import com.atxiaoming.vo.LoginVo;
import com.atxiaoming.vo.MenuRequireVo;
import com.atxiaoming.vo.RespBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小明
 * @since 2021-01-04
 */
@RestController
@RequestMapping("/menu")
public class TbMenuController {

    @Autowired
    private TbMenuServiceImpl menuServiceI;

    @ApiOperation(value = "获取菜单" ,  notes="获取菜单")
    @RequestMapping(value="/getList",method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public RespBean getList(@RequestBody MenuRequireVo menuVo){
        return menuServiceI.getList(menuVo);
    }

    @ApiOperation(value = "添加菜单" ,  notes="添加菜单")
    @RequestMapping(value="/add",method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public RespBean add(@RequestBody TbMenu menu){
        return menuServiceI.add(menu);
    }
}
