package Ariketa2;

public class StringContainer {
    private String aldagaia;
    public int constant = 5;

    public StringContainer(String katea) {
        this.aldagaia = katea;
    }

    public String toString() {
        return this.aldagaia.toString();
    }

    public boolean isEqualTo(StringContainer parameter) {
        if (aldagaia.equals(parameter.aldagaia)) {
            return true;
        }
        return false;
    }

    public void shiftLeft(int position) {

    }

    public void shiftRight(int position) {
        this.aldagaia = this.aldagaia.substring(position);
        for (int i = 1; i <= position; i++) {
            this.aldagaia = "-" + this.aldagaia;
        }
        System.out.println(this.aldagaia);
    }

    public void Rotate(int position, char direction) {
        if (direction == 'R' || direction == 'r') {
            int length = aldagaia.length();
            String res = aldagaia.substring((length - position) % length);
            System.out.println(res);

        } else if (direction == 'L' || direction == 'l') {
            String string = "";
            int n = position % aldagaia.length();
            string = aldagaia.substring(n) + aldagaia.substring(0, n);
            System.out.println(string);
        } else {
            System.out.println("Ez duzu direkzio egokia sartu.");
        }
    }

    public String codificar(int n) {
        String textoCodificado = "";
        String letras = "abcdefghijklmnñopqrstuvwxyz";
        String texto = this.aldagaia.toLowerCase();

        char caracter;
        boolean suma = true;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i); // Carácter en cada iteración

            int pos = letras.indexOf(caracter); // Cuantas posiciones

            if (pos == -1) { // Si el carácter es uno solo
                textoCodificado += caracter;
            } else {
                if (suma && caracter != 'a') { // Suma
                    textoCodificado += letras.charAt((pos + n) % letras.length());
                    suma = false;
                } else if (suma == false && caracter != 'a') { // Resta
                    textoCodificado += letras.charAt((pos - n) % letras.length());
                    suma = true;

                }
                if (caracter == 'a' && suma == false) { // Resta cuando el carácter es a
                    textoCodificado += letras.charAt(letras.length() - n);
                }

            }

        }

        return textoCodificado;
    }

    public StringContainer mixWords(StringContainer string1, StringContainer string2) {
        String aux = " ";
        StringContainer stringc = new StringContainer(aux);
        String[] newStr1 = string1.aldagaia.toString().split(" ");
        String[] newStr2 = string2.aldagaia.toString().split(" ");
        if (newStr1.length >= newStr2.length) {
            for (int i = 0; i < newStr1.length; i++) {
                if (newStr2.length <= i) {
                    stringc.aldagaia = stringc.aldagaia + " " + newStr1[i];
                } else {
                    stringc.aldagaia = stringc.aldagaia + " " + newStr1[i] + newStr2[i];
                }
            }
        } else {
            for (int i = 0; i < newStr2.length; i++) {
                if (newStr1.length <= i) {
                    stringc.aldagaia = stringc.aldagaia + " " + newStr2[i];
                } else {
                    stringc.aldagaia = stringc.aldagaia + " " + newStr1[i] + newStr2[i];
                }
            }
        }
        return stringc;
    }
}
