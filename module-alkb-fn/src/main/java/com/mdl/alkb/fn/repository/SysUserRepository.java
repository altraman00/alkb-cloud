package com.mdl.alkb.fn.repository;

import com.mdl.alkb.fn.entity.SysUserEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Project : cloudService
 * @Package Name : com.mdl.alkb.fn.repository
 * @Description : TODO
 * @Author : xiekun
 * @Create Date : 2020年08月31日 14:50
 * ----------------- ----------------- -----------------
 */
public interface SysUserRepository extends JpaRepository<SysUserEntity, String> {

  SysUserEntity findByName(String name);

  List<SysUserEntity> findAllByAge(String age);

}
