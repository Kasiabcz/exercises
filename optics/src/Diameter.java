

public class Diameter
{
    public static void main (String [] args)
    {
        FiFactory skanFactory = new ScanFiFactory();
        Fi diamData = skanFactory.createFi();
        //diamData.skan(); !To już nie jest potrzebne!
        double diam = 2 * (diamData.getRmax() + (diamData.getPDop() / 2) - diamData.getWidth() + diamData.getSpace() +2);
        Result.choice(diam);
        System.out.println();

    }



}
