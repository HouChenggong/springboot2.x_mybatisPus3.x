package cn.net.conet.mybatisplus.service;

import cn.net.conet.mybatisplus.entity.UserData;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiyou
 * @since 2019-07-05
 */
public interface UserDataService extends IService<UserData> {


    List<UserData> list(Integer limit);
}
