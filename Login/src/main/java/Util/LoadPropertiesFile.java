package Util;



	import java.io.FileInputStream;
	import java.util.Properties;

	public class LoadPropertiesFile {

		public static Properties objectrepo;
		public static Properties Datarepo;
		

		/**
		 * This method helps in loading the properties file based on the user input
		 */
		public static void loadProperties() {

			objectrepo = new Properties();
			Datarepo = new Properties();
			

			try {

				objectrepo.load(new FileInputStream(
						"C://Users//Ancha 2//workspace//Login//Resources//Objectrepo.properties"));

				Datarepo.load(new FileInputStream(
						"C://Users//Ancha 2//workspace//Login//Resources//Dataconfig.properties"));

				

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}


