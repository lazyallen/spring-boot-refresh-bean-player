package com.example.lazyallen.refreshbeanplayer;

import com.example.lazyallen.refreshbeanplayer.config.propertie.FruitProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootRefreshBeanPlayerApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	FruitProperties fruitProperties;


	@Test
	void contextLoads() {

		System.out.println(applicationContext.getBean("apple"));

		fruitProperties.setName("apple plus");
		fruitProperties.setColor("green");
		fruitProperties.setEnable(true);

		applicationContext.getBean(RefreshScope.class).refresh("apple");


		System.out.println(applicationContext.getBean("apple"));





	}

}
