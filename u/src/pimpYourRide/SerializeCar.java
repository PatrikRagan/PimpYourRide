package pimpYourRide;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeCar implements Serializable {
	private String filename = "file";

	public void serializeNow() {
		if (filename != null) {
			try {
				ObjectOutputStream out = new ObjectOutputStream(
						new FileOutputStream(filename + ".ser"));

				out.writeObject(Main.getInstance());
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
