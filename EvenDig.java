import java.util.Scanner;
public class EvenDig
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int cases[]=new int[T];
        for(int i=0;i<T;i++){
            int temp,temp2,temp3;
            boolean passed1=false,passed2=false;
            sc.nextLine();
            temp=sc.nextInt();
            temp2=temp;
            temp3=temp;
            int tempResults1=0;
            int tempResults2=0;
            if(temp<10){
                if((temp+1)%2==0)
                cases[i]=1;
                else
                cases[i]=0;
            }
            else{
                while(!passed1){
                    int digit;
                    int checker = temp2;
                    passed1 = true;
                    while(checker> 0)
                    {
                        digit = checker % 10;
                        checker = checker / 10;
                        if(digit%2!=0){
                             passed1=false;
                             break;
                        }
                    }
                    if (!passed1)temp2++;
                }
                while(!passed2){
                    int digit;
                    int checker = temp3;
                    passed2 = true;
                    while(checker> 0)
                    {
                        digit = checker % 10;
                        checker = checker / 10;
                        if(digit%2!=0){
                             passed2=false;
                             break;
                        }
                    }
                    if (!passed2)   temp3--;
                }
                cases[i]=Math.min((temp2-temp),(temp-temp3)) ;
            } 

        }
        for(int i=0;i<T;i++){ 
            System.out.println("Case #"+(i+1)+": "+cases[i]);
        }
    }
}
