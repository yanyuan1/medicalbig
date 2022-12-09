package common.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import common.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
