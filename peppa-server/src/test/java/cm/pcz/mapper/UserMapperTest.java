package cm.pcz.mapper;

import com.pcz.mapper.UserMapper;
import com.pcz.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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
}
