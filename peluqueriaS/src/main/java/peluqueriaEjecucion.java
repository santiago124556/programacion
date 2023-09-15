
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karol
 */
public class peluqueriaEjecucion extends Peluqueria2 {
//    
//    Peluqueria2 fabian= new Peluqueria2();
//    
//    public Peluqueria2 ingresarDatos(){
//        Peluqueria2 nuPeluqueria2=new Peluqueria2();
//        
//        int corteCab=Integer.parseInt(JOptionPane.showInputDialog("ingrese dato"));
//        
//        nuPeluqueria2.setCorteCaballero(corteCab);
//        return nuPeluqueria2;
//    }
//    
//    
//    /*private final Peluqueria[] peluqueros;
//        public peluqueriaEjecucion() {
//        this.peluqueros = new Peluqueria[4];
//        this.peluqueros[0] = new Peluqueria("Andres");
//        this.peluqueros[1] = new Peluqueria("Diego");
//        this.peluqueros[2] = new Peluqueria("Adelle");
//        this.peluqueros[3] = new Peluqueria("Brayitan");
//    }*/
//
//
//
//    public void registrarServicio() {
//        int tipoServicio = Integer.parseInt(JOptionPane.showInputDialog("Tipo de servicio \n 1. Corte Caballero\n 2. Corte Dama\n 3. Tintura\n 4. Peinado\n"));
//        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de servicios realizados:"));
//        Peluqueria2 p= new Peluqueria2();
//        
//
//        switch (tipoServicio) {
//            case 1 -> p.setCorteCaballero(cantidad);
//            case 2 -> p.setCorteDama(cantidad);
//            case 3 -> p.setTintura(cantidad);
//            case 4 -> p.setPeinado(cantidad);
//        }
//        
//        
//    }
//    
//    
}

//    public void mostrarDetallespeluqueros() {
//        Peluqueria2 peluquero = buscarPeluquero();
//
//        if (peluquero != null) {
//            int totalCorteCaballero = peluquero.getCorteCaballero() * 8000;
//            int totalCorteDama = peluquero.getCorteDama() * 10500;
//            int totalTintura = peluquero.getTintura() * 40000;
//            int totalPeinado = peluquero.getPeinado() * 15000;
//
//            String detalles = "Detalles del peluquero " + peluquero.getNombre() + ":\n\n";
//            detalles += "Corte Caballero: " + peluquero.getCorteCaballero() + " - Total: $" + totalCorteCaballero + "\n";
//            detalles += "Corte Dama: " + peluquero.getCorteDama() + " - Total:" + totalCorteDama + "\n";
//            detalles += "Tintura: " + peluquero.getTintura() + " - Total:" + totalTintura + "\n";
//            detalles += "Peinado: " + peluquero.getPeinado() + " - Total:" + totalPeinado + "\n\n";
//
//            int total = totalCorteCaballero + totalCorteDama + totalTintura + totalPeinado;
//            detalles += "Total:" + total;
//
//            JOptionPane.showMessageDialog(null, detalles);
//        } 
//    }
//
//    public void mostrarelConsolidado() {
//        int totalCorteCaballero = 0;
//        int totalCorteDama = 0;
//        int totalTintura = 0;
//        int totalPeinado = 0;
//
//        for (Peluqueria2 peluquero : peluqueros) {
//            totalCorteCaballero += peluquero.getCorteCaballero();
//            totalCorteDama += peluquero.getCorteDama();
//            totalTintura += peluquero.getTintura();
//            totalPeinado += peluquero.getPeinado();
//        }
//
//        int totalIngresosCorteCaballero = totalCorteCaballero * 8000;
//        int totalIngresosCorteDama = totalCorteDama * 10500;
//        int totalIngresosTintura = totalTintura * 40000;
//        int totalIngresosPeinado = totalPeinado * 15000;
//
//        String consolidado = "Consolidado  peluquería:\n\n";
//        consolidado += "Corte Caballero: " + totalCorteCaballero + " - Total de ingresos:" + totalIngresosCorteCaballero + "\n";
//        consolidado += "Corte Dama: " + totalCorteDama + " - Total de ingresos:" + totalIngresosCorteDama + "\n";
//        consolidado += "Tintura: " + totalTintura + " - Total de ingresos:" + totalIngresosTintura + "\n";
//        consolidado += "Peinado: " + totalPeinado + " - Total de ingresos:" + totalIngresosPeinado + "\n\n";
//
//        int total = totalIngresosCorteCaballero + totalIngresosCorteDama + totalIngresosTintura + totalIngresosPeinado;
//        consolidado += "El total de los ingresos es: " + total;
//
//        JOptionPane.showMessageDialog(null, consolidado);
//    }
//
//    public void nuevodiareiniciar() {
//        for (Peluqueria2 peluqueria : peluqueros) {
//            peluqueria.setCorteCaballero(0);
//            peluqueria.setCorteDama(0);
//            peluqueria.setTintura(0);
//            peluqueria.setPeinado(0);
//        }
//
//        JOptionPane.showMessageDialog(null, "Se ha reiniciado ocn exito");
//    }
//
//    private Peluqueria2 buscarPeluquero() {
//        for (Peluqueria2 peluquero : peluqueros) {
//           {
//                return peluquero;
//            }
//        }
//
//        return null;
//    }
//
//    
//}