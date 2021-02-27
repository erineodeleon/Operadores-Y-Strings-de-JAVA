import java.util.Scanner;

public class PrimerProyecto {
    public static void main(String[] args) {
        // int lo asignamos para la eleccion de menu

        int op=0;
        boolean salir =false;

        Scanner kb = new Scanner(System.in);

            System.out.println(" ============================== \n " +
                    " Seleccione una opción  \n " +
                    " ============================== \n " +
                    "1.- Tamaño \n"+
                    "2.- Subcadena \n"+
                    "3.- comparacion de palabras \n"+
                    "4.- comparacion de tamaño \n"+
                    "5.- Salir  \n");
            //op son las opciones de menu
        do {
        op = kb.nextInt();

                switch (op){
                    case 1:
                        //cadena de texto principal ingresada por el usuario
                        String cadena_ingresada = "";
                        // aguarda los carapteres de la cadena
                        int num_caracteres = 0;
                        //
                            Scanner in = new Scanner(System.in);

                            //los System es para pedir los datos a el usuario
                            System.out.println("Ingresar cadena : ");
                            //alogara los datos
                            cadena_ingresada = in.nextLine();

                            num_caracteres = cadena_ingresada.length();

                            System.out.println("la cadena de texto ingresada: " + cadena_ingresada + "  tiene " + " "  + num_caracteres);

                        break;
                    case 2:
                        Scanner im = new Scanner(System.in);
                        System.out.println("Ingresar cadena : ");
                        String nombre = im.nextLine();
                        System.out.println(nombre.substring(0,4));

                        break;
                    case 3:
                        Scanner um = new Scanner(System.in);
                        System.out.println("Ingresar cadena : ");
                        String a = um.nextLine();


                        Scanner om = new Scanner(System.in);
                        System.out.println("Ingresar cadena : ");
                        String b = om.nextLine();

                         // son iguales
                        //Para comparar dos cadenas sin importar si los caracteres están en mayúscula o minúscula, se utiliza el método equalsIgnoreCase()
                        if (a.equalsIgnoreCase(b)) {
                            System.out.println("a y b son iguales");
                        } // en cado caso no se cumpla la condicion se ejecutara el else
                        else {
                            System.out.println("a y b no son iguales");
                        }

                        break;
                    case 4:
                        Scanner ca = new Scanner(System.in);
                        System.out.println("Ingresar cadena : ");
                        String ca1 = ca.nextLine();

                        Scanner ce = new Scanner(System.in);
                        System.out.println("Ingresar cadena : ");
                        String ca2 = ce.nextLine();

                        if (ca.equals(ce)){
                            System.out.println("si lo son");
                        } else{
                            System.out.println("no lo son");
                        }


                        break;
                    case 5:
                        System.out.println("Saliendo de programa ");
                        salir = false;
                        break;
                    //default entrara en funcion cuando se celecione una opcion no balida
                    default:
                        System.out.println("No es una opcion disponible");
                        break;
            }

            //si es mallor a 4 se cerrara
            } while (op < 4);


    }
}
