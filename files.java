import java.io.*;
class Files {
    public static void main(String args[])throws IOException{
        try{
            FileInputStream fi = new FileInputStream("file.txt");
            FileOutputStream ft = new FileOutputStream("output.txt");
            int i = 0;
            while((i=fi.read())!=-1){
                ft.write(i);
            }
            ft.close();
            fi.close();
        }catch(IOException e){
            System.out.print("Exception "+e);
        }
    }
}
