import javax.imageio.ImageTranscoder;

public class ExpressionStmt {

    public static void main(String[] args){
        System.out.printf("5+2=7").println(); // O/p: String literal 5*2=10
        int i=5;
        int j=10;
        System.out.printf("%d * %d is %d",i,i, i*i).println();
        String s="String";
        System.out.printf("String value is %s",s);
        System.out.printf("Min of %d , %d is %d",i,j,Math.min(i,j)).println();
        // Escape characters
        System.out.println("Hello \" world");
        System.out.println("Hello \\\\ world");
        System.out.println("Helo \nworld");
        System.out.println("Hello \t world");
        int a= 1;
        int b=2;
        int c=3;
        System.out.printf("%d + %d + %d = %d",a,b,c,a+b+c).println();
        a=2;
        b=3;
        System.out.printf("%d + %d + %d = %d",a,b,c,a+b+c).println();
        System.out.println(1+2); // O/p : 3
        System.out.println("1"+"2"); // O/p : 12
        System.out.println("1"+(2+3)); // O/p : 15
        System.out.printf("The value before  i is %d\n",i);
        System.out.printf("%d*2 is %d\n",i,(i*=2));
        System.out.printf("The value after i is %d\n",i).println();
        int multiplicant=3;
        int multiplelimt=10;
        printMultiplicationTable(multiplicant, multiplelimt);
        printMultiplicationTableReversion(multiplicant, multiplelimt);
        for(i=0,j=1;i<=10;i++,j++);
        System.out.printf("i value is %d\n",i); // O/p: 11
        System.out.printf("j value is %d\n",j); // O/p : 12
    }

    public static void printMultiplicationTableReversion(int multiplicant, int multiplelimt) {
        if(multiplelimt!=0 && multiplicant!=0){
            System.out.printf("Multiplication table for %d in reverse is \n",multiplicant);
            for(int i=multiplelimt; i>=0;i--){
                System.out.printf("%d * %d is %d\n",multiplicant, i, multiplicant*i);
            }
        }
    }

    public static void printMultiplicationTable(int multiplicant, int multiplelimt){
        if(multiplelimt!=0 && multiplicant!=0){
            System.out.printf("Multiplication table for %d is \n",multiplicant);
            for(int i=1; i<=multiplelimt;i++){
                System.out.printf("%d * %d is %d\n",multiplicant, i, multiplicant*i);
            }
        }

    }

}
