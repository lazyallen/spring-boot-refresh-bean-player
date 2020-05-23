package com.example.lazyallen.refreshbeanplayer.config.propertie;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author allen
 * @Date 2020/5/23
 */
@Data
@Component
public class FruitProperties {
	@Value("apple")
	String name;

	@Value("red")
	String color;

	@Value("false")
	Boolean enable;

}
