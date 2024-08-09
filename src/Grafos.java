import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import models.Pessoa;

public class Grafos {
    public static void main(String[] args) {
        Queue<Pessoa> pessoaFila = new LinkedList<>();
        HashMap<String, Pessoa[]> amigos = new HashMap<>(); 

        Pessoa joao = new Pessoa("Joao", false);
        Pessoa maria = new Pessoa("Maria", false);
        Pessoa mario = new Pessoa("Mario", false);
        Pessoa lucas = new Pessoa("Lucas", false);
        Pessoa eddie = new Pessoa("Eddie", false);
        Pessoa halen = new Pessoa("Halen", true);
        amigos.put("Joao", new Pessoa[]{mario, maria});
        amigos.put("Maria", new Pessoa[]{lucas, eddie});
        amigos.put("Mario", new Pessoa[]{halen});
        pessoaFila.add(joao);
        verificar(pessoaFila, amigos);

    }
    public static void verificar(Queue<Pessoa> fila, HashMap<String, Pessoa[]> amigos){
        while (fila.size() > 0){
            Pessoa pessoa = fila.poll();
            if (pessoa.possuiManga){
                System.out.println(pessoa.nome + " Vende manga");
                break;
            }
            System.out.println(pessoa.nome + " Nao vende manga");
            for (Pessoa amigo:amigos.get(pessoa.nome)){
                fila.add(amigo);
            }
        }
    }


}
