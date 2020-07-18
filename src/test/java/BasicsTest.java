import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yan.basics.BasicsApplication;
import com.yan.basics.dao.BasicsDictMapper;
import com.yan.basics.pojo.BasicsDict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BasicsApplication.class)
public class BasicsTest {
    @Autowired
    private BasicsDictMapper basicsDictMapper;

    @Test
    public void test1 () {
        PageHelper.startPage(2, 1);
        List<BasicsDict> hardware = basicsDictMapper.getDictByGroup("Hardware");
        PageInfo<BasicsDict> basicsDictPageInfo = new PageInfo<>(hardware);

        System.out.println(JSONObject.toJSONString(basicsDictPageInfo));
    }

}
