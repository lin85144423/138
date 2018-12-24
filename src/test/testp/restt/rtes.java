package restt;

import com.baizhi.dao.mangerDao;
import com.baizhi.entity.manger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springmysql.xml")
public class rtes {
    @Autowired
    private mangerDao md;
    @Test
    public void cc(){
        Jedis jedis=new Jedis("192.168.206.3",7000);
        Set<String> keys=jedis.keys("*");
        for(String key:keys){
            System.out.println(key);
        }
    }

    @Test
    public void ee(){
        List<manger> ma=md.select();
        for (manger m:ma){
            System.out.println(m);
        }
    }
}
