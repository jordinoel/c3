package repasobasico2209;
public class Composicion {
    
    public static void main (String [] args ){
        String nombre = "José";
        System.out.println (nombre.charAt(2));
        System.out.println(nombre.toUpperCase());
        
       // sustituir la letra O por la letra X
       System.out.println(nombre.replace('o','X'));
       System.out.println(nombre);
    }
    
    
}
