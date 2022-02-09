package dao;

import com.huanhuangf.ApiApplication;
import com.huanhuangf.gfadmin.dao.UserDAO;
import com.huanhuangf.gfadmin.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class UserDAOTest {

    @Resource
    private UserDAO userDAO;

    @Test
    public void queryUserByName() {
        User user = userDAO.queryUserByName("Tony");
        System.out.println(user);
    }
}