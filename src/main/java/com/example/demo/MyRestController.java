package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //①retcontrollerというアノテーションを使う
public class MyRestController {

	@GetMapping("/weather/{areaCode}")//③パスを指定
	public WeatherReport getWeather(@PathVariable String areaCode) {
		
		WeatherReport report = new WeatherReport();
		report.setHeadlineText("ヘッドラインです。");
		report.setPublishingOffice("字名丸星見観察所");
		report.setTargetArea("エリアコードは" + areaCode + "番です。");
		report.setText("本日は星降る夜");
		
		return report;//②何かしらの文字列を返すメソッドを作る
	}
	
	@PostMapping("/weather")//③パスを指定
	public WeatherReport postWeather(@PathVariable String areaCode) {
		
		WeatherReport report = new WeatherReport();
		
		report.setHeadlineText("ヘッドラインです。");
		report.setPublishingOffice("帆風帆船星見台");
		report.setTargetArea("エリアコードは" + areaCode + "番です。");
		report.setText("本日の天気：星降る夜");
		
		return report;//②何かしらの文字列を返すメソッドを作る
	}
}
