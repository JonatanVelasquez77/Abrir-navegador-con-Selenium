package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    public static void main(String[] args) {
        // Configurar WebDriverManager para administrar ChromeDriver
        WebDriverManager.chromedriver().clearResolutionCache().setup();

        // Crear opciones de Chrome
        ChromeOptions chromeOptions = new ChromeOptions();

        // Cargar un perfil de Chrome específico
        chromeOptions.addArguments("user-data-dir=/home/choko77/.config/google-chrome");
        chromeOptions.addArguments("profile-directory=Default");

        // Opcional: Deshabilitar extensiones y limpiar caché
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("disable-cache");
        chromeOptions.addArguments("disable-application-cache");
        chromeOptions.addArguments("disk-cache-size=0");
        //chromeOptions.addArguments("--headless"); // Ejecutar en modo headless
        chromeOptions.addArguments("--no-sandbox"); // Requerido para algunos entornos
        chromeOptions.addArguments("--remote-debugging-port=9222"); // Puerto para depuración remota

        // Crear una instancia de ChromeDriver con las opciones especificadas
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Abrir una página web de ejemplo
        driver.get("https://libranza-qa.previospichincha.com/#/welcome");

        // Imprimir el título de la página
        System.out.println("Título de la página: " + driver.getTitle());

        // Cerrar el navegador
        //driver.quit();
    }
}

