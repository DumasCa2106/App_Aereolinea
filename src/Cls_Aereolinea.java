import javax.swing.JOptionPane;

public class Cls_Aereolinea {
    private String str_id;
    private String str_nombre;
    private float flt_contacto;
    private String str_correo;
    private String str_direccion;
    private static double dbl_economico = 350000;
    private static double dbl_turista = 450000;
    private static double dbl_ejecutivo = 600000;
    private static double descuento = 0;
    private static double total;
    private static int int_cantidad_tikect;
    private static int int_tipo_vuelo;
    private static String [][] tikects = new String[100][9];
    private static int fila = 0;
    
    public static void main(String[] args){
        fnt_solicitar_tiquete();
    }
    public static void fnt_solicitar_tiquete(){
        String i = JOptionPane.showInputDialog(null,"Id");
        String n = JOptionPane.showInputDialog(null,"Nombre");
        String c = JOptionPane.showInputDialog(null,"Contacto");
        String e = JOptionPane.showInputDialog(null,"Correo");
        String d = JOptionPane.showInputDialog(null,"Dirección");
        int_tipo_vuelo = Integer.parseInt(JOptionPane.showInputDialog(null,"0. Economico\n 1. Turistico\n 2. Ejecutivo"));
        int_cantidad_tikect = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad"));
        
        if(int_tipo_vuelo == 0){
            if (int_cantidad_tikect == 2) {
                descuento = dbl_economico * 0.15;
            }
        }else if(int_tipo_vuelo == 1){
            if (int_cantidad_tikect == 3) {
                descuento = dbl_turista * 0.10;
            }
        }else if(int_tipo_vuelo == 2){
            if (int_cantidad_tikect == 2) {
                descuento = dbl_ejecutivo * 0.20;
            }
        }
        
        switch(int_tipo_vuelo){
            case 0: total = (dbl_economico * int_cantidad_tikect) - descuento;
                break;
            case 1: total = (dbl_turista * int_cantidad_tikect) - descuento;
                break;
            case 2: total = (dbl_ejecutivo * int_cantidad_tikect) - descuento;
                break;
        }
        
        tikects[fila][0] = i;
        tikects[fila][1] = n;
        tikects[fila][2] = c;
        tikects[fila][3] = e;
        tikects[fila][4] = d;
        tikects[fila][5] = "" + int_tipo_vuelo;
        tikects[fila][6] = "" + int_cantidad_tikect;
        tikects[fila][7] = "" + descuento;
        tikects[fila][8] = "" + total;
        fila++;
        
        JOptionPane.showMessageDialog(null, "Guardo");
        
        //Buscar
        i = JOptionPane.showInputDialog(null, "Ingrese el id: ");
        int pos = 0;
        for (int j = 0; j < 100; j++) {
            for (int k  = 0; k  < 9; k ++) {
                if (i.equals(tikects[j][k])) {
                    pos = j;
                    break;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "ID: " + tikects[pos][0]);
        JOptionPane.showMessageDialog(null, "Nombre: " + tikects[pos][1]);
        JOptionPane.showMessageDialog(null, "Contacto: " +tikects[pos][2]);
        JOptionPane.showMessageDialog(null, "Correo: " +tikects[pos][3]);
        JOptionPane.showMessageDialog(null, "Dirección: " +tikects[pos][4]);
        JOptionPane.showMessageDialog(null, "Tipo vuelo: " + tikects[pos][5]);
        JOptionPane.showMessageDialog(null, "Cantidad tiketes: " + tikects[pos][6]);
        JOptionPane.showMessageDialog(null, "Descuento: " + tikects[pos][7]);
        JOptionPane.showMessageDialog(null, "Total: " + tikects[pos][8]); 
    }

    public String getStr_id() {
        return str_id;
    }

    public void setStr_id(String str_id) {
        this.str_id = str_id;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public float getFlt_contacto() {
        return flt_contacto;
    }

    public void setFlt_contacto(float flt_contacto) {
        this.flt_contacto = flt_contacto;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

    public String getStr_direccion() {
        return str_direccion;
    }

    public void setStr_direccion(String str_direccion) {
        this.str_direccion = str_direccion;
    }

}