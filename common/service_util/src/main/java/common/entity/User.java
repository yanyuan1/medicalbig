package common.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @TableId(type = IdType.AUTO) //自增
    //@TableId(type = IdType.ASSIGN_ID) //雪花算法
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;  //create_time
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime; //update_time
    @Version
    private Integer version;
    @TableLogic
    private Integer deleted;
}
