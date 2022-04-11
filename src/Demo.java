import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //Đọc File
        //Khai bao 1 doi tuong file
        File file = new File("demo.txt");
        //tao 1 dong ket noi voi file
        InputStream inputStream = new FileInputStream(file);
        // tao 1 doi tuong doc file dong tren
        InputStreamReader inputStreamReader =new InputStreamReader(inputStream);
        // tao 1 doi tuong bo dem
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = "";
        int sum = 0;
        System.out.println("Đọc file ");
        while ((line = reader.readLine()) != null){

            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        System.out.println("\nTổng bằng " + sum);

//        String a[] = new String[3];
//        a[0] = "DELL";
//        a[1] = "Macbook";
//        a[2] = "Asus";
//        File file = new File("mt.txt");
//        OutputStream outputStream = new FileOutputStream(file);
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
//        for (String item : a ){
//            outputStreamWriter.write(item);
//            outputStreamWriter.flush();
//        }
    }
}
