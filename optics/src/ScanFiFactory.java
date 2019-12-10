import java.util.Scanner;

public class ScanFiFactory implements FiFactory {
    @Override
    public Fi createFi()
    {
        return skan();
    }

    protected Fi skan()
    {
        Fi retVal = new Fi();
        Scanner fiScanner = new Scanner(System.in);
        System.out.println("Wprowadz PD");
        retVal.setPDop( fiScanner.nextDouble() );

        System.out.println("Wprowadź maksymalny promień tarczy");
        retVal.setRmax(fiScanner.nextDouble());

        System.out.println("Wprowadź szerokość oprawy");
        retVal.setWidth(fiScanner.nextDouble());

        System.out.println("Wprowadź wymiary mostka");
        retVal.setSpace(fiScanner.nextDouble());

        return retVal;
    }
}
