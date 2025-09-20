Proyecto: Reto TCS - Automatización E2E de Compra
Este proyecto implementa la automatización de extremo a extremo (E2E) del flujo de compra de productos en el sitio DemoBlaze.
El objetivo principal es demostrar buenas prácticas en automatización de pruebas funcionales, aplicando patrones de diseño modernos y herramientas robustas, garantizando la confiabilidad, escalabilidad y mantenibilidad del código.


El sistema simula el flujo de un usuario que:

Ingresa a la aplicación web.

Realiza un login exitoso.

Agrega dos productos al carrito.

Llena el formulario de compra.

Confirma la orden y valida el mensaje final de éxito.


Objetivo
Automatizar el escenario donde un usuario:

Validar conocimientos técnicos en automatización de pruebas E2E.

Implementar un framework escalable y mantenible basado en el patrón Screenplay.

Evidenciar el uso de tecnologías modernas (Java 21, Serenity, Cucumber, Selenium).

Reforzar las buenas prácticas de testing empresarial: modularidad, reutilización y legibilidad.


Estructura del Proyecto
features/: Contiene el archivo .feature con el escenario de prueba escrito en lenguaje Gherkin.

stepsdefinitions/: Contiene las definiciones de pasos (StepDefinition) que implementan los pasos del archivo .feature.

tasks/: Implementa las acciones del usuario como tareas reutilizables, por ejemplo: Login y proceso de compra.

questions/: Contiene clases que permiten validar respuestas en el flujo, como textos o elementos visibles.

userinterface/: Contiene los localizadores (elementos web) utilizados durante la ejecución.

runners/: Clase runner que permite ejecutar los tests con Cucumber y Serenity.

Herramientas y Tecnologías

Lenguaje: Java 21

Gestión de dependencias: Maven

Frameworks de automatización: Serenity BDD 4.1.14 + Serenity Screenplay

Orquestador de pruebas: Cucumber 7.21.1

Automatización de navegador: Selenium WebDriver 4.29.0

Gestión de drivers: WebDriverManager

Patrón de diseño aplicado: Screenplay Pattern


Instalación y Ejecución
Escenario del archivo Feature

Feature: RETO TCS, REALIZAR E2E DEL PROCEDO DE COMPRA DE 2 PRODUCTOS

Scenario: Usuario realiza ingreso satisfactorio y compra de productos
Given El usuario apertura la pagina
When El usuario ingresa las credenciales de manera correcta
Then El usuario realizar la compra de 2 productos


Validación Final
La automatización finaliza validando el texto:

Validacion Final.
"Thank you for your purchase!"

Este mensaje aparece después de realizar una compra exitosa.    


Consideraciones

Se utiliza @Managed para inicializar el WebDriver de forma automática con Serenity.

WebDriverManager facilita la gestión de drivers sin configuración manual.

Se implementan esperas explícitas (WebDriverWait) y esperas simples (Thread.sleep) como refuerzo temporal.

El uso del patrón Screenplay garantiza:

Reutilización del código.

Escalabilidad del framework.

Mejor legibilidad y mantenibilidad.



