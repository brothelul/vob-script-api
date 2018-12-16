package com.mosesc.vobscriptapi;

import com.mosesc.vobscriptapi.entity.VobComponent;
import com.mosesc.vobscriptapi.mapper.VobComponentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VobScriptApiApplicationTests {

	@Autowired
	private VobComponentMapper vobComponentMapper;

	@Test
	public void contextLoads() {
		VobComponent vobComponent = vobComponentMapper.selectById(1);
		System.out.println(vobComponent);
	}

}

