package com.mdl.alkb.server.user.controller;

import com.mdl.alkb.server.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : cloudService
 * @Package Name : com.mdl.alkb.fn.repository
 * @Description : TODO
 * @Author : xiekun
 * @Create Date : 2020年08月31日 14:50
 * ----------------- ----------------- -----------------
 */

@Api(value = "UserController", tags = "用户相关")
@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  private UserService userService;

  @ApiOperation(value = "根据id查询")
  @GetMapping("/name")
  public String bridgeInfo(String id) {
    String byId = userService.findById(id);
    return byId;

  }

}
