@RealizarCompras
Feature: Logearse en saucedemo y realizar una compra

  Background: login
    Given accede a la pagina de saucedemo
    And el usuario inicia sesion en el sistema de saucedemo
      | user       | password       |
      | userPrueba | passwordPrueba |


  @ComprasVarias
  Scenario Outline: Realizar compra numero 2
    When selecciona unos productos para agregarlos a el carrito
    And ingresa la informacion de "<nombre>", "<apellido>" y "<codigo_postal>"
    Then el usuario visualiza el "<mensaje>"
    Examples:
      | nombre | apellido | codigo_postal | mensaje                   |
      | Maria  | Lopez    | 67890         | Thank you for your order! |
      | Juan   | Camacho  | 12345         | Thank you for your order! |