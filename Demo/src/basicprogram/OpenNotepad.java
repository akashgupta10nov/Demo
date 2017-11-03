package basicprogram;

import java.io.IOException;

public class OpenNotepad {

	public static void main(String[] args) {
		try
        {
            Runtime.getRuntime().exec("notepad.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Hello");
        }

	}

}
