import javax.swing.*;

/**
 * Created by Aaron Fernandes(300773526) on November 2015.
 */
public class AirLineProgram {
	public static void main(String[] args){

		for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			if ("GTK+".equals(info.getName()) || "windows".equals(info.getName()) || "substance".equals(info.getName())) {
				try {
					UIManager.setLookAndFeel(info.getClassName());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
				break;
			}
		}

/*
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		AirLine air = new AirLine();
		AirLineGui gui = new AirLineGui(air);
	}
}
