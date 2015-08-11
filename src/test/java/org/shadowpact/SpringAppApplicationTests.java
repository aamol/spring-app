package org.shadowpact;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shadowpact.SpringAppApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringAppApplication.class)
@WebAppConfiguration
public class SpringAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
