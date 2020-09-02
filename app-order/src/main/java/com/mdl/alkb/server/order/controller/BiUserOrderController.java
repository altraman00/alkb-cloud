package com.mdl.alkb.server.order.controller;

import com.mdl.alkb.server.order.entity.BiUserOrderEntity;
import com.mdl.alkb.server.order.service.BiUserOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : alkb-cloud
 * @Package Name : com.mdl.alkb.server.order.controller
 * @Description : TODO
 * @Author : xiekun
 * @Create Date : 2020年09月01日 16:33
 * ----------------- ----------------- -----------------
 */

@Api(value = "UserOrderController", tags = "用户订单相关")
@RestController
@RequestMapping("/user")
public class BiUserOrderController {

  @Autowired
  private BiUserOrderService userOrderService;

  @ApiOperation(value = "根据用户id查询")
  @GetMapping("{userId}/order")
  public List<BiUserOrderEntity> getOrderListByUserId(@PathVariable("userId") String userId) {
    List<BiUserOrderEntity> byUserId = userOrderService.findByUserId(userId);
    return byUserId;

  }

}
