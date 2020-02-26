import java.util.regex.*;

public class DataSplitter {
    String[] input = { "320/10.50/Dec 09 2006/39.95",
        "110-4.25-Dec 09 2006-39.95",
        "8%54.00%Dec 8 2006%0" };

    public DataSplitter() {
        for (int i = 0; i < input.length; i++) {
            String[] piece = input[i].split("[-/%]");
            for (int j = 0; j < piece.length; j++)
                System.out.print(piece[j] + "\t");
            System.out.print("\n");
        }
    }

    public static void main(String[] arguments) {
        DataSplitter app = new DataSplitter();
    }
}
