public class Foreach {
    public static void main(String[] args) {
        int [] list = {1,2,3,4};

        for (int i=0;i<list.length;i++){
//            System.out.println(list[i]);
        }

//        Foreach kullanımı
        int sum =0;
        for (int i:list){
            sum+=i;
        }
//        System.out.println(sum);

        for (double j:list){
            System.out.println(j);
        }

        String[] cars = {"BMW","Mercedes","Audi"};

        for (String car :cars){
            System.out.print(car+" \t");
        }
        System.out.println("\n");
        int [][] matris ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] row : matris){
//            System.out.println(row[1]);
            for(int columnElement : row){
                System.out.print(columnElement+"\t");
            }
            System.out.println();
        }
    }
}
