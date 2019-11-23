package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.TipoNum;

public class UsaTipoNum {

	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		List<TipoNum<String>> lista = new ArrayList<TipoNum<String>>();
		while(true) {
			System.out.print("Digite um nome (. finaliza): ");
			String nome = sc.next();
			if (nome.equals(".")) break;
			System.out.print("Digite um número: ");
			int id = sc.nextInt();
			lista.add(new TipoNum<String>(id, nome));
		}
		sc.close();
		for (TipoNum<String> el: lista) {
			System.out.println("#" + el.getId() + ": " + el.getValor());
		}
	}
}
