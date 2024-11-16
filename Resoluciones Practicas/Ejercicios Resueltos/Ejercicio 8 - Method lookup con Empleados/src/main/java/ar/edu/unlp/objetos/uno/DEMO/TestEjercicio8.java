package ar.edu.unlp.objetos.uno.DEMO;
public class TestEjercicio8 {
    public static void main(String[] args) {
       
        Gerente alan1 = new Gerente ("Alan Turing");
        double aportesDeAlan = alan1.aportes();
        System.out.println("Aportes de alan1: "+aportesDeAlan);
        
        
        Gerente alan2 = new Gerente ("Alan Turing");
        double sueldoBasicoAlan2 = alan2.sueldoBasico();
        System.out.println("Sueldo basico de alan2: "+sueldoBasicoAlan2);
        
        
        /*
        alan1.aportes: - Gerente +aportes(): 
        Se ejecuta el metodo aportes de la clase Gerente. Este metodo ejecuta el metodo montoBasico de la misma clase (Gerente) y lo que retorna 
        el metodo montoBasico por 0.05
        Resultado = 57000 * 0.05 = 2850.0
        
  	alan 2 - Gerente (Sueldo básico): 1) Búsqueda de método en clase Gerente. 2)
		 * Método +sueldoBasico de la clase EmpleadoJerarquico. 3) Método +sueldoBasico
		 * de la clase Empleado. 3.1) this.montoBasico() + this.aportes() = 57000 + 2850
		 * = 59850. Se ejecutan los metodos de la clase Gerente. 2.1)
		 * super.sueldoBasico() + this.bonoPorCategoria() = 59850 +
		 * this.bonoPorCategoria(). 2.2) Búsqueda de método de la clase Gerente. 2.3)
		 * Método +bonoPorCategoria de la clase EmpleadoJerarquico. 2.4) 59850 + 8000 =
		 * 67850.
        
        */
    }
    
}
