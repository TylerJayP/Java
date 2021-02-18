package FileWrite;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;

public class fileWrite {

	public static void main(String[] args) {

		createFile();
		writeFile();

	}

	public static void createFile() {

		try {

			File myFile = new File("C:\\Users\\tyler\\Desktop\\forClasss.txt");

			if (myFile.createNewFile()) {

				System.out.println("File created: " + myFile.getName());

			} else {

				System.out.println("File already exists");

			}

		} catch (IOException e) {

			System.out.println("An error has occurred...");
			e.printStackTrace();

		}

	}

	public static void writeFile() {

		try {

			PrintWriter writing = new PrintWriter("C:\\Users\\tyler\\Desktop\\forclasss.txt");

			for (int i = 1; i <= 10; i++) {

				for (int j = 1; j <= 10; j++) {

				//	System.out.printf("%d * %d = %d \t \t %d * %d = %d \n\n", j, i, i * j, j, i + 1, (i + 1) * j);

					writing.printf("%d * %d = %d \t \t %d * %d = %d \n\n", j, i, i * j, j, i + 1, (i + 1) * j);


				}
				i++;
				writing.println();

			}

			writing.close();

			System.out.println("Successfully wrote to file");

		} catch (IOException e) {

			System.out.println("An error occurred");
			e.printStackTrace();

		}

	}

}
