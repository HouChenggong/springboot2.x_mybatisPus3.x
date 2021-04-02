package cn.net.conet.mybatisplus.service.impl;

import cn.net.conet.mybatisplus.entity.UserData;
import cn.net.conet.mybatisplus.mapper.UserDataMapper;
import cn.net.conet.mybatisplus.service.UserDataService;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xiyou
 * @since 2019-07-05
 */
@Service
@Slf4j
public class UserDataServiceImpl extends ServiceImpl<UserDataMapper, UserData> implements UserDataService {
    @Autowired
    private UserDataMapper userMapper;


    @Override
    public List<UserData> list(Integer limit) {
        if (limit == null) {
            limit = 10;
        }
        IPage<UserData> page = new Page<>(1, limit);
        IPage<UserData> result = new LambdaQueryChainWrapper<>(userMapper)
                .page(page);
        if (result == null) {
            return new LinkedList<>();
        }
        return result.getRecords();
    }
}
