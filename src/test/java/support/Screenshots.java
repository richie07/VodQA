package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots extends Util{

    public static void evidencia() throws IOException, InterruptedException {
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmss");
        String path = "C:\\Users\\Richard\\IdeaProjects\\MobileProject\\target\\evidencias\\";
        String file = formato.format(hoy)+"_screnshot.jpg";

        Thread.sleep(3000);
        File images = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(images, new File(path + file));
    }
}
