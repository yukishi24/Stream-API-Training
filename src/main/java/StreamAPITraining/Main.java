package StreamAPITraining;

public class Main {
  public static void main(String[] args) {
    // ***************************
    // mapで要素の値を書き換える。
    // ***************************
    // List<Integer> list = Arrays.asList(1, 2, 3);
    // list.stream().map(x -> x * 2).forEach(System.out::println);

    // ***************************
    // filerを使って値の選別
    // ***************************
    // Java8
    // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    // int total = list.stream().filter(x -> x >= 2).mapToInt(x -> x).sum();
    // System.out.println("Total :" + total);

    // Java7
    // List<Integer> List = Arrays.asList(1, 2, 3, 4, 5);
    // int total = 0;
    // for (Integer x : List) {
    // if (x >= 2) {
    // total += x;
    // }
    // }
    // System.out.println("total :" + total);

    // ***************************
    // sortedで並び替える
    // ***************************
    // Java8
    // List<Integer> List = Arrays.asList(5, 1, 4, 3, 2);
    // List.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    // ***************************
    // distinctで重複を無くす方法
    // ***************************
    // List<Integer> List = Arrays.asList(5,1,4,5,5);
    // List.stream().distinct().forEach(System.out::println);

    // ***************************
    // Limitでデータの制限
    // ***************************
    // List<Integer> List = Arrays.asList(1,2,3,4,5);
    // List.stream().limit(3).forEach(System.out::println);
  }
}
