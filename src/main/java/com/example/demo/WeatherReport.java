package com.example.demo;

import lombok.Data;

@Data
public class WeatherReport {
	
	private String publishingOffice;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private String reportDatetime;
    private String targetArea;
    private String headlineText;
    private String text;

    public WeatherReport() {
    }

//    public String getPublishingOffice() {
//		return publishingOffice;
//	}
//
//	public void setPublishingOffice(String publishingOffice) {
//		this.publishingOffice = publishingOffice;
//	}
//
//	public String getReportDatetime() {
//		return reportDatetime;
//	}
//
//	public void setReportDatetime(String reportDatetime) {
//		this.reportDatetime = reportDatetime;
//	}
//
//	public String getTargetArea() {
//		return targetArea;
//	}
//
//	public void setTargetArea(String targetArea) {
//		this.targetArea = targetArea;
//	}
//
//	public String getHeadlineText() {
//		return headlineText;
//	}
//
//	public void setHeadlineText(String headlineText) {
//		this.headlineText = headlineText;
//	}
//
//	public String getText() {
//		return text;
//	}
//
//	public void setText(String text) {
//		this.text = text;
//	}

	public WeatherReport(String publishingOffice, String reportDatetime, String targetArea, String headlineText, String text) {
        this.publishingOffice = publishingOffice;
        this.reportDatetime = reportDatetime;
        this.targetArea = targetArea;
        this.headlineText = headlineText;
        this.text = text;
    }
}
