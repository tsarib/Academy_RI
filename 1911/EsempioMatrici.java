public class EsempioMatrici {
    public static void main(String[] args){
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        System.out.println(myNumbers[0][1]); // outputs 2

        // scorrere un array multidimensionale
        for (int i=0; i<myNumbers.length; i++){
            for (int j=0; j<myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
