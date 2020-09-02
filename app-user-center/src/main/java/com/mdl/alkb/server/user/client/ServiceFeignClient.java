package com.mdl.alkb.server.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project : alkb-cloud
 * @Package Name : com.mdl.alkb.server.user.client
 * @Description : TODO
 * @Author : xiekun
 * @Create Date : 2020年09月02日 11:47
 * ----------------- ----------------- -----------------
 */

@Component
@FeignClient(value = "APP-ORDER-SERVICE")
public interface ServiceFeignClient {

  @RequestMapping("/user/{userId}/order")
  String getUserOrderByUserId(@PathVariable("userId") String userId);

}
