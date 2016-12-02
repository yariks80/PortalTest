import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver



waiting {
    timeout = 2
}

//System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "")- Jenkins report

baseUrl = "http://www.gebish.org/"




autoClearCookies = false
atCheckWaiting = true
baseNavigatorWaiting = true

name = 'iaroslav.sviatkin'
password = '$viatk1n2016'
mail ='iaroslav.sviatkin@globallogic.com'

reportsDir = new File("target/reports")

environments {
    System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe")
    chrome {

        driver = {

            def driverInstance = new ChromeDriver()
            driverInstance.manage().window().maximize()
            driverInstance

        }
    }

    firefox {

        driver = {
            def driverInstance = new FirefoxDriver()
            driverInstance.manage().window().maximize()
            driverInstance

        }
    }

    ie {
        driver = {
            def driverInstance = new InternetExplorerDriver()
            driverInstance.manage().window().maximize()
            driverInstance

        }

    }

}
