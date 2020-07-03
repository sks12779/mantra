import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 2 {

    public static void main(String[] args) {

        String csvFile = "test.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
		int priceColumn=0;
        try {
            br = new BufferedReader(new FileReader(csvFile));
			line=br.readLine();
			String[] columns = line.split(csvSplitBy);
			for(int i=0;i<columns.length;i++) {
				if("price".equals(columns[i])){
					priceColumn=i;
					break;
				}
			}
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);
                System.out.println(values[priceColumn]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}