public class Archivos {

    private String nombre;
    private int peso;
    private String extension;
    private int fecha;
    private String medida;

    public Archivos(){}

    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }

    public void setPeso(int nuevoPeso){
        peso=nuevoPeso;
    }
    public void setExtension(String nuevoExtension){
       extension=nuevoExtension;
    }

    public void setFecha(int nuevoFecha){
        fecha=nuevoFecha;
    }

    public void setMedida(String nuevoMedida){
        medida=nuevoMedida;
    }

    public static void main(String [] args){
        Archivos Archivo1 = new Archivos();
        Archivos Archivo2 = new Archivos();
        Archivos Archivo3 = new Archivos();
        Archivos Archivo4 = new Archivos();

        Archivo1.setNombre("Someone like you");
        Archivo1.setExtension(".mp4");
        Archivo1.setFecha(20170626);
        Archivo1.setPeso(117);
        Archivo1.setMedida("MB");

        Archivo2.setNombre("League of Legends");
        Archivo2.setExtension(".exe");
        Archivo2.setFecha(20171127);
        Archivo2.setPeso(929);
        Archivo2.setMedida("bytes");

        Archivo3.setNombre("T3-EntornosCorporacion");
        Archivo3.setExtension(".docx");
        Archivo3.setFecha(20180429);
        Archivo3.setPeso(23);
        Archivo3.setMedida("KB");

        Archivo4.setNombre("WhatsApp Image 2017-08-15");
        Archivo4.setExtension(".JPEG");
        Archivo4.setFecha(20170815);
        Archivo4.setPeso(116);
        Archivo4.setMedida("KB");

        System.out.println("Archivo 1: ");
        System.out.println("Nombre: "+ Archivo1.nombre+ " " + "Extension:" + Archivo1.extension+ " " + "Fecha: "+ Archivo1.fecha+ " " + "Peso: "+ Archivo1.peso + " Unidad de medida: "+ Archivo1.medida);

        System.out.println("Archivo 2: ");
        System.out.println("Nombre: "+ Archivo2.nombre+ " " + "Extension:" + Archivo2.extension+ " " + "Fecha: "+ Archivo2.fecha+ " " + "Peso: "+ Archivo2.peso + " Unidad de medida: "+ Archivo2.medida);

        System.out.println("Archivo 3: ");
        System.out.println("Nombre: "+ Archivo3.nombre+ " " + "Extension:" + Archivo3.extension+ " " + "Fecha: "+ Archivo3.fecha+ " " + "Peso: "+ Archivo3.peso + " Unidad de medida: "+ Archivo3.medida);

        System.out.println("Archivo 4: ");
        System.out.println("Nombre: "+ Archivo4.nombre+ " " + "Extension:" + Archivo4.extension+ " " + "Fecha: "+ Archivo4.fecha+ " " + "Peso: "+ Archivo4.peso + " Unidad de medida: "+ Archivo4.medida);





    }
}
