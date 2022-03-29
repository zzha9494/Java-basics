package W5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Palette {

    public static void main(String[] args) {

//        if (args.length == 0) {
//            System.out.println("No Filename Specified");
//            return;
//        }

        FileInputStream f = null;
        try {
//            f = new FileInputStream(args[0]);
            f = new FileInputStream("src/W5/imgd.b");
        } catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist");
            return;
        }

        DataInputStream input = new DataInputStream(f);
        ArrayList<Byte> data = new ArrayList<Byte>();
        byte[] temp = new byte[1];
        int a = 0;
        try {
            while (a != -1) {
                a = input.read(temp);
                if(temp[0] != 0)
                    data.add(temp[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int x = data.get(7).intValue();

        data.get(1);




    }
}
