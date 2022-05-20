import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;

class Curso {
    public ArrayList<Integer> valores = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public String adicionar = scanner.next();
    public Integer n1 = scanner.nextInt();
    public Consumer<Integer> addition = e -> valores.add(e);
    public Consumer<Integer> soma = i -> System.out.println(Integer.sum(valores.stream().iterator().next(), i));


    public void fazProcesso(Integer i) {
        valores.add(i);
        if (valores.isEmpty()){
            System.out.println(n1);
        }else if (Objects.equals(this.adicionar, "S")) {
            this.soma.accept(n1);
            this.addition.accept(n1);
        }

    }
}