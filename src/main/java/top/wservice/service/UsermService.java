package top.wservice.service;

import top.wservice.entity.Userm;
import top.wservice.entity.UsermExample;

import java.util.List;

/**
 * @author senfel
 * @Title: UsermService
 * @ProjectName springbootMybatis
 * @Description: TODO
 * @date 2018/9/816:40
 */
public interface UsermService {

    List<Userm> selectByExample();
}
