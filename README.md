🛒 Proyecto: Reto TCS – Automatización E2E de Compra
📖 Descripción

Este proyecto implementa la automatización de extremo a extremo (E2E) del flujo de compra de productos en el sitio DemoBlaze
.
El objetivo principal es demostrar buenas prácticas en automatización de pruebas funcionales, aplicando patrones de diseño modernos y herramientas robustas, garantizando la confiabilidad, escalabilidad y mantenibilidad del código.

El sistema simula el flujo de un usuario que:

Ingresa a la aplicación web.

Realiza un login exitoso.

Agrega dos productos al carrito.

Llena el formulario de compra.

Confirma la orden y valida el mensaje final de éxito.

🎯 Objetivo del Reto

Validar conocimientos técnicos en automatización de pruebas E2E.

Implementar un framework escalable y mantenible basado en el patrón Screenplay.

Evidenciar el uso de tecnologías modernas (Java 21, Serenity, Cucumber, Selenium).

Reforzar las buenas prácticas de testing empresarial: modularidad, reutilización y legibilidad.

🏗️ Estructura del Proyecto
📂 src/test/java
 ├── features/          # Escenarios .feature escritos en Gherkin
 ├── stepsdefinitions/  # Definiciones de pasos (StepDefinition)
 ├── tasks/             # Acciones de usuario (Login, compra, etc.)
 ├── questions/         # Validaciones y verificaciones (textos, elementos)
 ├── userinterface/     # Localizadores de elementos web
 └── runners/           # Clase runner para ejecutar pruebas con Serenity y Cucumber

🛠️ Tecnologías y Herramientas

Lenguaje: Java 21

Gestión de dependencias: Maven

Frameworks de automatización: Serenity BDD 4.1.14 + Serenity Screenplay

Orquestador de pruebas: Cucumber 7.21.1

Automatización de navegador: Selenium WebDriver 4.29.0

Gestión de drivers: WebDriverManager

Patrón de diseño aplicado: Screenplay Pattern

⚙️ Instalación y Ejecución
🔹 Requisitos Previos

JDK 21 instalado

Maven configurado

Navegador Google Chrome

🔹 Pasos para ejecutar

Clonar el repositorio:

git clone https://github.com/tu-usuario/reto-tcs-automatizacion.git


Posicionarse en la carpeta del proyecto:

cd reto-tcs-automatizacion


Ejecutar las pruebas con Maven:

mvn clean verify

📌 Escenario Automatizado (Gherkin)
Feature: RETO TCS – Realizar E2E del proceso de compra de 2 productos

  Scenario: Usuario realiza ingreso satisfactorio y compra de productos
    Given El usuario apertura la pagina
    When El usuario ingresa las credenciales de manera correcta
    Then El usuario realizar la compra de 2 productos

✅ Validación Final

La automatización concluye validando la aparición del mensaje:

"Thank you for your purchase!"


Este mensaje confirma que el flujo de compra fue exitoso.

📊 Consideraciones Técnicas

Se utiliza @Managed para inicializar el WebDriver de forma automática con Serenity.

WebDriverManager facilita la gestión de drivers sin configuración manual.

Se implementan esperas explícitas (WebDriverWait) y esperas simples (Thread.sleep) como refuerzo temporal.

El uso del patrón Screenplay garantiza:

Reutilización del código.

Escalabilidad del framework.

Mejor legibilidad y mantenibilidad.