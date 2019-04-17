import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args)throws IOException{
    //字节缓冲输入流
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\File\\123.zip");
    //字节缓冲输出流
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\File\\456.zip");
    int len=0;
    byte[] bytes = new byte[1024];
    while((len = bis.read(bytes))!=-1){
        bos.write(bytes,0,len);  
  }
    bos.close();
    bis.close();
}
