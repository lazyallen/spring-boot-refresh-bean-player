package com.example.lazyallen.refreshbeanplayer.config;

import com.example.lazyallen.refreshbeanplayer.config.propertie.FruitProperties;
import com.example.lazyallen.refreshbeanplayer.model.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author allen
 * @Date 2020/5/23
 */
@Configuration
public class FruitConfig {

	@Autowired
	private FruitProperties fruitProperties;

	@RefreshScope
	@Bean
	public Apple apple(){
		return Apple.builder()
				.color(fruitProperties.getColor())
				.name(fruitProperties.getName())
				.enable(fruitProperties.getEnable())
				.build();
	}
}
