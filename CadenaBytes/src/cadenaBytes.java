
public class cadenaBytes {

	public static void main(String[] args) {

		byte[] array; // 1. Crear un arreglo de bytes
		String str = "Esto es un ejemplo";

		array = new byte[str.length() + 1]; // 2. el arreglo contenga en la primera posici�n un contador de caracteres

		array[0] = (byte) str.length(); // 4. dicho contador indique la longitud de la cadena

		byte[] ascci = str.getBytes(); // 3. dicho arreglo a continuaci�n contenga los c�digos ASCII de cada caracter
										// del String

		System.arraycopy(ascci, 0, array, 1, array[0]); // 5. Utilizar el m�todo String.getBytes()

		for (int i = 0; i < array.length; i++) // 6. Imprimir a pantalla los valores num�ricos de todos los elementos
												// del arreglo de Bytes.
			System.out.print(" " + array[i]);

		rebuild(array);

	}

	private static void rebuild(byte[] array) { // 7. Despu�s de realizar todo lo anterior, una subrutina reciba el
												// arreglo de bytes e imprima la cadena (los caracteres) contenida en el
												// arreglo (el contador para eso sirve)

		String str = new String(array, 1, array[0]);

		System.out.println();
		System.out.println(str);
	}

}
