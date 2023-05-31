package Utilitys;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srennshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://images.search.yahoo.com/search/images;_ylt=Awr.wBLNm1Bky4oHvlhXNyoA;_ylu=Y29sbwNncTEEcG9zAzEEdnRpZAMEc2VjA3BpdnM-?p=Prabhas&fr2=piv-web&type=E211US885G0&fr=mcafee");
TakesScreenshot srenScreenshot=(TakesScreenshot)driver;
File src=Srennshot.getScrenShotAS(OutputType.FILE);
File detFile=new File("D:\\abc.png");
FileUtils.copyFile(src, detFile);


	}

}
