package cn.net.conet.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiyou
 * @since 2019-07-05
 */
@Data
@TableName("user")
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;

     private Integer id;
     private String name;
     private Integer age;
     private String email;


}
