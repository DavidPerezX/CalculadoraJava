package proyectofinal;

public class operaciones {

    public float formula(String cadenaNumeros) {

        int posicion = cadenaNumeros.indexOf('+');
        if (posicion != -1) {
            return formula(cadenaNumeros.substring(0, posicion)) + formula(cadenaNumeros.substring(posicion + 1));
        } else {
            posicion = cadenaNumeros.indexOf('-');
            if (posicion != -1) {
                return formula(cadenaNumeros.substring(0, posicion)) - formula(cadenaNumeros.substring(posicion + 1));
            } else {
                posicion = cadenaNumeros.indexOf('x');
                if (posicion != -1) {
                    return formula(cadenaNumeros.substring(0, posicion)) * formula(cadenaNumeros.substring(posicion + 1));
                } else {
                    posicion = cadenaNumeros.indexOf('/');
                    if (posicion != -1) {
                        return formula(cadenaNumeros.substring(0, posicion)) / formula(cadenaNumeros.substring(posicion + 1));
                    }

                }
            }
        }
        String procesar = cadenaNumeros.trim();
        if (procesar == null || procesar.isEmpty()) {
            return 0;
        }
        return Float.parseFloat(procesar);
    }
}