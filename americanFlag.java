public class americanFlag {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i<10; i++){
            if(i<=4){
                if(i%2==0){
                    for(j=1; j<=19; j++){
                        if(j<=6){
                            System.out.print(" "+'*');
                        }else{
                            System.out.print("=");
                        }
                    }
                }else{
                    for(j=1; j<=19; j++){
                        if(j<=6){
                            System.out.print('*'+" ");
                        }else{
                            System.out.print("=");
                        }
                    }
                }
            }else{
                for(j=1; j<=25; j++){
                    System.out.print('=');
                }
            }
            System.out.println();
        }
    }
}