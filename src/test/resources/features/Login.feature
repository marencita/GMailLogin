Feature: Acceso a Gmail

    Scenario Outline: Login en gmail
        Given Acceso a la pagina de gmail
        When Ingreso nombre de usuario "<usuario>", contrasena "<contrasena>" y doy click en ingresar
        Then valido que haya ingresado
        Examples:
            | usuario | contrasena |
            | testermef@gmail.com   | Tester2023#12*+   |