**Proyecto Automatización Piloto**


* Descripción: 
El proyecto consiste en automatizar el App VodQA.

* Precondición
-_Ejecutar en Sistema Operativo Windows_<br />
- El SO windows debe tener habilitado(virtualización)
- Dispositivo de Pruebas Android Movil debe tener instalado el apk VodQA
-_Tener instalado previamente maven en su local_<br />
-_Tener instalado jdk 8 de java_<br />
-_Tener instalado Appium<br />
    Configurar los siguientes Capabilities en Appium<br />
      {
  "deviceName": "emulador",
  "platformName": "Android", (Configurable)
  "platformVersion": "9.0", (Configurable)
  "automationName": "UiAutomator2",
  "appPackage": "com.vodqareactnative", (Configurable)
  "appActivity": "com.vodqareactnative.MainActivity", (Configurable)
  "app": "C:\\VodQA.apk"
      } <br />
-_Ejecutar Appium con la confiruación indicada_<br />
-_Descargar proyecto de git(Push) a su local_<br />
     Configurar los mismos capabilities en el proyecto descargado(..\VoadQA\src\test\java\definitions\Hooks.java)      

* Pasos para la ejecución:<br />
-_Ejecutar el comando cmd Windows :Tecla Win + R_<br />
-_Digitar cmd y presionar enter_<br />
-_En la consola ubicarse en la ruta del proyecto descargado (Ejm: cd C:\Users\Richard\IdeaProjects\VodQA)_<br />
-_En la consola ejecutar : mvn clean install compile test_<br />


* Nota:<br>
Para ejecutar el proyecto se puede crear una maquina virtual desde Android Studio u optar por usar el propio dispositivo(habilitar modo desarrollador y conectar USB compartido a la PC)
