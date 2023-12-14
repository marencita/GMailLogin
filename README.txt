Prueba de Login a la pagina web Gmail.com
Se incluye gherkin + cucumber + SerenityBDD + SeleniumWebDriver

pasos:
ingresa a la pagina https://www.gmail.com
ingresa usuario y  contraseña 
Comprueba que ingresa a la pagina de inicio de gmail confirmando que exista el boton "Redactar"

Para la construcción se utilizó Ide Intellij IDEA 2023.2.2
con plugins: 
cucumber+ 15.3.3
Cucumber for java 232.8660.142
Gherkin 232.8660.88



Probado en:
Version de Windows 10 Pro
Lenguaje predeterminado Español Colombia
java 17 + gradle 8.5
Google Chrome version 120.0.60.99.110

Comando de ejecución:
gradle test aggregate

La cuenta de gmail utilizada para la automatización tiene la opción de doble autenticación deshabilitada.
