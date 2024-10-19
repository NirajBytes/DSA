//PRINT NUMBER FROM 1 TO 50 EXCEPT MULTIPLE OF THREE
public class a47_num_ex_mul_3 {
    public static void main(String[] args) {
        //WHILE LOOP
        // int i=0;
        // while (i<=50) {
        //     i++; // this operation is used bcaz after continue statement it jump to next iteration which skips the last comand of code i,e i++ which rise to no increment in i value hence this is used two times in this code 
        //     if(i%3==0){
        //         continue;
        //     }
        //     System.out.print( " "+i+" " );
        //     i++;
        // }
        //for loop
        outer: for(int i=0;i<=50;i++)//LEBELED LOOP 
        {
            if(i%3==0){
                continue outer;//SPECIFIC TERMINATION TO LOOP BY LABEL
            }
            System.out.print(" "+i+" "); 
        }
    }
}
