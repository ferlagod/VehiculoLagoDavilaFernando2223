
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        int stockActual = operativaVehiculosLagoDavilaFernando2223();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculosLagoDavilaFernando2223() {
        return operativaVehiculosLagoDavilaFernando2223(50);
    }

    private static int operativaVehiculosLagoDavilaFernando2223(Object cantidad) {
        VehiculoLagoDavilafernando2223 miVehiculoLagoDavilaFernando2223;
        int stockActual;
        miVehiculoLagoDavilaFernando2223 = new VehiculoLagoDavilafernando2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoLagoDavilaFernando2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoLagoDavilaFernando2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoLagoDavilaFernando2223.obtenerStock();
        return stockActual;
    }

}
    
