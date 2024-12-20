# 💡 Tips para saber cuando usar Interfaz o Clase Abstracta

## 🔶 **Cuándo usar una Clase Abstracta**
➡️ **Debemos una Clase Abstracta** cuando:
1. **Tengamos atributos en común** entre las clases.
2. **Tengamos métodos comunes**, pero podria pasar que cada clase los implementa de forma diferente.  
`Observacion: Podemos tener clases abstractas sin ningun metodo abstracto. Las clases abstractas NO pueden ser instanciadas. Es decir, no le podriamos hacer un new().  `

### Ejemplo:
- Suponiendo que estamos modelando animales y todos tienen atributos  `nombre` y  `peso`, pero cada uno tiene un método `hacerSonido()` que cada tipo de animal (clase hija) lo hace de una manera distinta  como por ejemplo (`Perro: "Guau", Gato: "Miau"`), debemos usar una clase abstracta. 

🛠️ **Ventaja**: Aprovechamos y aplicamos el polimorfismo, definiendo métodos abstractos en la clase base e implementándolos en cada clase hija.

---

## 🔷 **Cuándo usar una Interfaz**
➡️ **Debemos usar una Interfaz** cuando:
1. **Solo tenemos métodos/comportamientos en común**, pero **no atributos**.
2. **Cada clase implementa los métodos de forma distinta**.

### Ejemplo:
- Si diferentes objetos (como un `Pájaro` y un `Avión`) comparten el comportamiento de "volar", pero no tienen atributos relacionados entre ellos, usa una interfaz `Volador`.

📜 **Nota**: Una interfaz es como un contrato: cualquier clase que la implemente **debe definir todos sus métodos SI O SI**.

---

## ✅ Diferencias clave

| **Clase Abstracta**         | **Interfaz**                |
|-----------------------------|----------------------------|
| ✅ Tiene atributos comunes. | ❌ No tiene atributos.       |
| ✅ Permite definir métodos concretos y abstractos. | 🚀 Solo define métodos abstractos. |
| 🔗 Relación jerárquica: "Es un(a)".  | 🔗 Contrato de comportamiento: "Puede hacer". |

---

![image](https://github.com/user-attachments/assets/51737c32-3a81-48ee-bb29-905664a40e51)
