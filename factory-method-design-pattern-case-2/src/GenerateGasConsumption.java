import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateGasConsumption {
    public static void main(String args[]) throws IOException {
        GetGasFactory gasFactory = new GetGasFactory();

        System.out.print("Enter the car type (RAMONA, BOCHO, KIA): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String carType = br.readLine();
        System.out.print("Enter the number of kilometers for gas consumption: ");
        double kilometers = Double.parseDouble(br.readLine());

        CarGasConsumption car = 
    }
}
