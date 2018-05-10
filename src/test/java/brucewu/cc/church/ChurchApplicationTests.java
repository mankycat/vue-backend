package brucewu.cc.church;

import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.common.CipherUtils;
import brucewu.cc.church.mapper.UserInfoMapper;
import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("brucewu.cc.church.mapper")
public class ChurchApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(ChurchApplicationTests.class);

	@Autowired
	UserInfoMapper userInfoMapper;
//
//	@Test
//	public void contextLoads() {
//
//	}
//
	@Test
	public void test(){
		UserInfo userInfo =
				userInfoMapper.login("管理员","admin" , CipherUtils.encodeWithBase64("654123"));
		Assert.assertEquals("admin", userInfo.getLoginname());
		logger.info(JSON.toJSONString(userInfo));
	}

}
