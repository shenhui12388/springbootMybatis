package top.wservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wservice.entity.Userm;
import top.wservice.entity.UsermExample;
import top.wservice.mapper.UsermMapper;
import top.wservice.service.UsermService;

import java.util.List;

/**
 * @author senfel
 * @Title: UsermServiceImpl
 * @ProjectName springbootMybatis
 * @Description: TODO
 * @date 2018/9/816:40
 */
@Service
public class UsermServiceImpl implements UsermService {
    @Autowired
    private UsermMapper usermMapper;


    @Override
    public List<Userm> selectByExample() {
        UsermExample usermExample = new UsermExample();
        UsermExample.Criteria criteria = usermExample.createCriteria();
        return usermMapper.selectByExample(usermExample);
    }
}
