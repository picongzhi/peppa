package cm.pcz.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pcz.mapper.UserMapper;
import com.pcz.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void selectAllTest() {
        List<User> userList = userMapper.selectAll();
        System.out.println(userList);
    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setName("pcz");
        userMapper.insertUseGeneratedKeys(user);
    }

    @Test
    public void selectWithCondition() {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id", 1);
        List<User> userList = userMapper.selectByExample(example);
        System.out.println(userList);
    }

    @Test
    public void selectByPage() {
        int page = 2;
        int size = 3;
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        log.info("total page: {}", userPageInfo.getPages());
        log.info("page size: {}", userPageInfo.getSize());
        userPageInfo.getList().forEach(user -> log.info("user: {}", user));
    }
}
